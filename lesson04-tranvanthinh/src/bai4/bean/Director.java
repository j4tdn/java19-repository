package bai4.bean;

import java.time.LocalDate;

public class Director extends Personnel {
	private float coefficientPosition;

	public Director() {
		super();
	}

	public Director(String name, LocalDate dateOfBirth, float coefficient, float coefficientPosition) {
		super(name, dateOfBirth, coefficient);
		this.coefficientPosition = coefficientPosition;
	}

	public float getCoefficientPosition() {
		return coefficientPosition;
	}

	public void setCoefficientPosition(float coefficientPosition) {
		this.coefficientPosition = coefficientPosition;
	}
	
	@Override
	public double calcSalary() {
		return (super.calcSalary() + this.getCoefficientPosition()) * 3000000;
	}

	@Override
	public String toString() {
		return "Director[" + super.toString() + ", coefficientPosition=" + coefficientPosition + "]";
	}
	
	
}
