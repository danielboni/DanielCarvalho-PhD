package lyon3.iae.datamodel;

public class OutputVariable extends Variable {

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof InputVariable)
			return false;
		if (!this.getName().equals(((OutputVariable)obj).getName()))
			return false;
		return true;
	}
}
