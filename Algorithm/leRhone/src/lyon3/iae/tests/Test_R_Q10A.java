package lyon3.iae.tests;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;

import org.dom4j.DocumentException;

import lyon3.iae.parser.InputHandler;
import lyon3.iae.reusability.QueryManager;
import lyon3.iae.rhone.Rhone;

public class Test_R_Q10A {

	public static void main(String[] args) throws DocumentException, SQLException, IOException {
		
		String resultFileName = "result_test_R_Q10A.txt";
		File file = new File(resultFileName);
		FileWriter writer = new FileWriter(file, true);

		String testFileName = "R-T10.xml";
		writer.write("Results from queries with 10 abstract services.\n");
		
		writer.write("Database with 10.000 matches.\n");
		
		/* Loop to process each query in the test file */
		for (Integer k = 0; k < 50; k++) {
			Rhone rhone = InputHandler.handleArguments(testFileName, k.toString());
			QueryManager queryManager = new QueryManager();

			long tempInicial = System.currentTimeMillis();

			queryManager.findSimilarityType(rhone.getQuery(), "query_history_11");

			long tempFinal = System.currentTimeMillis();
			long dif = (tempFinal - tempInicial);

			writer.write("Testcase: " + k + " \t" + dif + "\n");
		}

		writer.write("Database with 7.500 matches.\n");
		
		/* Loop to process each query in the test file */
		for (Integer k = 0; k < 50; k++) {
			Rhone rhone = InputHandler.handleArguments(testFileName, k.toString());
			QueryManager queryManager = new QueryManager();

			long tempInicial = System.currentTimeMillis();

			queryManager.findSimilarityType(rhone.getQuery(), "query_history_8");

			long tempFinal = System.currentTimeMillis();
			long dif = (tempFinal - tempInicial);

			writer.write("Testcase: " + k + " \t" + dif + "\n");
		}

		writer.write("Database with 5.000 matches.\n");
		
		/* Loop to process each query in the test file */
		for (Integer k = 0; k < 50; k++) {
			Rhone rhone = InputHandler.handleArguments(testFileName, k.toString());
			QueryManager queryManager = new QueryManager();

			long tempInicial = System.currentTimeMillis();

			queryManager.findSimilarityType(rhone.getQuery(), "query_history_9");

			long tempFinal = System.currentTimeMillis();
			long dif = (tempFinal - tempInicial);

			writer.write("Testcase: " + k + " \t" + dif + "\n");
		}

		writer.write("Database with 2.500 matches.\n");
		
		/* Loop to process each query in the test file */
		for (Integer k = 0; k < 50; k++) {
			Rhone rhone = InputHandler.handleArguments(testFileName, k.toString());
			QueryManager queryManager = new QueryManager();

			long tempInicial = System.currentTimeMillis();

			queryManager.findSimilarityType(rhone.getQuery(), "query_history_10");

			long tempFinal = System.currentTimeMillis();
			long dif = (tempFinal - tempInicial);

			writer.write("Testcase: " + k + " \t" + dif + "\n");
		}

		
		writer.close();
	}

}
