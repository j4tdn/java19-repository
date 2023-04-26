package bai4;

public class Director extends Person{
	private double coefficientsPosition;
	
	public Director() {
		// TODO Auto-generated constructor stub
	}
	
	public Director(String name, String birthday, double coefficientsSalary, double coefficientsPosition) {
		super(name, birthday, coefficientsSalary);
		this.coefficientsPosition = coefficientsPosition;
	}

	public double getCoefficientsPosition() {
		return coefficientsPosition;
	}

	public void setCoefficientsPosition(double coefficientsPosition) {
		this.coefficientsPosition = coefficientsPosition;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", coefficientsPosition: "+ coefficientsPosition;
	}
}
