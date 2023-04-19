package ex04.model;

/**
 * @author USER
 *
 */
public class Person {

	private String name;
	private String dateOfBirth;
	private float coefSalary;

	public Person() {
	}

	public Person(String name, String dateOfBirth, float coefSalary) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.coefSalary = coefSalary;
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

	public float getCoefSalary() {
		return coefSalary;
	}

	public void setCoefSalary(float coefSalary) {
		this.coefSalary = coefSalary;
	}

	@Override
	public String toString() {
		return "Name:" + name + ", DateOfBirth: " + dateOfBirth + ", CoefSalary:" + coefSalary;
	}
	
	

}
