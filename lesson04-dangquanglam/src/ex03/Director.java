package ex03;

public class Director extends Person {

	private Float jobCoefficient;

	public Director() {
		// TODO Auto-generated constructor stub
	}

	public Director(String name, String dateOfBirth, float coefSalary, Float jobCoefficient) {
		super(name, dateOfBirth, coefSalary);
		this.jobCoefficient = jobCoefficient;
	}

	public Float getJobCoefficient() {
		return jobCoefficient;
	}

	public void setJobCoefficient(Float jobCoefficient) {
		this.jobCoefficient = jobCoefficient;
	}

	@Override
	public String toString() {
		return super.toString() + "jobCoefficient=" + jobCoefficient + "]";
	}

	@Override
	public Float salary() {
		return (this.getCoefSalary() + this.getJobCoefficient()) * 3000000;
	}

}
