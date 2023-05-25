package exception.exercise;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String password;
		boolean isValid = false;

		while (!isValid) {
			System.out.print("Vui lòng nhập mật khẩu của bạn: ");
			password = sc.nextLine();

			if (password.length() < 8) {
				System.out.println("Mật khẩu phải có ít nhất 8 ký tự.");
			} else if (!password.matches(".*[A-Z].*")) {
				System.out.println("Mật khẩu phải chứa ít nhất một chữ cái viết hoa.");
			} else if (!password.matches(".*[a-z].*")) {
				System.out.println("Mật khẩu phải chứa ít nhất một chữ cái viết thường.");
			} else if (!password.matches(".*\\d.*")) {
				System.out.println("Mật khẩu phải chứa ít nhất một số.");
			} else {
				System.out.println("Mật khẩu hợp lệ.");
				isValid = true; 
			}
		}
		sc.close();

	}
}
