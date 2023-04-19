package ex04.model;

public class Employee extends Person {
	private String department;

	public Employee() {
	}

	public Employee(String name, String dateOfBirth, float coefSalary, String department) {
		super(name, dateOfBirth, coefSalary);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [" + super.toString() + " Department: " + department + "]";
	}
	

}
