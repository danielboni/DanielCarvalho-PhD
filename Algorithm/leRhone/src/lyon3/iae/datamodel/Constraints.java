package lyon3.iae.datamodel;

public class Constraints {
	
	private String variableName;
	private String op;
	private String value;
	
	public String getVariableName() {
		return variableName;
	}
	public void setVariableName(String name) {
		this.variableName = name;
	}
	public String getOp() {
		return op;
	}
	public void setOp(String op) {
		this.op = op;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
