package bai1;

public class Student {
	private String id;
	private String name;
	private double theoreticalPoint;
	private double practicePoint;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String id, String name, double theoreticalPoint, double practicePoint) {
		this.id = id;
		this.name = name;
		this.theoreticalPoint = theoreticalPoint;
		this.practicePoint = practicePoint;
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

	public double getTheoreticalPoint() {
		return theoreticalPoint;
	}

	public void setTheoreticalPoint(double theoreticalPoint) {
		this.theoreticalPoint = theoreticalPoint;
	}

	public double getPracticePoint() {
		return practicePoint;
	}

	public void setPracticePoint(double practicePoint) {
		this.practicePoint = practicePoint;
	}

	@Override
	public String toString() {
		return "/nStudent [id=" + id + ", name=" + name + ", theoreticalPoint=" + theoreticalPoint + ", practicePoint="
				+ practicePoint + "]";
	}
	
	public double averagePoint() {
		return (this.practicePoint + this.theoreticalPoint)/2;
	}
	
}
