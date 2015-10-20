package lyon3.iae.datamodel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Rewriting {

	private List<CSD> csds; 

	private Query query;

	private Query rewriting;

	public Rewriting(List<CSD> csds, Query query) {
		this.csds = new ArrayList<CSD>();
		this.csds.addAll(csds);
		this.query = query;

		organiser();
//		setRewritingMapping();
//		setRewritingQuery();
	}

	private void organiser() {
		List<AbstractService> queryAbstractServices = query.getAbstractServices();
		List<CSD> temporaryList = new ArrayList<CSD>(); 
		for (AbstractService abs: queryAbstractServices) {
			for (CSD csd: csds) {
				if (!temporaryList.contains(csd)) {
					for (AbstractService abs2: csd.getConcrete_service().getAbstractServices()) {
						if (abs.equals(abs2))
							temporaryList.add(csd);
					}
				} else {
					continue;
				}
			} 
		}
		this.setCsds(temporaryList);
	}
	
	private boolean isOrganised() {
		for (int i = 0; i < query.getAbstractServices().size(); i++) {
			for (int j = 0; j < csds.size(); j++) {
				
			}
		}
		return true;
	}

	public Query getRewriting() {
		return rewriting;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.query.getHead() + " := ");
		for (CSD csd: csds) {
			sb.append(csd.getConcrete_service().getName() + "(");
			for (int i = 0; i < csd.getConcrete_service().getHeadVariables().size(); i++) {
				Variable headVar = csd.getConcrete_service().getHeadVariables().get(i); 
				boolean check = false;
				if (i == csd.getConcrete_service().getHeadVariables().size() - 1) {
					for (Mapping map: csd.getMappings()) {
						if (check == true)
							break;
						for (Map.Entry<Variable, Variable> m: map.getMappings().entrySet()){
							//System.out.println("---" + m.getKey());
							if (m.getKey().equals(headVar) && headVar instanceof InputVariable) {
								sb.append(m.getValue().name + "?");
								check = true;
							}else if (m.getKey().equals(headVar) && headVar instanceof OutputVariable) {
								sb.append(m.getValue().name + "!");
								check = true;
							}
						}
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
							}else if (m.getKey().equals(headVar) && headVar instanceof OutputVariable) {
								sb.append(m.getValue().name + "!,");
								check = true;
							}
						}
					}
				}
				
			}
			sb.append(") ");
		}
		return sb.toString();
	}

	public List<CSD> getCsds() {
		return csds;
	}

	public void setCsds(List<CSD> csds) {
		this.csds = csds;
	}

	public Query getQuery() {
		return query;
	}

	public void setQuery(Query query) {
		this.query = query;
	}

	public void setRewriting(Query rewriting) {
		this.rewriting = rewriting;
	}
}
