package lyon3.iae.reusability.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EntityManagerUtil {

	private final String DRIVER_NAME = "com.mysql.jdbc.Driver";                       
	private final String SERVER_NAME = "localhost";  
	private String DATABASE;     
	private String URL;
	private final String USERNAME = "root";      
	private final String PASSWORD = "1234";
		
	public EntityManagerUtil(String dbName) {
		this.setDATABASE(dbName);
		this.setURL("jdbc:mysql://" + SERVER_NAME + "/" + DATABASE);
	}
	
	public Connection getConnection () {
		try {
			Class.forName(DRIVER_NAME);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Fail while connecting to the database.");
		}
		
		return connection;
	}
	
	public String getDATABASE() {
		return DATABASE;
	}

	public void setDATABASE(String dATABASE) {
		DATABASE = dATABASE;
	}

	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}



}
