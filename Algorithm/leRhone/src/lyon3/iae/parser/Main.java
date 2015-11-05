package lyon3.iae.parser;

import java.lang.management.ManagementFactory;

import org.dom4j.DocumentException;

import lyon3.iae.rhone.Rhone;

public class Main {

	public static void main(String[] args) throws DocumentException {
		int k = 0;
		for (Integer i = 0; i < 6; i++) {
			Rhone rhone = InputHandler.handleArguments("testcases10.xml", i.toString());
			long start = ManagementFactory.getThreadMXBean().getCurrentThreadUserTime();
			rhone.selectServices();
			rhone.createCSDs();
			rhone.combineCSDs();
			long time = ManagementFactory.getThreadMXBean().getCurrentThreadUserTime() - start;
			if (k == 20)
				k = 0;
			k += 2;
	        System.out.println("Testcase: " + i + " \tNumber of CSDs: " + k + "\tNumber of rewritings: " + rhone.getNumberOfRewritings() +  " \t--Done in: " + (double)time/1000000000 + " seconds");
		}
	}
}
 