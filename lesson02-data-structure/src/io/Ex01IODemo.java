package io;

import java.util.Scanner;

public class Ex01IODemo {

	public static void main(String[] args) {
		//Việc nhập sẽ kết thúc khi
		
		//string --> KẾT THÚC KHI NHẤN ENTER
		//!string --> phải nhập giá trị gì đó rồi nhấn enter mới kết thúc
		
		//Nhập xuất --> Scanner --> Java tạo ra mình sử dụng
		//Nhập số nguyên , số thực , kí tự , chuỗi
		
		//Lỗi trôi lệnh khi nhập xuất xảy ra khi nhập non-string rồi đến string
		//Nhập nextLine --> gán giá trị vừa nhập vào biến và xoá kí tự enter
		//Nhập nextInt --> gán giá trị vừa nhập vào biến và không xoá kí tự enter
		
		//Tạo ra 1 đối tượng cho phép nhập từ bàn phím
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập số báo danh:");
//		int id = sc.nextInt();
//		sc.nextLine();
		int id = Integer.parseInt(sc.nextLine());
		
		//1. Nhập chuỗi
		System.out.print("Nhập tài khoản:");
		String username = sc.nextLine();
		System.out.print("Nhập password:");
		String password = sc.nextLine();
		
		//2. Nhập số nguyên
		System.out.print("Nhập tuổi:");
		int age = Integer.parseInt(sc.nextLine());
		
		//3. Nhập số thực
		System.out.print("Nhập DTB:");
		float average = Float.parseFloat(sc.nextLine());
		
		System.out.println("***_-----_***");
		System.out.println("0. Số báo danh : " +id);
		System.out.println("1. Tài Khoản: " +username);
		System.out.println("2. Mật khẩu : " +password);
		System.out.println("3. Tuổi : " +age);
		System.out.println("4. DTB : " +average);
		System.out.println("***_-----_***");
		
		

	}

}
