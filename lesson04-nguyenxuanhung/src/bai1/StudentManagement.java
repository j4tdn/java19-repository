package bai1;

import java.util.Arrays;
import java.util.Scanner;

public class StudentManagement {
	
	public static void main(String[] args) {
		Student student1 = new Student("1", "Xuan Hung", 10, 8);
		Student student2 = new Student("2", "Xuan Hung2", 8, 7);
		Student student3 = new Student();
		inputInfoForStudent(student3);
		
		Student students[] = {student1, student2, student3};
		Student StudentByAveragePoint[] = findStudentsByAveragePoint(students);
		for(Student student: StudentByAveragePoint) {
			System.out.println(student);
		}
		
		System.out.println("===============================");
		
		Student[] studentTheoMoreThanPrac = findStudentsTheoPointMoreThanPracPoint(students);
		for(Student student: studentTheoMoreThanPrac) {
			System.out.println(student);
		}

	}
	
	private static void inputInfoForStudent(Student student) {
		System.out.println("input ID: ");
		Scanner scanner = new Scanner(System.in);
		String id = scanner.nextLine();
		System.out.println("input Name: ");
		String name = scanner.nextLine();
		System.out.println("input theoreticalPoint: ");
		Double theoreticalPoint  = Double.parseDouble(scanner.nextLine());
		System.out.println("input practicePoint: ");
		Double practicePoint  = Double.parseDouble(scanner.nextLine());
		
		student.setId(id);
		student.setName(name);
		student.setTheoreticalPoint(theoreticalPoint);
		student.setPracticePoint(practicePoint);
		
		
	}
	
	private static Student[] findStudentsByAveragePoint(Student[] students) {
		Student[] result = new Student[students.length];
		int running = 0;
		for(Student student: students) {
			if(student.averagePoint() > 8.5){
				result[running++] = student;
			}
		}
		
		return Arrays.copyOfRange(result, 0, running);
	}
	
	private static Student[] findStudentsTheoPointMoreThanPracPoint(Student[] students) {
		Student[] result = new Student[students.length];
		int running = 0;
		for(Student student: students) {
			if(student.getTheoreticalPoint() > student.getPracticePoint()){
				result[running++] = student;
			}
		}
		
		return Arrays.copyOfRange(result, 0, running);
	}
	
	

}
