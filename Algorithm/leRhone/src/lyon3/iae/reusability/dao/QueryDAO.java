package lyon3.iae.reusability.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import lyon3.iae.datamodel.Query;

public class QueryDAO {

	private EntityManagerUtil util;
	
	public QueryDAO(String dbName) {
		this.setUtil(new EntityManagerUtil(dbName));
	}
	
	public static QueryDAO getInstance() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Integer> findEquivalentQueries(Query incomingQuery) throws SQLException {
		Connection connection = this.getUtil().getConnection();
		int quantityOfAbstractServices = incomingQuery.getAbstractServicesAsInt().size(); 
		
		String sql = "select distinct q.id from tb_query_history q, tb_query_abstract a "
				+ "where q.id = a.id_query and ";
		
		if (quantityOfAbstractServices == 1) {
			sql += "( a.id_abstract = ? ) ";
		} else {
			for (int i = 0; i < quantityOfAbstractServices; i++) {
				if (i == 0) {
					sql += "( a.id_abstract = ? ";
				}else if (i == quantityOfAbstractServices-1){
					sql += "or a.id_abstract = ? ) and ";
				}else {
					sql += "or a.id_abstract = ? ";
				}
			}	
		}
		
		sql += "q.availability = ? and q.response_time = ? and "
				+ "q.price_per_call = ? and q.authentication = ? and "
				+ "q.privacy = ? and q.trust = ? and q.degree_of_rawness = ? and ";

		
		sql += "q.veracity = ? and q.production_time = ? and "	
				+ "q.production_rate = ? and q.data_type = ? and q.freshness = ? and "
				+ "q.provenance = ? and ";
		
		sql += "q.total_cost = ? and q.total_response_time = ? and ";
		
		sql += "((select count(*) from tb_query_abstract a2 where a2.id_query = q.id) = ?);";
		
		//System.out.println("SQL: " + sql);
		
		PreparedStatement stmt = connection.prepareStatement(sql);
		
		/* K = Variable to be used in the set of query parameters. */
		int k = 1;
		for (int i = 0; i < quantityOfAbstractServices; i++) {
			stmt.setInt(k++, incomingQuery.getAbstractServicesAsInt().get(i));
		}	
		
		stmt.setDouble(k++, incomingQuery.getAvailability());
		stmt.setDouble(k++, incomingQuery.getResponseTime());
		stmt.setDouble(k++, incomingQuery.getPricePerCall());
		stmt.setString(k++, incomingQuery.getAuthentication());
		stmt.setString(k++, incomingQuery.getPrivacy());		
		stmt.setString(k++, incomingQuery.getTrust());
		stmt.setString(k++, incomingQuery.getDegreeOfRawness());
		stmt.setString(k++, incomingQuery.getVeracity());
		stmt.setString(k++, incomingQuery.getProductionTime());
		stmt.setDouble(k++, incomingQuery.getProductionRate());
		stmt.setString(k++, incomingQuery.getDataType());
		stmt.setString(k++, incomingQuery.getFreshness());
		stmt.setString(k++, incomingQuery.getProvenance());
		stmt.setDouble(k++, incomingQuery.getTotalCost());
		stmt.setDouble(k++, incomingQuery.getTotalResponseTime());
		stmt.setInt(k++, quantityOfAbstractServices);
		
		//System.out.println(stmt.toString());
		
		LinkedList<Integer> results = new LinkedList<Integer>();
		
		ResultSet rs = stmt.executeQuery();
		
		while (rs.next()) {
			results.add(rs.getInt("id"));
		}
		
		stmt.execute();
		stmt.close();
        connection.close();
        
		return results;
	}

