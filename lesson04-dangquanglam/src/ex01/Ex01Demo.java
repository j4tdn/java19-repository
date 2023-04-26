package ex01;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01Demo {
	public static void main(String[] args) {
		Student s1 = new Student(1, "Dang Quang Lam", 10f, 9.5f);
		Student s2 = new Student(2, "Nguyen Thai Truong", 8.0f, 7.5f);
		Student s3 = new Student();
		inputStudent(s3);
		Student[] list = { s1, s2, s3 };

		System.out.println("Thông tin sinh viên có điểm trung bình lớn hơn 8.5:\n" + Arrays.toString(calAverageScoreMoreThan(list, 8.5f)));
		System.out.println("Thông tin sinh viên có điểm LT lớn hơn điểm TH:\n" + Arrays.toString(theoreticalScoreMoreThanPracticeScore(list)));
	}

	private static void inputStudent(Student student) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Nhập id: ");
			String input = sc.nextLine();
			if (Utils.isInteger(input)) {
				student.setId(Integer.valueOf(input));
				break;
			}
		}
		
		System.out.println("Nhập tên: ");
		String input = sc.nextLine();
		student.setName(input);

		while (true) {
			System.out.println("Nhập điểm LT: ");
			input = sc.nextLine();
			if (Utils.isFloat(input)) {
				student.setDiemLT(Float.valueOf(input));
				break;
			}
		}
		while (true) {
			System.out.println("Nhập điểm TH: ");
			input = sc.nextLine();
			if (Utils.isFloat(input)) {
				student.setDiemTH(Float.valueOf(input));
				break;
			}
		}
		System.out.println("Thông tin sinh viên là:\n" + student);
	}

	//Viết hàm tìm thông tin sinh viên có điểm trung bình lớn hơn 8.5
	private static Student[] calAverageScoreMoreThan(Student[] students, Float score) {
		Student[] result = new Student[students.length];
		int running = 0;
		for (Student student : students) {
			if (student.calAverage() > score) {
				result[running++] = student;
			}
		}
		return Arrays.copyOfRange(result, 0, running);
	}
	
	//Viết hàm tìm thông tin sinh viên có điểm LT lớn hơn điểm TH
	private static Student[] theoreticalScoreMoreThanPracticeScore(Student[] students) {
		Student[] result = new Student[students.length];
		int running = 0;
		for (Student student : students) {
			if (student.getDiemLT() > student.getDiemTH()) {
				result[running++] = student;
			}
		}
		return Arrays.copyOfRange(result, 0, running);
	}
}