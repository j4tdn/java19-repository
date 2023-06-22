package test1;

import test1.Student.Grade;

public class Ex01 {
public static void main(String[] args) {
	Student[] students = {
			new Student(102, "Nam", Grade.C),
			new Student(103, "Bảo", Grade.F),
			new Student(104, "Hoàng", Grade.D),
			new Student(105, "Nguyên", Grade.B),
			new Student(107, "Vũ",  Grade.F),
			new Student(109, "Lan", Grade.A),
			new Student(202, "Đạt", Grade.C),
			new Student(103, "Bảo", Grade.F),
			new Student(107, "Vũ",  Grade.C),
			new Student(104, "Hoàng",Grade.B)
	};
	for(Student student : students) {
		if(student.getGrade() == Grade.A) {
			System.out.println("Sinh viên đạt loại A trong năm 2021 là: " + student);
		}
	}
	
	System.out.println("\n================\n");
	
	for(Student again: students) {
		if(again.getGrade() == Grade.F) {
			System.out.println("Sinh viên học lại cấu trúc dữ liệu là: " + again);
		}
	}
}
}
