package lyon3.iae.datamodel;

import java.util.List;

public class CSD {
	
	private ConcreteService concrete_service;
	
	private List<Mapping> mappings;
	
	public ConcreteService getConcrete_service() {
		return concrete_service;
	}
	public void setConcrete_service(ConcreteService concrete_service) {
		this.concrete_service = concrete_service;
	}
	public List<Mapping> getMappings() {
		return mappings;
	}
	public void setMappings(List<Mapping> mappings) {
		this.mappings = mappings;
	}
}
