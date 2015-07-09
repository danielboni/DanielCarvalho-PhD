/*
 * Created on 20.01.2005
 * Programming project - Implementation of MiniCon algorithm
 */
package iae.algorithm.rhone;

import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.List;

import minicon.MCD;
import minicon.MCDMappings;
import minicon.MiniConPref;
import minicon.Rewriting;
import preference.BestFirst;
import preference.Index;
import preference.PreferencesFileParser;
import datalog.DatalogQuery;
import datalog.Predicate;

/**
 *
 * Extension of MiniConPref implementation to include user requirements, and SLA.
 *
 * @author Daniel Aguiar
 */
public class Rhone {

	public Rhone (DatalogQuery query, List<DatalogQuery> views) {
        this.query = query;
        this.views = views;
        this.pcds = new ArrayList<PCD>();
        this.rewritings = new ArrayList<Rewriting>();
    }

	private static int testID;

    /**
     * query Object used by algorithm
     */
    private DatalogQuery query;

    /**
     * list of views used by algorithm
     */
    private List<DatalogQuery> views;

    /**
     * list of PCDs created by algorithm.
     */
    private List<PCD> pcds;

    /**
     * list of rewritings created by the algorithm
     */
    private List<Rewriting> rewritings;

    /**
     * MiniCon constructor
     *
     * @param query query obtained from the parser
     * @param views list of views obtained from the parser
     */
//    public Rhone (DatalogQuery query, List<DatalogQuery> views) {
//        this.query = query;
//        this.views = views;
//        this.mcds = new ArrayList<MCD>();
//        this.rewritings = new ArrayList<Rewriting>();
//    }

    /**
     * Main method will be called to start the algorithm. It uses class
     * InputHandler to handle the arguments provided by parameter args.
     * InputHandler will return a MiniCon object which contains the query and a
     * list of views.
     *
     * @param args -v : verbose mode (print MCDs);
     *
     * -f FILE.XML ID : read testcase with ID from file;
     *
     * -sql : SQL input mode;
     *
     * -r : remove redundancies
     */
    public static void main(String[] args) throws Exception {
        
    	System.out.println("Rhone Algorithm");

        
        String[] argumentos = new String[3];
        argumentos[0] = "-f";
        argumentos[1] = "testcases.xml";
        argumentos[2] = "15";
        testID = Integer.parseInt(argumentos[2]);

        Rhone rhone = InputHandlerRhone.handleArguments(argumentos);

        if (rhone != null) {
        	
            rhone.printQuery();  // commented for time evaluation
            rhone.printViews();  // commented for time evaluation

            long start = ManagementFactory.getThreadMXBean().getCurrentThreadUserTime();
            
            rhone.startRhone();
            
            long time = ManagementFactory.getThreadMXBean().getCurrentThreadUserTime() - start;

            rhone.printRewritings(); // commented for time evaluation
            System.out.println("Done in: " + time + "ns");
        }

    }

    /**
     * The method will execute the actual algorithm. Three method calls will be
     * performed regarding to the three parts of the algorithm. 1. forming MCDs,
     * 2. combining MCDs, 3. remove redundancies; the last call depends on
     * whether argument -r is provided
     */
    
    public void startRhone() {
        
    	
    	/**
         * Old method to create MCDS: formMCDs(). Updated to createPCDs().
         */
//    	formMCDs();
    	this.createPCDs();
        
    	/*C.BA*/
        // set the MCD preferences ...
        try {

            PreferencesFileParser.setMCDPreferences(pcds, "preferences.xml", testID);

            Index.initialize(pcds, query);
            
            BestFirst bf = new BestFirst(query);

            rewritings = bf.getRewritings(query);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("OUPSS !!! " + e);
            System.out.println("mcds.size() = " + pcds.size());
            System.out.println("rewritings.size() = " + rewritings.size());
        }

    }
    
    /**
     * 
     * 
     * @ created by Daniel Aguiar
     */
    private void createPCDs() {

    	System.out.println("****** createPCDs() method ******");
    	
        List<Predicate> queryAbstractServices = query.getPredicates();
    	
        for (Predicate query_AbstractService : queryAbstractServices) {
    		
        	for (DatalogQuery concreteServices : views) {
        		
        		List<MCDMappings> mappings = createMapping(query_AbstractService, concreteServices);
        		
        		// for every mapping created check whether properties are
                // fulfilled
                for (MCDMappings map : mappings) {

                    // create MCD
                    PCD pcd = new PCD(query_AbstractService, query, concreteServices, map);

                    // MCD can be extend to fulfill properties
                    if (pcd.fulfillProperty())
                    	this.pcds.add(pcd);
                }
        	} 		
    	}      
        
        removeDuplicates();
        
        this.printPCDs();
        
        concatenatingPCDs();
        
        this.printPCDs();
        
        System.out.println("****** end of createPCDs() method ******");
        
    }
    

