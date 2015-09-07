package minicon;

import java.util.List;

public class SLA {
	
	private String name;
	
	private List<String> measures; 
	
	private List<String> values;
	
	private List<String> predicates;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getMeasures() {
		return measures;
	}

	public void setMeasures(List<String> measures) {
		this.measures = measures;
	}

	public List<String> getValues() {
		return values;
	}

	public void setValues(List<String> values) {
		this.values = values;
	}

	public List<String> getPredicates() {
		return predicates;
	}

	public void setPredicates(List<String> predicates) {
		this.predicates = predicates;
	} 	
}
