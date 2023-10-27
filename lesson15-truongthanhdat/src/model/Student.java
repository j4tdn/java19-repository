package model;

public class Student {
	private String id;
	private String name;
	private double gpa;
	private String gender;

	public Student() {
	}

	public Student(String id, String name, double gpa, String gender) {
		this.id = id;
		this.name = name;
		this.gpa = gpa;
		this.gender = gender;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gpa=" + gpa + ", gender=" + gender + "]";
	}

}
