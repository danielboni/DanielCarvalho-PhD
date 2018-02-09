package lyon3.iae.datamodel.populate.procedure.experiment;

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
public class FeedingQueryHistory_10000_5 {
	
	public static void main(String[] args) {
		FeedingQueryHistory_10000_5 feeding = new FeedingQueryHistory_10000_5();
		feeding.populateQueries("query_history_test1");
		feeding.populateConcrete("query_history_test1");
		feeding.populateCompositions("query_history_test1");
		feeding.populateRewritings("query_history_test1");
	}
	
	public void populateQueries(String databaseName) {
		
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
			for (int i = 1; i < 10001; i++) {
				String sql1 = "insert into tb_query_history values (?, ?, DEFAULT, ?, "
						+ "'96', '1', '0.5', '1', '1', 1, 0, 1, 'working hours', '2', 'text', '1', "
						+ "0, '5', '10');";
				
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				stmt.setString(2, "reused");
		        //stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
		        stmt.setString(3, "Q"+i+"(x?; y!) := A1(x?; p!), A2(p?; y!)");
		        
				stmt.execute();
				stmt.close();
			}
			System.out.println("Incluindo 10.000 consultas com 3 abstratos...");
			for (int i = 10001; i < 20001; i++) {
				String sql1 = "insert into tb_query_history values (?, ?, DEFAULT, ?, "
						+ "'96', '1', '0.5', '1', '1', 1, 0, 1, 'working hours', '2', 'text', '1', "
						+ "0, '5', '10');";
				
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				stmt.setString(2, "reused");
		        //stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
		        stmt.setString(3, "Q"+i+"(x?; y!, z!) := A1(x?; p!), A2(p?; y!), A3(p?; z!)");
		        
				stmt.execute();
				stmt.close();
			}
			System.out.println("Incluindo 10.000 consultas com 4 abstratos...");
			for (int i = 20001; i < 30001; i++) {
				String sql1 = "insert into tb_query_history values (?, ?, DEFAULT, ?, "
						+ "'96', '1', '0.5', '1', '1', 1, 0, 1, 'working hours', '2', 'text', '1', "
						+ "0, '5', '10');";
				
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				stmt.setString(2, "reused");
		        //stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
		        stmt.setString(3, "Q"+i+"(x?, d?; y!, z!) := A1(x?; p!), A2(p?; y!), A3(p?; z!), A4(d?; p!)");
		        
				stmt.execute();
				stmt.close();
			}
			System.out.println("Incluindo 10.000 consultas com 5 abstratos...");
			for (int i = 30001; i < 40001; i++) {
				String sql1 = "insert into tb_query_history values (?, ?, DEFAULT, ?, "
						+ "'96', '1', '0.5', '1', '1', 1, 0, 1, 'working hours', '2', 'text', '1', "
						+ "0, '5', '10');";
				
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				stmt.setString(2, "reused");
		        //stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
		        stmt.setString(3, "Q"+i+"(x?, d?; z!) := A1(x?; p!), A2(p?; z!), A3(p?; z!), A4(d?; p!), A5(d?; p!)");
		        
				stmt.execute();
				stmt.close();
			}
//			System.out.println("Inserindo consultas com 10 serviços abstratos...");
//			for (int i = 40001; i < 50001; i++) {
//				String sql1 = "insert into tb_query_history values (?, ?, ?, ?, "
//						+ "'96', '1', '0.5', '1', '1', 1, 0, 1, 'working hours', '2', 'text', '1', "
//						+ "0, '5', '10');";
//				
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				stmt.setString(2, "Processed");
//		        stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
//		        stmt.setString(4, "Q"+i+"(x?,d?;z!):=A1(x?; p!),A2(p?; z!),A3(p?; z!),A4(d?; p!),A5(d?; p!),A6(x?; p!),A7(p?; z!),A8(p?; z!),A9(d?; p!),A10(d?; p!)");
//		        
//				stmt.execute();
//				stmt.close();
//			}
			
			connection.close();
	        
	        System.out.println("Queries registered.");
	        
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		this.populateJoinTable(databaseName);
	}
	
