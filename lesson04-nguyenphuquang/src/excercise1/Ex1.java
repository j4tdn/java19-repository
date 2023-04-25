package excercise1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import bean.Student;
import bean.StudentUtils;
import bean.Utils;

public class Ex1 {

	public static void main(String[] args) {
		Student s1 = new Student(1, "Nguyễn Phú Quang", 9.2f, 8.5f);
		Student s2 = new Student(2, "Lê A", 8.4f, 6.3f);
		Student s3 = new Student();
		inputStudent(s3);
		Student[] list = {s1,s2,s3};

		System.out.println("Sinh viên có Điểm Trung Bình > 8.5: \n" + Arrays.toString(avgScoreMoreThan(list, 8.5f)));
		System.out.println("Sinh viên có Điểm Lí Thuyết > Điểm Thực Hành: \n" + Arrays.toString(theoreScoreMoreThanPracScore(list)));
	}
	private static void inputStudent(Student student) {
		Scanner ip = new Scanner(System.in);
		while(true) {

		System.out.println("Nhập id ");
		String input = ip.nextLine();
		if (Utils.isInteger(input)) {
			student.setId(Integer.valueOf(input));
			break;
		}
	}
		System.out.println("nhập tên ");
		String input = ip.nextLine();
		student.setName(input);
		
		while(true) {

		System.out.println("Nhập điểm LT ");
		input = ip.nextLine();
		if (Utils.isFloat(input)) {
			student.setTheoreticalScore(Float.valueOf(input));
			break;
		}
	}
		while(true) {
			
			System.out.println("Nhập điểm TH ");
			input = ip.nextLine();
			if (Utils.isFloat(input)) {
				student.setPracticeScore(Float.valueOf(input));
				break;
			}
		}
		System.out.println("Thông tin sinh viên là:\n" + student);
	}
	private static Student[] avgScoreMoreThan(Student[] students, Float score) {
		Student[] result = new Student[students.length];
		int running = 0; 
		for (Student student : students) {
			if (StudentUtils.averageScore(student) > score) {
				result[running++] = student;
			}
		}
		return Arrays.copyOfRange(result, 0, running);
	}

	private static Student[] theoreScoreMoreThanPracScore(Student[] students) {
		Student[] result = new Student[students.length];
		int running = 0;
		for (Student student : students) {
			if (student.getTheoreticalScore() > student.getPracticeScore()) {
				result[running++] = student;
			}
		}
		return Arrays.copyOfRange(result, 0, running);
	}
}