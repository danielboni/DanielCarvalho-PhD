package lyon3.iae.datamodel;

import java.util.List;

public class CSD {
	
	private boolean grouped = false;
	
	public boolean isGrouped() {
		return grouped;
	}
	public void setGrouped(boolean grouped) {
		this.grouped = grouped;
	}
	private ConcreteService concrete_service;
	
	private List<Mapping> mappings;
	
	private List<AbstractService> coveredAbstractServices;
	
	private int numberOfabstractServices;
	
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
	@Override
	public boolean equals(Object obj) {
		CSD csd = (CSD)obj;
		if (!this.getConcrete_service().equals(csd.getConcrete_service()))
			return false;
		return true;
	}
	public List<AbstractService> getCoveredAbstractServices() {
		return coveredAbstractServices;
	}
	public void setCoveredAbstractServices(
			List<AbstractService> coveredAbstractServices) {
		this.coveredAbstractServices = coveredAbstractServices;
	}
	public int getNumberOfabstractServices() {
		return numberOfabstractServices;
	}
	public void setNumberOfabstractServices(int numberOfabstractServices) {
		this.numberOfabstractServices = numberOfabstractServices;
	}
}
