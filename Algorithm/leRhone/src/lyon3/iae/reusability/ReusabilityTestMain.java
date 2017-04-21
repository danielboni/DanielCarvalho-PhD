package lyon3.iae.reusability;

import java.lang.management.ManagementFactory;
import java.sql.SQLException;

import org.dom4j.DocumentException;

import lyon3.iae.parser.InputHandler;
import lyon3.iae.rhone.Rhone;

public class ReusabilityTestMain {

	public static void main(String[] args) throws DocumentException, SQLException {
		Rhone rhone = InputHandler.handleArguments("populate1.xml", "0");
		
		long start = ManagementFactory.getThreadMXBean().getCurrentThreadUserTime();
		
		QueryManager queryManager = new QueryManager();
		queryManager.findSimilarityType(rhone.getQuery(), "query_history");
		
		long time = ManagementFactory.getThreadMXBean().getCurrentThreadUserTime() - start;
		System.out.println("Time in seconds: " + (double)time/1000000000);
		
//		System.out.println("Testcase: " + 0 + " \tNumber of concrete services: " + rhone.getCadidateConcreteServices().size() +
//       		"\tNumber of rewritings: " + rhone.combinations.size() +  " \t--Done in: " + (double)time/1000000000 + " seconds \n");

	}

}
