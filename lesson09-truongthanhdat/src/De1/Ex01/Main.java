package De1.Ex01;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		List<Student> listStudent = mockStudentList();
		List<Student> studentsWithGradeA = getStudentsWithGrade(listStudent, Grade.A);
		
        System.out.println("Danh sách sinh viên từng đạt loại A trong năm 2021:");
        for (Student student : studentsWithGradeA) {
            System.out.println(student);
        }
        
        List<Student> studentsRetakingCourse = getStudentsRetakingCourse(listStudent);
        
        System.out.println("\nDanh sách sinh viên đã tham gia học lại môn cấu trúc dữ liệu trong năm 2021:");
        for (Student student : studentsRetakingCourse) {
            System.out.println(student);
        }
	}

	private static List<Student> mockStudentList() {
		List<Student> students = new ArrayList<>();
		students.add(new Student(102, "Nam", Grade.A));
		students.add(new Student(103, "Bảo", Grade.F));
		students.add(new Student(104, "Hoàng", Grade.D));
		students.add(new Student(105, "Nguyên", Grade.B));
		students.add(new Student(107, "Vũ", Grade.F));
		students.add(new Student(109, "Lan", Grade.A));
		students.add(new Student(202, "Đạt", Grade.A));
		students.add(new Student(103, "Bảo", Grade.F));
		students.add(new Student(107, "Vũ", Grade.C));
		students.add(new Student(104, "Hoàng", Grade.B));
		return students;
	}

	public static List<Student> getStudentsWithGrade(List<Student> students, Grade grade) {
		List<Student> studentsWithGrade = new ArrayList<>();
		for (Student student : students) {
			if (student.getGrade() == grade) {
				studentsWithGrade.add(student);
			}
		}
		return studentsWithGrade;
	}
	
	public static List<Student> getStudentsRetakingCourse(List<Student> students) {
        List<Student> studentsRetakingCourse = new ArrayList<>();
        for (Student student : students) {
            if (student.getGrade() == Grade.F) {
                studentsRetakingCourse.add(student);
            }
        }
        return studentsRetakingCourse;
    }
}
