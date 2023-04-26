package ex03;

public class Staff extends Person {

	private String departmentName;

	public Staff() {
		// TODO Auto-generated constructor stub
	}

	public Staff(String name, String dateOfBirth, float coefSalary, String departmentName) {
		super(name, dateOfBirth, coefSalary);
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
		return super.toString() + "departmentName=" + departmentName + "]";
	}

	@Override
	public Float salary() {
		return this.getCoefSalary() * 1250000;
	}

}
