package studentmanagement;

public class Student {
	private int idStudent;
	private String name;
	private float theoreticalPoint;
	private float practicPoint;
	public Student() {
	}
	public Student(int idStudent, String name, float theoreticalPoint, float practicPoint) {
		super();
		this.idStudent = idStudent;
		this.name = name;
		this.theoreticalPoint = theoreticalPoint;
		this.practicPoint = practicPoint;
	}
	public int getIdStudent() {
		return idStudent;
	}
	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getTheoreticalPoint() {
		return theoreticalPoint;
	}
	public void setTheoreticalPoint(float theoreticalPoint) {
		this.theoreticalPoint = theoreticalPoint;
	}
	public float getPracticPoint() {
		return practicPoint;
	}
	public void setPracticPoint(float practicPoint) {
		this.practicPoint = practicPoint;
	}
	
	public float mediumScore() {
		return (this.theoreticalPoint+this.practicPoint)/2;
	}
	@Override
	public String toString() {
		return "Student [idStudent=" + idStudent + ", name=" + name + ", theoreticalPoint=" + theoreticalPoint
				+ ", practicPoint=" + practicPoint + "]";
	}
	
}