	public List<Integer> findEquivalentQueriesLessRestrict(Query incomingQuery) throws SQLException {
		Connection connection = this.getUtil().getConnection();
		int quantityOfAbstractServices = incomingQuery.getAbstractServicesAsInt().size(); 
		
		String sql = "select distinct q.id from tb_query_history q, tb_query_abstract a "
				+ "where q.id = a.id_query and ";
		
		if (quantityOfAbstractServices == 1) {
			sql += "( a.id_abstract = ? ) ";
		} else {
			for (int i = 0; i < quantityOfAbstractServices; i++) {
				if (i == 0) {
					sql += "( a.id_abstract = ? ";
				}else if (i == quantityOfAbstractServices-1){
					sql += "or a.id_abstract = ? ) and ";
				}else {
					sql += "or a.id_abstract = ? ";
				}
			}	
		}
		
		sql += "q.availability <= ? and q.response_time >= ? and "
				+ "q.price_per_call >= ? and ";
		
		if (incomingQuery.getAuthentication().equalsIgnoreCase("yes")) {
			sql += "(q.authentication = 'yes' or q.authentication = 'no') and ";
		} else {
			sql += "(q.authentication = 'no') and ";
		}
		
		if (incomingQuery.getPrivacy().equalsIgnoreCase("yes")) {
			sql += "(q.privacy = 'yes' or q.privacy = 'no') and ";
		} else {
			sql += "(q.privacy = 'no') and ";
		}
		
		if (incomingQuery.getTrust().equalsIgnoreCase("low")) {
			sql += "(q.trust = 'low') and ";
		} else if (incomingQuery.getTrust().equalsIgnoreCase("medium")) {
			sql += "(q.trust = 'low' or q.trust = 'medium') and ";
		} else {
			sql += "(q.trust = 'low' or q.trust = 'medium' or q.trust = 'high') and ";
		}
		
		if (incomingQuery.getDegreeOfRawness().equalsIgnoreCase("high")) {
			sql += "(q.degree_of_rawness = 'high' or q.degree_of_rawness = 'medium' or q.degree_of_rawness = 'low') and ";
		} else if (incomingQuery.getDegreeOfRawness().equalsIgnoreCase("medium")) {
			sql += "(q.degree_of_rawness = 'low' or q.degree_of_rawness = 'medium') and ";
		} else {
			sql += "q.degree_of_rawness = 'low' and ";
		}
		
		if (incomingQuery.getVeracity().equalsIgnoreCase("reliable")){
			sql += "(q.veracity = 'reliable' or q.veracity = 'unreliable') and ";
		}
		
		sql += "q.production_time = ? and "	
				+ "q.production_rate <= ? and ";
		
		if (incomingQuery.getFreshness().equalsIgnoreCase("no")) {
			sql += "q.freshness = 'no' and ";
		} else {
			sql += "(q.freshness = 'yes' or q.freshness = 'no') and ";
		}
		
		if (incomingQuery.getProvenance().equalsIgnoreCase("not certified")) {
			sql += "q.provenance = 'not certified' and ";
		} else {
			sql += "(q.provenance = 'certified' or q.provenance = 'not certified') and ";
		}

		sql += "q.total_cost >= ? and q.total_response_time >= ? and ";
		
		sql += "((select count(*) from tb_query_abstract a2 where a2.id_query = q.id) = ?);";
		
		//System.out.println("SQL: " + sql);
		
		PreparedStatement stmt = connection.prepareStatement(sql);
		
		/* K = Variable to be used in the set of query parameters. */
		int k = 1;
		for (int i = 0; i < quantityOfAbstractServices; i++) {
			stmt.setInt(k++, incomingQuery.getAbstractServicesAsInt().get(i));
		}	
		
		stmt.setDouble(k++, incomingQuery.getAvailability());
		stmt.setDouble(k++, incomingQuery.getResponseTime());
		stmt.setDouble(k++, incomingQuery.getPricePerCall());
		//stmt.setString(k++, incomingQuery.getAuthentication());
		//stmt.setString(k++, incomingQuery.getPrivacy());		
		//stmt.setString(k++, incomingQuery.getTrust());
		//stmt.setString(k++, incomingQuery.getDegreeOfRawness());
		//stmt.setString(k++, incomingQuery.getVeracity());
		stmt.setString(k++, incomingQuery.getProductionTime());
		stmt.setDouble(k++, incomingQuery.getProductionRate());
		//stmt.setString(k++, incomingQuery.getDataType());
		//stmt.setString(k++, incomingQuery.getFreshness());
		//stmt.setString(k++, incomingQuery.getProvenance());
		stmt.setDouble(k++, incomingQuery.getTotalCost());
		stmt.setDouble(k++, incomingQuery.getTotalResponseTime());
		stmt.setInt(k++, quantityOfAbstractServices);
		
		LinkedList<Integer> results = new LinkedList<Integer>();
		
		//System.out.println(stmt.toString());
		
		ResultSet rs = stmt.executeQuery();
		
		while (rs.next()) {
			results.add(rs.getInt("id"));
			//System.out.println(rs.getInt("id"));
		}
		
		stmt.execute();
		stmt.close();
        connection.close();

		return results;
	}

