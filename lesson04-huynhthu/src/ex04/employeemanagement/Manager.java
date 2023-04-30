package ex04.employeemanagement;

public class Manager extends GeneralInfo {
	private int employeeNumber;

	public Manager() {
	}

	public Manager(String name, String dayOfBirth, float coefficientsSalary, int employeeNumber) {
		super(name, dayOfBirth, coefficientsSalary);
		this.employeeNumber = employeeNumber;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	@Override
	public String toString() {
		return "Manager [employeeNumber=" + employeeNumber + ", toString()=" + super.toString() + "]";
	}

	@Override
	float salary() {
		return this.getCoefficientsSalary() * 2200000;
	}
	
}
