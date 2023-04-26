package bai4;

public class Person {
	String name;
	String birthday;
	double coefficientsSalary;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String name, String birthday, double coefficientsSalary) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.coefficientsSalary = coefficientsSalary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public double getCoefficientsSalary() {
		return coefficientsSalary;
	}
	public void setCoefficientsSalary(double coefficientsSalary) {
		this.coefficientsSalary = coefficientsSalary;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", birthday=" + birthday + ", coefficientsSalary=" + coefficientsSalary + "]";
	}
	
}