	public List<Integer> findEquivalentQueriesMoreRestrict(Query incomingQuery) throws SQLException {
		Connection connection = this.getUtil().getConnection();
		int quantityOfAbstractServices = incomingQuery.getAbstractServicesAsInt().size(); 
		
		String sql = "select distinct q.id from tb_query_history q, tb_query_abstract a "
				+ "where q.id = a.id_query and ";
		
		if (quantityOfAbstractServices == 1) {
			sql += "( a.id_abstract = ? ) ";
		} else {
			for (int i = 0; i < quantityOfAbstractServices; i++) {
				if (i == 0) {
					sql += "( a.id_abstract = ? ";
				}else if (i == quantityOfAbstractServices-1){
					sql += "or a.id_abstract = ? ) and ";
				}else {
					sql += "or a.id_abstract = ? ";
				}
			}	
		}
		
		sql += "( q.availability > ? or q.response_time < ? or "
				+ "q.price_per_call < ? or ";
		
		if (incomingQuery.getAuthentication().equalsIgnoreCase("no")) {
			sql += "(q.authentication = 'yes') or ";
		} else {
			// Do Nothing
		}
		
		if (incomingQuery.getPrivacy().equalsIgnoreCase("yes")) {
			// Do Nothing
		} else {
			sql += "(q.privacy = 'yes') or ";
		}
		
		if (incomingQuery.getTrust().equalsIgnoreCase("high")) {
			// Do Nothing
		} else if (incomingQuery.getTrust().equalsIgnoreCase("medium")) {
			sql += "( q.trust = 'high' ) or ";
		} else {
			sql += "(q.trust = 'medium' or q.trust = 'high') or ";
		}
		
		if (incomingQuery.getDegreeOfRawness().equalsIgnoreCase("high")) {
			// Do Nothing
		} else if (incomingQuery.getDegreeOfRawness().equalsIgnoreCase("medium")) {
			sql += "(q.degree_of_rawness = 'high') or ";
		} else {
			sql += "(q.degree_of_rawness = 'medium' or q.degree_of_rawness = 'high') or ";
		}
		
		if (incomingQuery.getVeracity().equalsIgnoreCase("reliable")){
			// Do nothing
		} else {
			sql += "(q.veracity = 'reliable') or ";
		}
		
		sql += "q.production_rate > ? or ";
		
		if (incomingQuery.getFreshness().equalsIgnoreCase("no")) {
			sql += "q.freshness = 'yes' or ";
		} else {
			// Do nothing
		}
		
		if (incomingQuery.getProvenance().equalsIgnoreCase("not certified")) {
			sql += "q.provenance = 'certified' or ";
		} else {
			// Do nothing
		}

		sql += "q.total_cost < ? or q.total_response_time < ? ) and ";
		
		sql += "((select count(*) from tb_query_abstract a2 where a2.id_query = q.id) = ?);";
		
		//System.out.println("SQL: " + sql);
		
		PreparedStatement stmt = connection.prepareStatement(sql);
		
		/* K = Variable to be used in the set of query parameters. */
		int k = 1;
		for (int i = 0; i < quantityOfAbstractServices; i++) {
			stmt.setInt(k++, incomingQuery.getAbstractServicesAsInt().get(i));
		}	
		
		stmt.setDouble(k++, incomingQuery.getAvailability());
		stmt.setDouble(k++, incomingQuery.getResponseTime());
		stmt.setDouble(k++, incomingQuery.getPricePerCall());
		//stmt.setString(k++, incomingQuery.getAuthentication());
		//stmt.setString(k++, incomingQuery.getPrivacy());		
		//stmt.setString(k++, incomingQuery.getTrust());
		//stmt.setString(k++, incomingQuery.getDegreeOfRawness());
		//stmt.setString(k++, incomingQuery.getVeracity());
		//stmt.setString(k++, incomingQuery.getProductionTime());
		stmt.setDouble(k++, incomingQuery.getProductionRate());
		//stmt.setString(k++, incomingQuery.getDataType());
		//stmt.setString(k++, incomingQuery.getFreshness());
		//stmt.setString(k++, incomingQuery.getProvenance());
		stmt.setDouble(k++, incomingQuery.getTotalCost());
		stmt.setDouble(k++, incomingQuery.getTotalResponseTime());
		stmt.setInt(k++, quantityOfAbstractServices);
		
		LinkedList<Integer> results = new LinkedList<Integer>();
		
		//System.out.println(stmt.toString());
		
		ResultSet rs = stmt.executeQuery();
		
		while (rs.next()) {
			results.add(rs.getInt("id"));
			//System.out.println(rs.getInt("id"));
		}
		
		stmt.execute();
		stmt.close();
        connection.close();

		return results;
	}
	
	/* 
	 * Pega as consultas que tem mais abstratos 
	 * */
	public List<Integer> findEquivalentSupersetQueries(Query incomingQuery) throws SQLException {
		Connection connection = this.getUtil().getConnection();
		int quantityOfAbstractServices = incomingQuery.getAbstractServicesAsInt().size(); 
		
		String sql = "select distinct q.id from tb_query_history q, tb_query_abstract a "
				+ "where q.id = a.id_query and ";
		
		if (quantityOfAbstractServices == 1) {
			sql += "( a.id_abstract = ? ) ";
		} else {
			for (int i = 0; i < quantityOfAbstractServices; i++) {
				if (i == 0) {
					sql += "( a.id_abstract = ? ";
				}else if (i == quantityOfAbstractServices-1){
					sql += "or a.id_abstract = ? ) and ";
				}else {
					sql += "or a.id_abstract = ? ";
				}
			}	
		}
		
		sql += "q.availability = ? and q.response_time = ? and "
				+ "q.price_per_call = ? and q.authentication = ? and "
				+ "q.privacy = ? and q.trust = ? and q.degree_of_rawness = ? and ";

		
		sql += "q.veracity = ? and q.production_time = ? and "	
				+ "q.production_rate = ? and q.data_type = ? and q.freshness = ? and "
				+ "q.provenance = ? and ";
		
		sql += "q.total_cost = ? and q.total_response_time = ? and ";
		
		sql += "((select count(*) from tb_query_abstract a2 where a2.id_query = q.id) > ?);";
		
		//System.out.println("SQL: " + sql);
		
		PreparedStatement stmt = connection.prepareStatement(sql);
		
		/* K = Variable to be used in the set of query parameters. */
		int k = 1;
		for (int i = 0; i < quantityOfAbstractServices; i++) {
			stmt.setInt(k++, incomingQuery.getAbstractServicesAsInt().get(i));
		}	
		
		stmt.setDouble(k++, incomingQuery.getAvailability());
		stmt.setDouble(k++, incomingQuery.getResponseTime());
		stmt.setDouble(k++, incomingQuery.getPricePerCall());
		stmt.setString(k++, incomingQuery.getAuthentication());
		stmt.setString(k++, incomingQuery.getPrivacy());		
		stmt.setString(k++, incomingQuery.getTrust());
		stmt.setString(k++, incomingQuery.getDegreeOfRawness());
		stmt.setString(k++, incomingQuery.getVeracity());
		stmt.setString(k++, incomingQuery.getProductionTime());
		stmt.setDouble(k++, incomingQuery.getProductionRate());
		stmt.setString(k++, incomingQuery.getDataType());
		stmt.setString(k++, incomingQuery.getFreshness());
		stmt.setString(k++, incomingQuery.getProvenance());
		stmt.setDouble(k++, incomingQuery.getTotalCost());
		stmt.setDouble(k++, incomingQuery.getTotalResponseTime());
		stmt.setInt(k++, quantityOfAbstractServices);
		
		//System.out.println(stmt.toString());
		
		LinkedList<Integer> results = new LinkedList<Integer>();
		
		ResultSet rs = stmt.executeQuery();
		List<Integer> abstracts = new LinkedList<Integer>();
		
		while (rs.next()) {
			int queryID = rs.getInt("id");
			
			String newSql = "select a.id_abstract from tb_query_abstract a where a.id_query = " + queryID + ";";
			PreparedStatement stmt2 = connection.prepareStatement(newSql);
			ResultSet rs2 = stmt2.executeQuery();
			
			abstracts.clear();
			while (rs2.next()) {
				abstracts.add(rs2.getInt("id_abstract"));
			}
		
			if (abstracts.containsAll(incomingQuery.getAbstractServicesAsInt())) {
				results.add(rs.getInt("id"));
			}
		}
		
		stmt.execute();
		stmt.close();
        connection.close();
        
		return results;
	}

