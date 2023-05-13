package ex04;

public class Person {
	private String name;
	private String dayOfBirth;
	private float coefficientsSalary;

	public Person() {
	}

	public Person(String name, String dayOfBirth, float coefficientsSalary) {
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

	@Override
	public String toString() {
		return "Person [name=" + name + ", dayOfBirth=" + dayOfBirth + ", coefficientsSalary=" + coefficientsSalary
				+ "]";
	}
	
	

}
