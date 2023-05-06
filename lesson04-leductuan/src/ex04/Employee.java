package ex04;

import java.sql.Date;

public class Employee extends Personel{
	private String departmentName;

	public Employee(String name, String dateOfBirth, float coefficientsSalary, String departmentName) {
		super(name, dateOfBirth, coefficientsSalary);
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
		// TODO Auto-generated method stub
		return "Employee [" + super.toString() + " : Tên phòng ban: " + departmentName + "]";
	}
	@Override
	public double calSalary() {
		// TODO Auto-generated method stub
		return this.getCoefficientsSalary()*1250000;
	}
}
