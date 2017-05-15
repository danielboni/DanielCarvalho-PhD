package lyon3.iae.reusability;

import java.sql.SQLException;
import java.util.LinkedList;
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
		
		List<Integer> originalAbstracts = incomingQuery.getAbstractServicesAsInt();
		
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
		
		// retrieve previous equivalent queries that contains the incoming query
		List<Integer> equivalentSupersetQueries = dao.findEquivalentSupersetQueries(incomingQuery);
		// now we are working with previous equivalent queries that contains the incoming query
		if (equivalentSupersetQueries.size() > 0) {
			// now we need to choose one and reuse.
			// searching for availability
			System.out.println("EquivalentSupersetQueries: " + equivalentSupersetQueries.size());
			return null;
		}
		
		// retrieve previous more restrict queries that contains the incoming query
		List<Integer> moreRestrictSupersetQueries = dao.findEquivalentSupersetQueriesMoreRestrict(incomingQuery);
		// now we are working with previous more restrict queries that contains the incoming query
		if (moreRestrictSupersetQueries.size() > 0) {
			// now we need to choose one and reuse.
			// searching for availability
			System.out.println("moreRestrictSupersetQueries: " + moreRestrictSupersetQueries.size());
			return null;
		}
		
		// retrieve previous less restrict queries that contains the incoming query
		List<Integer> lessRestrictSupersetQueries = dao.findEquivalentSupersetQueriesLessRestrict(incomingQuery);
		// now we are working with previous less restrict queries that contains the incoming query
		if (lessRestrictSupersetQueries.size() > 0) {
			// now we need to choose one and reuse.
			// searching for availability and matching on requirements
			System.out.println("lessRestrictSupersetQueries: " + lessRestrictSupersetQueries.size());
			return null;
		}
		
		// before rewrite, search for possible combination of queries (this is an extension of the third algorithm)
		// retrieve previous equivalent subset queries that is contained in the incoming query
		List<Integer> equivalentSubsetQueries = dao.findEquivalentSubsetQueries(incomingQuery);
		if (!equivalentSubsetQueries.isEmpty()) {
			System.out.println("equivalentSubsetQueries");
			// need to be improved to keep searching for other combinations, for now uses the first one
			int queryID = equivalentSubsetQueries.get(0);
			// method that gets the ids of the abstracts in a query
			List<Integer> abstracts = dao.findAbstractServices(queryID);
			incomingQuery.getAbstractServicesAsInt().removeAll(abstracts);
//			List<Integer> temp = new LinkedList<Integer>();
//			
//			System.out.println("abstracts: " + abstracts.size());
//			
//			
//			for (Integer integer : incomingQuery.getAbstractServicesAsInt()) {
//				if (!abstracts.contains(integer))
//					temp.add(integer);
//			}
			
			//System.out.println("temp: " + incomingQuery.getAbstractServicesAsInt().size());
			
			//incomingQuery.setAbstractServicesAsInt(temp);
			
			// Preciso melhorar isso aqui
			
			String typeOfComplementaryQueries = "";
			int numberOfComplementaryQueries = 0;
			
			
			// Chamo metodo que vai no banco e pega queries 100% equivalents
			List<Integer> equivalentQueries2 = dao.findEquivalentQueries(incomingQuery);
			if (!equivalentQueries2.isEmpty()) {

				typeOfComplementaryQueries = "EquivalentQueries";
				numberOfComplementaryQueries = equivalentQueries2.size();
			} else {
				// Chamo metodo que vai no banco e pega queries equivalentes com preferencias mais restritas
				List<Integer> equivalentQueriesMoreRestrict2 = dao.findEquivalentQueriesMoreRestrict(incomingQuery);
							
				if (!equivalentQueriesMoreRestrict2.isEmpty()) {

					typeOfComplementaryQueries = "EquivalentQueriesMoreRestric";
					numberOfComplementaryQueries = equivalentQueriesMoreRestrict2.size();
				} else {
					// Chamo metodo que vai no banco e pega queries equivalentes com preferencias menos restritas
					List<Integer> equivalentQueriesLessRestrict2 = dao.findEquivalentQueriesLessRestrict(incomingQuery);
					
					if (!equivalentQueriesLessRestrict2.isEmpty()) {

						typeOfComplementaryQueries = "EquivalentQueriesLessRestric";
						numberOfComplementaryQueries = equivalentQueriesLessRestrict2.size();
					} 
				}
			}
			// Retorna o manager desse tipo
			System.out.println("Found complementary queries: EquivalentSubsetQueries (" + equivalentSubsetQueries.size() + ") + Complementary" +  typeOfComplementaryQueries + "(" + numberOfComplementaryQueries + ")");
			return null;
		}
		
		// retrieve previous more restrict subset queries that is contained in the incoming query
		List<Integer> moreRestrictSubsetQueries = dao.findEquivalentSubsetQueriesMoreRestrict(incomingQuery);
		if (!moreRestrictSubsetQueries.isEmpty()) {
			System.out.println("moreRestrictSubsetQueries");
			// need to be improved to keep searching for other combinations, for now uses the first one
			int queryID = moreRestrictSubsetQueries.get(0);
			// method that gets the ids of the abstracts in a query
			List<Integer> abstracts = dao.findAbstractServices(queryID);
			incomingQuery.getAbstractServicesAsInt().removeAll(abstracts);
//			List<Integer> temp = new LinkedList<Integer>();
//			
//			System.out.println("abstracts: " + abstracts.size());
//			
//			
//			for (Integer integer : incomingQuery.getAbstractServicesAsInt()) {
//				if (!abstracts.contains(integer))
//					temp.add(integer);
//			}
			
			//System.out.println("temp: " + incomingQuery.getAbstractServicesAsInt().size());
			
			//incomingQuery.setAbstractServicesAsInt(temp);
			
			// Preciso melhorar isso aqui

			String typeOfComplementaryQueries = "";
			int numberOfComplementaryQueries = 0;


			// Chamo metodo que vai no banco e pega queries 100% equivalents
			List<Integer> equivalentQueries2 = dao.findEquivalentQueries(incomingQuery);
			if (!equivalentQueries2.isEmpty()) {

				typeOfComplementaryQueries = "EquivalentQueries";
				numberOfComplementaryQueries = equivalentQueries2.size();
			} else {
				// Chamo metodo que vai no banco e pega queries equivalentes com preferencias mais restritas
				List<Integer> equivalentQueriesMoreRestrict2 = dao.findEquivalentQueriesMoreRestrict(incomingQuery);

				if (!equivalentQueriesMoreRestrict2.isEmpty()) {

					typeOfComplementaryQueries = "EquivalentQueriesMoreRestric";
					numberOfComplementaryQueries = equivalentQueriesMoreRestrict2.size();
				} else {
					// Chamo metodo que vai no banco e pega queries equivalentes com preferencias menos restritas
					List<Integer> equivalentQueriesLessRestrict2 = dao.findEquivalentQueriesLessRestrict(incomingQuery);

					if (!equivalentQueriesLessRestrict2.isEmpty()) {

						typeOfComplementaryQueries = "EquivalentQueriesLessRestric";
						numberOfComplementaryQueries = equivalentQueriesLessRestrict2.size();
					} 
				}
			}
			// Retorna o manager desse tipo
			System.out.println("Found complementary queries: MoreRestrictSubsetQueries (" + moreRestrictSubsetQueries.size() + ") + Complementary" +  typeOfComplementaryQueries + "(" + numberOfComplementaryQueries + ")");
			return null;
		}
		
		// retrieve previous less restrict subset queries that is contained in the incoming query
		List<Integer> lessRestrictSubsetQueries = dao.findEquivalentSubsetQueriesLessRestrict(incomingQuery);
		if (!lessRestrictSubsetQueries.isEmpty()) {
			System.out.println("lessRestrictSubsetQueries");
			// need to be improved to keep searching for other combinations, for now uses the first one
			int queryID = lessRestrictSubsetQueries.get(0);
			// method that gets the ids of the abstracts in a query
			List<Integer> abstracts = dao.findAbstractServices(queryID);
			incomingQuery.getAbstractServicesAsInt().removeAll(abstracts);
//			List<Integer> temp = new LinkedList<Integer>();
//			
//			System.out.println("abstracts: " + abstracts.size());
//			System.out.println("temp: " + temp.size());
//			
//			for (Integer integer : incomingQuery.getAbstractServicesAsInt()) {
//				if (!abstracts.contains(integer))
//					temp.add(integer);
//			}
			
			//System.out.println("temp: " + incomingQuery.getAbstractServicesAsInt().size());
			
			//incomingQuery.setAbstractServicesAsInt(temp);

			
			// Preciso melhorar isso aqui

			String typeOfComplementaryQueries = "";
			int numberOfComplementaryQueries = 0;


			// Chamo metodo que vai no banco e pega queries 100% equivalents
			List<Integer> equivalentQueries2 = dao.findEquivalentQueries(incomingQuery);
			if (!equivalentQueries2.isEmpty()) {

				typeOfComplementaryQueries = "EquivalentQueries";
				numberOfComplementaryQueries = equivalentQueries2.size();
			} else {
				// Chamo metodo que vai no banco e pega queries equivalentes com preferencias mais restritas
				List<Integer> equivalentQueriesMoreRestrict2 = dao.findEquivalentQueriesMoreRestrict(incomingQuery);

				if (!equivalentQueriesMoreRestrict2.isEmpty()) {

					typeOfComplementaryQueries = "EquivalentQueriesMoreRestric";
					numberOfComplementaryQueries = equivalentQueriesMoreRestrict2.size();
				} else {
					// Chamo metodo que vai no banco e pega queries equivalentes com preferencias menos restritas
					List<Integer> equivalentQueriesLessRestrict2 = dao.findEquivalentQueriesLessRestrict(incomingQuery);

					if (!equivalentQueriesLessRestrict2.isEmpty()) {

						typeOfComplementaryQueries = "EquivalentQueriesLessRestric";
						numberOfComplementaryQueries = equivalentQueriesLessRestrict2.size();
					} 
				}
			}
			// Retorna o manager desse tipo
			System.out.println("Found complementary queries: LessRestrictSubsetQueries (" + lessRestrictSubsetQueries.size() + ") + Complementary" +  typeOfComplementaryQueries + "(" + numberOfComplementaryQueries + ")");
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
