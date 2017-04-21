package lyon3.iae.datamodel.populate.experiment8;

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
 * Descricao: Classe responsavel por alimentar o banco de dados com consultas.
 * 
 * */
public class QueryHistory_500 {
	
	
	public static void main(String[] args) throws IOException, DocumentException, SQLException {
		/*
		QueryHistory_500 h = new QueryHistory_500();
		h.populate("query_history_28");
		h.populateJoinTable("query_history_28");
		*/
		String resultFileName = "result_test_28.txt";
		File file = new File(resultFileName);
		FileWriter writer = new FileWriter(file, true);
		
		writer.write("Database with 2500 queries.\n");
		
		/* Loop to run each test file R-T1 to R-T4 
		 * Each file contain 50 queries.
		 * T1: 2 abstract services
		 * T2: 3 abstract services
		 * T3: 4 abstract services
		 * T4: 5 abstract services
		 * T5: 10 abstract services 
		 * */
		for (int i = 1; i < 6; i++) {
			String testFileName = "T" + i + ".xml";
			
			writer.write("Results from queries with " + (i+1) + " abstract services.\n");
			System.out.println("Results from queries with " + (i+1) + " abstract services.");
			
			/* Loop to process each query in the test file */
			for (Integer k = 0; k < 50; k++) {
			
				Rhone rhone = InputHandler.handleArguments(testFileName, k.toString());
				QueryManager queryManager = new QueryManager();
				
				long tempInicial = System.currentTimeMillis();
				
				
//				System.out.println(String.format("%02d segundos  e %02d milisegundos", dif/60, dif%60));
				
				
//				long start = ManagementFactory.getThreadMXBean().getCurrentThreadUserTime();
				
				String r = queryManager.findSimilarityType(rhone.getQuery(), "query_history_28");
				
				long tempFinal = System.currentTimeMillis();
				long dif = (tempFinal - tempInicial);
//				long time = ManagementFactory.getThreadMXBean().getCurrentThreadUserTime() - start;
				
//				writer.write("Testcase: " + k + " \t" + (double)time/1000000000 + " \t" + r + "\n");
				writer.write("Testcase: " + k + " \t" + dif + "\n");

			}
			
		}
		writer.close();
		
		
	}
	
	public void populate(String databaseName) {
		
		String driverName = "com.mysql.jdbc.Driver";                        
		 
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}


		String serverName = "localhost";  
		String mydatabase = databaseName;       
		String url = "jdbc:mysql://" + serverName + "/" + mydatabase;

		String username = "root";      
		String password = "1234";

