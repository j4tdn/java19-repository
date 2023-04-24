package excercise1;

import java.util.Scanner;

import bean.Student;
import bean.Utils;

public class Ex1 {

	public static void main(String[] args) {
		Student s1 = new Student(1, "Nguyen Phu Quang", 9.2f, 8.5f);
		Student s2 = new Student(2, "Lê A", 8.4f, 6.3f);
		Student s3 = new Student();
		inputStudent(s3);
	}
	private static void inputStudent(Student student) {
		Scanner ip = new Scanner(System.in);
		while(true) {

		System.out.println("Nhập id:");
		if (Utils.isInteger(ip.nextLine())) {
			student.setId(Integer.valueOf(ip.nextLine()));
			break;
		}
	}
		

	}
}
