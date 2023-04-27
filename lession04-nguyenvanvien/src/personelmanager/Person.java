package personelmanager;

abstract public class Person {
	private String name;
	private String dateOfBirth;
	private float coefficientsSalary;
	
	public Person(String name, String dateOfBirth, float coefficientsSalary) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.coefficientsSalary = coefficientsSalary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public float getCoefficientsSalary() {
		return coefficientsSalary;
	}
	public void setCoefficientsSalary(float coefficientsSalary) {
		this.coefficientsSalary = coefficientsSalary;
	}
	@Override
	public String toString() {
		return ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", coefficientsSalary=" + coefficientsSalary
				+ "]";
	}
	
	public abstract double Payroll();
}
