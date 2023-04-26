package bai4.bean;

import java.time.LocalDate;

public class Employee extends Personnel {
	private String unit;

	public Employee() {
		super();
	}

	public Employee(String name, LocalDate dateOfBirth, float coefficientSalary, String unit) {
		super(name, dateOfBirth, coefficientSalary);
		this.unit = unit;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	@Override
	public double calcSalary() {
		return super.calcSalary() * 3000000;
	}

	@Override
	public String toString() {
		return "Employee [" + super.toString() + ", unit=" + unit + "]";
	}
	
	
	
}
