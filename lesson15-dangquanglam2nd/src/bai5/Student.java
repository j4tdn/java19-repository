package bai5;

public class Student {
	private String id;
	private String name;
	private double averageScore;
	private String gender;

	public Student(String id, String name, double averageScore, String gender) {
		this.id = id;
		this.name = name;
		this.averageScore = averageScore;
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

	public double getAverageScore() {
		return averageScore;
	}

	public void setAverageScore(double averageScore) {
		this.averageScore = averageScore;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", averageScore=" + averageScore
				+ ", gender='" + gender + '\'' + '}';
	}
}
