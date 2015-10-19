package lyon3.iae.rhone;

import java.util.ArrayList;
import java.util.List;

import lyon3.iae.datamodel.AbstractService;
import lyon3.iae.datamodel.CSD;
import lyon3.iae.datamodel.ConcreteService;
import lyon3.iae.datamodel.Constraints;
import lyon3.iae.datamodel.Dependency;
import lyon3.iae.datamodel.InputVariable;
import lyon3.iae.datamodel.Mapping;
import lyon3.iae.datamodel.OutputVariable;
import lyon3.iae.datamodel.QualityAspect;
import lyon3.iae.datamodel.Query;
import lyon3.iae.datamodel.UserPreference;
import lyon3.iae.datamodel.Variable;


public class Rhone {
	
	private Query query;
	
	private List<ConcreteService> concreteServices;
	
	private List<ConcreteService> cadidateConcreteServices;
	
	private List<CSD> csds;
	
	private List<List<CSD>> rewritings;
	
	private List<List<CSD>> csdsPermutations;

	public void selectServices(){
		this.setCadidateConcreteServices(new ArrayList<ConcreteService>());
		
		for (ConcreteService c: concreteServices){
			if (this.isCandidateService(c))
				this.cadidateConcreteServices.add(c);
		}
	}
	
	public boolean isCandidateService(ConcreteService service){
		for (AbstractService a: service.getAbstractServices()){
			boolean k = false;
			for (AbstractService b: this.query.getAbstractServices()){
				if (a.equals(b))
					k = true;
			}
			if (!k)
				return false;
		}
		return true;
	}
	
/*	public void combineCSDs() {
		rewritings = new ArrayList<List<CSD>>();
		csdsPermutations = new ArrayList<List<CSD>>();
		for (int i = 1; i <= csds.size(); i++) {

			// find subset of size i
			List<List<CSD>> subsetList = findMCDSubset(csds, i);
			csdsPermutations.addAll(subsetList);
//			for (List<CSD> csdList : subsetList) {
//				if (isRewriting(csdList)) {
//					rewritings.add(csdList);
//				}
//			}
		}
	}*/
	
	public void combineCSDs() {		
		csdsPermutations = new ArrayList<List<CSD>>();
		List<List<CSD>> subsetList = findMCDSubsetPref(csds) ;
		csdsPermutations.addAll(subsetList);
//		for (List<CSD> mcdList : subsetList) {
//			if (isRewriting(mcdList)) {
//				rewritings.add(new Rewriting(mcdList, query));
//			}
//		}
	}
	
	private List<List<CSD>> findMCDSubsetPref(List<CSD> list) {
		List<List<CSD>> result;

		if (list.size() == 0){
			result = new ArrayList<List<CSD>>();
			result.add(new ArrayList<CSD>());
			return result;
		}

		List<CSD> newList = new ArrayList(list);
		CSD lastMCD = newList.remove(newList.size()-1);		

		return addMCDToSubsetList(lastMCD, findMCDSubsetPref(newList));
	}
	
	private List<List<CSD>> addMCDToSubsetList (CSD csd, List<List<CSD>> subsetList){
		List<List<CSD>> resultat = clone (subsetList);		
		List<List<CSD>> initialSubsetList = clone (subsetList);

		for (List<CSD> csdList: initialSubsetList){
			csdList.add(csd);
			resultat.add(csdList);
		}		
		return resultat;				
	}
	
	private List<List<CSD>> clone (List<List<CSD>> listOfLists){
		List<List<CSD>> result = new ArrayList<List<CSD>>();

		for (List<CSD> list: listOfLists){
			List<CSD> newList = new ArrayList<CSD>();
			newList.addAll(list);
			result.add(newList);
		}
		return result;
	}
/*	
	private List<List<CSD>> findMCDSubset(List<CSD> list, int size) {
		//
		List<CSD> csdList = new ArrayList<CSD>(list);
		List<List<CSD>> returnList = new ArrayList<List<CSD>>();
		//
		if (size == 1) {
			for (CSD mcd : csdList) {
				List<CSD> tempList = new ArrayList<CSD>();
				tempList.add(mcd);
				returnList.add(tempList);
			}
		} else {
			for (int i = 0; i <= (csdList.size() - size + 1); i++) {

				CSD csd = csdList.get(0);
				csdList.remove(0);
				List<List<CSD>> tempList = findMCDSubset(csdList, size - 1);

				addAsFirstElem(csd, tempList);
				returnList.addAll(tempList);
			}
		}
		//
		return returnList;
	}*/
	
/*	private void addAsFirstElem(CSD elem, List<List<CSD>> list) {
		for (List<CSD> currList : list) {
			currList.add(0, elem);
		}
	}*/
	
