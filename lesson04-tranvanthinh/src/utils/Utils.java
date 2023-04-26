package utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Random;
import java.util.Scanner;

import bai1.Student;
import bai4.bean.Director;
import bai4.bean.Employee;
import bai4.bean.Manager;
import bai4.bean.Personnel;

public class Utils {

	static Scanner sc = new Scanner(System.in);

	public static boolean isInteger(String str) {
		return str.matches("\\d+");
	}

	public static boolean isDouble(String str) {
		return str.matches("-?\\d+(\\.\\d+)?");
	}

	public static void inputStudent(Student sv) {
		String mssv;
		String name;
		String theoryScore;
		String practiceScore;

		do {
			System.out.print("Nhập mã sinh viên: ");
			mssv = sc.nextLine();
		} while (!isInteger(mssv));
		sv.setMssv(Integer.parseInt(mssv));

		System.out.print("Nhập họ tên: ");
		name = sc.nextLine();
		sv.setName(name);

		do {
			System.out.print("Nhập điểm lý thuyết: ");
			theoryScore = sc.nextLine();
		} while (!isDouble(theoryScore));
		sv.setTheoryScore(Float.parseFloat(theoryScore));

		do {
			System.out.print("Nhập điểm thực hành: ");
			practiceScore = sc.nextLine();
		} while (!isDouble(practiceScore));
		sv.setPracticeScore(Float.parseFloat(practiceScore));
	}

	public static int inputInteger() {
		String n;
		do {
			System.out.print("Nhập n: ");
			n = sc.nextLine();
		} while (!isInteger(n));
		return Integer.parseInt(n);
	}

	public static int[] randIntArray(int n, int a, int b) {
		Random rand = new Random();

		int[] arr = new int[n];

		int count = 0;
		while (count < n) {
			int num = rand.nextInt(b - a + 1) + a;

			boolean exists = false;
			for (int i = 0; i < count; i++) {
				if (arr[i] == num) {
					exists = true;
					break;
				}
			}

			if (!exists) {
				arr[count++] = num;
			}
		}
		return arr;
	}

	public static boolean validDate(String dateStr) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		try {
			LocalDate date = LocalDate.parse(dateStr, formatter);
			return true;
		} catch (DateTimeParseException e) {
			return false;
		}
	}

	public static void inputEmployee(Personnel p) {
		String name;
		String dateOfBirth;
		String coefficientSalary;
		
		System.out.println("Nhập thông tin " + p.getClass().getSimpleName());

		System.out.print("Nhập họ tên: ");
		name = sc.nextLine();
		p.setName(name);

		do {
			System.out.print("Nhập ngày sinh (dd/MM/yyyy): ");
			dateOfBirth = sc.nextLine();
		} while (!validDate(dateOfBirth));
		p.setDateOfBirth(LocalDate.parse(dateOfBirth, DateTimeFormatter.ofPattern("dd/MM/yyyy")));

		do {
			System.out.print("Nhập hệ số lương: ");
			coefficientSalary = sc.nextLine();
		} while (!isDouble(coefficientSalary));
		p.setcoefficientSalary(Float.parseFloat(coefficientSalary));

		String fourthAttribute;
		if (p.getClass() == Director.class) {
			Director d = (Director) p;
			do {
				System.out.print("Nhập hệ số chức vụ: ");
				fourthAttribute = sc.nextLine();
			} while (!isDouble(fourthAttribute));
			d.setCoefficientPosition(Float.parseFloat(fourthAttribute));
			p = d;
		}
		if (p.getClass() == Manager.class) {
			Manager m = (Manager) p;
			do {
				System.out.print("Nhập số lượng nhân viên quản lý: ");
				fourthAttribute = sc.nextLine();
			} while (!isInteger(fourthAttribute));
			m.setAmountOfEmployee(Integer.parseInt(fourthAttribute));
			p = m;
		}
		if (p.getClass() == Employee.class) {
			Employee e = (Employee) p;
			System.out.print("Nhập tên phòng ban: ");
			fourthAttribute = sc.nextLine();
			e.setUnit(fourthAttribute);
			p = e;
		}

	}

}