	/* 
	 * Pega as consultas que tem mais abstratos 
	 * */
	public List<Integer> findEquivalentSupersetQueriesLessRestrict(Query incomingQuery) throws SQLException {
		Connection connection = this.getUtil().getConnection();
		int quantityOfAbstractServices = incomingQuery.getAbstractServicesAsInt().size(); 
		
		String sql = "select distinct q.id from tb_query_history q, tb_query_abstract a "
				+ "where q.id = a.id_query and ";
		
		if (quantityOfAbstractServices == 1) {
			sql += "( a.id_abstract = ? ) ";
		} else {
			for (int i = 0; i < quantityOfAbstractServices; i++) {
				if (i == 0) {
					sql += "( a.id_abstract = ? ";
				}else if (i == quantityOfAbstractServices-1){
					sql += "or a.id_abstract = ? ) and ";
				}else {
					sql += "or a.id_abstract = ? ";
				}
			}	
		}
		
		sql += "q.availability <= ? and q.response_time >= ? and "
				+ "q.price_per_call >= ? and ";
		
		if (incomingQuery.getAuthentication().equalsIgnoreCase("yes")) {
			sql += "(q.authentication = 'yes' or q.authentication = 'no') and ";
		} else {
			sql += "(q.authentication = 'no') and ";
		}
		
		if (incomingQuery.getPrivacy().equalsIgnoreCase("yes")) {
			sql += "(q.privacy = 'yes' or q.privacy = 'no') and ";
		} else {
			sql += "(q.privacy = 'no') and ";
		}
		
		if (incomingQuery.getTrust().equalsIgnoreCase("low")) {
			sql += "(q.trust = 'low') and ";
		} else if (incomingQuery.getTrust().equalsIgnoreCase("medium")) {
			sql += "(q.trust = 'low' or q.trust = 'medium') and ";
		} else {
			sql += "(q.trust = 'low' or q.trust = 'medium' or q.trust = 'high') and ";
		}
		
		if (incomingQuery.getDegreeOfRawness().equalsIgnoreCase("high")) {
			sql += "(q.degree_of_rawness = 'high' or q.degree_of_rawness = 'medium' or q.degree_of_rawness = 'low') and ";
		} else if (incomingQuery.getDegreeOfRawness().equalsIgnoreCase("medium")) {
			sql += "(q.degree_of_rawness = 'low' or q.degree_of_rawness = 'medium') and ";
		} else {
			sql += "q.degree_of_rawness = 'low' and ";
		}
		
		if (incomingQuery.getVeracity().equalsIgnoreCase("reliable")){
			sql += "(q.veracity = 'reliable' or q.veracity = 'unreliable') and ";
		}
		
		sql += "q.production_time = ? and "	
				+ "q.production_rate <= ? and ";
		
		if (incomingQuery.getFreshness().equalsIgnoreCase("no")) {
			sql += "q.freshness = 'no' and ";
		} else {
			sql += "(q.freshness = 'yes' or q.freshness = 'no') and ";
		}
		
		if (incomingQuery.getProvenance().equalsIgnoreCase("not certified")) {
			sql += "q.provenance = 'not certified' and ";
		} else {
			sql += "(q.provenance = 'certified' or q.provenance = 'not certified') and ";
		}

		sql += "q.total_cost >= ? and q.total_response_time >= ? and ";
		
		sql += "((select count(*) from tb_query_abstract a2 where a2.id_query = q.id) > ?);";
		
		//System.out.println("SQL: " + sql);
		
		PreparedStatement stmt = connection.prepareStatement(sql);
		
		/* K = Variable to be used in the set of query parameters. */
		int k = 1;
		for (int i = 0; i < quantityOfAbstractServices; i++) {
			stmt.setInt(k++, incomingQuery.getAbstractServicesAsInt().get(i));
		}	
		
		stmt.setDouble(k++, incomingQuery.getAvailability());
		stmt.setDouble(k++, incomingQuery.getResponseTime());
		stmt.setDouble(k++, incomingQuery.getPricePerCall());
		//stmt.setString(k++, incomingQuery.getAuthentication());
		//stmt.setString(k++, incomingQuery.getPrivacy());		
		//stmt.setString(k++, incomingQuery.getTrust());
		//stmt.setString(k++, incomingQuery.getDegreeOfRawness());
		//stmt.setString(k++, incomingQuery.getVeracity());
		stmt.setString(k++, incomingQuery.getProductionTime());
		stmt.setDouble(k++, incomingQuery.getProductionRate());
		//stmt.setString(k++, incomingQuery.getDataType());
		//stmt.setString(k++, incomingQuery.getFreshness());
		//stmt.setString(k++, incomingQuery.getProvenance());
		stmt.setDouble(k++, incomingQuery.getTotalCost());
		stmt.setDouble(k++, incomingQuery.getTotalResponseTime());
		stmt.setInt(k++, quantityOfAbstractServices);
		
		LinkedList<Integer> results = new LinkedList<Integer>();
		
		//System.out.println(stmt.toString());
		
		ResultSet rs = stmt.executeQuery();
		
		List<Integer> abstracts = new LinkedList<Integer>();
		while (rs.next()) {
			int queryID = rs.getInt("id");
			
			String newSql = "select a.id_abstract from tb_query_abstract a where a.id_query = " + queryID + ";";
			PreparedStatement stmt2 = connection.prepareStatement(newSql);
			ResultSet rs2 = stmt2.executeQuery();
			
			abstracts.clear();
			while (rs2.next()) {
				abstracts.add(rs2.getInt("id_abstract"));
			}
		
			if (abstracts.containsAll(incomingQuery.getAbstractServicesAsInt())) {
				results.add(rs.getInt("id"));
			}
		}
		
		stmt.execute();
		stmt.close();
        connection.close();

		return results;
	}

