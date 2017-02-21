package lyon3.iae.rhone;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import lyon3.iae.datamodel.AbstractService;
import lyon3.iae.datamodel.CSD;
import lyon3.iae.datamodel.ConcreteService;
import lyon3.iae.datamodel.Dependency;
import lyon3.iae.datamodel.InputVariable;
import lyon3.iae.datamodel.Mapping;
import lyon3.iae.datamodel.OutputVariable;
import lyon3.iae.datamodel.QualityAspect;
import lyon3.iae.datamodel.Query;
import lyon3.iae.datamodel.Rewriting;
import lyon3.iae.datamodel.UserPreference;
import lyon3.iae.datamodel.Variable;


public class Rhone {
	
	private Query query;
	
	public List<ConcreteService> concreteServices;
	
	public List<ConcreteService> cadidateConcreteServices;
	
	private List<CSD> csds;
	
	private List<List<CSD>> rewritings;
	
	public List<List<CSD>> csdsPermutations;
	
	private List<String> aggregatedPreferences;
	
	private List<UserPreference> queryAggregatedPreferences;
	
	private Map<UserPreference, Double> aggregatedMeasures;
	
	public Rhone() {
		this.aggregatedPreferences = new LinkedList<String>();
		this.aggregatedPreferences.add("total cost");
	}

	public void selectServices(){
		this.setCadidateConcreteServices(new LinkedList<ConcreteService>());
		
		for (ConcreteService c: concreteServices){
			if (this.isCandidateService(c))
				this.cadidateConcreteServices.add(c);
		}
		
		List<ConcreteService> tempList = new LinkedList<ConcreteService>();
		
		this.queryAggregatedPreferences = new LinkedList<UserPreference>();
		for (ConcreteService c: this.cadidateConcreteServices) {
			if (this.itViolatesPreferences(c)) {
				tempList.add(c);
			}
		}
		this.cadidateConcreteServices.clear();
		this.setCadidateConcreteServices(tempList);
	}
	
	/*  This method selects the data services from our database
	 *  taking into consideration the user preferences defined
	 *  in the query. */
	public void selectCandidateServicesFromDB(){
		
		// TODO remove the code to access the database from this file. 
		
		System.out.println("Selecting candidate data services...");
		
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
			
			System.out.println("Searching for candidate data services...");			
			
			int quantidadeDeAbstract = this.query.getAbstractServicesAsInt().size(); 
			
			// SQL para procurar por serviços que respeitem a minha consulta.
			String sql = "select distinct * from tb_concrete_service ds, tb_concrete_abstract ca "
					+ "where ds.id = ca.id_concrete and ";
			
			if (quantidadeDeAbstract == 1) {
				sql += "( ca.id_abstract = ? ) ";
			} else {
				for (int i = 0; i < quantidadeDeAbstract; i++) {
					if (i == 0) {
						sql += "( ca.id_abstract = ? ";
					}else if (i == quantidadeDeAbstract-1){
						sql += "or ca.id_abstract = ? ) and ";
					}else {
						sql += "or ca.id_abstract = ? ";
					}
				}	
			}
			
			sql += "ds.availability > ? and ds.response_time < ? and "
					+ "ds.price_per_call <= ? and ds.authentication = ? and "
					+ "ds.privacy = ? and ";
			
			if (this.query.getTrust().equalsIgnoreCase("low")) {
				sql += "(ds.trust = 'high' or ds.trust = 'medium' or ds.trust = 'low') and ";
			} else if (this.query.getTrust().equalsIgnoreCase("medium")) {
				sql += "(ds.trust = 'high' or ds.trust = 'medium') and ";
			} else {
				sql += "ds.trust = 'high' and ";
			}
			
			if (this.query.getDegreeOfRawness().equalsIgnoreCase("low")) {
				sql += "(ds.degree_of_rawness = 'high' or ds.degree_of_rawness = 'medium' or ds.degree_of_rawness = 'low') and ";
			} else if (this.query.getDegreeOfRawness().equalsIgnoreCase("medium")) {
				sql += "(ds.degree_of_rawness = 'high' or ds.degree_of_rawness = 'medium') and ";
			} else {
				sql += "ds.degree_of_rawness = 'high' and ";
			}
			
			sql += "ds.veracity = ? and ds.production_time = ? and "	
					+ "ds.production_rate <= ? and ds.data_type = ? and ";
			
			if (this.query.getFreshness().equalsIgnoreCase("yes")) {
				sql += "ds.freshness = 'yes' and ";
			} else {
				sql += "(ds.freshness = 'yes' or ds.freshness = 'no') and ";
			}
			
			if (this.query.getProvenance().equalsIgnoreCase("certified")) {
				sql += "ds.provenance = 'certified';";
			} else {
				sql += "(ds.provenance = 'certified' or ds.provenance = 'not certified'); ";
			}

			System.out.println("SQL: " + sql);
			
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			/* K = Variable to be used in the set of query parameters. */
			int k = 1;
			for (int i = 0; i < quantidadeDeAbstract; i++) {
				stmt.setInt(k++, this.query.getAbstractServicesAsInt().get(i));
			}	
			
			stmt.setDouble(k++, this.query.getAvailability());
			stmt.setDouble(k++, this.query.getResponseTime());
			stmt.setDouble(k++, this.query.getPricePerCall());
			stmt.setString(k++, this.query.getAuthentication());
			stmt.setString(k++, this.query.getPrivacy());		
			stmt.setString(k++, this.query.getVeracity());
			stmt.setString(k++, this.query.getProductionTime());
			stmt.setDouble(k++, this.query.getProductionRate());
			stmt.setString(k++, this.query.getDataType());
			
			System.out.println("K= " + k);
			
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
//				String nome = rs.getString("first_name");
//				String sobrenome = rs.getString("last_name");
//				int ativo = rs.getInt("active");
//				int loja = rs.getInt("store_id");
	
				System.out.println("Funcionou: " + rs.getString("id"));
			}
			
			stmt.execute();
			stmt.close();
	        connection.close();
	        
