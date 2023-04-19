package ex01;

import java.util.ArrayList;
import java.util.List;

public class StudentDemo {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();
		Student sv1 = new Student(1, "Truong Cong Trinh", 9.8f, 8.8f);
		Student sv2 = new Student(2, "Nguyen Van A", 9.4f, 9.6f);
		students.add(sv1);
		students.add(sv2);

		Student sv3 = new Student();
		StudentUtils.inputStudent(sv3);
		students.add(sv3);

		StudentUtils.printStudent(searchStudentByAverage(students));

		StudentUtils.printStudent(searchStudentByLTTH(students));

	}

	public static List<Student> searchStudentByAverage(List<Student> students) {
		System.out.println("\n<--------Student have average greater than 8.5-------->");
		List<Student> searchedList = new ArrayList<>();
		for (Student student : students) {
			if (student.calAverage() > 8.5)
				searchedList.add(student);
		}
		return searchedList;
	}

	public static List<Student> searchStudentByLTTH(List<Student> students) {
		System.out.println("\n<--------Student have diemLT > diemTH-------->");
		List<Student> searchedList = new ArrayList<>();
		for (Student student : students) {
			if (student.getDiemLT() > student.getDiemTH())
				searchedList.add(student);
		}
		return searchedList;
	}

}
