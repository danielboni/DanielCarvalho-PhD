package lyon3.iae.datamodel.populate;

import java.lang.management.ManagementFactory;
import java.sql.SQLException;

import org.dom4j.DocumentException;

import lyon3.iae.parser.InputHandler;
import lyon3.iae.rhone.Rhone;

public class FeedingDatabaseMain {

	public static void main(String[] args) throws DocumentException, SQLException {

		/* FeedingAbstractServices feedAbstract = new FeedingAbstractServices();
		feedAbstract.populate(); */
		
//		FeedingDataServices feedDataServices = new FeedingDataServices();
//		feedDataServices.populate();
//		feedDataServices.populateJoinTable(); 
		
//		FeedingQueryHistory_10000 feedQueries = new FeedingQueryHistory_10000();
//		feedQueries.populate("query_history_11");
//		feedQueries.populateJoinTable("query_history_11");
		
		
		FeedingQueryHistory_2500 feedQueries = new FeedingQueryHistory_2500();
		feedQueries.populate("query_history_10");
		feedQueries.populateJoinTable("query_history_10");
		
//		
//		FeedingQueryHistory_5000 feedQueries = new FeedingQueryHistory_5000();
//		feedQueries.populate("query_history_9");
//		feedQueries.populateJoinTable("query_history_9"); 
//		
		
		
//		FeedingQueryHistory_7500 feedQueries = new FeedingQueryHistory_7500();
//		feedQueries.populate("query_history_8");
//		feedQueries.populateJoinTable("query_history_8");
		
		
//		Rhone rhone = InputHandler.handleArguments("populate1.xml", "0");
		
//		long start = ManagementFactory.getThreadMXBean().getCurrentThreadUserTime();
		
//		rhone.selectCandidateServicesFromDB();
//		rhone.divideGroups2_NEW();
//		rhone.combine2_NEW();
		
//		long time = ManagementFactory.getThreadMXBean().getCurrentThreadUserTime() - start;
		
//		System.out.println("Testcase: " + 0 + " \tNumber of concrete services: " + rhone.getCadidateConcreteServices().size() +
//        		"\tNumber of rewritings: " + rhone.combinations.size() +  " \t--Done in: " + (double)time/1000000000 + " seconds \n");
		
//		FeedingQueryHistory feedQueries = new FeedingQueryHistory();
//		feedQueries.populate();
//		feedQueries.populateJoinTable();
		//feedQueries.populateRewritings(1, rhone.getCombinations());
		
//		List<ConcreteService> concreteServices =  rhone.getConcreteServices();
//		for (ConcreteService concreteService : concreteServices) {
//			System.out.println(concreteService);
//		}
		//long start = ManagementFactory.getThreadMXBean().getCurrentThreadUserTime();
		//rhone.selectServices();
		//rhone.createCSDs();
		//rhone.divideGroups6();
		//rhone.combine6();

		/* long time = ManagementFactory.getThreadMXBean().getCurrentThreadUserTime() - start; /*
		
		/* System.out.println("Testcase: " + i + " \tNumber of CSDs: " + rhone.getCsds().size() + " \tNumber of concrete services: " + rhone.getConcreteServices().size() +
        		"\tNumber of rewritings: " + rhone.csdsPermutations.size() +  " \t--Done in: " + (double)time/1000000000 + " seconds \n" + "cost: " + rhone.total);
        System.gc(); */
	}

}
