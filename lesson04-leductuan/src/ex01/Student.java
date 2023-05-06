package ex01;

public class Student {
	public int id;
	public String name;
	public float theoryPoint;
	public float pracPoint;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, float theoryPoint, float pracPoint) {
		this.id = id;
		this.name = name;
		this.theoryPoint = theoryPoint;
		this.pracPoint = pracPoint;
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
	public float getPracPoint() {
		return pracPoint;
	}
	public void setPracPoint(float pracPoint) {
		this.pracPoint = pracPoint;
	}
	public float getTheoryPoint() {
		return theoryPoint;
	}
	public void setTheoryPoint(float theoryPoint) {
		this.theoryPoint = theoryPoint;
	}
	public float averagePoint() {
		return (pracPoint + theoryPoint) / 2.f;
	}
	@Override
	public String toString() {
		return "Student (Mã SV= " + this.id + ", Tên= " + this.name + ", Điểm lí thuyết= " + this.theoryPoint + ", Điểm thực hành= "
				+ this.pracPoint +" Điểm trung bình= " + this.averagePoint()+ ")"+"\n";
	}
}