	/* 
	 * Pega as consultas que tem mais abstratos 
	 * */
	public List<Integer> findEquivalentSupersetQueriesMoreRestrict(Query incomingQuery) throws SQLException {
		Connection connection = this.getUtil().getConnection();
		int quantityOfAbstractServices = incomingQuery.getAbstractServicesAsInt().size(); 
		
		String sql = "select distinct q.id from tb_query_history q, tb_query_abstract a "
				+ "where q.id = a.id_query and ";
		
		if (quantityOfAbstractServices == 1) {
			sql += "( a.id_abstract = ? ) ";
		} else {
			for (int i = 0; i < quantityOfAbstractServices; i++) {
				if (i == 0) {
					sql += "( a.id_abstract = ? ";
				}else if (i == quantityOfAbstractServices-1){
					sql += "or a.id_abstract = ? ) and ";
				}else {
					sql += "or a.id_abstract = ? ";
				}
			}	
		}
		
		sql += "( q.availability > ? or q.response_time < ? or "
				+ "q.price_per_call < ? or ";
		
		if (incomingQuery.getAuthentication().equalsIgnoreCase("no")) {
			sql += "(q.authentication = 'yes') or ";
		} else {
			// Do Nothing
		}
		
		if (incomingQuery.getPrivacy().equalsIgnoreCase("yes")) {
			// Do Nothing
		} else {
			sql += "(q.privacy = 'yes') or ";
		}
		
		if (incomingQuery.getTrust().equalsIgnoreCase("high")) {
			// Do Nothing
		} else if (incomingQuery.getTrust().equalsIgnoreCase("medium")) {
			sql += "( q.trust = 'high' ) or ";
		} else {
			sql += "(q.trust = 'medium' or q.trust = 'high') or ";
		}
		
		if (incomingQuery.getDegreeOfRawness().equalsIgnoreCase("high")) {
			// Do Nothing
		} else if (incomingQuery.getDegreeOfRawness().equalsIgnoreCase("medium")) {
			sql += "(q.degree_of_rawness = 'high') or ";
		} else {
			sql += "(q.degree_of_rawness = 'medium' or q.degree_of_rawness = 'high') or ";
		}
		
		if (incomingQuery.getVeracity().equalsIgnoreCase("reliable")){
			// Do nothing
		} else {
			sql += "(q.veracity = 'reliable') or ";
		}
		
		sql += "q.production_rate > ? or ";
		
		if (incomingQuery.getFreshness().equalsIgnoreCase("no")) {
			sql += "q.freshness = 'yes' or ";
		} else {
			// Do nothing
		}
		
		if (incomingQuery.getProvenance().equalsIgnoreCase("not certified")) {
			sql += "q.provenance = 'certified' or ";
		} else {
			// Do nothing
		}

		sql += "q.total_cost < ? or q.total_response_time < ? ) and ";
		
		sql += "((select count(*) from tb_query_abstract a2 where a2.id_query = q.id) > ?);";
		
		//System.out.println("SQL: " + sql);
		
		PreparedStatement stmt = connection.prepareStatement(sql);
		
		/* K = Variable to be used in the set of query parameters. */
		int k = 1;
		for (int i = 0; i < quantityOfAbstractServices; i++) {
			stmt.setInt(k++, incomingQuery.getAbstractServicesAsInt().get(i));
		}	
		
		stmt.setDouble(k++, incomingQuery.getAvailability());
		stmt.setDouble(k++, incomingQuery.getResponseTime());
		stmt.setDouble(k++, incomingQuery.getPricePerCall());
		//stmt.setString(k++, incomingQuery.getAuthentication());
		//stmt.setString(k++, incomingQuery.getPrivacy());		
		//stmt.setString(k++, incomingQuery.getTrust());
		//stmt.setString(k++, incomingQuery.getDegreeOfRawness());
		//stmt.setString(k++, incomingQuery.getVeracity());
		//stmt.setString(k++, incomingQuery.getProductionTime());
		stmt.setDouble(k++, incomingQuery.getProductionRate());
		//stmt.setString(k++, incomingQuery.getDataType());
		//stmt.setString(k++, incomingQuery.getFreshness());
		//stmt.setString(k++, incomingQuery.getProvenance());
		stmt.setDouble(k++, incomingQuery.getTotalCost());
		stmt.setDouble(k++, incomingQuery.getTotalResponseTime());
		stmt.setInt(k++, quantityOfAbstractServices);
		
		LinkedList<Integer> results = new LinkedList<Integer>();
		
		//System.out.println(stmt.toString());
		
		ResultSet rs = stmt.executeQuery();
		
		List<Integer> abstracts = new LinkedList<Integer>();
		while (rs.next()) {
			int queryID = rs.getInt("id");
			
			String newSql = "select a.id_abstract from tb_query_abstract a where a.id_query = " + queryID + ";";
			PreparedStatement stmt2 = connection.prepareStatement(newSql);
			ResultSet rs2 = stmt2.executeQuery();
			
			abstracts.clear();
			while (rs2.next()) {
				abstracts.add(rs2.getInt("id_abstract"));
			}
		
			if (abstracts.containsAll(incomingQuery.getAbstractServicesAsInt())) {
				results.add(rs.getInt("id"));
			}
		}
		
		stmt.execute();
		stmt.close();
        connection.close();

		return results;
	}

