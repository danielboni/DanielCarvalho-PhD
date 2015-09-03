package preference;

import iae.algorithm.rhone.PCD;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

import minicon.MCDMappings;
import minicon.Mapping;
import minicon.Rewriting;
import datalog.DatalogQuery;
import datalog.PredicateElement;

/**
 * Creates MCD combinations.
 * This class uses the BestFirst strategy to create combinations
 * ordered by a rank comparator.
 * 
 * @author Thiago Abreu
 */
public class BestFirst {

    int[] max;
    PriorityQueue<ArrayList<Integer>> front;
    Set<ArrayList<Integer>> upTilNow;

    public BestFirst(DatalogQuery query) {
        
    	System.out.println("**** Inside Best First **** ");
    	
    	max = new int[query.getPredicates().size()];
        front = new PriorityQueue<ArrayList<Integer>>(1, new TotalRankComparator());
        upTilNow = new HashSet<ArrayList<Integer>>();

        ArrayList<Integer> melhor = new ArrayList<Integer>(max.length);

        for (int i = 0; i < max.length; i++) {
            this.max[i] = Index.getSubdomain(i).size();
            melhor.add(-1);
        }

        getFirstSucessor(melhor);

    }

    private void getFirstSucessor(ArrayList<Integer> combination) {
        boolean[] covering = new boolean[max.length];
        ArrayList<Integer> succ = new ArrayList<Integer>(combination);

        for (int i = 0; i < covering.length; i++) {
            if (covering[i])
                continue;

            int next = combination.get(i) + 1;
            boolean[] nextCovering = Index.getCoverList(i, next);

            covering = combineCoverings(covering, nextCovering);

            succ.set(i, next);
        }
        front.add(succ);
    }

    private void getSucessors(ArrayList<Integer> combination, List<PCD> pcds) {
        upTilNow.add(combination);

        for (PCD mcd : pcds) {
            boolean[] covering = Index.getCoverList(mcd);
            ArrayList<Integer> succ = new ArrayList<Integer>(combination);

            for (int i = 0; i < covering.length; i++) {
                if (covering[i]) {

                    if (combination.get(i) < max[i] - 1) {
                        succ.set(i, succ.get(i) + 1);

                        while (Index.isBlackListed(i, succ.get(i)) && succ.get(i) < max[i] - 1)
                            succ.set(i, succ.get(i) + 1);

                    }

                    if (Index.isBlackListed(i, succ.get(i)))
                        succ.set(i, -1);
                }
            }

            if (!upTilNow.contains(succ) && !front.contains(succ))
                front.add(succ);
        }

    }

    private List<PCD> getPCDFromCombination(ArrayList<Integer> combo) {
        List<PCD> PCDs = new LinkedList<PCD>();
        boolean[] covering = new boolean[combo.size()];

        for (int i = 0; i < combo.size(); i++) {

            int el = combo.get(i);

            if (el != -1 && !covering[i]) {

                PCD pcd = Index.getMCDfromPos(i, el);

                if (!PCDs.contains(pcd))
                    PCDs.add(pcd);

                covering = combineCoverings(covering, Index.getCoverList(pcd));
            }
        }
        return PCDs;
    }

    private boolean[] combineCoverings(boolean[] c1, boolean[] c2) {
        boolean[] result = new boolean[c1.length];

        for (int i = 0; i < c1.length; i++) {
            result[i] = c1[i] || c2[i];
        }

        return result;
    }

    private boolean hasNext() {
        return !front.isEmpty();
    }

    private List<PCD> next() {
        ArrayList<Integer> prox = front.poll();
        List<PCD> result = getPCDFromCombination(prox);

        getSucessors(prox, result);

        return result;
    }

    /**
     * Gets all the possible rewritings for a given query.
     * 
     * @param query The query to be rewrited
     * @return A list containing all the possible rewritings
     */
    public List<Rewriting> getRewritings(DatalogQuery query) {
        return getRewritings(query, null);
    }

