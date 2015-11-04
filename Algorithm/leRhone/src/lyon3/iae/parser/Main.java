package lyon3.iae.parser;

import java.lang.management.ManagementFactory;

import org.dom4j.DocumentException;

import lyon3.iae.rhone.Rhone;

public class Main {

	public static void main(String[] args) throws DocumentException {
<<<<<<< .merge_file_PhGzRU
		Rhone rhone = InputHandler.handleArguments("testcases.xml", "2");
		//System.out.println(rhone.toString());
=======
		Rhone rhone = InputHandler.handleArguments("testcases1.xml", "4");
		long start = ManagementFactory.getThreadMXBean().getCurrentThreadUserTime();
>>>>>>> .merge_file_YxVKEW
		rhone.selectServices();
		rhone.createCSDs();
		rhone.combineCSDs();
<<<<<<< .merge_file_PhGzRU
		rhone.print_permutations();
		rhone.printQuery();
=======
        long time = ManagementFactory.getThreadMXBean().getCurrentThreadUserTime() - start;
        System.out.println("Done in: " + time + "ns");
>>>>>>> .merge_file_YxVKEW
		rhone.print_rewritings();
	}
}
 