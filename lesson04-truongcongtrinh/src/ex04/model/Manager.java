package ex04.model;

public class Manager extends Person {
	private float coefJob;

	public Manager() {
	}

	public Manager(String name, String dateOfBirth, float coefSalary, float coefJob) {
		super(name, dateOfBirth, coefSalary);
		this.coefJob = coefJob;
	}

	public float getCoefJob() {
		return coefJob;
	}

	public void setCoefJob(float coefJob) {
		this.coefJob = coefJob;
	}

	@Override
	public String toString() {
		return "Manager [" + super.toString() + " CoefJob: " + coefJob + "]";
	}

	
	
}
