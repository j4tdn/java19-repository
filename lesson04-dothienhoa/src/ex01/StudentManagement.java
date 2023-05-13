package ex01;

import java.util.Arrays;
import java.util.Scanner;

public class StudentManagement {
	public static void main(String[] args) {
		Student sv1 = new Student(1, "Do Thien Hoa", 7.5f, 8.0f);
		Student sv2 = new Student(2, "Nguyen Viet Thanh Huyen", 8.5f, 9.0f);
		Student sv3 = new Student();
		inputInfo(sv3);

		Student[] students = { sv1, sv2, sv3 };
		System.out.println(Arrays.toString(gpaGreaterThan(students)));
		System.out.println(Arrays.toString(ltMarkGreatThanThMark(students)));
	}

	public static Student[] gpaGreaterThan(Student[] students) {
		Student[] result = new Student[students.length];
		int running = 0;
		for (Student student : students) {
			float mark = (student.getThMark() + student.getLtMark()) / 2;
			if (mark > 8.5) {
				result[running++] = student;
			}
		}
		return Arrays.copyOfRange(result, 0, running);
	}

	public static Student[] ltMarkGreatThanThMark(Student[] students) {
		Student[] result = new Student[students.length];
		int running = 0;
		for (Student student : students) {
			if (student.getLtMark() > student.getThMark()) {
				result[running++] = student;
			}
		}
		return Arrays.copyOfRange(result, 0, running);
	}

	public static void inputInfo(Student sv) {
		Scanner scanner = new Scanner(System.in);
		sv.setId(3);
		System.out.print("Nhập Name : ");
		String name = scanner.nextLine();
		sv.setName(name);
		System.out.print("\nNhap vao diem ly thuyet : ");
		float ltmark = scanner.nextFloat();
		sv.setLtMark(ltmark);
		System.out.print("\nNhap vao diem thuc hanh : ");
		float thmark = scanner.nextFloat();
		sv.setThMark(thmark);
	}

}
