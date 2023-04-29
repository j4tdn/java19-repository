package ex04;

import java.sql.Date;

public class Employee extends HRMember{
	private String department;

	public Employee(String fullName, String birthday, float salaryCoefficient, String department) {
		super(fullName, birthday, salaryCoefficient);
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
		return "Employee [" + super.toString() + "department=" + department+ "]";
	}

	//Nhân viên: Lương = (hệ số lương + hệ số chức vụ(nếu có)) * 1250000
	@Override
	double getSalary() {
		return (super.getSalaryCoefficient())*1250000;
	}
	
	
	
}
