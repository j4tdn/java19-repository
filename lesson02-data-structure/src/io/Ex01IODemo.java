package io;

import java.util.Scanner;

public class Ex01IODemo {
	public static void main(String[] args) {
		// Nhập xuất --> Scanner --> Java tạo ra mình sử dụng
		// Nhập số nguyên, số thực, kí tự, chuỗi
		
		
		try (//tạo ra 1 đối tượng cho phép nhập từ bàn phím
		Scanner ip = new Scanner(System.in)) {
			System.out.print("Input ID: ");
			int id  = Integer.parseInt(ip.nextLine());
			//1. Nhập chuỗi
			System.out.print("Input user: ");
			String username = ip.nextLine();
			
			System.out.print("Input password: ");
			String password = ip.nextLine();
			
			//2. Nhập số nguyên
			System.out.print("Input Age: ");
			int Age  = Integer.parseInt(ip.nextLine());
			
			//3. Nhập số thực
			System.out.print("Input diem trung binh: ");
			float average = Float.parseFloat(ip.nextLine());
			
			
			System.out.println("\n***___------___***");
			System.out.println("ID: " + id);
			System.out.println("User :" + username);
			System.out.println("Password :" + password);
			System.out.println("Age :" + Age);
			System.out.println("Average :" + average);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("***___------___***");
	}
}
