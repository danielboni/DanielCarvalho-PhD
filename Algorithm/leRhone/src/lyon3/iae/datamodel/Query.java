package lyon3.iae.datamodel;

import java.util.List;

public class Query {

	private String head;
	private String body;
	private String name;
	private List<Variable> headVariables;
	private List<AbstractService> abstractServices;
	private List<UserPreference> userPreferences;
	private List<Constraints> constraints;
	
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
}
