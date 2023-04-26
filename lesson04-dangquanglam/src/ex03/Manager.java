package ex03;

public class Manager extends Person {
	private float numOfManagerStaff;

	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public Manager(String name, String dateOfBirth, float coefSalary, float numOfManagerStaff) {
		super(name, dateOfBirth, coefSalary);
		this.numOfManagerStaff = numOfManagerStaff;
	}

	public float getNumOfManagerStaff() {
		return numOfManagerStaff;
	}

	public void setNumOfManagerStaff(float numOfManagerStaff) {
		this.numOfManagerStaff = numOfManagerStaff;
	}

	@Override
	public String toString() {
		return super.toString() + "numOfManagerStaff=" + numOfManagerStaff + "]";
	}

	@Override
	public Float salary() {
		return this.getCoefSalary() * 2200000;
	}
}
