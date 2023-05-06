package ex04;

import java.sql.Date;

public class Manager extends Personel {
	private int numEmployee;

	public Manager(String name, String dateOfBirth, float coefficientsSalary, int numEmployee) {
		super(name, dateOfBirth, coefficientsSalary);
		this.numEmployee = numEmployee;
	}

	public int getNumEmployee() {
		return numEmployee;
	}

	public void setNumEmployee(int numEmployee) {
		this.numEmployee = numEmployee;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Manager [" + super.toString() + " : Số lượng nhân viên quản lí: " + numEmployee + "]";
	}
	@Override
	public double calSalary() {
		return this.getCoefficientsSalary()*2200000;
	}
}
