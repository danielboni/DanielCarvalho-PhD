package lyon3.iae.datamodel;

import java.util.List;

public class CSD {
	
	private ConcreteService concrete_service;
	private List<AbstractService> quer_coverage_part;
	private List<Mapping> mappings;
	
	public ConcreteService getConcrete_service() {
		return concrete_service;
	}
	public void setConcrete_service(ConcreteService concrete_service) {
		this.concrete_service = concrete_service;
	}
	public List<AbstractService> getQuer_coverage_part() {
		return quer_coverage_part;
	}
	public void setQuer_coverage_part(List<AbstractService> quer_coverage_part) {
		this.quer_coverage_part = quer_coverage_part;
	}
	public List<Mapping> getMappings() {
		return mappings;
	}
	public void setMappings(List<Mapping> mappings) {
		this.mappings = mappings;
	}
}
