package personelmanager;

public class Director extends Person{
	private float jobCoefficient;
	
	public Director(String name, String dateOfBirth, float coefficientsSalary, float jobCoefficient) {
		super(name, dateOfBirth, coefficientsSalary);
		this.jobCoefficient = jobCoefficient;
	}

	public float getJobCoefficient() {
		return jobCoefficient;
	}

	public void setJobCoefficient(float jobCoefficient) {
		this.jobCoefficient = jobCoefficient;
	}

	@Override
	public String toString() {
		return "Director [jobCoefficient=" + jobCoefficient + ", toString()=" + super.toString() + "]";
	}

	@Override
	public double Payroll() {
		return this.getCoefficientsSalary() * 3000000;
	}
	
}
