package ex01;

import java.util.List;
import java.util.Scanner;

public class StudentUtils {

	private StudentUtils() {
	}

	public static Student inputStudent(Student student) {
		Scanner sc = new Scanner(System.in);
		String stdID;
		String name;
		String diemLT;
		String diemTH;
		do {
			System.out.print("Enter StudentID: ");
			 stdID = sc.nextLine();			
		} while(!Validation.isValidID(stdID));
		student.setStudentID(Integer.parseInt(stdID));
		do {
			System.out.print("Enter name: ");
			name = sc.nextLine();
		} while(!Validation.isValidName(name));
		student.setName(Validation.normalizeName(name));
		do {
			System.out.print("Enter diemLT: ");
			diemLT = sc.nextLine();
		} while(!Validation.isValidScore(diemLT));
		student.setDiemLT(Float.parseFloat(diemLT));
		do {
			System.out.print("Enter diemTH: ");
			diemTH = sc.nextLine();
		} while(!Validation.isValidScore(diemTH));
		student.setDiemTH(Float.parseFloat(diemTH));
		sc.close();
		return student;
	}

	public static void printStudent(List<Student> students) {
		students.stream().forEach(System.out::println);
	}

}
