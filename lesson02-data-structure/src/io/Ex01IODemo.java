package io;

import java.util.Scanner;

public class Ex01IODemo {
	public static void main(String[] args) {
		// Nhập xuất -- Scanner --> Java tạo ra mình sử dụng
		// Nhập số nguyên, số thực, kí tự, chuỗi

		// Tạo ra một đối tượng cho phép nhập từ bán phím
		Scanner ip = new Scanner(System.in);

		System.out.print("Nhap SBD: ");
		int id = Integer.parseInt(ip.nextLine());

		// 1.Nhập chuỗi
		System.out.print("Nhap tai khoan: ");
		String username = ip.nextLine();

		System.out.print("Nhap mat khau: ");
		String password = ip.nextLine();

		// 2.Nhập số nguyên
		System.out.print("Nhap tuoi: ");
		int age = ip.nextInt();

		// 3.Nhập số thực
		System.out.println("Nhap DTB: ");
		float average = ip.nextFloat();

		System.out.println("***___-----___***");
		System.out.println("1. Tai khoan: " + username);
		System.out.println("2. Mat khau: " + password);
		System.out.println("3. Tuoi: " + age);
		System.out.println("4. DTB: " + average);
		System.out.println("***___-----___***");
	}
}
