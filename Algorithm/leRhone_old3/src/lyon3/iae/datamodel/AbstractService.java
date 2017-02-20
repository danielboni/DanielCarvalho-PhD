package lyon3.iae.datamodel;

import java.util.LinkedList;
import java.util.List;

public class AbstractService {

	private String name;
	private String description;
	private List<Variable> variables;
	private List<Dependency> dep;
	
	public AbstractService () {
		this.dep = new LinkedList<Dependency>();
	}
	
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
	@Override
	public boolean equals(Object obj2) {
		AbstractService abs = (AbstractService) obj2;
		
		if (!this.getName().equals(abs.getName()))
			return false;
//		if (this.getVariables().size() != abs.getVariables().size())
//			return false;
		
//		int cont_input = 0;
//		int cont_output = 0;
//		for (Variable var: this.getVariables()){
//			if (var instanceof InputVariable)
//				cont_input++;
//			else
//				cont_output++;
//		}
//		
//		int abs_cont_input = 0;
//		int abs_cont_output = 0;
//		for (Variable var: abs.getVariables()){
//			if (var instanceof InputVariable)
//				abs_cont_input++;
//			else
//				abs_cont_output++;
//		}
		return true;
	}
	
	public boolean variablesOK(Object obj2) {
		AbstractService abs = (AbstractService) obj2;
		
		int cont_input = 0;
		int cont_output = 0;
		for (Variable var: this.getVariables()){
			if (var instanceof InputVariable)
				cont_input++;
			else
				cont_output++;
		}
		
		int abs_cont_input = 0;
		int abs_cont_output = 0;
		for (Variable var: abs.getVariables()){
			if (var instanceof InputVariable)
				abs_cont_input++;
			else
				abs_cont_output++;
		}
		
		if (cont_input < abs_cont_input)
			return false;
		if (cont_output < abs_cont_output)
			return false;
		
		return true;
	}
	
	public List<Dependency> getDep() {
		return dep;
	}
	public void setDep(List<Dependency> dep) {
		this.dep = dep;
	}
	public void addDep(Dependency dep) {
		this.dep.add(dep);
	}
}
