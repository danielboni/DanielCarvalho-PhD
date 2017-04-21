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

public class Test8 {

	public static void main(String[] args) throws DocumentException, SQLException, IOException {
		
		String resultFileName = "result_test_8.txt";
		File file = new File(resultFileName);
		FileWriter writer = new FileWriter(file, true);

		writer.write("Database with 5000 queries.\n");
		writer.write("Results from queries with 2 abstract services.\n");

		QueryManager queryManager = new QueryManager();
		
		/* Loop to process each query in the test file */
		for (Integer k = 0; k < 50; k++) {

			Rhone rhone = InputHandler.handleArguments("R-T5.xml", k.toString());

			long start = ManagementFactory.getThreadMXBean().getCurrentThreadUserTime();

			queryManager.findSimilarityType(rhone.getQuery(), "query_history_7");

			long time = ManagementFactory.getThreadMXBean().getCurrentThreadUserTime() - start;

			writer.write("Testcase: " + k + " \t" + (double)time/1000000000 + "\n");
			//writer.write("Testcase: " + k + " \t" + (double)time/1000000000 + " \t" + r + "\n");
		}

		writer.close();
	}

}