    /**
     * Gets a required number of rewritings for a given query.
     * 
     * @param query The query to be rewrited
     * @param n The number of required rewritings
     * @return A list containing the best N rewritings
     */
    public List<Rewriting> getRewritings(DatalogQuery query, Integer n) {

        List<Rewriting> rewritings = new LinkedList<Rewriting>();
        HashSet<List<PCD>> alreadyComputed = new HashSet<List<PCD>>();

        int required = Integer.MAX_VALUE;
        if (n != null)
            required = n;

        while (hasNext() && rewritings.size() <= required) {
            List<PCD> MCDsCandidates = next();

            if (isRewriting(MCDsCandidates, query))

                if (!alreadyComputed.contains(MCDsCandidates)) {
                    rewritings.add(new Rewriting(MCDsCandidates, query));
                    alreadyComputed.add(MCDsCandidates);
                }

        }

        return rewritings;
    }

    /**
     * From Organiser
     *
     * @author Cheik Ba
     */
    private static boolean isRewriting(List<PCD> mcds, DatalogQuery query) {
        int countPredicates = 0;

        for (PCD mcd : mcds) {
            countPredicates += mcd.numberOfSubgoals();
        }

        // compare total number of predicates with number of query subgoals
        if (countPredicates != query.numberOfPredicates())
            return false;

        // test pairwise disjoint
        for (int i = 0; i < mcds.size(); i++) {
            for (int j = 0; j < mcds.size(); j++) {
                if (i != j) {
                    PCD mcd1 = mcds.get(i);
                    PCD mcd2 = mcds.get(j);
                    if (!mcd1.isDisjoint(mcd2))
                        return false;
                }
            }
        }
// EU NAO ENTENDO O MOTIVO DISSO.
//        // x exists in C1 and C2 ==> it must be mapped to the same constant
//        for (int i = 0; i < mcds.size(); i++) {
//            PCD mcd1 = mcds.get(i);
//            Mapping constMap1 = mcd1.mappings.constMap;
//            for (int j = 0; j < mcds.size(); j++) {
//                if (i != j) {
//                    PCD mcd2 = mcds.get(j);
//                    Mapping constMap2 = mcd2.mappings.constMap;
//                    for (PredicateElement elem : constMap1.arguments) {
//                        if ((constMap2.containsArgument(elem) && !(constMap1
//                                .getFirstMatchingValue(elem).equals(constMap2
//                                        .getFirstMatchingValue(elem)))))
//                            return false;
//                    }
//                }
//            }
//        }
        
        for (int i = 0; i < mcds.size(); i++) {
            
        	PCD mcd1 = mcds.get(i);
            
            for (MCDMappings map: mcd1.getPhi()){
            	Mapping constMap1 = map.constMap;
            	for (int j = 0; j < mcds.size(); j++) {
                    if (i != j) {
                        PCD mcd2 = mcds.get(j);
                        for (MCDMappings map2: mcd2.getPhi()){
                        	Mapping constMap2 = map2.constMap;
                            for (PredicateElement elem : constMap1.arguments) {
                                if ((constMap2.containsArgument(elem) && !(constMap1
                                        .getFirstMatchingValue(elem).equals(constMap2
                                                .getFirstMatchingValue(elem)))))
                                    return false;
                            }
                        } 
                    }
                }
            }      
        } 
        return true;
    }
}

class TotalRankComparator implements Comparator<ArrayList<Integer>> {

    @Override
    public int compare(ArrayList<Integer> r1, ArrayList<Integer> r2) {
        if (totalRank(r1) == totalRank(r2))
            return 0;
        else if (totalRank(r1) > totalRank(r2))
            return -1;
        else
            return 1;
    }

    private double totalRank(ArrayList<Integer> a) {
        double total = 0.0;
        double old = 0.0;

        for (int i = 0; i < a.size(); i++) {
            List<PCD> ls = Index.getSubdomain(i);

            if (a.get(i) >= 0 && !ls.isEmpty())
                old = ls.get(a.get(i)).getRank();

            total += old;
        }
        return total;
    }
}
