package io;

import java.util.Scanner;

public class Ex01IODemo {
	public static void main(String[] args) {
		// Nhập xuất -> Scanner -> java tạo ra mình sử dụng
		// Nhập số nguyên, số thực, ký tự, chuỗi
		
		// Tạo ra một đối tượng cho phép nhập từ bàn phím
		
		Scanner ip = new Scanner(System.in);
		 System.out.print("Nhập SBD: ");
		// int id = ip.nextInt();
		 int id = Integer.parseInt(ip.nextLine());
		 
		// 1. Nhập chuỗi
		System.out.print("Nhập tài khoản: ");
		String username = ip.nextLine();
		
		System.out.print("Nhập mật khẩu: ");
		String password = ip.nextLine();
		
		// 2. Nhâp số nguyên
		System.out.print("Nhập tuổi: ");
		int age = ip.nextInt();
		// 3. Nhập số thực
		System.out.print("Nhập DTB: ");
		float average = ip.nextFloat();
		
		System.out.println("**********");
		System.out.println("1. SBD: " + id);
		System.out.println("2. Tài khoản: " + username);
		System.out.println("3. Mật khẩu: " + password);
		System.out.println("4.Nhập tuổi: " + age);
		System.out.println("5.Nhập DTB: " + average);
		System.out.println("************");
	}

}
