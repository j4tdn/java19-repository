package io;

import java.util.Scanner;

//  input , output
public class IODemo {
	public static void main(String[] args) {
		// Việc nhập sẽ kết thúc
		
		// Nhập string --> kết thúc khi nhấn enter
		//!string --> phải nhập giá trị gì đó ròi mới nhấn enter để kết thúc
		
		// Nhập xuất --> Scanner --> Java tạo ra mình sử dụng 
		// nhập số nguyên, số thực, kí tự, chuỗi
		
		// lỗi trôi lệnh khi nhập xuất xảy ra khi nhập non-String đến String
		//Giá trị nextLine --> gán giá trị vừa nhập vào biến và xóa kí tự enter
		//Giá trị !nextLine --> gán giá trị vừa nhập vào biến nhưng ko xóa kí tự enter
		
		
		// Tạo ra 1 đối tượng cho phép nhập từ bàn phím
		Scanner ip  = new Scanner(System.in);
		
		System.out.print("SBD : ");
		// c1 
		//    int id = ip.nextInt();
		//    ip.nextLine();// xóa enter
		//c2
		int id = Integer.parseInt(ip.nextLine());
		
		 
		//1. Nhập chuỗi
		System.out.print("Nhập tài khoản : ");
		String username = ip.nextLine();
		
		System.out.print("Nhập mật khẩu : ");
		String password = ip.nextLine();
		
		//2. Nhập số nguyên
		 System.out.print("Nhập tuổi :");
		 int age = ip.nextInt ();
	
		//3.Nhập số thực
		 System.out.println("Nhập điểm trung bình :");
		 float average = ip.nextFloat();
		
		System.out.println("\n***_____-----____***");
		System.out.println("0.SBD : " + id);
		System.out.println("1.Tài Khoản: " + username);
		System.out.println("2.Mật Khẩu: " + password);
		System.out.println("3.Tuổi : " + age);
		System.out.println("4.ĐTB: " + average);
		System.out.println("***_____-----____***");
	
		
		
		
		
	}

}
