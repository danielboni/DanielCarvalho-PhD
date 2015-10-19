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
	
//	private void setRewritingMapping() {
//
//		// temporary mapping to have a representatives for each query variable
//		Mapping represents = new Mapping();
//
//		for (PCD mcd : mcds) {
//
//			for (MCDMappings map: mcd.getPhi()){
//				
//				// get reference for rewritingMapping from mappings object of class
//				// MCD
//				Mapping rewritingMap = map.rewritingMap;
//
//				// list of variables that are already mapped
//				List<Variable> alreadyMapped = new ArrayList<Variable>();
//
//				for (int i = 0; i < map.varMapSize(); i++) {
//
//					PredicateElement queryElem = map.getVarMapArgument(i);
//					Variable viewVar = map.getVarMapValue(i);
//
//					// view variable has not been mapped before
//					if (!alreadyMapped.contains(viewVar)) {
//						alreadyMapped.add(viewVar);
//
//						// there is no yet a representative for the query variable
//						if (!represents.containsArgument(queryElem)) {
//
//							represents.map(queryElem, queryElem);
//
//							// add mapping from view variable to query element
//							rewritingMap.map(viewVar, queryElem);
//
//							// there is already a representative for the query
//							// variable
//						} else {
//							PredicateElement represent = represents
//									.getFirstMatchingValue(queryElem);
//
//							// add mapping from view variable to reprentative of
//							// query variable
//							rewritingMap.map(viewVar, represent);
//						}
//
//						// same view variable has been mapped before
//					} else {
//						PredicateElement represent = rewritingMap
//								.getFirstMatchingValue(viewVar);
//						// this query element gets same represantative as
//						// the one that was relevant when the view variable
//						// was mapped before
//						represents.map(queryElem, represent);
//
//						// add mapping from view variable to reprentative of
//						// query variable
//						rewritingMap.map(viewVar, represent);
//					}
//				}	
//			}
//		}
//	}
//
//
//	private void setRewritingQuery() {
//		
//		rewriting = new DatalogQuery(query.getName());
//		
//		for (Variable headVar : query.getHeadVariables()) {
//			rewriting.addHeadVariable(headVar);
//			System.out.println("Query headvar: " + headVar);
//		}
//
//		for (PCD mcd : mcds) {
//			
//			Predicate view = new Predicate(mcd.view.getName());
//			rewriting.addPredicate(view);
//			
//			for (Variable var : mcd.view.getHeadVariables()) {
//				boolean check = false;
//				for (int i = 0; i < mcd.getPhi().size(); i++){
//					MCDMappings map = mcd.getPhi().get(i);
//					Mapping rewritingMap = map.rewritingMap;
//					PredicateElement rwVar = rewritingMap.getFirstMatchingValue(var);
//					if (rwVar != null) {
//						view.addElement(rwVar);
//						check = true;
//						break;
//					}
//				}	
//				if (check == false) {
//					view.addVariable(new Variable("_"));
//				}
////				for (int i = 0; i < mcd.getPhi().size(); i++){
////					MCDMappings map = mcd.getPhi().get(i);
////					Mapping rewritingMap = map.rewritingMap;
////					PredicateElement rwVar = rewritingMap.getFirstMatchingValue(var);
////					if (rwVar != null) {
////						view.addElement(rwVar);
////					} else {
////						view.addVariable(new Variable("_"));
////					}
////				}			
//			}	
//		}
//	}

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
				if (i == csd.getConcrete_service().getHeadVariables().size() - 1) {
					for (Mapping map: csd.getMappings()) {
						for (Map.Entry<Variable, Variable> m: map.getMappings().entrySet()){
							//System.out.println("---" + m.getKey());
							if (m.getKey().equals(headVar) && headVar instanceof InputVariable)
								sb.append(m.getValue().name + "?");
							else if (m.getKey().equals(headVar) && headVar instanceof OutputVariable)
								sb.append(m.getValue().name + "!");
						}
					}
				}else {
					for (Mapping map: csd.getMappings()) {
						for (Map.Entry<Variable, Variable> m: map.getMappings().entrySet()){
							//System.out.println("---" + m.getKey());
							if (m.getKey().equals(headVar) && headVar instanceof InputVariable)
								sb.append(m.getValue().name + "?,");
							else if (m.getKey().equals(headVar) && headVar instanceof OutputVariable)
								sb.append(m.getValue().name + "!,");
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
