package lyon3.iae.datamodel.populate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/*
 * Autor: Daniel Aguiar
 * 
 * Descricao: Classe responsavel por alimentar o banco de dados com serviços de dados concretos.
 * 
 * */
public class FeedingDataServices {
	
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
			
			System.out.println("Feeding the database with concrete data services...");
			/* String sql1 = "insert into tb_concrete_service values ('1', 'DS1', 'DS1(x?; y!) := A1(x?; y!)', "
					+ "'96', '1', '0.5', 'yes', 'yes', 'medium', 'low', 'reliable', 'working hours', '2', 'text', 'yes', 'not certified');";
			
			String sql2 = "insert into tb_concrete_service values ('2', 'DS2', 'DS2(x?; y!) := A1(x?; y!)', "
					+ "'96', '1', '0.5', 'yes', 'yes', 'medium', 'low', 'reliable', 'working hours', '2', 'text', 'yes', 'not certified');";
			
			String sql3 = "insert into tb_concrete_service values ('3', 'DS3', 'DS3(x?; y!) := A1(x?; y!)', "
					+ "'97', '1', '0.1', 'yes', 'yes', 'high', 'low', 'reliable', 'working hours', '2', 'text', 'yes', 'certified');";
			
			String sql4 = "insert into tb_concrete_service values ('4', 'DS4', 'DS4(x?; y!) := A1(x?; y!)', "
					+ "'98', '2', '0.7', 'yes', 'yes', 'medium', 'low', 'reliable', 'working hours', '2', 'text', 'yes', 'not certified');";
			*/
			
			
			for (int i = 5; i < 21; i++) {
				String sql1 = "insert into tb_concrete_service values (?, ?, ?, "
						+ "'96', '1', '0.5', 'yes', 'yes', 'medium', 'low', 'reliable', 'working hours', '2', 'text', 'yes', 'not certified');";
				
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				stmt.setString(2, "DS"+i);
		        stmt.setString(3, "DS"+i+"(x?; y!) := A1(x?; y!)");
				
				stmt.execute();
				stmt.close();
			}
			
			for (int i = 21; i < 41; i++) {
				String sql1 = "insert into tb_concrete_service values (?, ?, ?, "
						+ "'96', '1', '0.5', 'yes', 'yes', 'medium', 'low', 'reliable', 'working hours', '2', 'text', 'yes', 'not certified');";
				
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				stmt.setString(2, "DS"+i);
		        stmt.setString(3, "DS"+i+"(x?; y!) := A2(x?; y!)");
				
				stmt.execute();
				stmt.close();
			}
			
			for (int i = 41; i < 61; i++) {
				String sql1 = "insert into tb_concrete_service values (?, ?, ?, "
						+ "'96', '1', '0.5', 'yes', 'yes', 'medium', 'low', 'reliable', 'working hours', '2', 'text', 'yes', 'not certified');";
				
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				stmt.setString(2, "DS"+i);
		        stmt.setString(3, "DS"+i+"(x?; y!) := A3(x?; y!)");
				
				stmt.execute();
				stmt.close();
			}
			
			for (int i = 61; i < 81; i++) {
				String sql1 = "insert into tb_concrete_service values (?, ?, ?, "
						+ "'96', '1', '0.5', 'yes', 'yes', 'medium', 'low', 'reliable', 'working hours', '2', 'text', 'yes', 'not certified');";
				
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				stmt.setString(2, "DS"+i);
		        stmt.setString(3, "DS"+i+"(x?; y!) := A4(x?; y!)");
				
				stmt.execute();
				stmt.close();
			}
	        
	        /* stmt = connection.prepareStatement(sql2);
	        stmt.execute();
	        
	        stmt = connection.prepareStatement(sql3);
	        stmt.execute();
	        
	        stmt = connection.prepareStatement(sql4);
	        stmt.execute(); */
			
	        //stmt.close();
	        connection.close();
	        
	        System.out.println("Concrete data services registered.");
	        
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
