package ex01;

import java.util.Arrays;

public class Ex01StudentManagement {

	public static void main(String[] args) {
		Student[] students = { new Student(102, "Nam", Rank.C), new Student(103, "Bảo", Rank.F),
				new Student(104, "Hoàng", Rank.D), new Student(105, "Nguyên", Rank.B), new Student(107, "Vũ", Rank.F),
				new Student(109, "Lan", Rank.A), new Student(202, "Đạt", Rank.C), new Student(103, "Bảo", Rank.F),
				new Student(107, "Vũ", Rank.C), new Student(104, "Hoàng", Rank.B) };
		System.out.println("Tìm danh sách sinh viên từng đạt loại A trong năm 2021.");
		System.out.println(Arrays.toString(getStudent(students)));
		System.out.println("=================================");
		System.out.println("Tìm danh sách sinh viên đã tham gia học lại môn cấu trúc dữ liệu trong năm 2021.");
		System.out.println(Arrays.toString(getStudentLearnAgain(students)));
	}

	private static Student[] getStudent(Student[] students) {
		Student[] results = new Student[students.length];
		int running = 0;
		for (Student student : students) {
			if (student.getRank().equals(Rank.A)) {
				results[running++] = student;
			}
		}
		return Arrays.copyOfRange(results, 0, running);
	}

	private static Student[] getStudentLearnAgain(Student[] students) {
		Tuple[] results = new Tuple[students.length];
		int running = 0;
		for (Student student : students) {
			if (contain(student, results, running)) {
				continue;
			}
			Tuple tuple = new Tuple(student, 1);
			results[running++] = tuple;
		}
		Student[] finalResult = new Student[running];
		running = 0;
		for (Tuple tuple : results) {
			if (tuple != null && tuple.getCount() > 1) {
				finalResult[running++] = tuple.getStudent();
			}
		}
		return Arrays.copyOfRange(finalResult, 0, running);
	}

	private static boolean contain(Student student, Tuple[] results, int running) {
		for (int i = 0; i < running; i++) {
			if (results[i] != null && results[i].getStudent().getId() == student.getId()) {
				results[i].increase();
				return true;
			}
		}
		return false;
	}
}
