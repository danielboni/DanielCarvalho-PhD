package lyon3.iae.parser;

import java.lang.management.ManagementFactory;

import org.dom4j.DocumentException;

import lyon3.iae.rhone.Rhone;

public class Main {

	public static void main(String[] args) throws DocumentException {
		
//		Rhone rhone = InputHandler.handleArguments("testcases10.xml", "5");
//		//long start = ManagementFactory.getThreadMXBean().getCurrentThreadUserTime();
//		rhone.selectServices();
//		rhone.createCSDs();
//		rhone.combineCSDs();
//		rhone.print_permutations();
		
		for (Integer i = 0; i < 8; i++) {
			Rhone rhone = InputHandler.handleArguments("testcases14.xml", i.toString());
			long start = ManagementFactory.getThreadMXBean().getCurrentThreadUserTime();
			rhone.selectServices();
			rhone.createCSDs();
			rhone.combineCSDs();
			//rhone.print_rewritings();
			//rhone.print_permutations();
			long time = ManagementFactory.getThreadMXBean().getCurrentThreadUserTime() - start;
	        System.out.println("Testcase: " + i + " \tNumber of CSDs: " + rhone.getCsds().size() + "\tNumber of rewritings: " + rhone.getNumberOfRewritings() +  " \t--Done in: " + (double)time/1000000000 + " seconds");
		}
	}
}
 