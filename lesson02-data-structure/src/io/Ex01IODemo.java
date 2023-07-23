package io;

import java.util.Scanner;

//input,output
public class Ex01IODemo {
	public static void main(String[] args) {
		// Việc nhập sẽ kết thúc khi
		//string --> kết thúc khi nhấn enter
		
		//!string --> phải nhập giá trị gì đó rối nhấn enter mới kết thúc
		// Nhập xuất --> Scanner --> Java tạo ra mình sử dụng
		// Nhập số nguyên, số thực , kí tự, chuổi

		//Nhập nextLine --> gán giá trị vừa nhập vào biến và xóa kí tự enter
		//Nhập !nextLine --> gán giá trị vừa nhập vào biến nhưng không xóa kí tự enter
		
		//Lỗi trôi lệnh : khi nhập !String xuống String
		// Tạo ra 1 đối tượng cho phép nhập từ bàn phím
		Scanner ip = new Scanner(System.in);

		// 1.Nhập chuỗi
	System.out.print("Nhập SBD: ");
	//int id = ip.nextInt();
	//ip.next();
	int id = Integer.parseInt(ip.nextLine());

		System.out.print("Nhập tài khoản: ");
		String usernane = ip.nextLine();

		// 2.Nhập số nguyên
		System.out.print("Nhập mật khẩu: ");
		String password = ip.nextLine();

		System.out.print("Nhập Tuổi: ");
		int age = ip.nextInt();

		// 3.Nhập số thực
		System.out.print("Nhập DTB: ");
		float average = ip.nextFloat();

		System.out.println("**------------**");
		System.out.println("1.SBD : " + id);
		System.out.println("2.Tài khoản: " + usernane);
		System.out.println("3.Mật khẩu : " + password);
		System.out.println("4. Tuổi : " + age);
		System.out.println("5. DTB : " + average);
	
		System.out.println("**------------**");
	}

}
