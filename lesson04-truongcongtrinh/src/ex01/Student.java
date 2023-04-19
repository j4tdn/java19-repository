package ex01;

public class Student {
	
	private int studentID;
	private String name;
	private float diemLT;
	private float diemTH;
	
	public Student() {
	}

	public Student(int studentID, String name, float diemLT, float diemTH) {
		this.studentID = studentID;
		this.name = name;
		this.diemLT = diemLT;
		this.diemTH = diemTH;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getDiemLT() {
		return diemLT;
	}

	public void setDiemLT(float diemLT) {
		this.diemLT = diemLT;
	}

	public float getDiemTH() {
		return diemTH;
	}

	public void setDiemTH(float diemTH) {
		this.diemTH = diemTH;
	}
	
	public float calAverage() {
		return (diemLT + diemTH) / 2.f;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", name=" + name + ", diemLT=" + diemLT + ", diemTH=" + diemTH + " Average= " + this.calAverage() + "]";
	}
	
	
	
	
	
	
	
	
	
}