		try {
			Connection connection = DriverManager.getConnection(url, username, password);
			
			if (connection != null)
				 System.out.println("Connected to the database.");
			
			System.out.println("Feeding the database with queries...");
		
			System.out.println("0...");
			for (int i = 1; i < 501; i++) {
				String sql1 = "insert into tb_query_history values (?, ?, ?, ?, "
						+ "'96', '1', '0.5', 'yes', 'yes', 'medium', 'low', 'reliable', 'working hours', '2', 'text', 'yes', "
						+ "'not certified', '5', '10');";
				
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				stmt.setString(2, "Processed");
		        stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
		        stmt.setString(4, "Q"+i+"(x?; y!) := A1(x?; p!), A2(p?; y!)");
		        
				stmt.execute();
				stmt.close();
			}
			System.out.println("10001...");
			for (int i = 501; i < 1001; i++) {
				String sql1 = "insert into tb_query_history values (?, ?, ?, ?, "
						+ "'96', '1', '0.5', 'yes', 'yes', 'medium', 'low', 'reliable', 'working hours', '2', 'text', 'yes', "
						+ "'not certified', '5', '10');";
				
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				stmt.setString(2, "Processed");
		        stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
		        stmt.setString(4, "Q"+i+"(x?; y!, z!) := A1(x?; p!), A2(p?; y!), A3(p?; z!)");
		        
				stmt.execute();
				stmt.close();
			}
			System.out.println("20001...");
			for (int i = 1001; i < 1501; i++) {
				String sql1 = "insert into tb_query_history values (?, ?, ?, ?, "
						+ "'96', '1', '0.5', 'yes', 'yes', 'medium', 'low', 'reliable', 'working hours', '2', 'text', 'yes', "
						+ "'not certified', '5', '10');";
				
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				stmt.setString(2, "Processed");
		        stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
		        stmt.setString(4, "Q"+i+"(x?, d?; y!, z!) := A1(x?; p!), A2(p?; y!), A3(p?; z!), A4(d?; p!)");
		        
				stmt.execute();
				stmt.close();
			}
			System.out.println("30001...");
			for (int i = 1501; i < 2001; i++) {
				String sql1 = "insert into tb_query_history values (?, ?, ?, ?, "
						+ "'96', '1', '0.5', 'yes', 'yes', 'medium', 'low', 'reliable', 'working hours', '2', 'text', 'yes', "
						+ "'not certified', '5', '10');";
				
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				stmt.setString(2, "Processed");
		        stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
		        stmt.setString(4, "Q"+i+"(x?, d?; z!) := A1(x?; p!), A2(p?; z!), A3(p?; z!), A4(d?; p!), A5(d?; p!)");
		        
				stmt.execute();
				stmt.close();
			}
			
			System.out.println("30001...");
			for (int i = 2001; i < 2501; i++) {
				String sql1 = "insert into tb_query_history values (?, ?, ?, ?, "
						+ "'96', '1', '0.5', 'yes', 'yes', 'medium', 'low', 'reliable', 'working hours', '2', 'text', 'yes', "
						+ "'not certified', '5', '10');";
				
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				stmt.setString(2, "Processed");
		        stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
		        stmt.setString(4, "Q"+i+"(x?, d?; z!) := A1(x?; p!), A2(p?; z!), A3(p?; z!), A4(d?; p!), A5(d?; p!),A6(x?; p!), A7(p?; z!), A8(p?; z!), A9(d?; p!), A10(d?; p!)");
		        
				stmt.execute();
				stmt.close();
			}
			
			connection.close();
	        
	        System.out.println("Queries registered.");
	        
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void populateJoinTable (String databaseName) {
		
		String driverName = "com.mysql.jdbc.Driver";                        
		 
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}


		String serverName = "localhost";  
		String mydatabase = databaseName;       
		String url = "jdbc:mysql://" + serverName + "/" + mydatabase;

		String username = "root";      
		String password = "1234";

		try {
			Connection connection = DriverManager.getConnection(url, username, password);
			
			if (connection != null)
				 System.out.println("Connected to the database.");
			
			System.out.println("Feeding the database in the join table query/abstract services...");			
	
			System.out.println("2 abstracts...");
			for (int i = 1; i < 501; i++) {
				String sql1 = "insert into tb_query_abstract values (?, ?);";
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				for (int j = 1; j < 3; j++) {
					stmt.setInt(2, j);
					stmt.execute();
				}
				stmt.close();
				System.out.println("feito " + i);
			}
			
			System.out.println("3 abstracts...");
			for (int i = 501; i < 1001; i++) {
				String sql1 = "insert into tb_query_abstract values (?, ?);";
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				for (int j = 1; j < 4; j++) {
					stmt.setInt(2, j);
					stmt.execute();
				}
				stmt.close();
				System.out.println("feito " + i);
			}
			
			System.out.println("4 abstracts...");
			for (int i = 1001; i < 1501; i++) {
				String sql1 = "insert into tb_query_abstract values (?, ?);";
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				for (int j = 1; j < 5; j++) {
					stmt.setInt(2, j);
					stmt.execute();
				}
				stmt.close();
				System.out.println("feito " + i);
			}
			
			System.out.println("5 abstracts...");
			for (int i = 1501; i < 2001; i++) {
				String sql1 = "insert into tb_query_abstract values (?, ?);";
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				for (int j = 1; j < 6; j++) {
					stmt.setInt(2, j);
					stmt.execute();
				}
				stmt.close();
				System.out.println("feito " + i);
			}
			
			System.out.println("5 abstracts...");
			for (int i = 2001; i < 2501; i++) {
				String sql1 = "insert into tb_query_abstract values (?, ?);";
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				for (int j = 1; j < 11; j++) {
					stmt.setInt(2, j);
					stmt.execute();
				}
				stmt.close();
				System.out.println("feito " + i);
			}
			
			connection.close();
	        
	        System.out.println("Query/Abstract services registered.");
	        
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void populateRewritings(int idQuery, List<List<ConcreteService>> combinations) throws SQLException{
		int idComb = 1;
		for (List<ConcreteService> list : combinations) {
			PreparedStatement stmt = null;
			Connection connection = null;
			for (ConcreteService concreteService : list) {
					
				String driverName = "com.mysql.jdbc.Driver";                        
				 
				try {
					Class.forName(driverName);
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				}


				String serverName = "localhost";  
				String mydatabase = "query_history";       
				String url = "jdbc:mysql://" + serverName + "/" + mydatabase;

				String username = "root";      
				String password = "1234";

				try {
					connection = DriverManager.getConnection(url, username, password);
					
					if (connection != null)
						 System.out.println("Connected to the database.");
					
					System.out.println("Feeding the database combinations of data services...");			
					
					String sql = "insert into tb_combination values (?, ?);";
					
					stmt = connection.prepareStatement(sql);
					stmt.setInt(1, idComb);
					stmt.setInt(2, concreteService.getId());
					stmt.execute();
			        System.out.println("Combinations registered.");
			        
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		
			// Inserir na tabela rewritings
			System.out.println("Feeding the database rewritings of the query...");	
			String sql2 = "insert into tb_rewriting values (?, ?);";
			
			stmt = connection.prepareStatement(sql2);
			stmt.setInt(1, idQuery);
			stmt.setInt(2, idComb);
			stmt.execute();
	        System.out.println("Combinations registered.");
			
			stmt.close();
	        connection.close();
			idComb++;
		}	
	}
}
