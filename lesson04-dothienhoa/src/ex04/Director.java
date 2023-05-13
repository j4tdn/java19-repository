package ex04;

public class Director extends Person {
	private float jobCoefficient;

	public Director() {
	}

	public Director(String name, String dayOfBirth, float coefficientsSalary, float jobCoefficient) {
		super(name, dayOfBirth, coefficientsSalary);
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

}
