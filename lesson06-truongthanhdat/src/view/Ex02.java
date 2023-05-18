package view;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean isValidPassword = false;

		while (!isValidPassword) {
			try {
				System.out.println("Nhập mật khẩu:");
				String password = in.nextLine();
				validatePassword(password);
				isValidPassword = true;
				System.out.println("Đăng kí tài khoản thành công!");
			} catch (Exception e) {
				System.out.println("Mật khẩu không hợp lệ: " + e.getMessage());
			}
		}
		in.close();

	}

	private static void validatePassword(String password) throws Exception {
		if (password.length() < 8 || password.length() > 256) {
			throw new Exception("Mật khẩu phải có ít nhất 8 kí tự và nhiều nhất là 256 kí tự");
		}
		if (!password.matches(".*[a-z].*")) {
			throw new Exception("Mật khẩu phải có ít nhất 1 chữ cái viết thường");
		}
		if (!password.matches(".*[A-Z].*")) {
			throw new Exception("Mật khẩu phải có ít nhất 1 chữ cái viết hoa");
		}
		if (!password.matches(".*\\d+.*")) {
			throw new Exception("Mật khẩu phải có ít nhất 1 chữ số");
		}
		if (!password.matches(".*[!@#$%^&*()].*")) {
			throw new Exception("Mật khẩu phải có ít nhất 1 kí tự đặc biệt");
		}
	}

}
