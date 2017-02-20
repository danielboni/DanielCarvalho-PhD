package lyon3.iae.datamodel.populate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/*
 * Autor: Daniel Aguiar
 * 
 * Descricao: Classe responsavel por alimentar o banco de dados com serviços abstratos.
 * 
 * */
public class FeedingAbstractServices {
	
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
			
			System.out.println("Feeding the database with abstract services...");
			String sql1 = "insert into tb_abstract_service values ('1', 'A1', 'Given a disease, it returns infected patients.');";
			String sql2 = "insert into tb_abstract_service values ('2', 'A2', 'Given a patient, it returns his/her personal information.');";
			String sql3 = "insert into tb_abstract_service values ('3', 'A3', 'Given a patient, it returns his/her dna information.');";
			String sql4 = "insert into tb_abstract_service values ('4', 'A4', 'Given a doctor, it returns a list of patients that were threated by him/her.');";
			
			PreparedStatement stmt = connection.prepareStatement(sql1);
	        stmt.execute();
	        
	        stmt = connection.prepareStatement(sql2);
	        stmt.execute();
	        
	        stmt = connection.prepareStatement(sql3);
	        stmt.execute();
	        
	        stmt = connection.prepareStatement(sql4);
	        stmt.execute();
			
	        stmt.close();
	        connection.close();
	        
	        System.out.println("Abstract services registered.");
	        
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
