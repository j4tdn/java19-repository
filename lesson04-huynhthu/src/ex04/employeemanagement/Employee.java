package ex04.employeemanagement;

public class Employee extends GeneralInfo {
	private String departmentName;

	public Employee() {
	}

	public Employee(String name, String dayOfBirth, float coefficientsSalary, String departmentName) {
		super(name, dayOfBirth, coefficientsSalary);
		this.departmentName = departmentName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
    

	@Override
	public String toString() {
		return "Employee [departmentName=" + departmentName + ", toString()=" + super.toString() + "]";
	}

	@Override
	float salary() {
        return this.getCoefficientsSalary() * 1250000;		
	}

}
