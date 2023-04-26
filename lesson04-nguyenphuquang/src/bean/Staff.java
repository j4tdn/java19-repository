package bean;

public class Staff extends Employee {
private String department;

public Staff() {
	// TODO Auto-generated constructor stub
}


public Staff(String name, String dateOfBirth, Float salaryCoef, String department) {
	super(name, dateOfBirth, salaryCoef);
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
	return super.toString() + "Staff [department=" + department + "]";
}

@Override
	public Float salary() {
	return this.getSalaryCoef()*1250000;
}

}
