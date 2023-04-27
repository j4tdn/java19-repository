package personelmanager;

public class Employee extends Person{
	private String department;
	
	public Employee(String name, String dateOfBirth, float coefficientsSalary, String department) {
		super(name, dateOfBirth, coefficientsSalary);
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
		return "Employee [department=" + department + ", toString()=" + super.toString() + "]";
	}

	@Override
	public double Payroll() {
		return this.getCoefficientsSalary() * 1250000;
	}
	
	
}
