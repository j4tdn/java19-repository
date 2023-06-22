package ex01;

import java.util.Arrays;

public class Ex01 {
	static class Student {
		int id;
		String name;
		Grade grade;

		private Student() {
			// TODO Auto-generated constructor stub
		}

		public Student(int id, String name, Grade grade) {
			super();
			this.id = id;
			this.name = name;
			this.grade = grade;
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

		public Grade getGrade() {
			return grade;
		}

		public void setGrade(Grade grade) {
			this.grade = grade;
		}

		@Override
		public String toString() {
			return "\nStudent [id=" + id + ", name=" + name + ", grade=" + grade + "]\n";
		}

	}

	private static Student[] getStudentsWithGrade(Student[] students, Grade grade) {
		Student[] result = new Student[students.length];
		int count = 0;
		for (Student student : students) {
			if (student.grade == grade) {
				result[count++] = student;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

	private static Student[] getStudentLearnAgain(Student[] students) {
		Student[] result = new Student[students.length];
		int[] id = new int[students.length];
		int[] temp = new int[students.length];
		int runningId = 0;
		int runningCheck = 0;
		int runningResult = 0;
		int count = 0;
		for (Student student : students) {
			id[runningId++] = student.id;
		}

		Arrays.sort(id);
		for (int i = 1; i < id.length; i++) {
			if (id[i] == id[i - 1]) {
				count++;
			} else {
				if (count >= 1) {
					temp[runningCheck++] = id[i - 1];
				}
				count = 0;
			}
		}
		temp = Arrays.copyOfRange(temp, 0, runningCheck);
		int i = 0;
		while (true) {
			for (Student student : students) {
				if (student.id == temp[i]) {
					result[runningResult++] = student;
					i++;
					if (i >= temp.length)
						return Arrays.copyOfRange(result, 0, runningResult);
				}
			}
		}
	}
	public static void main(String[] args) {
		Student[] students = { 
				new Student(102, "Nam", Grade.A), 
				new Student(104, "Hoàng", Grade.D),
				new Student(109, "Lan", Grade.A), 
				new Student(103, "Bảo", Grade.F), 
				new Student(105, "Nguyên", Grade.B),
				new Student(107, "Vũ", Grade.F), 
				new Student(103, "Bảo", Grade.F), 
				new Student(202, "Đạt", Grade.C),
				new Student(107, "Vũ", Grade.C), 
				new Student(193, "Bảo", Grade.B), 
				new Student(199, "Tài", Grade.A) 
		};
		System.out.println(Arrays.toString(getStudentsWithGrade(students, Grade.A)));
	}
}
