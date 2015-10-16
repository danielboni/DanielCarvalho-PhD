package lyon3.iae.datamodel;

public class InputVariable extends Variable {

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof OutputVariable)
			return false;
		if (!this.getName().equals(((InputVariable)obj).getName()))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "InputVariable [name=" + name + "]";
	}
}
