package ex04.employeemanagement;

public abstract class GeneralInfo {
	private String name;
	private String dayOfBirth;
	private float coefficientsSalary;
	
	public GeneralInfo() {
	}

	public GeneralInfo(String name, String dayOfBirth, float coefficientsSalary) {
		super();
		this.name = name;
		this.dayOfBirth = dayOfBirth;
		this.coefficientsSalary = coefficientsSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDayOfBirth() {
		return dayOfBirth;
	}

	public void setDayOfBirth(String dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}

	public float getCoefficientsSalary() {
		return coefficientsSalary;
	}

	public void setCoefficientsSalary(float coefficientsSalary) {
		this.coefficientsSalary = coefficientsSalary;
	}
    abstract float salary();
	
	@Override
	public String toString() {
		return "GeneralInfo [name=" + name + ", dayOfBirth=" + dayOfBirth + ", coefficientsSalary=" + coefficientsSalary
				+ "]";
	}
	
	
}
