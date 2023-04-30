package ex01.studentmanagement;

import java.util.Arrays;

public class StudentManagementDemo extends Student {
	public static void main(String[] args) {
		Student s1 = new Student(1, "Thu", 9f, 9f);
		Student s2 = new Student(2, "Mai", 7.5f, 7f);
		Student s3 = new Student();
		s3.setId(3);
		s3.setName("Quynh");
		s3.setTheory(9.5f);
		s3.setPractice(6f);		

		Student[] students = { s1, s2, s3 };
		// Tim thong tin sinh vien co diem trung binh lon hon 8.5
        Student[] studentByAverage = findStudentbyaverage(students);
        System.out.println("Students have average point bigger than 8.5 --> " + Arrays.toString(studentByAverage));
		
		
		// Tim thong tin sinh vien co diem LT lon hon diem TH
		Student[] studentByComparing = findStudentbycomparing(students);
		System.out.println("Students have point in therory bigger than the one in pratice --> " + Arrays.toString(studentByComparing));
	}

	public static Student[] findStudentbyaverage(Student[] students) {
		Student[] result = new Student[students.length];
		int running = 0;
		for (Student student : students) {
			if (student.averagepoint() > 8.5) {
				result[running++] = student;

			}
		}
		return Arrays.copyOfRange(result, 0, running);
	}

	public static Student[] findStudentbycomparing(Student[] students) {
		Student[] result = new Student[students.length];
		int running = 0;
		for (Student student : students) {
			if (student.getTheory() > student.getPractice()) {
				result[running++] = student;

			}
		}
		return Arrays.copyOfRange(result, 0, running);
	}

}