	public void populateConcrete(String databaseName) {
		
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
			
			System.out.println("Feeding the database with concrete services...");
		
			System.out.println("0...");
			for (int i = 1; i < 101; i++) {
				String sql1 = "insert into tb_concrete_service values (?, ?, "
						+ "'96', '1', '0.5', '1', '1', 1, 0, 1, 'working hours', '2', 'text', '1', "
						+ "0);";
				
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				//stmt.setString(2, "reused");
		        //stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
		        stmt.setString(2, "S"+i+"(x?; y!) := A1(x?; p!)");
		        
				stmt.execute();
				stmt.close();
			}
			
			for (int i = 101; i < 201; i++) {
				String sql1 = "insert into tb_concrete_service values (?, ?, "
						+ "'96', '1', '0.5', '1', '1', 1, 0, 1, 'working hours', '2', 'text', '1', "
						+ "0);";
				
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				//stmt.setString(2, "reused");
		        //stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
		        stmt.setString(2, "S"+i+"(x?; y!) := A2(x?; y!)");
		        
				stmt.execute();
				stmt.close();
			}
			
			for (int i = 201; i < 301; i++) {
				String sql1 = "insert into tb_concrete_service values (?, ?, "
						+ "'96', '1', '0.5', '1', '1', 1, 0, 1, 'working hours', '2', 'text', '1', "
						+ "0);";
				
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				//stmt.setString(2, "reused");
		        //stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
		        stmt.setString(2, "S"+i+"(x?; y!) := A3(x?; y!)");
		        
				stmt.execute();
				stmt.close();
			}
			
			for (int i = 301; i < 401; i++) {
				String sql1 = "insert into tb_concrete_service values (?, ?, "
						+ "'96', '1', '0.5', '1', '1', 1, 0, 1, 'working hours', '2', 'text', '1', "
						+ "0);";
				
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				//stmt.setString(2, "reused");
		        //stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
		        stmt.setString(2, "S"+i+"(x?; y!) := A4(x?; y!)");
		        
				stmt.execute();
				stmt.close();
			}
			
			for (int i = 401; i < 501; i++) {
				String sql1 = "insert into tb_concrete_service values (?, ?, "
						+ "'96', '1', '0.5', '1', '1', 1, 0, 1, 'working hours', '2', 'text', '1', "
						+ "0);";
				
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				//stmt.setString(2, "Processed");
		        //stmt.setTimestamp(3, new Timestamp(new Date().getTime()));
		        stmt.setString(2, "S"+i+"(x?; y!):= A5(x?; y!)");
		        
				stmt.execute();
				stmt.close();
			}
	
			System.out.println("Associoando concreto -> abstrato: ");			
			
			for (int i = 1; i < 101; i++) {
				String sql1 = "insert into tb_concrete_abstract values (?, ?);";
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				stmt.setInt(2, 1);
				stmt.execute();
				stmt.close();
				//System.out.println("feito " + i);
			}
			
			for (int i = 101; i < 201; i++) {
				String sql1 = "insert into tb_concrete_abstract values (?, ?);";
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				stmt.setInt(2, 2);
				stmt.execute();
				stmt.close();
				//System.out.println("feito " + i);
			}
			
			for (int i = 201; i < 301; i++) {
				String sql1 = "insert into tb_concrete_abstract values (?, ?);";
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				stmt.setInt(2, 3);
				stmt.execute();
				stmt.close();
				//System.out.println("feito " + i);
			}
		
			for (int i = 301; i < 401; i++) {
				String sql1 = "insert into tb_concrete_abstract values (?, ?);";
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				stmt.setInt(2, 4);
				stmt.execute();
				stmt.close();
				//System.out.println("feito " + i);
			}
	
			for (int i = 401; i < 501; i++) {
				String sql1 = "insert into tb_concrete_abstract values (?, ?);";
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				stmt.setInt(2, 5);
				stmt.execute();
				stmt.close();
				//System.out.println("feito " + i);
			}
			
			connection.close();
	        
	        System.out.println("Concrete registered.");
	        
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


	public void populateCompositions(String databaseName) {
		
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
						
			System.out.println("Criando composicoes: ");			
			
			for (int i = 1; i < 1001; i++) {
				for (int j = 1; j < 101; j++) {
					String sql1 = "insert into tb_composition values (?, ?);";
					PreparedStatement stmt = connection.prepareStatement(sql1);
					stmt.setInt(1, i);
					stmt.setInt(2, j);
					stmt.execute();
					stmt.close();
					//System.out.println("feito " + i);
				}
				for (int j = 101; j < 201; j++) {
					String sql1 = "insert into tb_composition values (?, ?);";
					PreparedStatement stmt = connection.prepareStatement(sql1);
					stmt.setInt(1, i);
					stmt.setInt(2, j);
					stmt.execute();
					stmt.close();
					//System.out.println("feito " + i);
				}
			}
			
			for (int i = 1001; i < 2001; i++) {
				for (int j = 1; j < 101; j++) {
					String sql1 = "insert into tb_composition values (?, ?);";
					PreparedStatement stmt = connection.prepareStatement(sql1);
					stmt.setInt(1, i);
					stmt.setInt(2, j);
					stmt.execute();
					stmt.close();
					//System.out.println("feito " + i);
				}
				for (int j = 101; j < 201; j++) {
					String sql1 = "insert into tb_composition values (?, ?);";
					PreparedStatement stmt = connection.prepareStatement(sql1);
					stmt.setInt(1, i);
					stmt.setInt(2, j);
					stmt.execute();
					stmt.close();
					//System.out.println("feito " + i);
				}
				for (int j = 201; j < 301; j++) {
					String sql1 = "insert into tb_composition values (?, ?);";
					PreparedStatement stmt = connection.prepareStatement(sql1);
					stmt.setInt(1, i);
					stmt.setInt(2, j);
					stmt.execute();
					stmt.close();
					//System.out.println("feito " + i);
				}
			}
			
			for (int i = 2001; i < 3001; i++) {
				for (int j = 1; j < 101; j++) {
					String sql1 = "insert into tb_composition values (?, ?);";
					PreparedStatement stmt = connection.prepareStatement(sql1);
					stmt.setInt(1, i);
					stmt.setInt(2, j);
					stmt.execute();
					stmt.close();
					//System.out.println("feito " + i);
				}
				for (int j = 101; j < 201; j++) {
					String sql1 = "insert into tb_composition values (?, ?);";
					PreparedStatement stmt = connection.prepareStatement(sql1);
					stmt.setInt(1, i);
					stmt.setInt(2, j);
					stmt.execute();
					stmt.close();
					//System.out.println("feito " + i);
				}
				for (int j = 201; j < 301; j++) {
					String sql1 = "insert into tb_composition values (?, ?);";
					PreparedStatement stmt = connection.prepareStatement(sql1);
					stmt.setInt(1, i);
					stmt.setInt(2, j);
					stmt.execute();
					stmt.close();
					//System.out.println("feito " + i);
				}
				for (int j = 301; j < 401; j++) {
					String sql1 = "insert into tb_composition values (?, ?);";
					PreparedStatement stmt = connection.prepareStatement(sql1);
					stmt.setInt(1, i);
					stmt.setInt(2, j);
					stmt.execute();
					stmt.close();
					//System.out.println("feito " + i);
				}
			}
			
			for (int i = 3001; i < 4001; i++) {
				for (int j = 1; j < 101; j++) {
					String sql1 = "insert into tb_composition values (?, ?);";
					PreparedStatement stmt = connection.prepareStatement(sql1);
					stmt.setInt(1, i);
					stmt.setInt(2, j);
					stmt.execute();
					stmt.close();
					//System.out.println("feito " + i);
				}
				for (int j = 101; j < 201; j++) {
					String sql1 = "insert into tb_composition values (?, ?);";
					PreparedStatement stmt = connection.prepareStatement(sql1);
					stmt.setInt(1, i);
					stmt.setInt(2, j);
					stmt.execute();
					stmt.close();
					//System.out.println("feito " + i);
				}
				for (int j = 201; j < 301; j++) {
					String sql1 = "insert into tb_composition values (?, ?);";
					PreparedStatement stmt = connection.prepareStatement(sql1);
					stmt.setInt(1, i);
					stmt.setInt(2, j);
					stmt.execute();
					stmt.close();
					//System.out.println("feito " + i);
				}
				for (int j = 301; j < 401; j++) {
					String sql1 = "insert into tb_composition values (?, ?);";
					PreparedStatement stmt = connection.prepareStatement(sql1);
					stmt.setInt(1, i);
					stmt.setInt(2, j);
					stmt.execute();
					stmt.close();
					//System.out.println("feito " + i);
				}
				for (int j = 401; j < 501; j++) {
					String sql1 = "insert into tb_composition values (?, ?);";
					PreparedStatement stmt = connection.prepareStatement(sql1);
					stmt.setInt(1, i);
					stmt.setInt(2, j);
					stmt.execute();
					stmt.close();
					//System.out.println("feito " + i);
				}
			}
			
			connection.close();
	        
	        System.out.println("Compositions registered.");
	        
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void populateRewritings(String databaseName) {
		
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
						
			System.out.println("Criando associacoes query -> compositions: ");			
			
			for (int i = 1; i < 10001; i++) {
				for (int j = 1; j < 1001; j++) {
					String sql1 = "insert into tb_query_composition values (?, ?);";
					PreparedStatement stmt = connection.prepareStatement(sql1);
					stmt.setInt(1, i);
					stmt.setInt(2, j);
					stmt.execute();
					stmt.close();
					//System.out.println("feito " + i);
				}
			}
			
			for (int i = 10001; i < 20001; i++) {
				for (int j = 1001; j < 2001; j++) {
					String sql1 = "insert into tb_query_composition values (?, ?);";
					PreparedStatement stmt = connection.prepareStatement(sql1);
					stmt.setInt(1, i);
					stmt.setInt(2, j);
					stmt.execute();
					stmt.close();
					//System.out.println("feito " + i);
				}
			}
			
			for (int i = 20001; i < 30001; i++) {
				for (int j = 2001; j < 3001; j++) {
					String sql1 = "insert into tb_query_composition values (?, ?);";
					PreparedStatement stmt = connection.prepareStatement(sql1);
					stmt.setInt(1, i);
					stmt.setInt(2, j);
					stmt.execute();
					stmt.close();
					//System.out.println("feito " + i);
				}
			}
			
			for (int i = 30001; i < 40001; i++) {
				for (int j = 3001; j < 4001; j++) {
					String sql1 = "insert into tb_query_composition values (?, ?);";
					PreparedStatement stmt = connection.prepareStatement(sql1);
					stmt.setInt(1, i);
					stmt.setInt(2, j);
					stmt.execute();
					stmt.close();
					//System.out.println("feito " + i);
				}
			}
			
			connection.close();
	        
	        System.out.println("Compositions registered.");
	        
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
			for (int i = 1; i < 10001; i++) {
				String sql1 = "insert into tb_query_abstract values (?, ?);";
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				for (int j = 1; j < 3; j++) {
					stmt.setInt(2, j);
					stmt.execute();
				}
				stmt.close();
				//System.out.println("feito " + i);
			}
			
			System.out.println("3 abstracts...");
			for (int i = 10001; i < 20001; i++) {
				String sql1 = "insert into tb_query_abstract values (?, ?);";
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				for (int j = 1; j < 4; j++) {
					stmt.setInt(2, j);
					stmt.execute();
				}
				stmt.close();
				//System.out.println("feito " + i);
			}
			
			System.out.println("4 abstracts...");
			for (int i = 20001; i < 30001; i++) {
				String sql1 = "insert into tb_query_abstract values (?, ?);";
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				for (int j = 1; j < 5; j++) {
					stmt.setInt(2, j);
					stmt.execute();
				}
				stmt.close();
				//System.out.println("feito " + i);
			}
			
			System.out.println("5 abstracts...");
			for (int i = 30001; i < 40001; i++) {
				String sql1 = "insert into tb_query_abstract values (?, ?);";
				PreparedStatement stmt = connection.prepareStatement(sql1);
				stmt.setInt(1, i);
				for (int j = 1; j < 6; j++) {
					stmt.setInt(2, j);
					stmt.execute();
				}
				stmt.close();
				//System.out.println("feito " + i);
			}
			
//			System.out.println("Associando os serviços abstratos com as consultas de tamanho 5...");
//			for (int i = 1; i < 10001; i++) {
//				String sql1 = "insert into tb_query_abstract values (?, ?);";
//				PreparedStatement stmt = connection.prepareStatement(sql1);
//				stmt.setInt(1, i);
//				for (int j = 1; j < 6; j++) {
//					stmt.setInt(2, j);
//					stmt.execute();
//				}
//				stmt.close();
//				System.out.println("Feito " + i);
//			}
			
			connection.close();
	        
	        System.out.println("Query/Abstract services registered.");
	        
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
//	public void populateRewritings(int idQuery, List<List<ConcreteService>> combinations) throws SQLException{
//		int idComb = 1;
//		for (List<ConcreteService> list : combinations) {
//			PreparedStatement stmt = null;
//			Connection connection = null;
//			for (ConcreteService concreteService : list) {
//					
//				String driverName = "com.mysql.jdbc.Driver";                        
//				 
//				try {
//					Class.forName(driverName);
//				} catch (ClassNotFoundException e1) {
//					e1.printStackTrace();
//				}
//
//
//				String serverName = "localhost";  
//				String mydatabase = "query_history";       
//				String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
//
//				String username = "root";      
//				String password = "1234";
//
//				try {
//					connection = DriverManager.getConnection(url, username, password);
//					
//					if (connection != null)
//						 System.out.println("Connected to the database.");
//					
//					System.out.println("Feeding the database combinations of data services...");			
//					
//					String sql = "insert into tb_combination values (?, ?);";
//					
//					stmt = connection.prepareStatement(sql);
//					stmt.setInt(1, idComb);
//					stmt.setInt(2, concreteService.getId());
//					stmt.execute();
//			        System.out.println("Combinations registered.");
//			        
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//			}
//		
//			// Inserir na tabela rewritings
//			System.out.println("Feeding the database rewritings of the query...");	
//			String sql2 = "insert into tb_rewriting values (?, ?);";
//			
//			stmt = connection.prepareStatement(sql2);
//			stmt.setInt(1, idQuery);
//			stmt.setInt(2, idComb);
//			stmt.execute();
//	        System.out.println("Combinations registered.");
//			
//			stmt.close();
//	        connection.close();
//			idComb++;
//		}	
//	}
}