	public void createCSDs(){
		csds = new ArrayList<CSD>();

		/*if there is no dependency in the query, create mappings and CSDs for all candidate concrete*/
		if (query.getDependencies().isEmpty()) {

			for (ConcreteService c: cadidateConcreteServices) {
				CSD csd = new CSD();
				csd.setConcrete_service(c);

				List<Mapping> mappings = new ArrayList<Mapping>();

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
				csds.add(csd);
			}
		} else {
			for (ConcreteService c: cadidateConcreteServices) {
				if (satisfyDependenciesRule(c)) {
					CSD csd = new CSD();
					csd.setConcrete_service(c);

					List<Mapping> mappings = new ArrayList<Mapping>();

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
	
	public void queryParser(String query){
		Query q = new Query();
		
		q.setHead(this.getHeadDefinition(query).trim());
		q.setBody(this.getBodyDefinition(query).trim());

		List<Variable> headVariables = this.processVariables(q.getHead());
		q.setHeadVariables(headVariables);
		
		q.setUserPreferences(this.getUserPreferences(q.getBody()));
		
		q.setAbstractServices(this.getAbstractServices(q.getBody()));
		
		q.setConstraints(this.getConstraints(q.getBody()));
	}
	
	public void concreteServiceParser(String concreteService){
		ConcreteService c = new ConcreteService();
		c.setHead(this.getHeadDefinition(concreteService));
		c.setBody(this.getBodyDefinition(concreteService));
		List<Variable> headVariables = this.processVariables(c.getHead());
		c.setHeadVariables(headVariables);
		c.setAbstractServices(this.getAbstractServices(c.getBody()));
		c.setQualityAspects(this.getQualityAspects(c.getBody()));
	}

	public String getHeadDefinition(String query){
		int middle = query.indexOf(":");
		return query.substring(0, middle-1);
	}
	
	public String getBodyDefinition(String query){
		int middle = query.indexOf("=");
		return query.substring(middle+1, query.length());
	}
	
	public List<Variable> processVariables(String s){
		int begin = s.indexOf("(") + 1;
		int end = s.indexOf(")");
		String s1 = s.substring(begin, end);
		List<Variable> variables = new ArrayList<Variable>();
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
	
	public List<UserPreference> getUserPreferences(String body){
		List<UserPreference> userPreferences = new ArrayList<UserPreference>();
		int begin = body.indexOf("[");
		int end = body.indexOf("]");
		String userPref = body.substring(begin+1, end);
		//System.out.println(userPref);
		String[] prefs = userPref.split(",");
		for (String pref: prefs){
			if (pref.contains("<=")){
				String[] prefParts = pref.split("<=");
				UserPreference u = new UserPreference();
				u.setMeasure(prefParts[0].trim());
				u.setOp("<=");
				u.setValue(prefParts[1].trim());
				userPreferences.add(u);
			} else if (pref.contains(">=")){
				String[] prefParts = pref.split(">=");
				UserPreference u = new UserPreference();
				u.setMeasure(prefParts[0].trim());
				u.setOp(">=");
				u.setValue(prefParts[1].trim());
				userPreferences.add(u);
			} else if (pref.contains("!=")){
				String[] prefParts = pref.split("!=");
				UserPreference u = new UserPreference();
				u.setMeasure(prefParts[0].trim());
				u.setOp("!=");
				u.setValue(prefParts[1].trim());
				userPreferences.add(u);
			} else if (pref.contains(">")){
				String[] prefParts = pref.split(">");
				UserPreference u = new UserPreference();
				u.setMeasure(prefParts[0].trim());
				u.setOp(">");
				u.setValue(prefParts[1].trim());
				userPreferences.add(u);
			} else if (pref.contains("<")){
				String[] prefParts = pref.split("<");
				UserPreference u = new UserPreference();
				u.setMeasure(prefParts[0].trim());
				u.setOp("<");
				u.setValue(prefParts[1].trim());
				userPreferences.add(u);
			} else if (pref.contains("=")){
				String[] prefParts = pref.split("=");
				UserPreference u = new UserPreference();
				u.setMeasure(prefParts[0].trim());
				u.setOp("=");
				u.setValue(prefParts[1].trim());
				userPreferences.add(u);
			}
		}
		return userPreferences;
	}
	
	private List<AbstractService> getAbstractServices(String body) {
		List<AbstractService> abstractServices = new ArrayList<AbstractService>();
		int end = body.indexOf("{");
		if (end == -1)
			end = body.indexOf("[");
		if (end == -1)
			end = body.length();
				
		String aServices = body.substring(0, end);
		//System.out.println(aServices);
		String[] aS = aServices.split(",");
		String concat = "";
		for (String abs: aS){
			if (!abs.contains(")")){
				concat = concat + abs + ",";
			}else {
				concat = concat + abs;
				//System.out.println(concat.trim());
				AbstractService a = new AbstractService();
				a.setDescription(concat.trim());
				int i = concat.indexOf("(");
				a.setName((concat.substring(0, i)).trim());
				a.setVariables(this.processVariables(concat));
				abstractServices.add(a);
				concat = "";
			}
		}
		return abstractServices;
	}
	
	public List<Constraints> getConstraints(String body){
		List<Constraints> constraints = new ArrayList<Constraints>();
		int begin = body.indexOf("{");
		int end = body.indexOf("}");
		String constraintsPart = body.substring(begin+1, end);
		//System.out.println(constraintsPart);
		String[] prefs = constraintsPart.split(",");
		for (String pref: prefs){
			if (pref.contains("<=")){
				String[] prefParts = pref.split("<=");
				Constraints u = new Constraints();
				u.setVariableName(prefParts[0].trim());
				u.setOp("<=");
				u.setValue(prefParts[1].trim());
				constraints.add(u);
			} else if (pref.contains(">=")){
				String[] prefParts = pref.split(">=");
				Constraints u = new Constraints();
				u.setVariableName(prefParts[0].trim());
				u.setOp(">=");
				u.setValue(prefParts[1].trim());
				constraints.add(u);
			} else if (pref.contains("!=")){
				String[] prefParts = pref.split("!=");
				Constraints u = new Constraints();
				u.setVariableName(prefParts[0].trim());
				u.setOp("!=");
				u.setValue(prefParts[1].trim());
				constraints.add(u);
			} else if (pref.contains(">")){
				String[] prefParts = pref.split(">");
				Constraints u = new Constraints();
				u.setVariableName(prefParts[0].trim());
				u.setOp(">");
				u.setValue(prefParts[1].trim());
				constraints.add(u);
			} else if (pref.contains("<")){
				String[] prefParts = pref.split("<");
				Constraints u = new Constraints();
				u.setVariableName(prefParts[0].trim());
				u.setOp("<");
				u.setValue(prefParts[1].trim());
				constraints.add(u);
			} else if (pref.contains("=")){
				String[] prefParts = pref.split("=");
				Constraints u = new Constraints();
				u.setVariableName(prefParts[0].trim());
				u.setOp("=");
				u.setValue(prefParts[1].trim());
				constraints.add(u);
			}
		}
		return constraints;
	}
	
	private List<QualityAspect> getQualityAspects(String body) {
		List<QualityAspect> qualityAspects = new ArrayList<QualityAspect>();
		int begin = body.indexOf("[");
		int end = body.indexOf("]");
		String userPref = body.substring(begin+1, end);
		//System.out.println(userPref);
		String[] prefs = userPref.split(",");
		for (String pref: prefs){
			if (pref.contains("<=")){
				String[] prefParts = pref.split("<=");
				QualityAspect u = new QualityAspect();
				u.setMeasure(prefParts[0].trim());
				u.setOp("<=");
				u.setValue(prefParts[1].trim());
				qualityAspects.add(u);
			} else if (pref.contains(">=")){
				String[] prefParts = pref.split(">=");
				QualityAspect u = new QualityAspect();
				u.setMeasure(prefParts[0].trim());
				u.setOp(">=");
				u.setValue(prefParts[1].trim());
				qualityAspects.add(u);
			} else if (pref.contains("!=")){
				String[] prefParts = pref.split("!=");
				QualityAspect u = new QualityAspect();
				u.setMeasure(prefParts[0].trim());
				u.setOp("!=");
				u.setValue(prefParts[1].trim());
				qualityAspects.add(u);
			} else if (pref.contains(">")){
				String[] prefParts = pref.split(">");
				QualityAspect u = new QualityAspect();
				u.setMeasure(prefParts[0].trim());
				u.setOp(">");
				u.setValue(prefParts[1].trim());
				qualityAspects.add(u);
			} else if (pref.contains("<")){
				String[] prefParts = pref.split("<");
				QualityAspect u = new QualityAspect();
				u.setMeasure(prefParts[0].trim());
				u.setOp("<");
				u.setValue(prefParts[1].trim());
				qualityAspects.add(u);
			} else if (pref.contains("=")){
				String[] prefParts = pref.split("=");
				QualityAspect u = new QualityAspect();
				u.setMeasure(prefParts[0].trim());
				u.setOp("=");
				u.setValue(prefParts[1].trim());
				qualityAspects.add(u);
			}
		}
		return qualityAspects;
	}

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
}
