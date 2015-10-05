package minicon;

import java.util.ArrayList;
import java.util.List;

public class UserPreference {
	
	private int id;
	
	private List<String> measures; 
	
	private List<String> values;
	
	private List<String> predicates;
	
	public UserPreference(){
		this.measures = new ArrayList<String>();
		this.values = new ArrayList<String>();
		this.predicates = new ArrayList<String>();
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
		this.predicates.add(predicate);
		this.values.add(value);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
