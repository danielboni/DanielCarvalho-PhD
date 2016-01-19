package lyon3.iae.parser;

import java.lang.management.ManagementFactory;

import org.dom4j.DocumentException;

import lyon3.iae.datamodel.CSD;
import lyon3.iae.rhone.Rhone;

public class Main {

	public static void main(String[] args) throws DocumentException {
		
		for (Integer i = 0; i < 6; i++) {
			Rhone rhone = InputHandler.handleArguments("testcasesD.xml", i.toString());
			long start = ManagementFactory.getThreadMXBean().getCurrentThreadUserTime();
			rhone.selectServices();
			//rhone.printCandidateServices();
			rhone.createCSDs();
			//rhone.print_CSDS();
			rhone.divideGroups6();
			rhone.combine6();
			//rhone.combineCSDs();
			//rhone.print_permutations();
			long time = ManagementFactory.getThreadMXBean().getCurrentThreadUserTime() - start;
	        System.out.println("Testcase: " + i + " \tNumber of CSDs: " + rhone.getCsds().size() + 
	        		"\tNumber of rewritings: " + rhone.getNumberOfRewritings() +  " \t--Done in: " + (double)time/1000000000 + " seconds");
	        System.gc();
		}
	}
}
 