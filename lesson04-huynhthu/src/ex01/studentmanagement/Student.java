package ex01.studentmanagement;

public class Student {
    private int id;
    private String name;
    private float theory;
    private float practice;
    
    public Student() {
	}

	public Student(int id, String name, float theory, float practice) {
		super();
		this.id = id;
		this.name = name;
		this.theory = theory;
		this.practice = practice;
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

	public float getTheory() {
		return theory;
	}

	public void setTheory(float theory) {
		this.theory = theory;
	}

	public float getPractice() {
		return practice;
	}

	public void setPractice(float practice) {
		this.practice = practice;
	}
    
	public float averagepoint() {
		return (this.theory + this.practice )/ 2;
	}

	@Override
	public String toString() {
		return "Student {[id=" + id + ", name=" + name + ", theory=" + theory + ", practice=" + practice + "]}\n";
	}
	
	
	
	
}
