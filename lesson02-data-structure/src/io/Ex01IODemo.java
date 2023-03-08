package io;

import java.util.Scanner;

public class Ex01IODemo {

	public static void main(String[] args) {
		// Nhập xuất --> Scanner --> Java tạo ra mình sử dụng 
		// Nhập số nguyên 
		Scanner ip =new Scanner(System.in);
		//1. Nhập chuỗi
		System.out.print("Nhập tài khoản: ");
		String username =ip.nextLine();
		System.out.print("Nhập mật khẩu: ");
		String password =ip.nextLine();
		
		//2. Nhập số nguyên
		System.out.println("Nhập tuổi: ");
		int age =ip.nextInt();
		//3. Nhập số thực
		System.out.println("Nhập DTB: ");
		float average =ip.nextFloat();
		
		
		System.out.println("--------------");
		System.out.println("Tài khoản : "+username);
		System.out.println("Mật Khẩu : "+password);
		System.out.println("Tuổi : "+age);
		System.out.println("DTB : "+average);
		System.out.println("--------------");
		

	}

}
