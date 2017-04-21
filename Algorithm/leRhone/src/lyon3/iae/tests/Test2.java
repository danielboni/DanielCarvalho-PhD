package lyon3.iae.tests;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.sql.SQLException;

import org.dom4j.DocumentException;

import lyon3.iae.parser.InputHandler;
import lyon3.iae.reusability.QueryManager;
import lyon3.iae.rhone.Rhone;

public class Test2 {

	public static void main(String[] args) throws DocumentException, SQLException, IOException {
		
		String resultFileName = "result_test_2.txt";
		File file = new File(resultFileName);
		FileWriter writer = new FileWriter(file, true);
		
		/* Loop to run each test file R-T1 to R-T4 
		 * Each file contain 50 queries.
		 * R-T1: 2 abstract services
		 * R-T2: 3 abstract services
		 * R-T3: 4 abstract services
		 * R-T4: 5 abstract services 
		 * 
		 * This test rewrites each query.
		 * */
		for (int i = 1; i < 5; i++) {
			String testFileName = "R-T" + i + ".xml";
			
			writer.write("Results from queries with " + (i+1) + " abstract services.\n");
			
			/* Loop to process each query in the test file */
			for (Integer k = 0; k < 50; k++) {
			
				Rhone rhone = InputHandler.handleArguments(testFileName, k.toString());
				
				long start = ManagementFactory.getThreadMXBean().getCurrentThreadUserTime();
				
				rhone.selectCandidateServicesFromDB("");

				if (i == 1) {
					rhone.divideGroups2_NEW();
					rhone.combine2_NEW();
				} else if (i == 2) {
					rhone.divideGroups3_NEW();
					rhone.combine3_NEW();
				} else if (i == 3) {
					rhone.divideGroups4_NEW();
					rhone.combine4_NEW();	
				} else if (i == 4) {
					rhone.divideGroups5_NEW();
					rhone.combine5_NEW();
				}
				
				long time = ManagementFactory.getThreadMXBean().getCurrentThreadUserTime() - start;
				

				
				writer.write("Testcase: " + k + " \t" + (double)time/1000000000 + "\t" + " Quantidade de servicos: " + rhone.getCadidateConcreteServices().size() + "\n");
			}
			
		}
		writer.close();
		System.out.println("Process Finished");
	}

}
