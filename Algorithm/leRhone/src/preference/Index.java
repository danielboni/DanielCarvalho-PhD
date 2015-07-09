
/*
 * Created on 09.09.2014
 * Index: to store PCD for concrete services according to the user's preferences.
 * 
 * @author Thiago Abreu
 */
package preference;

import iae.algorithm.rhone.PCD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import datalog.DatalogQuery;
import datalog.Predicate;

public class Index {

    private static DatalogQuery query;

    private static List<List<PCD>> index;

    private static Map<SubAndDesc, Boolean> blackList;

    private static Map<PCD, boolean[]> coverList;

    public static void initialize(List<PCD> mcds, DatalogQuery _query) {
        RankComparator comp = new RankComparator();

        query = _query;
        index = new ArrayList<List<PCD>>(query.getPredicates().size());
        blackList = new HashMap<SubAndDesc, Boolean>();
        coverList = new HashMap<PCD, boolean[]>();

        List<PCD> coverageDomain;

        for (int i = 0; i < query.getPredicates().size(); i++) {
            Predicate subGoal = query.getPredicates().get(i);
            coverageDomain = getCoverageDomain(subGoal, mcds);
            ArrayList<PCD> abstractService = new ArrayList<PCD>(coverageDomain);
            Collections.sort(abstractService, comp);

            setBlackLists(abstractService);

            index.add(abstractService);
        }

        for (PCD mcd : mcds) {
            int n = query.getPredicates().size();
            boolean[] covering = new boolean[n];
            for (int i = 0; i < n; i++) {
                covering[i] = false;
            }

            for (Predicate predicate : mcd.getSubgoals()) {
                int m = query.getPredicates().indexOf(predicate);
                covering[m] = true;
            }
            coverList.put(mcd, covering);
        }
    }

    public static PCD getMCDfromPos(int subGoal, int pos) {
        return index.get(subGoal).get(pos);
    }

    public static boolean[] getCoverList(PCD pcd) {
        return coverList.get(pcd);
    }
    
    public static boolean[] getCoverList(int i, int j) {
        return getCoverList(index.get(i).get(j));
    }

    private static void setBlackLists(List<PCD> mcds) {
        for (int i = 0; i < mcds.size(); i++) {
            PCD mcd = mcds.get(i);
            for (int j = 0; j < mcd.getSubgoals().size(); j++) {
                Predicate pred = mcd.getSubgoals().get(j);
                int dom = query.getPredicates().indexOf(pred);

                blackList.put(new SubAndDesc(dom, i), j != 0);
            }
        }
    }

    public static boolean isBlackListed(int i, int j) {
        return blackList.get(new SubAndDesc(i, j));
    }

    private static List<PCD> getCoverageDomain(Predicate abstractService, List<PCD> mcds) {
        List<PCD> coverageDomain = new LinkedList<PCD>();

        for (int i = 0; i < mcds.size(); i++) {
            PCD mcd = mcds.get(i);
            List<Predicate> coveredSubGoals = mcd.getSubgoals();
            for (int j = 0; j < coveredSubGoals.size(); j++) {

                if (coveredSubGoals.get(j).equals(abstractService)) {
                    coverageDomain.add(mcd);
                    j = coveredSubGoals.size();
                }
            }
        }
        return coverageDomain;
    }
    
    public static List<PCD> getSubdomain(int i) {
        return index.get(i);
    }

}

class RankComparator implements Comparator<PCD> {

    @Override
    public int compare(PCD r1, PCD r2) {
        if (r1.getRank() == r2.getRank())
            return r1.getView().getName().compareTo(r2.getView().getName());
        else if (r1.getRank() > r2.getRank())
            return -1;
        else
            return 1;

    }
}

class SubAndDesc {

    private Integer first;
    private Integer second;

    public SubAndDesc(Integer first, Integer second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public int hashCode() {
        int hashFirst = first != null ? first.hashCode() : 0;
        int hashSecond = second != null ? second.hashCode() : 0;

        return (hashFirst + hashSecond) * hashSecond + hashFirst;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof SubAndDesc) {
            SubAndDesc otherPair = (SubAndDesc) other;
            return ((this.first == otherPair.first
                    || (this.first != null && otherPair.first != null
                    && this.first.equals(otherPair.first)))
                    && (this.second == otherPair.second
                    || (this.second != null && otherPair.second != null
                    && this.second.equals(otherPair.second))));
        }

        return false;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}