	/* 
	 * Pega as consultas que tem menos abstratos 
	 * */
	public List<Integer> findEquivalentSubsetQueries(Query incomingQuery) throws SQLException {
		Connection connection = this.getUtil().getConnection();
		int quantityOfAbstractServices = incomingQuery.getAbstractServicesAsInt().size(); 
		
		String sql = "select distinct q.id from tb_query_history q, tb_query_abstract a "
				+ "where q.id = a.id_query and ";
		
		if (quantityOfAbstractServices == 1) {
			sql += "( a.id_abstract = ? ) ";
		} else {
			for (int i = 0; i < quantityOfAbstractServices; i++) {
				if (i == 0) {
					sql += "( a.id_abstract = ? ";
				}else if (i == quantityOfAbstractServices-1){
					sql += "or a.id_abstract = ? ) and ";
				}else {
					sql += "or a.id_abstract = ? ";
				}
			}	
		}
		
		sql += "q.availability = ? and q.response_time = ? and "
				+ "q.price_per_call = ? and q.authentication = ? and "
				+ "q.privacy = ? and q.trust = ? and q.degree_of_rawness = ? and ";

		
		sql += "q.veracity = ? and q.production_time = ? and "	
				+ "q.production_rate = ? and q.data_type = ? and q.freshness = ? and "
				+ "q.provenance = ? and ";
		
		sql += "q.total_cost = ? and q.total_response_time = ? and ";
		
		sql += "((select count(*) from tb_query_abstract a2 where a2.id_query = q.id) < ?);";
		
		//System.out.println("SQL: " + sql);
		
		PreparedStatement stmt = connection.prepareStatement(sql);
		
		/* K = Variable to be used in the set of query parameters. */
		int k = 1;
		for (int i = 0; i < quantityOfAbstractServices; i++) {
			stmt.setInt(k++, incomingQuery.getAbstractServicesAsInt().get(i));
		}	
		
		stmt.setDouble(k++, incomingQuery.getAvailability());
		stmt.setDouble(k++, incomingQuery.getResponseTime());
		stmt.setDouble(k++, incomingQuery.getPricePerCall());
		stmt.setString(k++, incomingQuery.getAuthentication());
		stmt.setString(k++, incomingQuery.getPrivacy());		
		stmt.setString(k++, incomingQuery.getTrust());
		stmt.setString(k++, incomingQuery.getDegreeOfRawness());
		stmt.setString(k++, incomingQuery.getVeracity());
		stmt.setString(k++, incomingQuery.getProductionTime());
		stmt.setDouble(k++, incomingQuery.getProductionRate());
		stmt.setString(k++, incomingQuery.getDataType());
		stmt.setString(k++, incomingQuery.getFreshness());
		stmt.setString(k++, incomingQuery.getProvenance());
		stmt.setDouble(k++, incomingQuery.getTotalCost());
		stmt.setDouble(k++, incomingQuery.getTotalResponseTime());
		stmt.setInt(k++, quantityOfAbstractServices);
		
		//System.out.println(stmt.toString());
		
		LinkedList<Integer> results = new LinkedList<Integer>();
		
		ResultSet rs = stmt.executeQuery();
		List<Integer> abstracts = new LinkedList<Integer>();
		
		while (rs.next()) {
			int queryID = rs.getInt("id");
			
			String newSql = "select a.id_abstract from tb_query_abstract a where a.id_query = " + queryID + ";";
			PreparedStatement stmt2 = connection.prepareStatement(newSql);
			ResultSet rs2 = stmt2.executeQuery();
			
			abstracts.clear();
			while (rs2.next()) {
				abstracts.add(rs2.getInt("id_abstract"));
			}
		
			if (incomingQuery.getAbstractServicesAsInt().containsAll(abstracts)) {
				results.add(rs.getInt("id"));
			}
		}
		
		stmt.execute();
		stmt.close();
        connection.close();
        
		return results;
	}

