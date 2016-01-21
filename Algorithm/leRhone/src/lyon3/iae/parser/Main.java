package lyon3.iae.parser;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.management.ManagementFactory;

import org.dom4j.DocumentException;

import lyon3.iae.rhone.Rhone;

public class Main {

	public static void main(String[] args) throws DocumentException {
		
		try {
			FileWriter file = new FileWriter("test1.txt");
			PrintWriter writer = new PrintWriter(file);
			writer.println("Results from experiment 1 (one).");
			
			for (Integer i = 0; i < 10; i++) {
				Rhone rhone = InputHandler.handleArguments("testcasesE1.xml", i.toString());
				long start = ManagementFactory.getThreadMXBean().getCurrentThreadUserTime();
				rhone.selectServices();
				rhone.createCSDs();
				rhone.divideGroups6();
				rhone.combine6();

				long time = ManagementFactory.getThreadMXBean().getCurrentThreadUserTime() - start;
				
				writer.println("Testcase: " + i + " \tNumber of CSDs: " + rhone.getCsds().size() + " \tNumber of concrete services: " + rhone.getConcreteServices().size() +
		        		"\tNumber of rewritings: " + rhone.getNumberOfRewritings() +  " \t--Done in: " + (double)time/1000000000 + " seconds");
		        System.gc();
			}
			
			FileWriter file2 = new FileWriter("test2.txt");
			PrintWriter writer2 = new PrintWriter(file2);
			writer2.println("Results from experiment 2 (two).");
			
			for (Integer i = 0; i < 10; i++) {
				Rhone rhone = InputHandler.handleArguments("testcasesE2.xml", i.toString());
				long start = ManagementFactory.getThreadMXBean().getCurrentThreadUserTime();
				rhone.selectServices();
				rhone.createCSDs();
				rhone.divideGroups6();
				rhone.combine6();

				long time = ManagementFactory.getThreadMXBean().getCurrentThreadUserTime() - start;
				
				writer2.println("Testcase: " + i + " \tNumber of CSDs: " + rhone.getCsds().size() + " \tNumber of concrete services: " + rhone.getConcreteServices().size() +
		        		"\tNumber of rewritings: " + rhone.getNumberOfRewritings() +  " \t--Done in: " + (double)time/1000000000 + " seconds");
				System.gc();
			}
			
			writer.close();
			writer2.close();
			System.out.println("The Rhone algorithm was run successfully.");
		} catch (IOException e) {
			System.out.println("A problem occured while writing the results.");
			e.printStackTrace();
		}
	}
}
 