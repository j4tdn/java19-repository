package ex01;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ManagerStudent {
	
	public static void main(String[] args) {
		
		Student sv1 = new Student(01,"Phu", 9.5f, 9f);
		Student sv2 = new Student(02,"Tuan", 9f, 8f);
		
		Student sv3 = new Student();
		enterInfo(sv3);
		
		System.out.println("\n===========================\n");
		
		Student[] students = {sv1,sv2,sv3};
		
		Student[] infoStudentAvgO85 = findStudentByAvgO85(students);
		System.out.println("infoStudentAvgO85 --->\n" + Arrays.toString(infoStudentAvgO85));
		
		System.out.println("\n===========================\n");
		
		Student[] infoStudentByLtHigherTh = findStudentByLtHigherTh(students) ;
		System.out.println("infoStudentByLtHigherTh --->\n" + Arrays.toString(infoStudentByLtHigherTh));
		
	}
	
	public static void enterInfo( Student sv) {
		Scanner input = new Scanner(System.in);
		
		sv.setMsv(3);
		System.out.println("Name: ");
		sv.setName(input.nextLine());
		System.out.println("TheoryPoint: ");
		sv.setTheoryPoint(input.nextFloat());
		System.out.println("PracticePoint: ");
		sv.setPracticePoint(input.nextFloat());
		
	}
	public static Student[] findStudentByAvgO85(Student[] students) {
		Student[] result = new Student[students.length];
		int running = 0;
		
		for(Student student: students) {
			if(student.averagePoint() > 8.5) {
				result[running++] = student;
			}
		}
		
		return Arrays.copyOfRange(result, 0, running);
		
	}
	
	public static Student[] findStudentByLtHigherTh(Student[] students) {
		Student[] result = new Student[students.length];
		int running = 0;
		
		for(Student student : students) {
			if(student.getTheoryPoint() > student.getPracticePoint()) {
				result[running++] = student;
			}
		}
		
		return Arrays.copyOfRange(result, 0, running);
	}
	
	
}