	/* 
	 * Pega as consultas que tem menos abstratos 
	 * */
	public List<Integer> findEquivalentSubsetQueriesLessRestrict(Query incomingQuery) throws SQLException {
		Connection connection = this.getUtil().getConnection();
		int quantityOfAbstractServices = incomingQuery.getAbstractServicesAsInt().size(); 
		
		String sql = "select distinct q.id from tb_query_history q, tb_query_abstract a "
				+ "where q.id = a.id_query and ";
		
		if (quantityOfAbstractServices == 1) {
			sql += "( a.id_abstract = ? ) ";
		} else {
			for (int i = 0; i < quantityOfAbstractServices; i++) {
				if (i == 0) {
					sql += "( a.id_abstract = ? ";
				}else if (i == quantityOfAbstractServices-1){
					sql += "or a.id_abstract = ? ) and ";
				}else {
					sql += "or a.id_abstract = ? ";
				}
			}	
		}
		
		sql += "q.availability <= ? and q.response_time >= ? and "
				+ "q.price_per_call >= ? and ";
		
		if (incomingQuery.getAuthentication().equalsIgnoreCase("yes")) {
			sql += "(q.authentication = 'yes' or q.authentication = 'no') and ";
		} else {
			sql += "(q.authentication = 'no') and ";
		}
		
		if (incomingQuery.getPrivacy().equalsIgnoreCase("yes")) {
			sql += "(q.privacy = 'yes' or q.privacy = 'no') and ";
		} else {
			sql += "(q.privacy = 'no') and ";
		}
		
		if (incomingQuery.getTrust().equalsIgnoreCase("low")) {
			sql += "(q.trust = 'low') and ";
		} else if (incomingQuery.getTrust().equalsIgnoreCase("medium")) {
			sql += "(q.trust = 'low' or q.trust = 'medium') and ";
		} else {
			sql += "(q.trust = 'low' or q.trust = 'medium' or q.trust = 'high') and ";
		}
		
		if (incomingQuery.getDegreeOfRawness().equalsIgnoreCase("high")) {
			sql += "(q.degree_of_rawness = 'high' or q.degree_of_rawness = 'medium' or q.degree_of_rawness = 'low') and ";
		} else if (incomingQuery.getDegreeOfRawness().equalsIgnoreCase("medium")) {
			sql += "(q.degree_of_rawness = 'low' or q.degree_of_rawness = 'medium') and ";
		} else {
			sql += "q.degree_of_rawness = 'low' and ";
		}
		
		if (incomingQuery.getVeracity().equalsIgnoreCase("reliable")){
			sql += "(q.veracity = 'reliable' or q.veracity = 'unreliable') and ";
		}
		
		sql += "q.production_time = ? and "	
				+ "q.production_rate <= ? and ";
		
		if (incomingQuery.getFreshness().equalsIgnoreCase("no")) {
			sql += "q.freshness = 'no' and ";
		} else {
			sql += "(q.freshness = 'yes' or q.freshness = 'no') and ";
		}
		
		if (incomingQuery.getProvenance().equalsIgnoreCase("not certified")) {
			sql += "q.provenance = 'not certified' and ";
		} else {
			sql += "(q.provenance = 'certified' or q.provenance = 'not certified') and ";
		}

		sql += "q.total_cost >= ? and q.total_response_time >= ? and ";
		
		sql += "((select count(*) from tb_query_abstract a2 where a2.id_query = q.id) < ?);";
		
		//System.out.println("SQL: " + sql);
		
		PreparedStatement stmt = connection.prepareStatement(sql);
		
		/* K = Variable to be used in the set of query parameters. */
		int k = 1;
		for (int i = 0; i < quantityOfAbstractServices; i++) {
			stmt.setInt(k++, incomingQuery.getAbstractServicesAsInt().get(i));
		}	
		
		stmt.setDouble(k++, incomingQuery.getAvailability());
		stmt.setDouble(k++, incomingQuery.getResponseTime());
		stmt.setDouble(k++, incomingQuery.getPricePerCall());
		//stmt.setString(k++, incomingQuery.getAuthentication());
		//stmt.setString(k++, incomingQuery.getPrivacy());		
		//stmt.setString(k++, incomingQuery.getTrust());
		//stmt.setString(k++, incomingQuery.getDegreeOfRawness());
		//stmt.setString(k++, incomingQuery.getVeracity());
		stmt.setString(k++, incomingQuery.getProductionTime());
		stmt.setDouble(k++, incomingQuery.getProductionRate());
		//stmt.setString(k++, incomingQuery.getDataType());
		//stmt.setString(k++, incomingQuery.getFreshness());
		//stmt.setString(k++, incomingQuery.getProvenance());
		stmt.setDouble(k++, incomingQuery.getTotalCost());
		stmt.setDouble(k++, incomingQuery.getTotalResponseTime());
		stmt.setInt(k++, quantityOfAbstractServices);
		
		LinkedList<Integer> results = new LinkedList<Integer>();
		
		//System.out.println(stmt.toString());
		
		ResultSet rs = stmt.executeQuery();
		
		List<Integer> abstracts = new LinkedList<Integer>();
		while (rs.next()) {
			int queryID = rs.getInt("id");
			
			String newSql = "select a.id_abstract from tb_query_abstract a where a.id_query = " + queryID + ";";
			PreparedStatement stmt2 = connection.prepareStatement(newSql);
			ResultSet rs2 = stmt2.executeQuery();
			
			abstracts.clear();
			while (rs2.next()) {
				abstracts.add(rs2.getInt("id_abstract"));
			}
		
			if (incomingQuery.getAbstractServicesAsInt().containsAll(abstracts)) {
				results.add(rs.getInt("id"));
			}
		}
		
		stmt.execute();
		stmt.close();
        connection.close();

		return results;
	}
	
