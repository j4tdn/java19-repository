package ex01;

public class Student {
	private int id;
	private String fullName;
	private float practicePoint;
	private float theoreticalPoint;
	
	public Student() {
	}

	public Student(int id, String fullName, float practicePoint, float theoreticalPoint) {
		this.id = id;
		this.fullName = fullName;
		this.practicePoint = practicePoint;
		this.theoreticalPoint = theoreticalPoint;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public float getPracticePoint() {
		return practicePoint;
	}

	public void setPracticePoint(float practicePoint) {
		this.practicePoint = practicePoint;
	}

	public float getTheoreticalPoint() {
		return theoreticalPoint;
	}

	public void setTheoreticalPoint(float theoreticalPoint) {
		this.theoreticalPoint = theoreticalPoint;
	}
	
	public float  avgPoint(){
		return (this.practicePoint + this.theoreticalPoint)/2;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", fullName=" + fullName + ", practicePoint=" + practicePoint
				+ ", theoreticalPoint=" + theoreticalPoint + ", getAvgPoint()=" + avgPoint() + "]" + "\n";
	}

	
	
	
	
	
	
}
