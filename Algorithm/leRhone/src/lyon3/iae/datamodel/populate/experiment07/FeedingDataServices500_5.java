package lyon3.iae.datamodel.populate.experiment07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/*
 * Autor: Daniel Aguiar
 * 
 * Descricao: Classe responsavel por alimentar o banco de dados com servi�os de dados concretos.
 * 
 * */
public class FeedingDataServices500_5 {
	
	public static void main(String[] args) {
		FeedingDataServices500_5 feeding = new FeedingDataServices500_5();
		feeding.populate("query_history_15");
		feeding.populateJoinTable("query_history_15");
	}
	
	public void populate(String dbName) {
		
		String driverName = "com.mysql.jdbc.Driver";                        
		 
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}


		String serverName = "localhost";  
		String mydatabase = dbName;       
		String url = "jdbc:mysql://" + serverName + "/" + mydatabase;

		String username = "root";      
		String password = "1234";

		try {
			Connection connection = DriverManager.getConnection(url, username, password);
			
			System.out.println("Connected to the database.");
			System.out.println("Feeding the database with concrete data services...");
			
			for (int i = 1; i < 101; i++) {
				String sql1 = "insert into tb_concrete_service values (?, ?, ?, "
						+ "'96', '1', '0.5', 'yes', 'yes', 'medium', 'low', 'reliable', 'working hours', '2', 'text', 'yes', 'not certified');";
				
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				stmt.setString(2, "DS"+i);
		        stmt.setString(3, "DS"+i+"(x?; y!) := A1(x?; y!)");
				
				stmt.execute();
				stmt.close();
			}
	        
			for (int i = 101; i < 201; i++) {
				String sql1 = "insert into tb_concrete_service values (?, ?, ?, "
						+ "'96', '1', '0.5', 'yes', 'yes', 'medium', 'low', 'reliable', 'working hours', '2', 'text', 'yes', 'not certified');";
				
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				stmt.setString(2, "DS"+i);
		        stmt.setString(3, "DS"+i+"(x?; y!) := A2(x?; y!)");
				
				stmt.execute();
				stmt.close();
			}
			
			for (int i = 201; i < 301; i++) {
				String sql1 = "insert into tb_concrete_service values (?, ?, ?, "
						+ "'96', '1', '0.5', 'yes', 'yes', 'medium', 'low', 'reliable', 'working hours', '2', 'text', 'yes', 'not certified');";
				
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				stmt.setString(2, "DS"+i);
		        stmt.setString(3, "DS"+i+"(x?; y!) := A3(x?; y!)");
				
				stmt.execute();
				stmt.close();
			}
			
			for (int i = 301; i < 401; i++) {
				String sql1 = "insert into tb_concrete_service values (?, ?, ?, "
						+ "'96', '1', '0.5', 'yes', 'yes', 'medium', 'low', 'reliable', 'working hours', '2', 'text', 'yes', 'not certified');";
				
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				stmt.setString(2, "DS"+i);
		        stmt.setString(3, "DS"+i+"(x?; y!) := A4(x?; y!)");
				
				stmt.execute();
				stmt.close();
			}
			
			for (int i = 401; i < 501; i++) {
				String sql1 = "insert into tb_concrete_service values (?, ?, ?, "
						+ "'96', '1', '0.5', 'yes', 'yes', 'medium', 'low', 'reliable', 'working hours', '2', 'text', 'yes', 'not certified');";
				
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				stmt.setString(2, "DS"+i);
		        stmt.setString(3, "DS"+i+"(x?; y!) := A5(x?; y!)");
				
				stmt.execute();
				stmt.close();
			}
			
			connection.close();
	        
	        System.out.println("Concrete data services registered.");
	        
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void populateJoinTable (String dbName) {
		
		String driverName = "com.mysql.jdbc.Driver";                        
		 
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}


		String serverName = "localhost";  
		String mydatabase = dbName;       
		String url = "jdbc:mysql://" + serverName + "/" + mydatabase;

		String username = "root";      
		String password = "1234";

		try {
			Connection connection = DriverManager.getConnection(url, username, password);
			
			if (connection != null)
				 System.out.println("Connected to the database.");
			
			System.out.println("Feeding the database in the join table concrete/abstract services...");			
			
			for (int i = 1; i < 101; i++) {
				String sql1 = "insert into tb_concrete_abstract values (?, '1');";		
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
		
				stmt.execute();
				stmt.close();
			}
			
			for (int i = 101; i < 201; i++) {
				String sql1 = "insert into tb_concrete_abstract values (?, '2');";		
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
		
				stmt.execute();
				stmt.close();
			}
			
			for (int i = 201; i < 301; i++) {
				String sql1 = "insert into tb_concrete_abstract values (?, '3');";		
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
		
				stmt.execute();
				stmt.close();
			}
			
			for (int i = 301; i < 401; i++) {
				String sql1 = "insert into tb_concrete_abstract values (?, '4');";		
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
		
				stmt.execute();
				stmt.close();
			}
	    
			for (int i = 401; i < 501; i++) {
				String sql1 = "insert into tb_concrete_abstract values (?, '5');";		
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
		
				stmt.execute();
				stmt.close();
			}
			
			connection.close();
	        
	        System.out.println("Concrete/Abstract services registered.");
	        
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}