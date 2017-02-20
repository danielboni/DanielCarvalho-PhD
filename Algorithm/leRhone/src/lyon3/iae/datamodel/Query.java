package lyon3.iae.datamodel;

import java.util.LinkedList;
import java.util.List;

public class Query {

	private String head;
	private String body;
	private String name;
	private List<Variable> headVariables;
	private List<AbstractService> abstractServices;
	private List<UserPreference> userPreferences;
	private List<Constraints> constraints;
	private List<Dependency> dependencies;
	private int size;
	
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
	private double totalCost;
	private double totalResponseTime;
	
	
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


	public double getTotalCost() {
		return totalCost;
	}


	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}


	public double getTotalResponseTime() {
		return totalResponseTime;
	}


	public void setTotalResponseTime(double totalResponseTime) {
		this.totalResponseTime = totalResponseTime;
	}
	/* Lista que guarda os ids dos serviços abstratos */
	private List<Integer> abstractServicesAsInt;
	
	public Query() {
		this.abstractServicesAsInt = new LinkedList<Integer>();
	}
	
	
	public List<Integer> getAbstractServicesAsInt() {
		return abstractServicesAsInt;
	}


	public void setAbstractServicesAsInt(List<Integer> abstractServicesAsInt) {
		this.abstractServicesAsInt = abstractServicesAsInt;
	}


	public List<UserPreference> getUserPreferences() {
		return userPreferences;
	}
	public void setUserPreferences(List<UserPreference> userPreferences) {
		this.userPreferences = userPreferences;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public List<Constraints> getConstraints() {
		return constraints;
	}
	public void setConstraints(List<Constraints> constraints) {
		this.constraints = constraints;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(getHead() + " := " + getBody() + "\n");
		
		for (AbstractService a: abstractServices){
			sb.append("Abstract Service: ");
			sb.append(a.getDescription() + " --> " + a.toString());
		}
		sb.append("\n Constraints: [");
		for (Constraints c: constraints)
			sb.append(c.toString());
		sb.append(" ]");
		sb.append("\n User Preferences: [");
		for (UserPreference c: userPreferences)
			sb.append(c.toString());
		sb.append(" ]");
		return sb.toString();
	}
	public List<Dependency> getDependencies() {
		return dependencies;
	}
	public void setDependencies(List<Dependency> dependencies) {
		this.dependencies = dependencies;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
}
