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

public class Test11 {

	public static void main(String[] args) throws DocumentException, SQLException, IOException {
		
		String resultFileName = "result_test_11.txt";
		File file = new File(resultFileName);
		FileWriter writer = new FileWriter(file, true);
		
		writer.write("Database with 20000 queries.\n");
		
		/* Loop to run each test file R-T1 to R-T4 
		 * Each file contain 50 queries.
		 * R-T1: 2 abstract services
		 * R-T2: 3 abstract services
		 * R-T3: 4 abstract services
		 * R-T4: 5 abstract services 
		 * */
		for (int i = 5; i < 9; i++) {
			String testFileName = "R-T" + i + ".xml";
			
			writer.write("Results from queries with " + (i-3) + " abstract services.\n");
			System.out.println("Results from queries with " + (i-3) + " abstract services.");
			
			/* Loop to process each query in the test file */
			for (Integer k = 0; k < 50; k++) {
			
				Rhone rhone = InputHandler.handleArguments(testFileName, k.toString());
				QueryManager queryManager = new QueryManager();
				
				long tempInicial = System.currentTimeMillis();
				
				
//				System.out.println(String.format("%02d segundos  e %02d milisegundos", dif/60, dif%60));
				
				
//				long start = ManagementFactory.getThreadMXBean().getCurrentThreadUserTime();
				
				String r = queryManager.findSimilarityType(rhone.getQuery(), "query_history_9");
				
				long tempFinal = System.currentTimeMillis();
				long dif = (tempFinal - tempInicial);
//				long time = ManagementFactory.getThreadMXBean().getCurrentThreadUserTime() - start;
				
//				writer.write("Testcase: " + k + " \t" + (double)time/1000000000 + " \t" + r + "\n");
				writer.write("Testcase: " + k + " \t" + dif + "\n");
				System.out.println("Testcase: " + k + " \t" + dif + "\n");

			}
			
		}
		writer.close();
	}

}
