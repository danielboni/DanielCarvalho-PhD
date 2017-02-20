package lyon3.iae.datamodel.populate;

import org.dom4j.DocumentException;

public class FeedingDatabaseMain {

	public static void main(String[] args) throws DocumentException {

		/* FeedingAbstractServices feedAbstract = new FeedingAbstractServices();
		feedAbstract.populate(); */
		
		/* FeedingDataServices feedDataServices = new FeedingDataServices();
		feedDataServices.populate();
		feedDataServices.populateJoinTable(); */
		
		FeedingQueryHistory feedQueries = new FeedingQueryHistory();
		feedQueries.populate();
		
//		Rhone rhone = InputHandler.handleArguments("populate1.xml", "0");
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
