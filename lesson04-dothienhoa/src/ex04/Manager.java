package ex04;

public class Manager extends Person {
	private float numberOfStaff;

	public Manager() {
	}

	public Manager(String name, String dayOfBirth, float coefficientsSalary, float numberOfStaff) {
		super(name, dayOfBirth, coefficientsSalary);
		this.numberOfStaff = numberOfStaff;
	}

	public float getNumberOfStaff() {
		return numberOfStaff;
	}

	public void setNumberOfStaff(float numberOfStaff) {
		this.numberOfStaff = numberOfStaff;
	}

	@Override
	public String toString() {
		return "Manager [numberOfStaff=" + numberOfStaff + ", toString()=" + super.toString() + "]";
	}
	
	

}
