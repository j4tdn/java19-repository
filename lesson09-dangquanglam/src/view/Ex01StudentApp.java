package view;

import java.util.Arrays;

import bean.Student;
import common.Rank;

public class Ex01StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] students = findAll();
		
		Student[] studentsByRank = findStudents(students, Rank.A);
		System.out.println("SV từng đạt loại A trong năm 2021:" +Arrays.toString(studentsByRank));
		
		Student[] findResignedStudents = findResignedStudents(students);
		System.out.println("SV đã tham gia học lại môn cấu trúc dữ liệu trong năm 2021:" +Arrays.toString(findResignedStudents));

	}
	//Tìm danh sách sv đã tham gia học lại môn cấu trúc dữ liệu trong năm 2021
	private static Student[] findResignedStudents(Student[] students) {
		Student[] result = new Student[students.length];
		int running = 0;
		boolean[] resifnedFlags = new boolean[students.length];
		
		for (int i = 0; i < students.length - 1; i++) {
			if(!resifnedFlags[i]) {
				for (int j = i + 1; j < students.length; j++) {
					if(!resifnedFlags[j] && students[i].equals(students[j])) {
						resifnedFlags[i] = true;
						resifnedFlags[j] = true;
					}
				}
			}
		}
		for (int i = 0; i < resifnedFlags.length; i++) {
			if(resifnedFlags[i] && !contains(result, running, students[i])) {
				result[running++] = students[i];
			}
		}
		return Arrays.copyOfRange(result, 0, running);
	}
	
	private static boolean contains(Student[] result, int running, Student student) {
		for (int i = 0; i < running; i++) {
			if(result[i].equals(student)) {
				return true;
			}
		}
		return false;
	}
	//Tìm danh sách sv từng đạt loại A trong năm 2021
	private static Student[] findStudents(Student[] students, Rank rankFilter) {
		Student[] result = new Student[students.length];
		int running = 0;
		for(Student student : students) {
			if(rankFilter.equals(student.getRank())) {
				result[running++] = student;
			}
		}
		return Arrays.copyOfRange(result, 0, running);
		
	}
	
	private static Student[] findAll() {
		return new Student[] {
				new Student(102, "Nam", Rank.C),
				new Student(103, "Bảo", Rank.F),
				new Student(104, "Hoàng", Rank.D),
				new Student(105, "Nguyên", Rank.B),
				new Student(107, "Vũ", Rank.F),
				new Student(109, "Lan", Rank.A),
				new Student(202, "Đạt", Rank.C),
				new Student(103, "Bảo", Rank.F),
				new Student(107, "Vũ", Rank.C),
				new Student(104, "Hoàn", Rank.B),
		};
	}

}
