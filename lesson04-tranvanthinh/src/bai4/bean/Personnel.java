package bai4.bean;

import java.time.LocalDate;

public class Personnel {
	private String name;
	private LocalDate dateOfBirth ;
	private float coefficientSalary;
	
	
	public Personnel() {
	}
	
	public Personnel(String name, LocalDate dateOfBirth, float coefficientSalary) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.coefficientSalary = coefficientSalary;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public float getcoefficientSalary() {
		return coefficientSalary;
	}
	
	public void setcoefficientSalary(float coefficientSalary) {
		this.coefficientSalary = coefficientSalary;
	}
	
	public double calcSalary() {
		return this.getcoefficientSalary();
	}

	@Override
	public String toString() {
		return "name=" + name + ", dateOfBirth=" + dateOfBirth + ", coefficientSalary=" + coefficientSalary ;
	}
	
	
	
}
