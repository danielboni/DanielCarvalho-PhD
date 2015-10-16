package lyon3.iae.datamodel;

import java.util.List;

public class ConcreteService {

	private String head;
	private String body;
	private List<Variable> headVariables;
	private List<AbstractService> abstractServices;
	private List<QualityAspect> qualityAspects;
	private List<Dependency> dependencies;
	
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
}