	/**
     * The old implementation creates more than one PCD for the same concrete service (view).
     * This method concatenates PCDs for the same concrete service in one single PCD.
     * @author Daniel Aguiar
     */
    private void concatenatingPCDs() {
		List<PCD> pcdsWithoutDuplicates = new ArrayList<PCD>();
		List<DatalogQuery> concreteServicesName = this.getConcreteServicesName();
		// Iterating on each different concrete service
		for (DatalogQuery concreteService : concreteServicesName) {
			List<Predicate> coveredAbstractServices = this.getCoveredAbstractServices(concreteService);
			List<MCDMappings> mappings = this.getMappings(concreteService);
			
			PCD newPCD = new PCD (coveredAbstractServices, mappings, concreteService);
			pcdsWithoutDuplicates.add(newPCD);

			//			System.out.println("::: Concrete Service: " + concreteService);
//			System.out.println("::: Number of PCDS for the same Concrete Service: " + duplicatedPCDs.size());
//			System.out.println("::: Number of covered abstract services for " + concreteService + ": " + duplicatedPCDs.size());
			
			//PCD newPCD = new PCD(subgoal, concreteService, view, mappings);
		}
			
		this.pcds = pcdsWithoutDuplicates;
	}
    
    

	private List<Predicate> getCoveredAbstractServices(
			DatalogQuery concreteService) {
		List<Predicate> coveredAbstractServices = new ArrayList<Predicate>();
		for (PCD pcd: pcds){
			if (pcd.view.equals(concreteService))
				coveredAbstractServices.addAll(pcd.coveredSubgoals);
		}
		return coveredAbstractServices;
	}

	private List<DatalogQuery> getConcreteServicesName() {
		List<DatalogQuery> concreteServicesName = new ArrayList<DatalogQuery>();
		for (PCD pcd: pcds){
			if (!concreteServicesName.contains(pcd.view))
				concreteServicesName.add(pcd.view);
		}
		return concreteServicesName;
	}

	private List<MCDMappings> getMappings(DatalogQuery concreteService) {
		List<MCDMappings> mappings = new ArrayList<MCDMappings>();
		for (PCD pcd: pcds){
			if (pcd.view.equals(concreteService))
				mappings.add(pcd.mappings);
		}
		return mappings;
	}

	/**
     * Called by formMCDs. The given query subgoal is tested if it can be mapped
     * to every predicate of the view. If a mapping is possible, a new mapping
     * object is added to the list of mappings.
     *
     * @param subgoal current query subgoal
     * @param view current view
     * @return list of possible mappings
     */
    protected List<MCDMappings> createMapping(Predicate subgoal, DatalogQuery view) {
        List<Predicate> viewPredicates = view.getPredicates();
        List<MCDMappings> mappings = new ArrayList<MCDMappings>();
        
        for (Predicate viewPred : viewPredicates) {
            if (subgoal.canBeMapped(viewPred)){
                mappings.add(new MCDMappings(subgoal, viewPred));
            }    
        }
        return mappings;
    }

    /**
     * Called by formMCDs. The method will remove duplicate MCDs. First the
     * empty list 'noDuplicates' will be created. By iterating through the
     * member list 'mcds', each MCD will be added to the noDuplicates list only
     * if there is no duplicate already contained in the list. The reference of
     * the member list mcds will finally be linked to the list noDuplicates. The
     * equality of the MCDs is determined by method 'equals' in class MCD.
     */
    protected void removeDuplicates() {

        List<PCD> noDuplicates = new ArrayList<PCD>();

        for (PCD mcd : pcds) {
            boolean contains = false;

            for (PCD noDup : noDuplicates) {
                if (mcd.equals(noDup))
                    contains = true;
            }
            if (!contains)
                noDuplicates.add(mcd);
        }
        pcds = noDuplicates;
    }

    /**
     * Print rewritings
     */
    protected void printRewritings() {
        if (!rewritings.isEmpty()) {
            System.out.println("\nRewriting(s):");
            for (Rewriting rw : rewritings) {
                System.out.println(rw);
            }
        }
    }

    /**
     * Print MCDs
     */
    protected void printPCDs() {
        if (pcds.isEmpty())
            System.out.println("\nNo MCDs created");
        else {
        	System.out.println("********* printPCDs() Method *********");
        	System.out.println("Created PCD's:");
            for (PCD pcd : pcds) {
                System.out.println("Concrete service: " + pcd.getView());
            }
            System.out.println("********* end of printPCDs() Method *********");
        }
    }

    /**
     * Print query provided by user
     */
    protected void printQuery() {
        System.out.println("\nQuery: " + query);
    }

    /**
     * Print views provided by user
     */
    protected void printViews() {
        for (DatalogQuery view : views) {
            System.out.println("View: " + view);

        }
    }

    /**
     * Returns list of Rewriting objects created by the algorithm.
     *
     * @return list of Rewriting objects
     */
    protected List<Rewriting> getRewritings() {
        return rewritings;
    }

}
