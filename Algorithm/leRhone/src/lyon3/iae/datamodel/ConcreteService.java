package lyon3.iae.datamodel;

import java.util.List;

public class ConcreteService {

	private int id;
	private String description;
	private int idAbstract;
	
	public int getIdAbstract() {
		return idAbstract;
	}
	public void setIdAbstract(int idAbstract) {
		this.idAbstract = idAbstract;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	private String name;
	private String head;
	private String body;
	private List<Variable> headVariables;
	private List<AbstractService> abstractServices;
	private List<QualityAspect> qualityAspects;
	private List<Dependency> dependencies;
	
	private double availability;
	private double responseTime;
	private double pricePerCall;
	private String authentication;
	private String privacy;
	private String trust;
	private String degreeOfRawness;
	private String veracity;
	private String productionTime;
	private double productionRate;
	private String dataType;
	private String freshness;
	private String provenance;
	
	public double getAvailability() {
		return availability;
	}
	public void setAvailability(double availability) {
		this.availability = availability;
	}
	public double getResponseTime() {
		return responseTime;
	}
	public void setResponseTime(double responseTime) {
		this.responseTime = responseTime;
	}
	public double getPricePerCall() {
		return pricePerCall;
	}
	public void setPricePerCall(double pricePerCall) {
		this.pricePerCall = pricePerCall;
	}
	public String getAuthentication() {
		return authentication;
	}
	public void setAuthentication(String authentication) {
		this.authentication = authentication;
	}
	public String getPrivacy() {
		return privacy;
	}
	public void setPrivacy(String privacy) {
		this.privacy = privacy;
	}
	public String getTrust() {
		return trust;
	}
	public void setTrust(String trust) {
		this.trust = trust;
	}
	public String getDegreeOfRawness() {
		return degreeOfRawness;
	}
	public void setDegreeOfRawness(String degreeOfRawness) {
		this.degreeOfRawness = degreeOfRawness;
	}
	public String getVeracity() {
		return veracity;
	}
	public void setVeracity(String veracity) {
		this.veracity = veracity;
	}
	public String getProductionTime() {
		return productionTime;
	}
	public void setProductionTime(String productionTime) {
		this.productionTime = productionTime;
	}
	public double getProductionRate() {
		return productionRate;
	}
	public void setProductionRate(double productionRate) {
		this.productionRate = productionRate;
	}
	public String getDataType() {
		return dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	public String getFreshness() {
		return freshness;
	}
	public void setFreshness(String freshness) {
		this.freshness = freshness;
	}
	public String getProvenance() {
		return provenance;
	}
	public void setProvenance(String provenance) {
		this.provenance = provenance;
	}
	public String getHead() {
		return head;
	}
	public void setHead(String head) {
		this.head = head;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public List<Variable> getHeadVariables() {
		return headVariables;
	}
	public void setHeadVariables(List<Variable> headVariables) {
		this.headVariables = headVariables;
	}
	public List<AbstractService> getAbstractServices() {
		return abstractServices;
	}
	public void setAbstractServices(List<AbstractService> abstractServices) {
		this.abstractServices = abstractServices;
	}
	public List<QualityAspect> getQualityAspects() {
		return qualityAspects;
	}
	public void setQualityAspects(List<QualityAspect> qualityAspects) {
		this.qualityAspects = qualityAspects;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(getHead() + " := " + getBody() + "\n");
		
		for (AbstractService a: abstractServices){
			sb.append("Abstract Service: ");
			sb.append(a.getDescription() + " --> " + a.toString());
		}

		for (QualityAspect c: qualityAspects)
			sb.append("\n Quality Aspects: [" + c.toString());
		sb.append(" ]");
		return sb.toString();
	}
	public List<Dependency> getDependencies() {
		return dependencies;
	}
	public void setDependencies(List<Dependency> dependencies) {
		this.dependencies = dependencies;
	}
	@Override
	public boolean equals(Object obj) {
		ConcreteService c = (ConcreteService) obj;
		if (!this.getHead().equals(c.getHead()))
			return false;
		if (!this.getBody().equals(c.getBody()))
			return false;
		return true;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
