package lyon3.iae.datamodel.populate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;



/*
 * Autor: Daniel Aguiar
 * 
 * Descricao: Classe responsavel por alimentar o banco de dados com consultas.
 * 
 * */
public class FeedingQueryHistory {
	
	public void populate() {
		
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
			Connection connection = DriverManager.getConnection(url, username, password);
			
			if (connection != null)
				 System.out.println("Connected to the database.");
			
			System.out.println("Feeding the database with queries...");
			
			for (int i = 1; i < 21; i++) {
				String sql1 = "insert into tb_query_history values (?, ?, ?, ?, "
						+ "'96', '1', '0.5', 'yes', 'yes', 'medium', 'low', 'reliable', 'working hours', '2', 'text', 'yes', "
						+ "'not certified', '5', '10');";
				
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				stmt.setString(2, "Reused	");
		        stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
		        stmt.setString(4, "Q"+i+"(x?; y!) := A1(x?; p!), A2(p?; y!)");
		        
				stmt.execute();
				stmt.close();
			}
			
			for (int i = 21; i < 41; i++) {
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
	        
			for (int i = 41; i < 61; i++) {
				String sql1 = "insert into tb_query_history values (?, ?, ?, ?, "
						+ "'96', '1', '0.5', 'yes', 'yes', 'medium', 'low', 'reliable', 'working hours', '2', 'text', 'yes', "
						+ "'not certified', '5', '10');";
				
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				stmt.setString(2, "Reused");
		        stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
		        stmt.setString(4, "Q"+i+"(x?, d?; y!, z!) := A1(x?; p!), A2(p?; y!), A3(p?; z!), A4(d?; p!)");
		        
				stmt.execute();
				stmt.close();
			}
			
			for (int i = 61; i < 81; i++) {
				String sql1 = "insert into tb_query_history values (?, ?, ?, ?, "
						+ "'96', '1', '0.5', 'yes', 'yes', 'medium', 'low', 'reliable', 'working hours', '2', 'text', 'yes', "
						+ "'not certified', '5', '10');";
				
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				stmt.setString(2, "Processed");
		        stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
		        stmt.setString(4, "Q"+i+"(p?, d?; z!) := A3(p?; z!), A4(d?; p!)");
		        
				stmt.execute();
				stmt.close();
			}
			
	        connection.close();
	        
	        System.out.println("Queries registered.");
	        
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void populateJoinTable () {
		
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
			Connection connection = DriverManager.getConnection(url, username, password);
			
			if (connection != null)
				 System.out.println("Connected to the database.");
			
			System.out.println("Feeding the database in the join table concrete/abstract services...");			
			
			for (int i = 1; i < 21; i++) {
				String sql1 = "insert into tb_concrete_abstract values (?, '1');";
				
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				
				stmt.execute();
				stmt.close();
			}
			
			for (int i = 21; i < 41; i++) {
				String sql1 = "insert into tb_concrete_abstract values (?, '2');";
				
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				
				stmt.execute();
				stmt.close();
			}
			
			for (int i = 41; i < 61; i++) {
				String sql1 = "insert into tb_concrete_abstract values (?, '3');";
				
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				
				stmt.execute();
				stmt.close();
			}
			
			for (int i = 61; i < 81; i++) {
				String sql1 = "insert into tb_concrete_abstract values (?, '4');";
				
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
