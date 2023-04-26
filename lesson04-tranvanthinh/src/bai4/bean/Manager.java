package bai4.bean;

import java.time.LocalDate;

public class Manager extends Personnel{
	private int amountOfEmployee;

	public Manager() {
		super();
	}

	public Manager(String name, LocalDate dateOfBirth, float coefficientSalary, int amountOfEmployee) {
		super(name, dateOfBirth, coefficientSalary);
		this.amountOfEmployee = amountOfEmployee;
	}

	public int getAmountOfEmployee() {
		return amountOfEmployee;
	}

	public void setAmountOfEmployee(int amountOfEmployee) {
		this.amountOfEmployee = amountOfEmployee;
	}
	
	@Override
	public double calcSalary() {
		return super.calcSalary() * 2200000;
	}

	@Override
	public String toString() {
		return "Manager ["+ super.toString() +", amountOfEmployee=" + amountOfEmployee + "]";
	}
	
	
	
}