	/* 
	 * Pega as consultas que tem menos abstratos 
	 * */
	public List<Integer> findEquivalentSubsetQueriesMoreRestrict(Query incomingQuery) throws SQLException {
		Connection connection = this.getUtil().getConnection();
		int quantityOfAbstractServices = incomingQuery.getAbstractServicesAsInt().size(); 
		
		String sql = "select distinct q.id from tb_query_history q, tb_query_abstract a "
				+ "where q.id = a.id_query and ";
		
		if (quantityOfAbstractServices == 1) {
			sql += "( a.id_abstract = ? ) ";
		} else {
			for (int i = 0; i < quantityOfAbstractServices; i++) {
				if (i == 0) {
					sql += "( a.id_abstract = ? ";
				}else if (i == quantityOfAbstractServices-1){
					sql += "or a.id_abstract = ? ) and ";
				}else {
					sql += "or a.id_abstract = ? ";
				}
			}	
		}
		
		sql += "( q.availability > ? or q.response_time < ? or "
				+ "q.price_per_call < ? or ";
		
		if (incomingQuery.getAuthentication().equalsIgnoreCase("no")) {
			sql += "(q.authentication = 'yes') or ";
		} else {
			// Do Nothing
		}
		
		if (incomingQuery.getPrivacy().equalsIgnoreCase("yes")) {
			// Do Nothing
		} else {
			sql += "(q.privacy = 'yes') or ";
		}
		
		if (incomingQuery.getTrust().equalsIgnoreCase("high")) {
			// Do Nothing
		} else if (incomingQuery.getTrust().equalsIgnoreCase("medium")) {
			sql += "( q.trust = 'high' ) or ";
		} else {
			sql += "(q.trust = 'medium' or q.trust = 'high') or ";
		}
		
		if (incomingQuery.getDegreeOfRawness().equalsIgnoreCase("high")) {
			// Do Nothing
		} else if (incomingQuery.getDegreeOfRawness().equalsIgnoreCase("medium")) {
			sql += "(q.degree_of_rawness = 'high') or ";
		} else {
			sql += "(q.degree_of_rawness = 'medium' or q.degree_of_rawness = 'high') or ";
		}
		
		if (incomingQuery.getVeracity().equalsIgnoreCase("reliable")){
			// Do nothing
		} else {
			sql += "(q.veracity = 'reliable') or ";
		}
		
		sql += "q.production_rate > ? or ";
		
		if (incomingQuery.getFreshness().equalsIgnoreCase("no")) {
			sql += "q.freshness = 'yes' or ";
		} else {
			// Do nothing
		}
		
		if (incomingQuery.getProvenance().equalsIgnoreCase("not certified")) {
			sql += "q.provenance = 'certified' or ";
		} else {
			// Do nothing
		}

		sql += "q.total_cost < ? or q.total_response_time < ? ) and ";
		
		sql += "((select count(*) from tb_query_abstract a2 where a2.id_query = q.id) < ?);";
		
		//System.out.println("SQL: " + sql);
		
		PreparedStatement stmt = connection.prepareStatement(sql);
		
		/* K = Variable to be used in the set of query parameters. */
		int k = 1;
		for (int i = 0; i < quantityOfAbstractServices; i++) {
			stmt.setInt(k++, incomingQuery.getAbstractServicesAsInt().get(i));
		}	
		
		stmt.setDouble(k++, incomingQuery.getAvailability());
		stmt.setDouble(k++, incomingQuery.getResponseTime());
		stmt.setDouble(k++, incomingQuery.getPricePerCall());
		//stmt.setString(k++, incomingQuery.getAuthentication());
		//stmt.setString(k++, incomingQuery.getPrivacy());		
		//stmt.setString(k++, incomingQuery.getTrust());
		//stmt.setString(k++, incomingQuery.getDegreeOfRawness());
		//stmt.setString(k++, incomingQuery.getVeracity());
		//stmt.setString(k++, incomingQuery.getProductionTime());
		stmt.setDouble(k++, incomingQuery.getProductionRate());
		//stmt.setString(k++, incomingQuery.getDataType());
		//stmt.setString(k++, incomingQuery.getFreshness());
		//stmt.setString(k++, incomingQuery.getProvenance());
		stmt.setDouble(k++, incomingQuery.getTotalCost());
		stmt.setDouble(k++, incomingQuery.getTotalResponseTime());
		stmt.setInt(k++, quantityOfAbstractServices);
		
		LinkedList<Integer> results = new LinkedList<Integer>();
		
		//System.out.println(stmt.toString());
		
		ResultSet rs = stmt.executeQuery();
		
		List<Integer> abstracts = new LinkedList<Integer>();
		while (rs.next()) {
			int queryID = rs.getInt("id");
			
			String newSql = "select a.id_abstract from tb_query_abstract a where a.id_query = " + queryID + ";";
			PreparedStatement stmt2 = connection.prepareStatement(newSql);
			ResultSet rs2 = stmt2.executeQuery();
			
			abstracts.clear();
			while (rs2.next()) {
				abstracts.add(rs2.getInt("id_abstract"));
			}
		
			if (incomingQuery.getAbstractServicesAsInt().containsAll(abstracts)) {
				results.add(rs.getInt("id"));
			}
		}
		
		stmt.execute();
		stmt.close();
        connection.close();

		return results;
	}

	
	public EntityManagerUtil getUtil() {
		return util;
	}

	public void setUtil(EntityManagerUtil util) {
		this.util = util;
	}

}
