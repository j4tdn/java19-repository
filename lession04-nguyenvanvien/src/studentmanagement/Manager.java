package studentmanagement;

import java.util.Scanner;

public class Manager {
	public static void main(String[] args) {
		Student sv1 = new Student(1,"Nguyen Van A",10f, 8.5f);
		Student sv2 = new Student(2,"Nguyen Van B",6f, 8.5f);
		Student sv3 = new Student();
		EnterInfo(sv3);
		
		Student[] arrs = new Student[3];
		arrs[0] = sv1;
		arrs[1] = sv2;
		arrs[2] = sv3;
		
		findSvByMediumScore(arrs);
		System.out.println("====================================");
		findSvPracBiggerThanTheo(arrs);
		
	}
	
	public static void findSvByMediumScore(Student[] arrSv) {
		for (Student sv: arrSv) {
			if (sv.mediumScore()>8.5) {
				System.out.println(sv.toString());	
			}
		}
	}
	
	public static void findSvPracBiggerThanTheo(Student[] arrSv) {
		for (Student sv: arrSv) {
			if (sv.getPracticPoint()>sv.getTheoreticalPoint()) {
				System.out.println(sv.toString());	
			}
		}
	}
	
	public static void EnterInfo(Student sv) {
		Scanner scanner = new Scanner(System.in);
		sv.setIdStudent(3);
		System.out.print("Nhập Name : ");
		String name = scanner.nextLine();
		sv.setName(name);
		System.out.print("\nEnter your theoreticalPoint : ");
		Float theoPoint = scanner.nextFloat();
		sv.setTheoreticalPoint(theoPoint);
		System.out.print("\nEnter your practicPoint : ");
		Float pracPoint = scanner.nextFloat();
		sv.setPracticPoint(pracPoint);
	}
}
