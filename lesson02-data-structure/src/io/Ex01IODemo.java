package io;

import java.util.Scanner;

public class Ex01IODemo {
	public static void main(String[] args) {
		//Việc nhập sẽ kết thúc khi nhấn Enter
		
		//string --> khi nhấn Enter
		//!string --> phải nhập giá trị gì đó rồi nhấn Enter mới kết thúc
		
		//Nhập xuất --> Scanner --> Java tạo ra mình sử dụng
		//Nhập số nguyên, số thực, kí tự, chuỗi
		
		//Lỗi trôi lập khi nhập xuất xảy ra khi nhập non-string rồi đến string
		//Nhập string
		
		//Tạo ra 1 đối tượng cho phép nhập từ bàn phím
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Nhập SBD: ");
		int id = Integer.parseInt(ip.nextLine());
		
		//1. Nhập chuỗi
		System.out.print("Nhập tài khoản: ");
		String username = ip.nextLine();
		
		System.out.print("Nhập mật khẩu: ");
		String password = ip.nextLine();

		//2. Nhập số nguyên
		System.out.println("Nhập tuổi: ");
		int age = ip.nextInt();
				
		//3. Nhập số thực
		System.out.println("Nhập DTB: ");
		float average = ip.nextFloat();
		
		System.out.println("1. SBD: " + id);
		System.out.println("2. Tài khoản: " + username);
		System.out.println("3. Mật khẩu: " + password);
		System.out.println("4. Tuổi : " + age);
		System.out.println("5. DTB : " + average);
		
	}

}
