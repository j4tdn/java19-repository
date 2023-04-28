package ex01;

public class Student {
	private int msv;
	private String name;
	private float theoryPoint;
	private float practicePoint;
	
	public Student() {
	}

	public Student(int msv, String name, float theoryPoint, float practicePoint) {
		this.msv = msv;
		this.name = name;
		this.theoryPoint = theoryPoint;
		this.practicePoint = practicePoint;
	}

	public int getMsv() {
		return msv;
	}

	public void setMsv(int msv) {
		this.msv = msv;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getTheoryPoint() {
		return theoryPoint;
	}

	public void setTheoryPoint(float theoryPoint) {
		this.theoryPoint = theoryPoint;
	}

	public float getPracticePoint() {
		return practicePoint;
	}

	public void setPracticePoint(float practicePoint) {
		this.practicePoint = practicePoint;
	}

	@Override
	public String toString() {
		return "Student [msv=" + msv + ", name=" + name + ", theoryPoint=" + theoryPoint + ", practicePoint="
				+ practicePoint + "]\n";
	}
	
	public float averagePoint() {
		return (this.practicePoint + this.theoryPoint)/2;
	}
	
}
