package lyon3.iae.parser;

import java.lang.management.ManagementFactory;

import org.dom4j.DocumentException;

import lyon3.iae.rhone.Rhone;

public class Main {

	public static void main(String[] args) throws DocumentException {

		Rhone rhone = InputHandler.handleArguments("testcases.xml", "2");

		long start = ManagementFactory.getThreadMXBean().getCurrentThreadUserTime();

		rhone.selectServices();
		rhone.createCSDs();
		rhone.combineCSDs();

        long time = ManagementFactory.getThreadMXBean().getCurrentThreadUserTime() - start;
        System.out.println("Done in: " + time + "ns");
		rhone.print_rewritings();
	}
}
 