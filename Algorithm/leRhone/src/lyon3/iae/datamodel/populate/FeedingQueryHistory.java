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
			
			/* for (int i = 1; i < 21; i++) {
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
			} */
			
			for (int i = 81; i < 101; i++) {
				String sql1 = "insert into tb_query_history values (?, ?, ?, ?, "
						+ "'97', '2', '0.7', 'no', 'yes', 'medium', 'low', 'reliable', 'working hours', '2', 'text', 'yes', "
						+ "'not certified', '6.5', '10');";
				
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				stmt.setString(2, "Processed");
		        stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
		        stmt.setString(4, "Q"+i+"(p?, d?; z!) := A2(p?; z!), A3(p?; z!), A4(d?; p!), A5(d?; p!)");
		        
				stmt.execute();
				stmt.close();
			}
			
	        connection.close();
	        
	        System.out.println("Queries registered.");
	        
		} catch (SQLException e) {
			e.printStackTrace();
		}
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
		
			for (int i = 1; i < 26; i++) {
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
				
			
			for (int i = 26; i < 51; i++) {
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
	        
			
			
			for (int i = 51; i < 76; i++) {
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
			
			for (int i = 76; i < 101; i++) {
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
			
//			for (int i = 1; i < 26; i++) {
//				String sql1 = "insert into tb_query_history values (?, ?, ?, ?, "
//						+ "'96', '1', '0.5', 'yes', 'yes', 'medium', 'low', 'reliable', 'working hours', '2', 'text', 'yes', "
//						+ "'not certified', '5', '10');";
//				
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				stmt.setString(2, "Processed");
//		        stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
//		        stmt.setString(4, "Q"+i+"(x?; y!) := A1(x?; p!), A2(p?; y!)");
//		        
//				stmt.execute();
//				stmt.close();
//			}
//			
//			for (int i = 26; i < 51; i++) {
//				String sql1 = "insert into tb_query_history values (?, ?, ?, ?, "
//						+ "'98', '2', '0.7', 'yes', 'no', 'low', 'low', 'reliable', 'working hours', '2', 'text', 'no', "
//						+ "'not certified', '5', '10');";
//				
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				stmt.setString(2, "Processed");
//		        stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
//		        stmt.setString(4, "Q"+i+"(x?; y!) := A1(x?; p!), A2(p?; y!)");
//		        
//				stmt.execute();
//				stmt.close();
//			}	
//			
//			for (int i = 51; i < 76; i++) {
//				String sql1 = "insert into tb_query_history values (?, ?, ?, ?, "
//						+ "'95', '3', '0.7', 'yes', 'yes', 'medium', 'low', 'reliable', 'working hours', '2', 'text', 'yes', "
//						+ "'not certified', '7', '10');";
//				
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				stmt.setString(2, "Processed");
//		        stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
//		        stmt.setString(4, "Q"+i+"(x?; y!, z!) := A1(x?; p!), A2(p?; y!), A3(p?; z!)");
//		        
//				stmt.execute();
//				stmt.close();
//			}
//	        
//			for (int i = 76; i < 101; i++) {
//				String sql1 = "insert into tb_query_history values (?, ?, ?, ?, "
//						+ "'97', '3', '0.7', 'yes', 'yes', 'low', 'low', 'reliable', 'working hours', '3', 'text', 'no', "
//						+ "'not certified', '7', '10');";
//				
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				stmt.setString(2, "Processed");
//		        stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
//		        stmt.setString(4, "Q"+i+"(x?; y!, z!) := A1(x?; p!), A2(p?; y!), A3(p?; z!)");
//		        
//				stmt.execute();
//				stmt.close();
//			}
//			
//			for (int i = 101; i < 126; i++) {
//				String sql1 = "insert into tb_query_history values (?, ?, ?, ?, "
//						+ "'96', '2', '0.6', 'yes', 'yes', 'medium', 'low', 'reliable', 'working hours', '2', 'text', 'yes', "
//						+ "'not certified', '7', '10');";
//				
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				stmt.setString(2, "Reused");
//		        stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
//		        stmt.setString(4, "Q"+i+"(x?, d?; y!, z!) := A1(x?; p!), A2(p?; y!), A3(p?; z!), A4(d?; p!)");
//		        
//				stmt.execute();
//				stmt.close();
//			}
//			
//			for (int i = 126; i < 151; i++) {
//				String sql1 = "insert into tb_query_history values (?, ?, ?, ?, "
//						+ "'95', '2', '0.5', 'yes', 'yes', 'medium', 'low', 'reliable', 'working hours', '2', 'text', 'yes', "
//						+ "'not certified', '6', '10');";
//				
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				stmt.setString(2, "Processed");
//		        stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
//		        stmt.setString(4, "Q"+i+"(x?, d?; y!, z!) := A1(x?; p!), A2(p?; y!), A3(p?; z!), A4(d?; p!)");
//		        
//				stmt.execute();
//				stmt.close();
//			}
//			
//			for (int i = 151; i < 176; i++) {
//				String sql1 = "insert into tb_query_history values (?, ?, ?, ?, "
//						+ "'96', '3', '0.6', 'no', 'yes', 'medium', 'low', 'reliable', 'working hours', '2', 'text', 'yes', "
//						+ "'not certified', '7.5', '10');";
//				
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				stmt.setString(2, "Processed");
//		        stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
//		        stmt.setString(4, "Q"+i+"(x?, d?; z!) := A1(x?; p!), A2(p?; z!), A3(p?; z!), A4(d?; p!), A5(d?; p!)");
//		        
//				stmt.execute();
//				stmt.close();
//			}
//			
//			for (int i = 176; i < 201; i++) {
//				String sql1 = "insert into tb_query_history values (?, ?, ?, ?, "
//						+ "'96', '4', '0.7', 'no', 'no', 'medium', 'low', 'reliable', 'working hours', '2', 'text', 'yes', "
//						+ "'not certified', '7', '15');";
//				
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				stmt.setString(2, "Processed");
//		        stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
//		        stmt.setString(4, "Q"+i+"(x?, d?; z!) := A1(x?; p!), A2(p?; z!), A3(p?; z!), A4(d?; p!), A5(d?; p!)");
//		        
//				stmt.execute();
//				stmt.close();
//			}
//			
//			for (int i = 1; i < 51; i++) {
//				String sql1 = "insert into tb_query_history values (?, ?, ?, ?, "
//						+ "'96', '1', '0.5', 'yes', 'yes', 'medium', 'low', 'reliable', 'working hours', '2', 'text', 'yes', "
//						+ "'not certified', '5', '10');";
//				
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				stmt.setString(2, "Processed");
//		        stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
//		        stmt.setString(4, "Q"+i+"(x?; y!) := A1(x?; p!), A2(p?; y!)");
//		        
//				stmt.execute();
//				stmt.close();
//			}
//			
//			for (int i = 51; i < 76; i++) {
//				String sql1 = "insert into tb_query_history values (?, ?, ?, ?, "
//						+ "'98', '2', '0.7', 'yes', 'no', 'low', 'low', 'reliable', 'working hours', '2', 'text', 'no', "
//						+ "'not certified', '5', '10');";
//				
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				stmt.setString(2, "Processed");
//		        stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
//		        stmt.setString(4, "Q"+i+"(x?; y!) := A1(x?; p!), A2(p?; y!)");
//		        
//				stmt.execute();
//				stmt.close();
//			}	
//			
//			for (int i = 76; i < 101; i++) {
//				String sql1 = "insert into tb_query_history values (?, ?, ?, ?, "
//						+ "'95', '3', '0.7', 'yes', 'yes', 'medium', 'low', 'reliable', 'working hours', '2', 'text', 'yes', "
//						+ "'not certified', '7', '10');";
//				
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				stmt.setString(2, "Processed");
//		        stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
//		        stmt.setString(4, "Q"+i+"(x?; y!, z!) := A1(x?; p!), A2(p?; y!), A3(p?; z!)");
//		        
//				stmt.execute();
//				stmt.close();
//			}
//	        
//			for (int i = 101; i < 151; i++) {
//				String sql1 = "insert into tb_query_history values (?, ?, ?, ?, "
//						+ "'97', '3', '0.7', 'yes', 'yes', 'low', 'low', 'reliable', 'working hours', '3', 'text', 'no', "
//						+ "'not certified', '7', '10');";
//				
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				stmt.setString(2, "Processed");
//		        stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
//		        stmt.setString(4, "Q"+i+"(x?; y!, z!) := A1(x?; p!), A2(p?; y!), A3(p?; z!)");
//		        
//				stmt.execute();
//				stmt.close();
//			}
//			
//			for (int i = 151; i < 201; i++) {
//				String sql1 = "insert into tb_query_history values (?, ?, ?, ?, "
//						+ "'96', '2', '0.6', 'yes', 'yes', 'medium', 'low', 'reliable', 'working hours', '2', 'text', 'yes', "
//						+ "'not certified', '7', '10');";
//				
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				stmt.setString(2, "Reused");
//		        stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
//		        stmt.setString(4, "Q"+i+"(x?, d?; y!, z!) := A1(x?; p!), A2(p?; y!), A3(p?; z!), A4(d?; p!)");
//		        
//				stmt.execute();
//				stmt.close();
//			}
//			
//			for (int i = 201; i < 226; i++) {
//				String sql1 = "insert into tb_query_history values (?, ?, ?, ?, "
//						+ "'95', '2', '0.5', 'yes', 'yes', 'medium', 'low', 'reliable', 'working hours', '2', 'text', 'yes', "
//						+ "'not certified', '6', '10');";
//				
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				stmt.setString(2, "Processed");
//		        stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
//		        stmt.setString(4, "Q"+i+"(x?, d?; y!, z!) := A1(x?; p!), A2(p?; y!), A3(p?; z!), A4(d?; p!)");
//		        
//				stmt.execute();
//				stmt.close();
//			}
//			
//			for (int i = 226; i < 251; i++) {
//				String sql1 = "insert into tb_query_history values (?, ?, ?, ?, "
//						+ "'96', '3', '0.6', 'no', 'yes', 'medium', 'low', 'reliable', 'working hours', '2', 'text', 'yes', "
//						+ "'not certified', '7.5', '10');";
//				
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				stmt.setString(2, "Processed");
//		        stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
//		        stmt.setString(4, "Q"+i+"(x?, d?; z!) := A1(x?; p!), A2(p?; z!), A3(p?; z!), A4(d?; p!), A5(d?; p!)");
//		        
//				stmt.execute();
//				stmt.close();
//			}
//			
//			for (int i = 251; i < 301; i++) {
//				String sql1 = "insert into tb_query_history values (?, ?, ?, ?, "
//						+ "'96', '4', '0.7', 'no', 'no', 'medium', 'low', 'reliable', 'working hours', '2', 'text', 'yes', "
//						+ "'not certified', '7', '15');";
//				
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				stmt.setString(2, "Processed");
//		        stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
//		        stmt.setString(4, "Q"+i+"(x?, d?; z!) := A1(x?; p!), A2(p?; z!), A3(p?; z!), A4(d?; p!), A5(d?; p!)");
//		        
//				stmt.execute();
//				stmt.close();
//			}
			
//			for (int i = 1; i < 51; i++) {
//				String sql1 = "insert into tb_query_history values (?, ?, ?, ?, "
//						+ "'96', '1', '0.5', 'yes', 'yes', 'medium', 'low', 'reliable', 'working hours', '2', 'text', 'yes', "
//						+ "'not certified', '5', '10');";
//				
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				stmt.setString(2, "Processed");
//		        stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
//		        stmt.setString(4, "Q"+i+"(x?; y!) := A1(x?; p!), A2(p?; y!)");
//		        
//				stmt.execute();
//				stmt.close();
//			}
//			
//			for (int i = 51; i < 126; i++) {
//				String sql1 = "insert into tb_query_history values (?, ?, ?, ?, "
//						+ "'98', '2', '0.7', 'yes', 'no', 'low', 'low', 'reliable', 'working hours', '2', 'text', 'no', "
//						+ "'not certified', '5', '10');";
//				
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				stmt.setString(2, "Processed");
//		        stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
//		        stmt.setString(4, "Q"+i+"(x?; y!) := A1(x?; p!), A2(p?; y!)");
//		        
//				stmt.execute();
//				stmt.close();
//			}	
//			
//			for (int i = 126; i < 201; i++) {
//				String sql1 = "insert into tb_query_history values (?, ?, ?, ?, "
//						+ "'95', '3', '0.7', 'yes', 'yes', 'medium', 'low', 'reliable', 'working hours', '2', 'text', 'yes', "
//						+ "'not certified', '7', '10');";
//				
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				stmt.setString(2, "Processed");
//		        stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
//		        stmt.setString(4, "Q"+i+"(x?; y!, z!) := A1(x?; p!), A2(p?; y!), A3(p?; z!)");
//		        
//				stmt.execute();
//				stmt.close();
//			}
//	        
//			for (int i = 201; i < 251; i++) {
//				String sql1 = "insert into tb_query_history values (?, ?, ?, ?, "
//						+ "'97', '3', '0.7', 'yes', 'yes', 'low', 'low', 'reliable', 'working hours', '3', 'text', 'no', "
//						+ "'not certified', '7', '10');";
//				
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				stmt.setString(2, "Processed");
//		        stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
//		        stmt.setString(4, "Q"+i+"(x?; y!, z!) := A1(x?; p!), A2(p?; y!), A3(p?; z!)");
//		        
//				stmt.execute();
//				stmt.close();
//			}
//			
//			for (int i = 251; i < 301; i++) {
//				String sql1 = "insert into tb_query_history values (?, ?, ?, ?, "
//						+ "'96', '2', '0.6', 'yes', 'yes', 'medium', 'low', 'reliable', 'working hours', '2', 'text', 'yes', "
//						+ "'not certified', '7', '10');";
//				
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				stmt.setString(2, "Reused");
//		        stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
//		        stmt.setString(4, "Q"+i+"(x?, d?; y!, z!) := A1(x?; p!), A2(p?; y!), A3(p?; z!), A4(d?; p!)");
//		        
//				stmt.execute();
//				stmt.close();
//			}
//			
//			for (int i = 301; i < 376; i++) {
//				String sql1 = "insert into tb_query_history values (?, ?, ?, ?, "
//						+ "'95', '2', '0.5', 'yes', 'yes', 'medium', 'low', 'reliable', 'working hours', '2', 'text', 'yes', "
//						+ "'not certified', '6', '10');";
//				
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				stmt.setString(2, "Processed");
//		        stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
//		        stmt.setString(4, "Q"+i+"(x?, d?; y!, z!) := A1(x?; p!), A2(p?; y!), A3(p?; z!), A4(d?; p!)");
//		        
//				stmt.execute();
//				stmt.close();
//			}
//			
//			for (int i = 376; i < 451; i++) {
//				String sql1 = "insert into tb_query_history values (?, ?, ?, ?, "
//						+ "'96', '3', '0.6', 'no', 'yes', 'medium', 'low', 'reliable', 'working hours', '2', 'text', 'yes', "
//						+ "'not certified', '7.5', '10');";
//				
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				stmt.setString(2, "Processed");
//		        stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
//		        stmt.setString(4, "Q"+i+"(x?, d?; z!) := A1(x?; p!), A2(p?; z!), A3(p?; z!), A4(d?; p!), A5(d?; p!)");
//		        
//				stmt.execute();
//				stmt.close();
//			}
//			
//			for (int i = 451; i < 501; i++) {
//				String sql1 = "insert into tb_query_history values (?, ?, ?, ?, "
//						+ "'96', '4', '0.7', 'no', 'no', 'medium', 'low', 'reliable', 'working hours', '2', 'text', 'yes', "
//						+ "'not certified', '7', '15');";
//				
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				stmt.setString(2, "Processed");
//		        stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
//		        stmt.setString(4, "Q"+i+"(x?, d?; z!) := A1(x?; p!), A2(p?; z!), A3(p?; z!), A4(d?; p!), A5(d?; p!)");
//		        
//				stmt.execute();
//				stmt.close();
//			}
						
//			for (int i = 1; i < 51; i++) {
//				String sql1 = "insert into tb_query_history values (?, ?, ?, ?, "
//						+ "'96', '1', '0.5', 'yes', 'yes', 'medium', 'low', 'reliable', 'working hours', '2', 'text', 'yes', "
//						+ "'not certified', '5', '10');";
//				
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				stmt.setString(2, "Processed");
//		        stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
//		        stmt.setString(4, "Q"+i+"(x?; y!) := A1(x?; p!), A2(p?; y!)");
//		        
//				stmt.execute();
//				stmt.close();
//			}
//			
//			for (int i = 51; i < 101; i++) {
//				String sql1 = "insert into tb_query_history values (?, ?, ?, ?, "
//						+ "'98', '2', '0.7', 'yes', 'no', 'low', 'low', 'reliable', 'working hours', '2', 'text', 'no', "
//						+ "'not certified', '5', '10');";
//				
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				stmt.setString(2, "Processed");
//		        stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
//		        stmt.setString(4, "Q"+i+"(x?; y!) := A1(x?; p!), A2(p?; y!)");
//		        
//				stmt.execute();
//				stmt.close();
//			}
//			
//			for (int i = 101; i < 151; i++) {
//				String sql1 = "insert into tb_query_history values (?, ?, ?, ?, "
//						+ "'98', '2', '0.7', 'no', 'no', 'low', 'high', 'reliable', 'working hours', '2', 'text', 'no', "
//						+ "'certified', '8', '15');";
//				
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				stmt.setString(2, "Processed");
//		        stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
//		        stmt.setString(4, "Q"+i+"(x?; y!) := A1(x?; p!), A2(p?; y!)");
//		        
//				stmt.execute();
//				stmt.close();
//			}
//			
//			for (int i = 151; i < 201; i++) {
//				String sql1 = "insert into tb_query_history values (?, ?, ?, ?, "
//						+ "'99', '3', '0.5', 'yes', 'no', 'low', 'high', 'unreliable', 'working hours', '2', 'text', 'no', "
//						+ "'certified', '8', '15');";
//				
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				stmt.setString(2, "Processed");
//		        stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
//		        stmt.setString(4, "Q"+i+"(x?; y!) := A1(x?; p!), A2(p?; y!)");
//		        
//				stmt.execute();
//				stmt.close();
//			}
//			
//			for (int i = 201; i < 251; i++) {
//				String sql1 = "insert into tb_query_history values (?, ?, ?, ?, "
//						+ "'97', '4', '0.9', 'yes', 'no', 'low', 'medium', 'unreliable', 'working hours', '3', 'text', 'yes', "
//						+ "'not certified', '9', '14');";
//				
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				stmt.setString(2, "Processed");
//		        stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
//		        stmt.setString(4, "Q"+i+"(x?; y!) := A1(x?; p!), A2(p?; y!)");
//		        
//				stmt.execute();
//				stmt.close();
//			}
//			
//			for (int i = 251; i < 301; i++) {
//				String sql1 = "insert into tb_query_history values (?, ?, ?, ?, "
//						+ "'95', '3', '0.7', 'yes', 'yes', 'medium', 'low', 'reliable', 'working hours', '2', 'text', 'yes', "
//						+ "'not certified', '7', '10');";
//				
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				stmt.setString(2, "Processed");
//		        stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
//		        stmt.setString(4, "Q"+i+"(x?; y!, z!) := A1(x?; p!), A2(p?; y!), A3(p?; z!)");
//		        
//				stmt.execute();
//				stmt.close();
//			}
//	        
//			for (int i = 301; i < 351; i++) {
//				String sql1 = "insert into tb_query_history values (?, ?, ?, ?, "
//						+ "'97', '3', '0.7', 'yes', 'yes', 'low', 'low', 'reliable', 'working hours', '3', 'text', 'no', "
//						+ "'not certified', '7', '10');";
//				
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				stmt.setString(2, "Processed");
//		        stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
//		        stmt.setString(4, "Q"+i+"(x?; y!, z!) := A1(x?; p!), A2(p?; y!), A3(p?; z!)");
//		        
//				stmt.execute();
//				stmt.close();
//			}
//			
//			for (int i = 351; i < 401; i++) {
//				String sql1 = "insert into tb_query_history values (?, ?, ?, ?, "
//						+ "'98', '3', '0.4', 'no', 'yes', 'low', 'low', 'reliable', 'working hours', '2', 'text', 'no', "
//						+ "'not certified', '6', '8');";
//				
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				stmt.setString(2, "Processed");
//		        stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
//		        stmt.setString(4, "Q"+i+"(x?; y!, z!) := A1(x?; p!), A2(p?; y!), A3(p?; z!)");
//		        
//				stmt.execute();
//				stmt.close();
//			}
//			
//			for (int i = 401; i < 451; i++) {
//				String sql1 = "insert into tb_query_history values (?, ?, ?, ?, "
//						+ "'95', '2', '0.8', 'no', 'yes', 'medium', 'medium', 'reliable', 'working hours', '2', 'text', 'no', "
//						+ "'not certified', '6', '8');";
//				
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				stmt.setString(2, "Processed");
//		        stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
//		        stmt.setString(4, "Q"+i+"(x?; y!, z!) := A1(x?; p!), A2(p?; y!), A3(p?; z!)");
//		        
//				stmt.execute();
//				stmt.close();
//			}
//			
//			for (int i = 451; i < 501; i++) {
//				String sql1 = "insert into tb_query_history values (?, ?, ?, ?, "
//						+ "'98', '3', '0.7', 'no', 'yes', 'low', 'medium', 'reliable', 'working hours', '2', 'text', 'yes', "
//						+ "'not certified', '8', '10');";
//				
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				stmt.setString(2, "Processed");
//		        stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
//		        stmt.setString(4, "Q"+i+"(x?; y!, z!) := A1(x?; p!), A2(p?; y!), A3(p?; z!)");
//		        
//				stmt.execute();
//				stmt.close();
//			}
//			
//			for (int i = 501; i < 551; i++) {
//				String sql1 = "insert into tb_query_history values (?, ?, ?, ?, "
//						+ "'96', '2', '0.6', 'yes', 'yes', 'medium', 'low', 'reliable', 'working hours', '2', 'text', 'yes', "
//						+ "'not certified', '7', '10');";
//				
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				stmt.setString(2, "Reused");
//		        stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
//		        stmt.setString(4, "Q"+i+"(x?, d?; y!, z!) := A1(x?; p!), A2(p?; y!), A3(p?; z!), A4(d?; p!)");
//		        
//				stmt.execute();
//				stmt.close();
//			}
//			
//			for (int i = 551; i < 601; i++) {
//				String sql1 = "insert into tb_query_history values (?, ?, ?, ?, "
//						+ "'95', '2', '0.5', 'yes', 'yes', 'medium', 'low', 'reliable', 'working hours', '2', 'text', 'yes', "
//						+ "'not certified', '6', '10');";
//				
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				stmt.setString(2, "Processed");
//		        stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
//		        stmt.setString(4, "Q"+i+"(x?, d?; y!, z!) := A1(x?; p!), A2(p?; y!), A3(p?; z!), A4(d?; p!)");
//		        
//				stmt.execute();
//				stmt.close();
//			}
//			
//			for (int i = 601; i < 651; i++) {
//				String sql1 = "insert into tb_query_history values (?, ?, ?, ?, "
//						+ "'95', '2', '0.6', 'yes', 'no', 'low', 'low', 'reliable', 'working hours', '2', 'text', 'yes', "
//						+ "'not certified', '6', '10');";
//				
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				stmt.setString(2, "Processed");
//		        stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
//		        stmt.setString(4, "Q"+i+"(x?, d?; y!, z!) := A1(x?; p!), A2(p?; y!), A3(p?; z!), A4(d?; p!)");
//		        
//				stmt.execute();
//				stmt.close();
//			}
//			
//			for (int i = 651; i < 701; i++) {
//				String sql1 = "insert into tb_query_history values (?, ?, ?, ?, "
//						+ "'97', '2', '0.4', 'yes', 'no', 'low', 'low', 'reliable', 'working hours', '2', 'text', 'no', "
//						+ "'certified', '6', '10');";
//				
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				stmt.setString(2, "Processed");
//		        stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
//		        stmt.setString(4, "Q"+i+"(x?, d?; y!, z!) := A1(x?; p!), A2(p?; y!), A3(p?; z!), A4(d?; p!)");
//		        
//				stmt.execute();
//				stmt.close();
//			}
//			
//			for (int i = 701; i < 751; i++) {
//				String sql1 = "insert into tb_query_history values (?, ?, ?, ?, "
//						+ "'98', '2', '0.2', 'no', 'no', 'low', 'low', 'reliable', 'working hours', '2', 'text', 'no', "
//						+ "'certified', '8', '10');";
//				
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				stmt.setString(2, "Processed");
//		        stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
//		        stmt.setString(4, "Q"+i+"(x?, d?; y!, z!) := A1(x?; p!), A2(p?; y!), A3(p?; z!), A4(d?; p!)");
//		        
//				stmt.execute();
//				stmt.close();
//			}
//			
//			for (int i = 751; i < 801; i++) {
//				String sql1 = "insert into tb_query_history values (?, ?, ?, ?, "
//						+ "'96', '3', '0.6', 'no', 'yes', 'medium', 'low', 'reliable', 'working hours', '2', 'text', 'yes', "
//						+ "'not certified', '7.5', '10');";
//				
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				stmt.setString(2, "Processed");
//		        stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
//		        stmt.setString(4, "Q"+i+"(x?, d?; z!) := A1(x?; p!), A2(p?; z!), A3(p?; z!), A4(d?; p!), A5(d?; p!)");
//		        
//				stmt.execute();
//				stmt.close();
//			}
//			
//			for (int i = 801; i < 851; i++) {
//				String sql1 = "insert into tb_query_history values (?, ?, ?, ?, "
//						+ "'96', '4', '0.7', 'no', 'no', 'medium', 'low', 'reliable', 'working hours', '2', 'text', 'yes', "
//						+ "'not certified', '7', '15');";
//				
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				stmt.setString(2, "Processed");
//		        stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
//		        stmt.setString(4, "Q"+i+"(x?, d?; z!) := A1(x?; p!), A2(p?; z!), A3(p?; z!), A4(d?; p!), A5(d?; p!)");
//		        
//				stmt.execute();
//				stmt.close();
//			}
//			
//			for (int i = 851; i < 901; i++) {
//				String sql1 = "insert into tb_query_history values (?, ?, ?, ?, "
//						+ "'97', '4', '0.4', 'no', 'yes', 'medium', 'low', 'reliable', 'working hours', '2', 'text', 'yes', "
//						+ "'not certified', '7', '15');";
//				
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				stmt.setString(2, "Processed");
//		        stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
//		        stmt.setString(4, "Q"+i+"(x?, d?; z!) := A1(x?; p!), A2(p?; z!), A3(p?; z!), A4(d?; p!), A5(d?; p!)");
//		        
//				stmt.execute();
//				stmt.close();
//			}
//			
//			for (int i = 901; i < 951; i++) {
//				String sql1 = "insert into tb_query_history values (?, ?, ?, ?, "
//						+ "'96', '2', '0.5', 'no', 'yes', 'medium', 'low', 'reliable', 'working hours', '2', 'text', 'yes', "
//						+ "'not certified', '7', '15');";
//				
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				stmt.setString(2, "Processed");
//		        stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
//		        stmt.setString(4, "Q"+i+"(x?, d?; z!) := A1(x?; p!), A2(p?; z!), A3(p?; z!), A4(d?; p!), A5(d?; p!)");
//		        
//				stmt.execute();
//				stmt.close();
//			}
//			
//			for (int i = 951; i < 1001; i++) {
//				String sql1 = "insert into tb_query_history values (?, ?, ?, ?, "
//						+ "'97', '2', '0.5', 'no', 'yes', 'medium', 'low', 'reliable', 'working hours', '2', 'text', 'yes', "
//						+ "'certified', '5', '12');";
//				
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				stmt.setString(2, "Processed");
//		        stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
//		        stmt.setString(4, "Q"+i+"(x?, d?; z!) := A1(x?; p!), A2(p?; z!), A3(p?; z!), A4(d?; p!), A5(d?; p!)");
//		        
//				stmt.execute();
//				stmt.close();
//			}
			
			
			
			
			
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
	
			for (int i = 1; i < 26; i++) {
				String sql1 = "insert into tb_query_abstract values (?, ?);";
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				for (int j = 1; j < 3; j++) {
					stmt.setInt(2, j);
					stmt.execute();
				}
				stmt.close();
			}
			
			for (int i = 26; i < 51; i++) {
				String sql1 = "insert into tb_query_abstract values (?, ?);";
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				for (int j = 1; j < 4; j++) {
					stmt.setInt(2, j);
					stmt.execute();
				}
				stmt.close();
			}
			
			for (int i = 51; i < 76; i++) {
				String sql1 = "insert into tb_query_abstract values (?, ?);";
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				for (int j = 1; j < 5; j++) {
					stmt.setInt(2, j);
					stmt.execute();
				}
				stmt.close();
			}
			
			for (int i = 76; i < 101; i++) {
				String sql1 = "insert into tb_query_abstract values (?, ?);";
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				for (int j = 1; j < 6; j++) {
					stmt.setInt(2, j);
					stmt.execute();
				}
				stmt.close();
			}
			
//			for (int i = 1; i < 51; i++) {
//				String sql1 = "insert into tb_query_abstract values (?, ?);";
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				for (int j = 1; j < 3; j++) {
//					stmt.setInt(2, j);
//					stmt.execute();
//				}
//				stmt.close();
//			}
//			
//			for (int i = 51; i < 101; i++) {
//				String sql1 = "insert into tb_query_abstract values (?, ?);";
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				for (int j = 1; j < 4; j++) {
//					stmt.setInt(2, j);
//					stmt.execute();
//				}
//				stmt.close();
//			}
//			
//			for (int i = 101; i < 151; i++) {
//				String sql1 = "insert into tb_query_abstract values (?, ?);";
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				for (int j = 1; j < 5; j++) {
//					stmt.setInt(2, j);
//					stmt.execute();
//				}
//				stmt.close();
//			}
//			
//			for (int i = 151; i < 201; i++) {
//				String sql1 = "insert into tb_query_abstract values (?, ?);";
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				for (int j = 1; j < 6; j++) {
//					stmt.setInt(2, j);
//					stmt.execute();
//				}
//				stmt.close();
//			}
			
//			for (int i = 1; i < 76; i++) {
//				String sql1 = "insert into tb_query_abstract values (?, ?);";
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				for (int j = 1; j < 3; j++) {
//					stmt.setInt(2, j);
//					stmt.execute();
//				}
//				stmt.close();
//			}
//			
//			for (int i = 76; i < 151; i++) {
//				String sql1 = "insert into tb_query_abstract values (?, ?);";
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				for (int j = 1; j < 4; j++) {
//					stmt.setInt(2, j);
//					stmt.execute();
//				}
//				stmt.close();
//			}
//			
//			for (int i = 151; i < 226; i++) {
//				String sql1 = "insert into tb_query_abstract values (?, ?);";
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				for (int j = 1; j < 5; j++) {
//					stmt.setInt(2, j);
//					stmt.execute();
//				}
//				stmt.close();
//			}
//			
//			for (int i = 226; i < 301; i++) {
//				String sql1 = "insert into tb_query_abstract values (?, ?);";
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				for (int j = 1; j < 6; j++) {
//					stmt.setInt(2, j);
//					stmt.execute();
//				}
//				stmt.close();
//			}
			
//			for (int i = 1; i < 126; i++) {
//				String sql1 = "insert into tb_query_abstract values (?, ?);";
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				for (int j = 1; j < 3; j++) {
//					stmt.setInt(2, j);
//					stmt.execute();
//				}
//				stmt.close();
//			}
//			
//			for (int i = 126; i < 251; i++) {
//				String sql1 = "insert into tb_query_abstract values (?, ?);";
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				for (int j = 1; j < 4; j++) {
//					stmt.setInt(2, j);
//					stmt.execute();
//				}
//				stmt.close();
//			}
//			
//			for (int i = 251; i < 376; i++) {
//				String sql1 = "insert into tb_query_abstract values (?, ?);";
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				for (int j = 1; j < 5; j++) {
//					stmt.setInt(2, j);
//					stmt.execute();
//				}
//				stmt.close();
//			}
//			
//			for (int i = 376; i < 501; i++) {
//				String sql1 = "insert into tb_query_abstract values (?, ?);";
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				for (int j = 1; j < 6; j++) {
//					stmt.setInt(2, j);
//					stmt.execute();
//				}
//				stmt.close();
//			}
			
			
			
//			for (int i = 1; i < 251; i++) {
//				String sql1 = "insert into tb_query_abstract values (?, ?);";
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				for (int j = 1; j < 3; j++) {
//					stmt.setInt(2, j);
//					stmt.execute();
//				}
//				stmt.close();
//			}
//			
//			for (int i = 251; i < 501; i++) {
//				String sql1 = "insert into tb_query_abstract values (?, ?);";
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				for (int j = 1; j < 4; j++) {
//					stmt.setInt(2, j);
//					stmt.execute();
//				}
//				stmt.close();
//			}
//			
//			for (int i = 501; i < 751; i++) {
//				String sql1 = "insert into tb_query_abstract values (?, ?);";
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				for (int j = 1; j < 5; j++) {
//					stmt.setInt(2, j);
//					stmt.execute();
//				}
//				stmt.close();
//			}
//			
//			for (int i = 751; i < 1001; i++) {
//				String sql1 = "insert into tb_query_abstract values (?, ?);";
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				for (int j = 1; j < 6; j++) {
//					stmt.setInt(2, j);
//					stmt.execute();
//				}
//				stmt.close();
//			}
			
			connection.close();
	        
	        System.out.println("Query/Abstract services registered.");
	        
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
			
			System.out.println("Feeding the database in the join table query/abstract services...");			
			
			/* for (int i = 1; i < 21; i++) {
				String sql1 = "insert into tb_query_abstract values (?, ?);";
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				for (int j = 1; j < 3; j++) {
					stmt.setInt(2, j);
					stmt.execute();
				}
				stmt.close();
			}
			
			for (int i = 21; i < 41; i++) {
				String sql1 = "insert into tb_query_abstract values (?, ?);";
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				for (int j = 1; j < 4; j++) {
					stmt.setInt(2, j);
					stmt.execute();
				}
				stmt.close();
			}
			
			for (int i = 41; i < 61; i++) {
				String sql1 = "insert into tb_query_abstract values (?, ?);";
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				for (int j = 1; j < 5; j++) {
					stmt.setInt(2, j);
					stmt.execute();
				}
				stmt.close();
			}
			
			for (int i = 61; i < 81; i++) {
				String sql1 = "insert into tb_query_abstract values (?, ?);";
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				for (int j = 3; j < 5; j++) {
					stmt.setInt(2, j);
					stmt.execute();
				}
				stmt.close();
			} */
			
			for (int i = 81; i < 101; i++) {
				String sql1 = "insert into tb_query_abstract values (?, ?);";
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				for (int j = 2; j < 6; j++) {
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
