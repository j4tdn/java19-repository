package bean;

public class Manager extends Employee{
	private int numberOfEmployee;
	
	public Manager() {
		// TODO Auto-generated constructor stub
	}


	public Manager(String name, String dateOfBirth, Float salaryCoef, int numberOfEmployee) {
		super(name, dateOfBirth, salaryCoef);
		this.numberOfEmployee = numberOfEmployee;
	}

	public int getNumberOfEmployee() {
		return numberOfEmployee;
	}

	public void setNumberOfEmployee(int numberOfEmployee) {
		this.numberOfEmployee = numberOfEmployee;
	}

	@Override
	public String toString() {
		return super.toString()+"Manager [numberOfEmployee=" + numberOfEmployee + "]";
	}
	
	@Override
	public Float salary() {
	return this.getSalaryCoef()*2200000;
}
}
