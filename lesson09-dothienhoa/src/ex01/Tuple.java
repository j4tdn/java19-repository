package ex01;

public class Tuple {
	private Student student;
	private int count;

	public Tuple() {
	}

	public Tuple(Student student, int count) {
		this.student = student;
		this.count = count;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void increase() {
		setCount(getCount() + 1);
	}

}
