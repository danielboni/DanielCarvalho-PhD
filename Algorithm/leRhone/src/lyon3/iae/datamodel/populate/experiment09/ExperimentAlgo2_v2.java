package lyon3.iae.datamodel.populate.experiment09;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.dom4j.DocumentException;

import lyon3.iae.datamodel.ConcreteService;
import lyon3.iae.parser.InputHandler;
import lyon3.iae.reusability.QueryManager;
import lyon3.iae.rhone.Rhone;



/*
 * Autor: Daniel Aguiar
 * 
 * Descricao: classe que testa consultas de 2 abstratos em diferentes bases de dados
 * variando no delta que existe entre ela e as consultas que ja existem no banco.
 * 
 * */
public class ExperimentAlgo2_v2 {
	
	public static void main(String[] args) throws IOException, DocumentException, SQLException {
		
		String resultFileName = "result_test_Algo2_Size2.txt";
		
		File file = new File(resultFileName);
		FileWriter writer = new FileWriter(file, true);
		writer.write("Testing the algorithm 2.\n");
		
		String testFileName = "T1.xml";

		writer.write("Queries with size 2.\n");
		/* Loop to process each query in the test file */
		for (Integer k = 0; k < 50; k++) {
		
			Rhone rhone = InputHandler.handleArguments(testFileName, k.toString());
			QueryManager queryManager = new QueryManager();
			
			long tempInicial = System.currentTimeMillis();
			
			queryManager.findSimilarityType(rhone.getQuery(), "query_history_32");
			
			long tempFinal = System.currentTimeMillis();
			long dif = (tempFinal - tempInicial);

			writer.write("Testcase: " + k + " \t" + dif + "\n");
		}
		
		testFileName = "T2.xml";
		writer.write("Queries with size 3.\n");
		/* Loop to process each query in the test file */
		for (Integer k = 0; k < 50; k++) {
		
			Rhone rhone = InputHandler.handleArguments(testFileName, k.toString());
			QueryManager queryManager = new QueryManager();
			
			long tempInicial = System.currentTimeMillis();
			
			queryManager.findSimilarityType(rhone.getQuery(), "query_history_33");
			
			long tempFinal = System.currentTimeMillis();
			long dif = (tempFinal - tempInicial);

			writer.write("Testcase: " + k + " \t" + dif + "\n");
		}
		
		testFileName = "T3.xml";
		writer.write("Queries with size 4.\n");
		/* Loop to process each query in the test file */
		for (Integer k = 0; k < 50; k++) {
		
			Rhone rhone = InputHandler.handleArguments(testFileName, k.toString());
			QueryManager queryManager = new QueryManager();
			
			long tempInicial = System.currentTimeMillis();
			
			queryManager.findSimilarityType(rhone.getQuery(), "query_history_34");
			
			long tempFinal = System.currentTimeMillis();
			long dif = (tempFinal - tempInicial);

			writer.write("Testcase: " + k + " \t" + dif + "\n");
		}
		
		testFileName = "T4.xml";
		writer.write("Queries with size 5.\n");
		/* Loop to process each query in the test file */
		for (Integer k = 0; k < 50; k++) {
		
			Rhone rhone = InputHandler.handleArguments(testFileName, k.toString());
			QueryManager queryManager = new QueryManager();
			
			long tempInicial = System.currentTimeMillis();
			
			queryManager.findSimilarityType(rhone.getQuery(), "query_history_35");
			
			long tempFinal = System.currentTimeMillis();
			long dif = (tempFinal - tempInicial);

			writer.write("Testcase: " + k + " \t" + dif + "\n");
		}
		
		testFileName = "T5B.xml";
		writer.write("Queries with size 10.\n");
		/* Loop to process each query in the test file */
		for (Integer k = 0; k < 50; k++) {
		
			Rhone rhone = InputHandler.handleArguments(testFileName, k.toString());
			QueryManager queryManager = new QueryManager();
			
			long tempInicial = System.currentTimeMillis();
			
			queryManager.findSimilarityType(rhone.getQuery(), "query_history_36");
			
			long tempFinal = System.currentTimeMillis();
			long dif = (tempFinal - tempInicial);

			writer.write("Testcase: " + k + " \t" + dif + "\n");
		}
		writer.close();
	}	
}
