package lyon3.iae.parser;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.management.ManagementFactory;

import org.dom4j.DocumentException;

import lyon3.iae.rhone.Rhone;

public class Main {

	public static void main(String[] args) throws DocumentException, IOException {
		// -XX:-UseGCOverheadLimit -Xms1024M -Xmx7120M
		for (Integer i = 0; i < 6; i++) {
			
			System.out.println("Starting ...");
			
			Rhone rhone = InputHandler.handleArguments("testcasesD.xml", i.toString());
			long start = ManagementFactory.getThreadMXBean().getCurrentThreadUserTime();
			rhone.selectServices();
			rhone.createCSDs();
			rhone.divideGroups6();
			rhone.combine6();

			long time = ManagementFactory.getThreadMXBean().getCurrentThreadUserTime() - start;
			
			System.out.println("Testcase: " + i + " \tNumber of CSDs: " + rhone.getCsds().size() + " \tNumber of concrete services: " + rhone.getConcreteServices().size() +
	        		"\tNumber of rewritings: " + rhone.csdsPermutations.size() +  " \t--Done in: " + (double)time/1000000000 + " seconds \n" + "cost: " + rhone.total);
//			writer.write("Testcase: " + i + " \tNumber of CSDs: " + rhone.getCsds().size() + " \tNumber of concrete services: " + rhone.getConcreteServices().size() +
//	        		"\tNumber of rewritings: " + rhone.getNumberOfRewritings() +  " \t--Done in: " + (double)time/1000000000 + " seconds \n");
	        System.gc();
//	        writer.close();
		}
		
//		File file = new File("test1.txt");
//		File file2 = new File("test2.txt");
//		try {
//			
//			for (Integer i = 0; i < 10; i++) {
//				FileWriter writer = new FileWriter(file, true);
//				writer.write("Results from experiment 1 (one). \n");
//				Rhone rhone = InputHandler.handleArguments("testcasesA1.xml", i.toString());
//				long start = ManagementFactory.getThreadMXBean().getCurrentThreadUserTime();
//				rhone.selectServices();
//				rhone.createCSDs();
//				rhone.divideGroups6();
//				rhone.combine6();
//
//				long time = ManagementFactory.getThreadMXBean().getCurrentThreadUserTime() - start;
//				
//				writer.write("Testcase: " + i + " \tNumber of CSDs: " + rhone.getCsds().size() + " \tNumber of concrete services: " + rhone.getConcreteServices().size() +
//		        		"\tNumber of rewritings: " + rhone.getNumberOfRewritings() +  " \t--Done in: " + (double)time/1000000000 + " seconds \n");
//		        System.gc();
//		        writer.close();
//			}
//			
//			for (Integer i = 0; i < 10; i++) {
//				FileWriter writer2 = new FileWriter(file2, true);
//				writer2.write("Results from experiment 2 (one). \n");
//				Rhone rhone = InputHandler.handleArguments("testcasesA2.xml", i.toString());
//				long start = ManagementFactory.getThreadMXBean().getCurrentThreadUserTime();
//				rhone.selectServices();
//				rhone.createCSDs();
//				rhone.divideGroups6();
//				rhone.combine6();
//
//				long time = ManagementFactory.getThreadMXBean().getCurrentThreadUserTime() - start;
//				
//				writer2.write("Testcase: " + i + " \tNumber of CSDs: " + rhone.getCsds().size() + " \tNumber of concrete services: " + rhone.getConcreteServices().size() +
//		        		"\tNumber of rewritings: " + rhone.getNumberOfRewritings() +  " \t--Done in: " + (double)time/1000000000 + " seconds \n");
//				System.gc();
//				writer2.close();
//			}
//			
//			
//			
//			System.out.println("The Rhone algorithm was run successfully.");
//		} catch (IOException e) {
//			System.out.println("A problem occured while writing the results.");
//			e.printStackTrace();
//		}
	}
}
 