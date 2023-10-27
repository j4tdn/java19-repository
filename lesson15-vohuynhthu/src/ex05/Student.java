package ex05;

public class Student {
    int id;
    String name;
    double gpa;
    String sex;
    
    public Student() {
	}

	public Student(int id, String name, double gpa, String sex) {
		super();
		this.id = id;
		this.name = name;
		this.gpa = gpa;
		this.sex = sex;
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

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gpa=" + gpa + ", sex=" + sex + "]";
	}
    
    
    
}
