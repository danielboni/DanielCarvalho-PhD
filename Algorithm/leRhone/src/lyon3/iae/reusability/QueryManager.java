package lyon3.iae.reusability;

import java.sql.SQLException;
import java.util.List;

import lyon3.iae.datamodel.Query;
import lyon3.iae.reusability.dao.QueryDAO;


public class QueryManager {

	/*
	 * Method to identify the type of similarities found
	 * for a given incoming query. It return a query manager
	 * associated to the type of similarity.
	 */
	//public QueryManager findSimilarityType (Query incomingQuery, String dbName) throws SQLException {
	public String findSimilarityType (Query incomingQuery, String dbName) throws SQLException {
		
		QueryDAO dao = new QueryDAO(dbName);
		
		// Chamo metodo que vai no banco e pega queries 100% equivalents
		List<Integer> equivalentQueries = dao.findEquivalentQueries(incomingQuery);
		
		if (equivalentQueries.size() > 0) {
			// Retorna o manager desse tipo
			System.out.println("EquivalentQueries: " + equivalentQueries.size());
			return null;
		} 
		
		// Chamo metodo que vai no banco e pega queries equivalentes com preferencias mais restritas
		List<Integer> equivalentQueriesMoreRestrict = dao.findEquivalentQueriesMoreRestrict(incomingQuery);
					
		if (equivalentQueriesMoreRestrict.size() > 0) {
			// Retorna o manager desse tipo
			System.out.println("EquivalentQueriesMoreRestrict: " + equivalentQueriesMoreRestrict.size());
			return null;
		}
		
		// Chamo metodo que vai no banco e pega queries equivalentes com preferencias menos restritas
		List<Integer> equivalentQueriesLessRestrict = dao.findEquivalentQueriesLessRestrict(incomingQuery);
		
		if (equivalentQueriesLessRestrict.size() > 0) {
			// Retorna o manager desse tipo
			System.out.println("EquivalentQueriesLessRestrict: " + equivalentQueriesLessRestrict.size());
			return null;
		} 
		
		// Continuo para os outros tipos ...
		String retorno = "Query equivalents: " + equivalentQueries.size() + 
				" Query equivalents More: " + equivalentQueriesMoreRestrict.size() +
				" Query equivalents Less: " + equivalentQueriesLessRestrict.size();
		//retornar o tipo para sem similaridade
		return retorno;
	}
}
