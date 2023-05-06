package ex04;

import java.sql.Date;

public class CEO extends Personel{
	
	private float coefficientJob;
	
	public CEO(String name, String dateOfBirth, float coefficientsSalary, float coefficientJob) {
		super(name, dateOfBirth, coefficientsSalary);
		this.coefficientJob = coefficientJob;
	}
	public float getCoefficientJob() {
		return coefficientJob;
	}
	public void setCoefficientJob(float coefficientJob) {
		this.coefficientJob = coefficientJob;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "CEO [" + super.toString() + " Hệ số chức vụ: " + coefficientJob + "]";
	}
	@Override
	public double calSalary() {
		// TODO Auto-generated method stub
		return (this.getCoefficientsSalary()+this.coefficientJob)*3000000;
	}
}
