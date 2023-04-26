package bean;

import java.util.Arrays;

public abstract class Employee {
private String name;
private String dateOfBirth;
private Float salaryCoef;

public Employee() {

}


public Employee(String name, String dateOfBirth, Float salaryCoef) {
	super();
	this.name = name;
	this.dateOfBirth = dateOfBirth;
	this.salaryCoef = salaryCoef;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}


public String getDateOfBirth() {
	return dateOfBirth;
}


public void setDateOfBirth(String dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}


public Float getSalaryCoef() {
	return salaryCoef;
}

public void setSalaryCoef(Float salaryCoef) {
	this.salaryCoef = salaryCoef;
}

@Override
public String toString() {
	return "Employee [name=" + name + ", dateOfBirth=" + dateOfBirth + ", salaryCoef=" + salaryCoef + "]";
}

public abstract Float salary();

}
