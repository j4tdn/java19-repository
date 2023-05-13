package ex04;

public class Staff extends Person {
	private String nameOfUnit;

	public Staff() {
	}

	public Staff(String name, String dayOfBirth, float coefficientsSalary, String nameOfUnit) {
		super(name, dayOfBirth, coefficientsSalary);
		this.nameOfUnit = nameOfUnit;
	}

	public String getNameOfUnit() {
		return nameOfUnit;
	}

	public void setNameOfUnit(String nameOfUnit) {
		this.nameOfUnit = nameOfUnit;
	}

	@Override
	public String toString() {
		return "Staff [nameOfUnit=" + nameOfUnit + ", toString()=" + super.toString() + "]";
	}

}
