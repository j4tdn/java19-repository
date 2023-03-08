package io;

import java.util.Scanner;

public class Ex01IODemo {

	public static void main(String[] args) {
		// Việc nhập sẽ kết thúc khi:
		// string --> kết thúc khi nhấn Enter
		// !string --> phải nhập giá trị gì đó rồi nhấn enter mới kết thúc

		// Nhập xuất --> Scanner --> Java tạo ra mình sử dụng
		// Số nguyên, số thực, kí tự, chuỗi

		// Lỗi trôi lệnh khi nhập xuất:
		// Nhập nextLine --> gán giá trị vừa nhập vào biến và xóa kí tự ENTER
		// Nhập !nextLine --> gán giá trị vừa nhập vào biến và KO xóa kí tự ENTER
		// --> xảy ra khi có !nextLine trước nextLine
		// Tạo ra 1 đối tượng cho phép nhập từ bàn phím
		Scanner ip = new Scanner(System.in);

		System.out.println("Nhập SBD: ");
		// int id = ip.nextInt();
		// ip.nextLine();
		int id = Integer.parseInt(ip.nextLine());

		// 1. Nhập chuỗi
		System.out.print("Nhập tài khoản: "); // dùng print thay cho println để ko xuống dòng
		String userName = ip.nextLine();

		System.out.print("Nhập mật khẩu: "); // dùng print thay cho println để ko xuống dòng
		String passwords = ip.nextLine();

		// 2. Nhập số nguyên
		System.out.print("Nhập tuổi: ");
		//int age = ip.nextInt();
		int age = Integer.parseInt(ip.nextLine());
		
		// 3. Nhập số thực
		System.out.print("Nhập DTB: ");
		//float average = ip.nextFloat();
		float average = Float.parseFloat(ip.nextLine());
				
		System.out.println("***__------__***");
		System.out.println("1. SBD: "+ userName);
		System.out.println("2. Tài khoản: " + userName);
		System.out.println("3. Mật khẩu: " + passwords);
		System.out.println("4. Tuổi: " + age);
		System.out.println("5. DTB: " + average);
		System.out.println("***__------__***");
	}

}
