package ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StudentManagmentApp {
	public static void main(String[] args) {

		// 1. sv1 chứa thông tin của chính mình
		Student sv1 = new Student(7, "tran trung tin", 8.5f, 9f);

		// 2. sv2 là thông tin người bạn thân nhất của em
		Student sv2 = new Student(10, "Francesco Totti", 9.5f, 9f);

		// 3. sv3 tạo bằng constructor mặc định. Tạo hàm nhập các thông tin cho sv3 từ
		// bàn phím sau
		// đó dùng setter để gán các thuộc tính tương ứng.
		Student sv3 = new Student();

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter sv3's id: ");
		int id = Integer.parseInt(sc.nextLine());
		sv3.setId(id);

		System.out.print("Enter sv3's full name: ");
		String fullName = sc.nextLine();
		sv3.setFullName(fullName);

		System.out.print("Enter sv3's practicePoint: ");
		float practicePoint = Float.parseFloat(sc.nextLine());
		sv3.setPracticePoint(practicePoint);

		System.out.print("Enter sv3's theoreticalPoint: ");
		float theoreticalPoint = Float.parseFloat(sc.nextLine());
		sv3.setTheoreticalPoint(theoreticalPoint);

		List<Student> studentList = new ArrayList<Student>();
		studentList.add(sv1);
		studentList.add(sv2);
		studentList.add(sv3);

		// sinh viên có điểm trung bình lớn hơn 8.5
		System.out.println("\n===============================\n");

		System.out.println("sinh viên có điểm trung bình lớn hơn 8.5: " + "\n"  + "\n" + findStudentByAvgPoint(studentList));

		System.out.println("\n===============================\n");

		// sinh viên có điểm LT lớn hơn điểm TH

		System.out.println("sinh viên có điểm LT lớn hơn điểm TH: "+ "\n" + "\n" + findStudentByPoint(studentList));
	}

	// 4. Viết hàm tìm thông tin sinh viên có điểm trung bình lớn hơn 8.5
	private static List<Student> findStudentByAvgPoint(List<Student> studentList) {
		List<Student> result = new ArrayList<Student>();
		for (Student student : studentList) {
			if (student.avgPoint() > 8.5f) {
				result.add(student);
			}
		}
		return result;
	}

	// 5. Viết hàm tìm thông tin sinh viên có điểm LT lớn hơn điểm TH
	private static List<Student> findStudentByPoint(List<Student> studentList) {
		List<Student> result = new ArrayList<Student>();
		for (Student student : studentList) {
			if (student.getTheoreticalPoint() > student.getPracticePoint()) {
				result.add(student);
			}
		}
		return result;
	}
}
