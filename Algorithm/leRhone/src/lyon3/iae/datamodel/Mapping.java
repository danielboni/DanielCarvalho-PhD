package lyon3.iae.datamodel;

import java.util.HashMap;
import java.util.Map;

public class Mapping {
	
	private ConcreteService concreteService;

	private AbstractService query_abstractservice;
	
	private AbstractService concrete_service_abstractservice;
	
	private Map<Variable, Variable> mappings;
	
	public Mapping() {
		this.setMappings(new HashMap<Variable, Variable>());
	}

	public AbstractService getQuery_abstractservice() {
		return query_abstractservice;
	}

	public void setQuery_abstractservice(AbstractService query_abstractservice) {
		this.query_abstractservice = query_abstractservice;
	}

	public AbstractService getConcrete_service_abstractservice() {
		return concrete_service_abstractservice;
	}

	public void setConcrete_service_abstractservice(
			AbstractService concrete_service_abstractservice) {
		this.concrete_service_abstractservice = concrete_service_abstractservice;
	}

	public Map<Variable, Variable> getMappings() {
		return mappings;
	}

	public void setMappings(Map<Variable, Variable> mappings) {
		this.mappings = mappings;
	}
	
	public void addMapping(Variable a, Variable b) {
		this.mappings.put(a, b);
	}

	@Override
	public String toString() {
		return "Mapping [query_abstractservice=" + query_abstractservice
				+ ", concrete_service_abstractservice="
				+ concrete_service_abstractservice + ", mappings=" + mappings
				+ "]";
	}

	public ConcreteService getConcreteService() {
		return concreteService;
	}

	public void setConcreteService(ConcreteService concreteService) {
		this.concreteService = concreteService;
	}
}
