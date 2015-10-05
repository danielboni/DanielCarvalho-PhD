package minicon;

import java.util.ArrayList;
import java.util.List;

public class SLA {
	
	private String name;
	
	private List<String> measures; 
	
	private List<String> values;
	
	private List<String> predicates;
	
	public SLA(){
		this.measures = new ArrayList<String>();
		this.values = new ArrayList<String>();
		this.predicates = new ArrayList<String>();
	}
	
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

	public void add(String measure, String predicate, String value) {
		this.measures.add(measure);
		this.values.add(value);
		this.predicates.add(predicate);
	} 	
}
