package lyon3.iae.datamodel;

import java.util.List;

public class AbstractService {

	private String name;
	private String description;
	private List<Variable> variables;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Variable> getVariables() {
		return variables;
	}
	public void setVariables(List<Variable> variables) {
		this.variables = variables;
	}
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("[ Name: " + getName() + "] [ Variables: ");
		for (Variable v: variables) {
			if(v instanceof InputVariable)
				sb.append("input <" + v.getName() +"> ");
			else
				sb.append("output <" + v.getName() +"> ");
		}
		sb.append("]");
		return sb.toString();
	}
}