	        System.out.println("Data services idenfied.");
	        
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
//		this.setCadidateConcreteServices(new LinkedList<ConcreteService>());
//		
//		for (ConcreteService c: concreteServices){
//			if (this.isCandidateService(c))
//				this.cadidateConcreteServices.add(c);
//		}
//		
//		List<ConcreteService> tempList = new LinkedList<ConcreteService>();
//		
//		this.queryAggregatedPreferences = new LinkedList<UserPreference>();
//		for (ConcreteService c: this.cadidateConcreteServices) {
//			if (this.itViolatesPreferences(c)) {
//				tempList.add(c);
//			}
//		}
//		this.cadidateConcreteServices.clear();
//		this.setCadidateConcreteServices(tempList);
	}
	
	
	
	/**
	 * This method checks if the quality preferences in the concrete 
	 * service violates or not the preferences in the query.
	 **/
	private boolean itViolatesPreferences(ConcreteService c) {
		List<UserPreference> userPreferences = this.query.getUserPreferences();
		for (UserPreference uPref: userPreferences){
			if (this.aggregatedPreferences.contains(uPref.getMeasure())) {
				this.queryAggregatedPreferences.add(uPref);
				continue;
			}else {
				// verifies if the concrete service has the user preference
				boolean check = false;
				for (QualityAspect qAspect: c.getQualityAspects()) {
					if (uPref.getMeasure().equalsIgnoreCase(qAspect.getMeasure())){
						check = true;
						
						// Start comparing preferences and service quality aspects
						if (uPref.getOp().equals("=")) {
							if (!qAspect.getOp().equals("=") || !uPref.getValue().equals(qAspect.getValue())) {
								return false;
							}
						} else if (uPref.getOp().equals(">")) {
							if (qAspect.getOp().equals("<") || qAspect.getOp().equals("<=")) {
								return false;
							}else if (qAspect.getOp().equals("=")) {
								if (Double.parseDouble(qAspect.getValue()) < Double.parseDouble(uPref.getValue())) {
									return false;
								}
							}else if (qAspect.getOp().equals(">")) {
								if (!(Double.parseDouble(qAspect.getValue()) >= Double.parseDouble(uPref.getValue()))) {
									return false;
								}
							}else if (qAspect.getOp().equals(">=")) {
								if (!(Double.parseDouble(qAspect.getValue()) > Double.parseDouble(uPref.getValue()))) {
									return false;
								}
							}
						} else if (uPref.getOp().equals(">=")) {
							if (qAspect.getOp().equals("<") || qAspect.getOp().equals("<=")) {
								return false;
							}else if (qAspect.getOp().equals("=")) {
								if (Double.parseDouble(qAspect.getValue()) < Double.parseDouble(uPref.getValue())) {
									return false;
								}
							}else if (qAspect.getOp().equals(">")) {
								if (!(Double.parseDouble(qAspect.getValue()) >= Double.parseDouble(uPref.getValue()))) {
									return false;
								}
							}else if (qAspect.getOp().equals(">=")) {
								if (!(Double.parseDouble(qAspect.getValue()) >= Double.parseDouble(uPref.getValue()))) {
									return false;
								}
							}
						} else if (uPref.getOp().equals("!=")) {
							if (qAspect.getOp().equals("<") || qAspect.getOp().equals("<=") || qAspect.getOp().equals(">") || qAspect.getOp().equals(">=")) {
								return false;
							} else {
								if (Double.parseDouble(qAspect.getValue()) == Double.parseDouble(uPref.getValue())) {
									return false;
								}
							}
						} else if (uPref.getOp().equals("<")) {
							if (qAspect.getOp().equals(">") || qAspect.getOp().equals(">=") || qAspect.getOp().equals("!=")) {
								return false;
							}else if (qAspect.getOp().equals("=")) {
								if (Double.parseDouble(qAspect.getValue()) >= Double.parseDouble(uPref.getValue())) {
									return false;
								}
							}else if (qAspect.getOp().equals("<")) {
								if (!(Double.parseDouble(qAspect.getValue()) <= Double.parseDouble(uPref.getValue()))) {
									return false;
								}
							}else if (qAspect.getOp().equals("<=")) {
								if (!(Double.parseDouble(qAspect.getValue()) < Double.parseDouble(uPref.getValue()))) {
									return false;
								}
							}
						} else if (uPref.getOp().equals("<=")) {
							if (qAspect.getOp().equals(">") || qAspect.getOp().equals(">=") || qAspect.getOp().equals("!=")) {
								return false;
							}else if (qAspect.getOp().equals("=")) {
								if (!(Double.parseDouble(qAspect.getValue()) <= Double.parseDouble(uPref.getValue()))) {
									return false;
								}
							}else if (qAspect.getOp().equals("<")) {
								if (!(Double.parseDouble(qAspect.getValue()) < Double.parseDouble(uPref.getValue()))) {
									return false;
								}
							}else if (qAspect.getOp().equals("<=")) {
								if (!(Double.parseDouble(qAspect.getValue()) <= Double.parseDouble(uPref.getValue()))) {
									return false;
								}
							}
						}
					}
				}
				// There is a preference in the query which is not found in the concrete service
				if (!check) {
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * Actually, this method checks if the concrete service contains:
	 * only abstract services that exists in the query.
	 * 
	 * The method equals in the abstract service class checks if the 
	 * abstract service has the same name and the same number of 
	 * input and output parameters.
	 * 
	 * We need to change it for considering abstract services that
	 * have different number of parameters.
	 **/
	public boolean isCandidateService(ConcreteService service){
		for (AbstractService a: service.getAbstractServices()){
			boolean k = false;
			for (AbstractService b: this.query.getAbstractServices()){
				if (a.equals(b)  && a.variablesOK(b))
					k = true;
			}
			if (!k) {
				return false;
			}
		}
		return true;
	}
	
	
	public void combineCSDs() {		
		csdsPermutations = new LinkedList<List<CSD>>();
		//rewritings = new LinkedList<Rewriting>();
		
		//List<List<CSD>> subsetList = findMCDSubsetPref(csds) ;
		List<List<CSD>> subsetList = findCombinations(csds);
		//List<List<CSD>> subsetList = findCombinations();
		//List<List<CSD>> subsetList = permutations(0, this.query.getAbstractServices().size(), null);
		csdsPermutations.addAll(subsetList);
		
		this.setAggregatedMeasures(new HashMap<UserPreference, Double>());
		
		for (UserPreference u: queryAggregatedPreferences) {
			aggregatedMeasures.put(u, 0.0);
		}
		
		for (List<CSD> mcdList : subsetList) {
			if (isNotViolated(aggregatedMeasures)) {
				if (isRewriting(mcdList) && aggregationFuntion(mcdList, aggregatedMeasures)) {
	//				rewritings.add(new Rewriting(mcdList, query));
				}
			}
		}
	}
	
	private boolean aggregationFuntion(List<CSD> listCsds, Map<UserPreference, Double> aggregatedMeasures){
		Map<UserPreference, Double> tempList = new HashMap<UserPreference, Double>();
		for (Map.Entry<UserPreference, Double> m: aggregatedMeasures.entrySet()){
			tempList.put(m.getKey(), m.getValue());
		}
		
		for (CSD csd: listCsds) {
			ConcreteService c = csd.getConcrete_service();
			List<QualityAspect> q = c.getQualityAspects();
			for (QualityAspect qAspect: q) {
				for (Map.Entry<UserPreference, Double> m: tempList.entrySet()){
					UserPreference uPref = m.getKey();
					if (uPref.getMeasure().equals("total cost") && (qAspect.getMeasure().equals("price per call"))) {
						double temp = m.getValue();
						double new_value = temp + Double.parseDouble(qAspect.getValue());
						m.setValue(new_value);
					}
				}
			}
		}
		
		if (isNotViolated(tempList)) {
			this.setAggregatedMeasures(tempList);
			return true;
		}
		return false;
	}
	
	private boolean isNotViolated(Map<UserPreference, Double> aggregatedMeasures){
		for (Map.Entry<UserPreference, Double> m: aggregatedMeasures.entrySet()){
			UserPreference uPref = m.getKey();

			if (uPref.getOp().equals("<")) {
				if (m.getValue() >= Double.parseDouble(uPref.getValue())) {
					return false;
				}
			} else if (uPref.getOp().equals("<=")) {
				if (m.getValue() > Double.parseDouble(uPref.getValue())) {
					return false;
				}
			}
		}
		return true;
	}	
	private List<List<CSD>> findCombinations(List<CSD> list) {
		List<List<CSD>> result;

		if (list.size() == 0){
			result = new LinkedList<List<CSD>>();
			result.add(new LinkedList<CSD>());
			return result;
		}
		
		List<CSD> newList = new LinkedList<CSD>(list);
		CSD lastMCD = newList.remove(newList.size()-1);		

		return addMCDToSubsetList(lastMCD, findCombinations(newList));
	}
	
//	private List<List<CSD>> permutations(int currentSize, int lastSize, List<List<CSD>> permutations) {
//		System.out.println(currentSize);
//		if (currentSize == 0){
//			System.out.println("I: 1");
//			permutations = new ArrayList<List<CSD>>();
//			
//			for (CSD csd: this.csds) {
//				List<CSD> initialList = new ArrayList<CSD>();
//				initialList.add(csd);
//				permutations.add(initialList);
//			}
//			currentSize++;
//			System.out.println("F: 1");
//			return permutations(currentSize, lastSize, permutations);
//			
//		} else if (currentSize >= lastSize) {
//			System.out.println("I e F: 2");
//			return permutations;
//		} else {
//			System.out.println("I: 3");
//			List<List<CSD>> newList = new ArrayList<List<CSD>>(permutations);
//			
//			for (List<CSD> csdList: newList) {
//				if (csdList.size() == currentSize) {
//					permutations.addAll(producePermutations(csdList));
//				}
//			}
//			currentSize++;
//			System.out.println("F: 3");
//			return permutations(currentSize, lastSize, permutations);
//		}
//	}
//	
//	private List<List<CSD>> producePermutations(List<CSD> list){	
//				
//		List<List<CSD>> result = new ArrayList<List<CSD>>();
//
//		for (CSD csd: this.csds) {
//			List<CSD> tempResult = cloneList (list);
//			tempResult.add(csd);
//			result.add(tempResult);
//		}	
//		
//		return result;				
//	}

	private List<List<CSD>> addMCDToSubsetList (CSD csd, List<List<CSD>> subsetList){
		
//		int lastIndex = subsetList.size() - 1;
//		
//		if (subsetList.get(lastIndex).size() > this.query.getAbstractServices().size()) {
//			return subsetList;
//		}
//		System.out.println(subsetList.get(lastIndex).size());
		
		List<List<CSD>> resultat = clone (subsetList);		
		List<List<CSD>> initialSubsetList = clone (subsetList);

		for (List<CSD> csdList: initialSubsetList){
			csdList.add(csd);
			if (!(csdList.size() > this.query.getSize()))
				resultat.add(csdList);
		}	
		
		return resultat;				
	}
	
	private List<List<CSD>> clone (List<List<CSD>> listOfLists){
		List<List<CSD>> result = new LinkedList<List<CSD>>();

		for (List<CSD> list: listOfLists){
			if (!(list.size() > this.query.getSize())) {
				List<CSD> newList = new LinkedList<CSD>();
				newList.addAll(list);
				result.add(newList);
			}	
		}
		return result;
	}
	
//	private List<CSD> cloneList (List<CSD> listOfCsd){
//		List<CSD> result = new ArrayList<CSD>();
//		for (CSD csd: listOfCsd){
//			result.add(csd);
//		}
//		return result;
//	}
	
	private boolean isRewriting(List<CSD> csds) {
		int countAbstractServices = 0;

		for (CSD csd : csds) {
			countAbstractServices += csd.getConcrete_service().getAbstractServices().size();
		}

		// compare total number of abstract services with number of query abstract services
		if (countAbstractServices != query.getAbstractServices().size()) {
			return false;
		}

		// test pairwise disjoint
		for (int i = 0; i < csds.size(); i++) {
			for (int j = 0; j < csds.size(); j++) {
				if (i != j) {
					CSD mcd1 = csds.get(i);
					CSD mcd2 = csds.get(j);
					if (!isDisjoint(mcd1, mcd2)) {
						return false;
					}
				}
			}
		}
		return true;
	}
	
	private boolean isDisjoint(CSD csd1, CSD csd2) {
		List<AbstractService> csd1AbstractServices = csd1.getConcrete_service().getAbstractServices();
		List<AbstractService> csd2AbstractServices = csd2.getConcrete_service().getAbstractServices();
		for (AbstractService abs1: csd1AbstractServices) {
			for (AbstractService abs2: csd2AbstractServices) {
				if (abs1.equals(abs2))
					return false;
			}
		}
		return true;
	}

	public void createCSDs(){
		csds = new LinkedList<CSD>();

		/*if there is no dependency in the query, create mappings and CSDs for all candidate concrete*/
		if (query.getDependencies().isEmpty()) {

			for (ConcreteService c: cadidateConcreteServices) {
				CSD csd = new CSD();
				csd.setConcrete_service(c);

				List<Mapping> mappings = new LinkedList<Mapping>();

				for (AbstractService abs: c.getAbstractServices()) {
					for (AbstractService query_abs: query.getAbstractServices()) {
						if (abs.equals(query_abs)) {
							Mapping mapping = new Mapping();
							mapping.setConcreteService(c);
							mapping.setConcrete_service_abstractservice(abs);
							mapping.setQuery_abstractservice(query_abs);
							for (int i = 0; i < query_abs.getVariables().size(); i++) {
								mapping.addMapping(abs.getVariables().get(i), query_abs.getVariables().get(i));
							}
							mappings.add(mapping);
						}
					}
				}
				csd.setMappings(mappings);
				csd.setCoveredAbstractServices(c.getAbstractServices());
				csd.setNumberOfabstractServices(c.getAbstractServices().size());
				csds.add(csd);
			}
		} else {
			for (ConcreteService c: cadidateConcreteServices) {
				if (satisfyDependenciesRule(c)) {
					CSD csd = new CSD();
					csd.setConcrete_service(c);

					List<Mapping> mappings = new LinkedList<Mapping>();

					for (AbstractService abs: c.getAbstractServices()) {
						for (AbstractService query_abs: query.getAbstractServices()) {
							if (abs.equals(query_abs)) {
								Mapping mapping = new Mapping();
								mapping.setConcrete_service_abstractservice(abs);
								mapping.setQuery_abstractservice(query_abs);
								for (int i = 0; i < query_abs.getVariables().size(); i++) {
									mapping.addMapping(abs.getVariables().get(i), query_abs.getVariables().get(i));
								}
								mappings.add(mapping);
							}
						}
					}
					csd.setMappings(mappings);
					csd.setCoveredAbstractServices(c.getAbstractServices());
					csd.setNumberOfabstractServices(c.getAbstractServices().size());
					csds.add(csd);
				}
			}
		}
	}
	
	/*
	 * This method verifies if a concrete service satisfies the rules regarding the creation
	 * of CSDs. (1) there are mappings for all variables in the head to variables in the body.
	 * (2) if an local variable if mapped to local variable, the service must cover or only 
	 * one of the dependent services or all of them.
	 * */
	public boolean satisfyDependenciesRule(ConcreteService c){
		if (c.getDependencies().isEmpty()) {
			return true;
		}else {
			for (AbstractService a: c.getAbstractServices()) {		
				int index = query.getAbstractServices().indexOf(a);
				AbstractService query_abs = query.getAbstractServices().get(index);

				if (!a.getDep().isEmpty()) {

					for (Dependency d: a.getDep()) {
						
						for (int i = 0; i < a.getVariables().size(); i++) {
							Variable var = a.getVariables().get(i);
							if (var.equals(d.getVar())){
								for (Dependency abs_dep: query_abs.getDep()){
									if (abs_dep.getVar().equals(query_abs.getVariables().get(i))){
										int query_abs_number_dep = abs_dep.getDependencies().size();
										int service_abs_number_dep = d.getDependencies().size();
										if (query_abs_number_dep != service_abs_number_dep) {
											return false;
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return true;
	}
	
	public void print_query_dependencies(){
		for (Dependency d: this.query.getDependencies()) {
			System.out.print(d.getOrigin().getName() + "." + d.getVar().getName() + " --> [");
			for (int i = 0; i < d.getDependencies().size(); i++) {
				if (i == d.getDependencies().size() - 1) {
					System.out.print(d.getDependencies().get(i).getName()+ "]");
				} else {
					System.out.print(d.getDependencies().get(i).getName() + ", ");
				}
			}
		}
	}
	
	public void print_CSDS(){
		System.out.println("***** CSD's *****");
		System.out.println("Number of CSD's created: " + csds.size());
		for (CSD csd: csds) {
			System.out.println("Concrete service: " + csd.getConcrete_service().getHead() + " := " + 
					csd.getConcrete_service().getBody());
			System.out.println("Mappings created:");
			for (Mapping map: csd.getMappings())
				System.out.println(map.toString());
		}
	}
	
	public void print_permutations() {
		System.out.println("Number of combinations: " + csdsPermutations.size());
		for (List<CSD> list: csdsPermutations) {
			for (CSD csd: list) {
				System.out.print(csd.getConcrete_service().getHead() + " ");
			}
			System.out.println();
		}
	}
	
	public void print_rewritings() {
		System.out.println("Number of rewritings: " + csdsPermutations.size());
		for (List<CSD> r: csdsPermutations) {
			StringBuilder sb = new StringBuilder();
			sb.append(this.query.getHead() + " := ");
			for (CSD csd: r) {
				sb.append(csd.getConcrete_service().getName() + "(");
				
				for (int i = 0; i < csd.getConcrete_service().getHeadVariables().size(); i++) {
					Variable headVar = csd.getConcrete_service().getHeadVariables().get(i); 
					boolean check = false;
					// se n ha mapeamento poe o _
					boolean check2 = false;
					if (i == csd.getConcrete_service().getHeadVariables().size() - 1) {
						for (Mapping map: csd.getMappings()) {
							if (check == true)
								break;
							for (Map.Entry<Variable, Variable> m: map.getMappings().entrySet()){
								if (m.getKey().equals(headVar) && headVar instanceof InputVariable) {
									sb.append(m.getValue().name + "?");
									check = true;
									check2 = true;
								}else if (m.getKey().equals(headVar) && headVar instanceof OutputVariable) {
									sb.append(m.getValue().name + "!");
									check = true;
									check2 = true;
								}
							}
						}
						if (!check2) {
							sb.append("_");
							check = true;
							check2 = false;
						}
					}else {
						for (Mapping map: csd.getMappings()) {
							if (check == true)
								break;
							for (Map.Entry<Variable, Variable> m: map.getMappings().entrySet()){
								//System.out.println("---" + m.getKey());
								if (m.getKey().equals(headVar) && headVar instanceof InputVariable ) {
									sb.append(m.getValue().name + "?,");
									check = true;
									check2 = true;
								}else if (m.getKey().equals(headVar) && headVar instanceof OutputVariable) {
									sb.append(m.getValue().name + "!,");
									check = true;
									check2 = true;
								}
							}
						}
						if (!check2) {
							sb.append("_,");
							check = true;
							check2 = false;
						}
					}
					
				}
				sb.append(") ");
			}
			System.out.println(sb.toString());
		}
	}
	
	public void printCandidateServices(){
		System.out.println("There is/are " + cadidateConcreteServices.size() + " candidate concrete services.");
		for (ConcreteService c: this.cadidateConcreteServices)
			System.out.println(c.getHead() + " := " + c.getBody());
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(" ****************** \n");
		sb.append("Query: ");
		sb.append(query.toString() + "\n");
		for (ConcreteService c: concreteServices)
			sb.append("Concrete Service: " + c.toString() + "\n");
		sb.append(" ****************** \n");
		return sb.toString();
	}
	
	public void printConcreteServices() {
		System.out.println("There is/are " + concreteServices.size() + " concrete services.");
		for (ConcreteService c: this.concreteServices)
			System.out.println(c.getHead() + " := " + c.getBody());
	}
	
//	public void queryParser(String query){
//		Query q = new Query();
//		
//		q.setHead(this.getHeadDefinition(query).trim());
//		q.setBody(this.getBodyDefinition(query).trim());
//
//		List<Variable> headVariables = this.processVariables(q.getHead());
//		q.setHeadVariables(headVariables);
//		
//		q.setUserPreferences(this.getUserPreferences(q.getBody()));
//		
//		q.setAbstractServices(this.getAbstractServices(q.getBody()));
//		
//		q.setConstraints(this.getConstraints(q.getBody()));
//	}
//	
//	public void concreteServiceParser(String concreteService){
//		ConcreteService c = new ConcreteService();
//		c.setHead(this.getHeadDefinition(concreteService));
//		c.setBody(this.getBodyDefinition(concreteService));
//		List<Variable> headVariables = this.processVariables(c.getHead());
//		c.setHeadVariables(headVariables);
//		c.setAbstractServices(this.getAbstractServices(c.getBody()));
//		c.setQualityAspects(this.getQualityAspects(c.getBody()));
//	}
//
//	public String getHeadDefinition(String query){
//		int middle = query.indexOf(":");
//		return query.substring(0, middle-1);
//	}
//	
//	public String getBodyDefinition(String query){
//		int middle = query.indexOf("=");
//		return query.substring(middle+1, query.length());
//	}
	
	public List<Variable> processVariables(String s){
		int begin = s.indexOf("(") + 1;
		int end = s.indexOf(")");
		String s1 = s.substring(begin, end);
		List<Variable> variables = new LinkedList<Variable>();
		String[] vars = s1.split(",");
		for (String var : vars) {
			int i = var.indexOf("?");
			if (i == -1){
				i = var.indexOf("!");
				OutputVariable out = new OutputVariable();
				out.setName((var.substring(0, i)).trim());
				variables.add(out);
			} else {
				InputVariable in = new InputVariable();
				in.setName((var.substring(0, i)).trim());
				variables.add(in);
			}
		}
		return variables;
	}
	
//	public List<UserPreference> getUserPreferences(String body){
//		List<UserPreference> userPreferences = new ArrayList<UserPreference>();
//		int begin = body.indexOf("[");
//		int end = body.indexOf("]");
//		String userPref = body.substring(begin+1, end);
//		//System.out.println(userPref);
//		String[] prefs = userPref.split(",");
//		for (String pref: prefs){
//			if (pref.contains("<=")){
//				String[] prefParts = pref.split("<=");
//				UserPreference u = new UserPreference();
//				u.setMeasure(prefParts[0].trim());
//				u.setOp("<=");
//				u.setValue(prefParts[1].trim());
//				userPreferences.add(u);
//			} else if (pref.contains(">=")){
//				String[] prefParts = pref.split(">=");
//				UserPreference u = new UserPreference();
//				u.setMeasure(prefParts[0].trim());
//				u.setOp(">=");
//				u.setValue(prefParts[1].trim());
//				userPreferences.add(u);
//			} else if (pref.contains("!=")){
//				String[] prefParts = pref.split("!=");
//				UserPreference u = new UserPreference();
//				u.setMeasure(prefParts[0].trim());
//				u.setOp("!=");
//				u.setValue(prefParts[1].trim());
//				userPreferences.add(u);
//			} else if (pref.contains(">")){
//				String[] prefParts = pref.split(">");
//				UserPreference u = new UserPreference();
//				u.setMeasure(prefParts[0].trim());
//				u.setOp(">");
//				u.setValue(prefParts[1].trim());
//				userPreferences.add(u);
//			} else if (pref.contains("<")){
//				String[] prefParts = pref.split("<");
//				UserPreference u = new UserPreference();
//				u.setMeasure(prefParts[0].trim());
//				u.setOp("<");
//				u.setValue(prefParts[1].trim());
//				userPreferences.add(u);
//			} else if (pref.contains("=")){
//				String[] prefParts = pref.split("=");
//				UserPreference u = new UserPreference();
//				u.setMeasure(prefParts[0].trim());
//				u.setOp("=");
//				u.setValue(prefParts[1].trim());
//				userPreferences.add(u);
//			}
//		}
//		return userPreferences;
//	}
//	
//	private List<AbstractService> getAbstractServices(String body) {
//		List<AbstractService> abstractServices = new ArrayList<AbstractService>();
//		int end = body.indexOf("{");
//		if (end == -1)
//			end = body.indexOf("[");
//		if (end == -1)
//			end = body.length();
//				
//		String aServices = body.substring(0, end);
//		//System.out.println(aServices);
//		String[] aS = aServices.split(",");
//		String concat = "";
//		for (String abs: aS){
//			if (!abs.contains(")")){
//				concat = concat + abs + ",";
//			}else {
//				concat = concat + abs;
//				//System.out.println(concat.trim());
//				AbstractService a = new AbstractService();
//				a.setDescription(concat.trim());
//				int i = concat.indexOf("(");
//				a.setName((concat.substring(0, i)).trim());
//				a.setVariables(this.processVariables(concat));
//				abstractServices.add(a);
//				concat = "";
//			}
//		}
//		return abstractServices;
//	}
//	
//	public List<Constraints> getConstraints(String body){
//		List<Constraints> constraints = new ArrayList<Constraints>();
//		int begin = body.indexOf("{");
//		int end = body.indexOf("}");
//		String constraintsPart = body.substring(begin+1, end);
//		//System.out.println(constraintsPart);
//		String[] prefs = constraintsPart.split(",");
//		for (String pref: prefs){
//			if (pref.contains("<=")){
//				String[] prefParts = pref.split("<=");
//				Constraints u = new Constraints();
//				u.setVariableName(prefParts[0].trim());
//				u.setOp("<=");
//				u.setValue(prefParts[1].trim());
//				constraints.add(u);
//			} else if (pref.contains(">=")){
//				String[] prefParts = pref.split(">=");
//				Constraints u = new Constraints();
//				u.setVariableName(prefParts[0].trim());
//				u.setOp(">=");
//				u.setValue(prefParts[1].trim());
//				constraints.add(u);
//			} else if (pref.contains("!=")){
//				String[] prefParts = pref.split("!=");
//				Constraints u = new Constraints();
//				u.setVariableName(prefParts[0].trim());
//				u.setOp("!=");
//				u.setValue(prefParts[1].trim());
//				constraints.add(u);
//			} else if (pref.contains(">")){
//				String[] prefParts = pref.split(">");
//				Constraints u = new Constraints();
//				u.setVariableName(prefParts[0].trim());
//				u.setOp(">");
//				u.setValue(prefParts[1].trim());
//				constraints.add(u);
//			} else if (pref.contains("<")){
//				String[] prefParts = pref.split("<");
//				Constraints u = new Constraints();
//				u.setVariableName(prefParts[0].trim());
//				u.setOp("<");
//				u.setValue(prefParts[1].trim());
//				constraints.add(u);
//			} else if (pref.contains("=")){
//				String[] prefParts = pref.split("=");
//				Constraints u = new Constraints();
//				u.setVariableName(prefParts[0].trim());
//				u.setOp("=");
//				u.setValue(prefParts[1].trim());
//				constraints.add(u);
//			}
//		}
//		return constraints;
//	}
//	
//	private List<QualityAspect> getQualityAspects(String body) {
//		List<QualityAspect> qualityAspects = new ArrayList<QualityAspect>();
//		int begin = body.indexOf("[");
//		int end = body.indexOf("]");
//		String userPref = body.substring(begin+1, end);
//		//System.out.println(userPref);
//		String[] prefs = userPref.split(",");
//		for (String pref: prefs){
//			if (pref.contains("<=")){
//				String[] prefParts = pref.split("<=");
//				QualityAspect u = new QualityAspect();
//				u.setMeasure(prefParts[0].trim());
//				u.setOp("<=");
//				u.setValue(prefParts[1].trim());
//				qualityAspects.add(u);
//			} else if (pref.contains(">=")){
//				String[] prefParts = pref.split(">=");
//				QualityAspect u = new QualityAspect();
//				u.setMeasure(prefParts[0].trim());
//				u.setOp(">=");
//				u.setValue(prefParts[1].trim());
//				qualityAspects.add(u);
//			} else if (pref.contains("!=")){
//				String[] prefParts = pref.split("!=");
//				QualityAspect u = new QualityAspect();
//				u.setMeasure(prefParts[0].trim());
//				u.setOp("!=");
//				u.setValue(prefParts[1].trim());
//				qualityAspects.add(u);
//			} else if (pref.contains(">")){
//				String[] prefParts = pref.split(">");
//				QualityAspect u = new QualityAspect();
//				u.setMeasure(prefParts[0].trim());
//				u.setOp(">");
//				u.setValue(prefParts[1].trim());
//				qualityAspects.add(u);
//			} else if (pref.contains("<")){
//				String[] prefParts = pref.split("<");
//				QualityAspect u = new QualityAspect();
//				u.setMeasure(prefParts[0].trim());
//				u.setOp("<");
//				u.setValue(prefParts[1].trim());
//				qualityAspects.add(u);
//			} else if (pref.contains("=")){
//				String[] prefParts = pref.split("=");
//				QualityAspect u = new QualityAspect();
//				u.setMeasure(prefParts[0].trim());
//				u.setOp("=");
//				u.setValue(prefParts[1].trim());
//				qualityAspects.add(u);
//			}
//		}
//		return qualityAspects;
//	}

	public Query getQuery() {
		return query;
	}

	public void setQuery(Query query) {
		this.query = query;
	}

	public List<ConcreteService> getConcreteServices() {
		return concreteServices;
	}

	public void setConcreteServices(List<ConcreteService> concreteServices) {
		this.concreteServices = concreteServices;
	}



	public List<ConcreteService> getCadidateConcreteServices() {
		return cadidateConcreteServices;
	}



	public void setCadidateConcreteServices(List<ConcreteService> cadidateConcreteServices) {
		this.cadidateConcreteServices = cadidateConcreteServices;
	}

	public List<CSD> getCsds() {
		return csds;
	}

	public void setCsds(List<CSD> csds) {
		this.csds = csds;
	}

	public void printQuery() {
		System.out.println(this.query.getHead() + " := " + this.query.getBody());
	}

	public Map<UserPreference, Double> getAggregatedMeasures() {
		return aggregatedMeasures;
	}

	public void setAggregatedMeasures(Map<UserPreference, Double> aggregatedMeasures) {
		this.aggregatedMeasures = aggregatedMeasures;
	}

	public int getNumberOfRewritings() {
		return rewritings.size();
	}
	
	
	public void initiateAggregateMeasures() {
		rewritings = new LinkedList<List<CSD>>();
		
		this.setAggregatedMeasures(new HashMap<UserPreference, Double>());
		
		for (UserPreference u: queryAggregatedPreferences) {
			aggregatedMeasures.put(u, 0.0);
		}
		
		for (List<CSD> mcdList : csdsPermutations) {
			if (isNotViolated(aggregatedMeasures)) {
				if (aggregationFuntion(mcdList, aggregatedMeasures)) {
					rewritings.add(mcdList);
				}
			}
		}
	}
	
	public void combine2(){
		csdsPermutations = new LinkedList<List<CSD>>();

		for (CSD csd1: this.group1){
			List<CSD> list1 = new LinkedList<CSD>();
			list1.add(csd1);
			this.csdsPermutations.add(list1);
			
			for (CSD csd2: this.group2){
				List<CSD> list2 = new LinkedList<CSD>();
				list2.add(csd1);
				list2.add(csd2);
				this.csdsPermutations.add(list2);
			}
		}
		
		this.initiateAggregateMeasures();
	}
	
	public void combine3(){
		csdsPermutations = new LinkedList<List<CSD>>();

		for (CSD csd1: this.group1){
			List<CSD> list1 = new LinkedList<CSD>();
			list1.add(csd1);
			this.csdsPermutations.add(list1);
			
			for (CSD csd2: this.group2){
				List<CSD> list2 = new LinkedList<CSD>();
				list2.add(csd1);
				list2.add(csd2);
				this.csdsPermutations.add(list2);
				
				for (CSD csd3: this.group3){
					List<CSD> list3 = new LinkedList<CSD>();
					list3.add(csd1);
					list3.add(csd2);
					list3.add(csd3);
					this.csdsPermutations.add(list3);
				}
			}
		}
		
		this.initiateAggregateMeasures();
	}
	
	public void combine4(){
		csdsPermutations = new LinkedList<List<CSD>>();

		for (CSD csd1: this.group1){
			List<CSD> list1 = new LinkedList<CSD>();
			list1.add(csd1);
			this.csdsPermutations.add(list1);
			
			for (CSD csd2: this.group2){
				List<CSD> list2 = new LinkedList<CSD>();
				list2.add(csd1);
				list2.add(csd2);
				this.csdsPermutations.add(list2);
				
				for (CSD csd3: this.group3){
					List<CSD> list3 = new LinkedList<CSD>();
					list3.add(csd1);
					list3.add(csd2);
					list3.add(csd3);
					this.csdsPermutations.add(list3);
					
					for (CSD csd4: this.group4){
						List<CSD> list4 = new LinkedList<CSD>();
						list4.add(csd1);
						list4.add(csd2);
						list4.add(csd3);
						list4.add(csd4);
						this.csdsPermutations.add(list4);
					}
				}
			}
		}
		
		this.initiateAggregateMeasures();
	}
	
	public void combine5(){
		csdsPermutations = new LinkedList<List<CSD>>();

		for (CSD csd1: this.group1){
			List<CSD> list1 = new LinkedList<CSD>();
			list1.add(csd1);
			this.csdsPermutations.add(list1);
			
			for (CSD csd2: this.group2){
				List<CSD> list2 = new LinkedList<CSD>();
				list2.add(csd1);
				list2.add(csd2);
				this.csdsPermutations.add(list2);
				
				for (CSD csd3: this.group3){
					List<CSD> list3 = new LinkedList<CSD>();
					list3.add(csd1);
					list3.add(csd2);
					list3.add(csd3);
					this.csdsPermutations.add(list3);
					
					for (CSD csd4: this.group4){
						List<CSD> list4 = new LinkedList<CSD>();
						list4.add(csd1);
						list4.add(csd2);
						list4.add(csd3);
						list4.add(csd4);
						this.csdsPermutations.add(list4);
						
						for (CSD csd5: this.group5){
							List<CSD> list5 = new LinkedList<CSD>();
							list5.add(csd1);
							list5.add(csd2);
							list5.add(csd3);
							list5.add(csd4);
							list5.add(csd5);
							this.csdsPermutations.add(list5);
						}
					}
				}
			}
		}
		
		this.initiateAggregateMeasures();
	}
	
	public long total = 0;
	
	public void combine6(){
		csdsPermutations = new LinkedList<List<CSD>>();

		for (CSD csd1: this.group1){
			List<CSD> list1 = new LinkedList<CSD>();
			list1.add(csd1);
			if (isRewriting(list1)) {
				this.csdsPermutations.add(list1);
				//total = total + 1;
			} else {
				list1 = null;
				//System.gc();
			}
			for (CSD csd2: this.group2){
				List<CSD> list2 = new LinkedList<CSD>();
				list2.add(csd1);
				list2.add(csd2);
				//this.csdsPermutations.add(list2);
				if (isRewriting(list2)) {
					this.csdsPermutations.add(list2);
					//total = total + 2;
				}else {
					list2 = null;
					//System.gc();
				}
				for (CSD csd3: this.group3){
					List<CSD> list3 = new LinkedList<CSD>();
					list3.add(csd1);
					list3.add(csd2);
					list3.add(csd3);
					//this.csdsPermutations.add(list3);
					if (isRewriting(list3)) {
						this.csdsPermutations.add(list3);
						//total = total + 3;
					}else {
						list3 = null;
						//System.gc();
					}
					for (CSD csd4: this.group4){
						List<CSD> list4 = new LinkedList<CSD>();
						list4.add(csd1);
						list4.add(csd2);
						list4.add(csd3);
						list4.add(csd4);
						//this.csdsPermutations.add(list4);
						if (isRewriting(list4)){
							this.csdsPermutations.add(list4);
							//total = total + 4;
						}else {
							list4 = null;
							//System.gc();
						}
						for (CSD csd5: this.group5){
							List<CSD> list5 = new LinkedList<CSD>();
							list5.add(csd1);
							list5.add(csd2);
							list5.add(csd3);
							list5.add(csd4);
							list5.add(csd5);
							//this.csdsPermutations.add(list5);
							if (isRewriting(list5)) {
								this.csdsPermutations.add(list5);
								//total = total + 5;
							}else {
								list5 = null;
								//System.gc();
							}
							for (CSD csd6: this.group6){
								List<CSD> list6 = new LinkedList<CSD>();
								list6.add(csd1);
								list6.add(csd2);
								list6.add(csd3);
								list6.add(csd4);
								list6.add(csd5);
								list6.add(csd6);
								//this.csdsPermutations.add(list6);
								if (isRewriting(list6)) {
									this.csdsPermutations.add(list6);
									//total = total + 6;
								}else {
									list6 = null;
									//System.gc();
								}
							}
						}
					}
				}
			}
		}
		
		//this.initiateAggregateMeasures();
	}
	
	private List<CSD> group1;
	private List<CSD> group2;
	private List<CSD> group3;
	private List<CSD> group4;
	private List<CSD> group5;
	private List<CSD> group6;
	
	public void divideGroups2(){
		group1 = new LinkedList<CSD>();
		group2 = new LinkedList<CSD>();
		group3 = new LinkedList<CSD>();
		group4 = new LinkedList<CSD>();
		group5 = new LinkedList<CSD>();
		
		List<AbstractService> abstractServices = this.query.getAbstractServices();
		for (int i = 0; i < abstractServices.size(); i++) {
			AbstractService abs = abstractServices.get(i);
			
			for (CSD csd: this.csds) {
				if (csd.getCoveredAbstractServices().contains(abs) && !csd.isGrouped()) {
					if (i == 0) {
						group1.add(csd);
						csd.setGrouped(true);
					} else if (i == 1) {
						group2.add(csd);
						csd.setGrouped(true);
					}
				}
			}	
		}
	}
	
	public void divideGroups3(){
		group1 = new LinkedList<CSD>();
		group2 = new LinkedList<CSD>();
		group3 = new LinkedList<CSD>();
		group4 = new LinkedList<CSD>();
		group5 = new LinkedList<CSD>();
		
		List<AbstractService> abstractServices = this.query.getAbstractServices();
		for (int i = 0; i < abstractServices.size(); i++) {
			AbstractService abs = abstractServices.get(i);
			
			for (CSD csd: this.csds) {
				if (csd.getCoveredAbstractServices().contains(abs) && !csd.isGrouped()) {
					if (i == 0) {
						group1.add(csd);
						csd.setGrouped(true);
					} else if (i == 1) {
						group2.add(csd);
						csd.setGrouped(true);
					} else if (i == 2) {
						group3.add(csd);
						csd.setGrouped(true);
					}
				}
			}	
		}
	}
	
	public void divideGroups4(){
		group1 = new LinkedList<CSD>();
		group2 = new LinkedList<CSD>();
		group3 = new LinkedList<CSD>();
		group4 = new LinkedList<CSD>();
		group5 = new LinkedList<CSD>();
		
		List<AbstractService> abstractServices = this.query.getAbstractServices();
		for (int i = 0; i < abstractServices.size(); i++) {
			AbstractService abs = abstractServices.get(i);
			
			for (CSD csd: this.csds) {
				if (csd.getCoveredAbstractServices().contains(abs) && !csd.isGrouped()) {
					if (i == 0) {
						group1.add(csd);
						csd.setGrouped(true);
					} else if (i == 1) {
						group2.add(csd);
						csd.setGrouped(true);
					} else if (i == 2) {
						group3.add(csd);
						csd.setGrouped(true);
					} else if (i == 3) {
						group4.add(csd);
						csd.setGrouped(true);
					}
				}
			}	
		}
	}
	
	public void divideGroups5(){
		group1 = new LinkedList<CSD>();
		group2 = new LinkedList<CSD>();
		group3 = new LinkedList<CSD>();
		group4 = new LinkedList<CSD>();
		group5 = new LinkedList<CSD>();
		
		List<AbstractService> abstractServices = this.query.getAbstractServices();
		for (int i = 0; i < abstractServices.size(); i++) {
			AbstractService abs = abstractServices.get(i);
			
			for (CSD csd: this.csds) {
				if (csd.getCoveredAbstractServices().contains(abs) && !csd.isGrouped()) {
					if (i == 0) {
						group1.add(csd);
						csd.setGrouped(true);
					} else if (i == 1) {
						group2.add(csd);
						csd.setGrouped(true);
					} else if (i == 2) {
						group3.add(csd);
						csd.setGrouped(true);
					} else if (i == 3) {
						group4.add(csd);
						csd.setGrouped(true);
					} else if (i == 4) {
						group5.add(csd);
						csd.setGrouped(true);
					}
				}
			}	
		}
	}
	
	public void divideGroups6(){
		group1 = new LinkedList<CSD>();
		group2 = new LinkedList<CSD>();
		group3 = new LinkedList<CSD>();
		group4 = new LinkedList<CSD>();
		group5 = new LinkedList<CSD>();
		group6 = new LinkedList<CSD>();
		
		List<AbstractService> abstractServices = this.query.getAbstractServices();
		for (int i = 0; i < abstractServices.size(); i++) {
			AbstractService abs = abstractServices.get(i);
			
			for (CSD csd: this.csds) {
				if (csd.getCoveredAbstractServices().contains(abs) && !csd.isGrouped()) {
					if (i == 0) {
						group1.add(csd);
						csd.setGrouped(true);
					} else if (i == 1) {
						group2.add(csd);
						csd.setGrouped(true);
					} else if (i == 2) {
						group3.add(csd);
						csd.setGrouped(true);
					} else if (i == 3) {
						group4.add(csd);
						csd.setGrouped(true);
					} else if (i == 4) {
						group5.add(csd);
						csd.setGrouped(true);
					} else if (i == 5) {
						group6.add(csd);
						csd.setGrouped(true);
					}
				}
			}	
		}
	}
	
}
