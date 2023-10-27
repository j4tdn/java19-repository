package bean;

import java.util.Objects;

public class Student {
	private int id;
	private String name;
	private double averagePoint;
	private String gender;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, double averagePoint, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.averagePoint = averagePoint;
		this.gender = gender;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAveragePoint() {
		return averagePoint;
	}
	public void setAveragePoint(double averagePoint) {
		this.averagePoint = averagePoint;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", averagePoint=" + averagePoint + ", gender=" + gender + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(averagePoint, gender, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id;
	}
	
}