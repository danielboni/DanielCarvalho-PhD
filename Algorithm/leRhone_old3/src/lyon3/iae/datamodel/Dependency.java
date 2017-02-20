package lyon3.iae.datamodel;

import java.util.List;

public class Dependency {

	private Variable var;
	private AbstractService origin;
	private List<AbstractService> dependencies;
	
	public Variable getVar() {
		return var;
	}
	public void setVar(Variable var) {
		this.var = var;
	}
	public AbstractService getOrigin() {
		return origin;
	}
	public void setOrigin(AbstractService origin) {
		this.origin = origin;
	}
	public List<AbstractService> getDependencies() {
		return dependencies;
	}
	public void setDependencies(List<AbstractService> dependencies) {
		this.dependencies = dependencies;
	}
}
