package lyon3.iae.datamodel.populate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import lyon3.iae.datamodel.ConcreteService;



/*
 * Autor: Daniel Aguiar
 * 
 * Descricao: Classe responsavel por alimentar o banco de dados com consultas.
 * 
 * */
public class FeedingQueryHistory_10000B {
	
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
		
			for (int i = 1; i < 2501; i++) {
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
				
			
			for (int i = 2501; i < 5001; i++) {
				String sql1 = "insert into tb_query_history values (?, ?, ?, ?, "
						+ "'95', '3', '0.7', 'yes', 'yes', 'medium', 'low', 'reliable', 'working hours', '2', 'text', 'yes', "
						+ "'not certified', '7', '10');";
				
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				stmt.setString(2, "Processed");
		        stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
		        stmt.setString(4, "Q"+i+"(x?; y!, z!) := A1(x?; p!), A2(p?; y!), A3(p?; z!)");
		        
				stmt.execute();
				stmt.close();
			}
	        
			
			
			for (int i = 5001; i < 7501; i++) {
				String sql1 = "insert into tb_query_history values (?, ?, ?, ?, "
						+ "'96', '2', '0.6', 'yes', 'yes', 'medium', 'low', 'reliable', 'working hours', '2', 'text', 'yes', "
						+ "'not certified', '7', '10');";
				
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				stmt.setString(2, "Reused");
		        stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
		        stmt.setString(4, "Q"+i+"(x?, d?; y!, z!) := A1(x?; p!), A2(p?; y!), A3(p?; z!), A4(d?; p!)");
		        
				stmt.execute();
				stmt.close();
			}
			
			for (int i = 7501; i < 10001; i++) {
				String sql1 = "insert into tb_query_history values (?, ?, ?, ?, "
						+ "'96', '3', '0.6', 'no', 'yes', 'medium', 'low', 'reliable', 'working hours', '2', 'text', 'yes', "
						+ "'not certified', '7.5', '10');";
				
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				stmt.setString(2, "Processed");
		        stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
		        stmt.setString(4, "Q"+i+"(x?, d?; z!) := A1(x?; p!), A2(p?; z!), A3(p?; z!), A4(d?; p!), A5(d?; p!)");
		        
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
	
			for (int i = 1; i < 2501; i++) {
				String sql1 = "insert into tb_query_abstract values (?, ?);";
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				for (int j = 1; j < 3; j++) {
					stmt.setInt(2, j);
					stmt.execute();
				}
				stmt.close();
			}
			
			for (int i = 2501; i < 5001; i++) {
				String sql1 = "insert into tb_query_abstract values (?, ?);";
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				for (int j = 1; j < 4; j++) {
					stmt.setInt(2, j);
					stmt.execute();
				}
				stmt.close();
			}
			
			for (int i = 5001; i < 7501; i++) {
				String sql1 = "insert into tb_query_abstract values (?, ?);";
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				for (int j = 1; j < 5; j++) {
					stmt.setInt(2, j);
					stmt.execute();
				}
				stmt.close();
			}
			
			for (int i = 7501; i < 10001; i++) {
				String sql1 = "insert into tb_query_abstract values (?, ?);";
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				for (int j = 1; j < 6; j++) {
					stmt.setInt(2, j);
					stmt.execute();
				}
				stmt.close();
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
