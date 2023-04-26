package bai1;

import java.util.Arrays;

import utils.Utils;

public class StudentManagement {
	public static void main(String[] args) {
		Student sv1 = new Student(1, "Trần Văn Thịnh", 9f, 9f);
		Student sv2 = new Student(2, "Trương Công Trình", 10f, 9f);
		Student sv3 = new Student();
		
		Utils.inputStudent(sv3);
		
		Student[] svS = {sv1,sv2,sv3};
		
		System.out.println("Điểm trung bình lớn hơn 8.5:");
		PrintStudentArray(findByAvgScore(svS));
		
		System.out.println("=".repeat(20));
		
		System.out.println("Điểm lý thuyết lớn hơn thực hành");
		PrintStudentArray(findByTheoryGreaterPractice(svS));
		
		
		
	}
	
	public static Student[] findByAvgScore(Student[] svS) {
		Student[] searchedList = new Student[svS.length];
		int index = 0;
		
		for (Student student : svS) {
			if(student.avgScore() > 8.5) {
				searchedList[index++] = student;
			}
		}
		
		Student[] result = Arrays.copyOfRange(searchedList, 0, index);
		return result;
	}
	
	public static Student[] findByTheoryGreaterPractice(Student[] svS) {
		Student[] searchedList = new Student[svS.length];
		int index = 0;
		
		for (Student student : svS) {
			if(student.getTheoryScore() > student.getPracticeScore()) {
				searchedList[index++] = student;
			}
		}
		
		Student[] result = Arrays.copyOfRange(searchedList, 0, index);
		return result;
	}
	
	public static void PrintStudentArray(Student[] svS) {
		for (Student student : svS) {
			System.out.println(student.toString());
		}
	}
}
