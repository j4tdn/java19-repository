package io;

import java.util.Scanner;

// input, output
public class Ex01IODemo {
	public static void main(String[] args) {
		// Việc nhập sẽ kết thúc khi
		
		// string --> kết thúc khi nhấn enter
		// !string --> phải nhập giá trị gì đó rồi nhấn enter mới kết thúc
		
		// Nhập xuất --> Scanner --> Java tạo ra mình sử dụng
		// Nhập số nguyên, số thực, kí tự, chuỗi
		
		// Lỗi trôi lệnh khi nhập xuất xảy ra khi nhập non-string rồi đến string
		// Nhập nextLine --> gán giá trị vừa nhập vào biến và xóa kí tự enter
		// Nhập !nextLine --> gán giá trị vừa nhập vào biến nhưng ko xóa kí tự enter
		
		// Tạo ra 1 đối tượng cho phép nhập từ bán phím
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Nhập SBD: ");
		// int id = ip.nextInt();
		int id = Integer.parseInt(ip.nextLine());
		
		System.out.print("Nhập tài khoản: ");
		String username = ip.nextLine();
		
		System.out.print("Nhập mật khẩu: ");
		String password = ip.nextLine(); // ""
		
		System.out.print("Nhập tuổi: ");
		int age = ip.nextInt();
		
		System.out.print("Nhập DTB:");
		float average = ip.nextFloat();
		
		System.out.println("\n***__ ----- __ ***");
		System.out.println("1. SBD: " + id);
		System.out.println("2. Tài khoản: " + username);
		System.out.println("3. Mật khẩu: " + password);
		System.out.println("4. Tuổi: " + age);
		System.out.println("5. DTB: " + average);
		System.out.println("***__ ----- __ ***");
	}
}
