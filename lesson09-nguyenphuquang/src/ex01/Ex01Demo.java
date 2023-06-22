package ex01;

import java.util.Arrays;

public class Ex01Demo {

	public static void main(String[] args) {

		Student[] students = { new Student(102, "Nam", Score.C), new Student(103, "Bảo", Score.F),
				new Student(104, "Hoàng", Score.D), new Student(105, "Nguyên", Score.B),
				new Student(107, "Vũ", Score.F), new Student(109, "Lan", Score.A), new Student(202, "Đạt", Score.C),
				new Student(103, "Bảo", Score.F), new Student(107, "Vũ", Score.C), new Student(104, "Hoàng", Score.B) };

		Student[] AScore = getStudents(students, Score.A);
		System.out.println("Students who got A score:");
		for (Student student : AScore) {

			System.out.println(student);
		}
		Student[] FScore = getStudents(students);
		System.out.println("Students who re-taked the course:");
		for (Student student : FScore) {

			System.out.println(student);
		}

	}

	public static Student[] getStudents(Student[] students, Score score) {
		Student[] result = new Student[students.length];
		Student[] resultFinal = null;
		int running = 0;
		for (Student student : students) {
			if (student.score.equals(score)) {
				result[running++] = student;
			}
			resultFinal = Arrays.copyOfRange(result, 0, running);
		}
		return resultFinal;

	}

	public static Student[] getStudents(Student[] students) {
		Student[] result = new Student[students.length];
		Student[] resultFinal = null;
		int running = 0;
		for (int i = 0; i < students.length; i++) {
			for (int j = i + 1; j < students.length; j++) {
				if (students[i].getId() == students[j].getId()) {
					result[running++] = students[i];
				}
			}
		}
		resultFinal = Arrays.copyOfRange(result, 0, running);
		return resultFinal;

	}

}
