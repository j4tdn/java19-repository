package ex01;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Scanner;

public class StudentManager {
	public static void main(String[] args) {
		Student sv1 = new Student(1, "Lê Đức Tuấn", 9.4f, 9.5f);
		Student sv2 = new Student(2, "Nguyễn Thành Phú", 7.5f, 6.5f);
		Student sv3 = new Student();
		enterStudent(sv3);
		Student[] list = {sv1,sv2,sv3};
		System.out.println("Sinh viên có điểm trung bình >8.5\n"+Arrays.toString(findStudentGPAGreaterThan85(list)));
		System.out.println("Sinh viên có điểm lý thuyết cao hơn thực hành\n"+Arrays.toString(findStudentByPoint(list)));
		
		
	}
	public static void enterStudent(Student student) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập mã sinh viên ");
		String id = ip.nextLine();
		student.setId(Integer.valueOf(id));
		System.out.println("Nhập tên sinh viên ");
		String name = ip.nextLine();
		student.setName(name);
		System.out.println("Nhập điểm lý thuyết ");
		float theotyPoint = ip.nextFloat();
		student.setTheoryPoint(theotyPoint);
		System.out.println("Nhập điểm thực hành ");
		float pracPoint = ip.nextFloat();
		student.setPracPoint(pracPoint);
		System.out.println("Nhập thông tin thành công");
		System.out.println("====================================================");
	}
	private static Student[] findStudentGPAGreaterThan85(Student[] students) {
		Student[] result = new Student[students.length];
		int count = 0; 
		for (Student student : students) {
			if (student.averagePoint() > 8.5) {
				result[count++] = student;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	private static Student[] findStudentByPoint(Student[] students) {
		Student[] result = new Student[students.length];
		int count = 0;
		for (Student student : students) {
			if (student.getTheoryPoint() > student.getPracPoint()) {
				result[count++] = student;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}



}
