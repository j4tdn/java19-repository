package ex04;

import java.util.Scanner;

public class Ex04PasswordValidation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập tên tài khoản: ");
		String username = scanner.nextLine();

		System.out.print("Nhập mật khẩu: ");
		String password = scanner.nextLine();

		boolean isValidPassword = validatePassword(username, password);

		if (isValidPassword) {
			System.out.println("Đăng ký tài khoản thành công!");
		} else {
			System.out.println("Mật khẩu không hợp lệ. Đăng ký thất bại!");
		}

		scanner.close();
	}

	public static boolean validatePassword(String username, String password) {
		if (password.length() < 8) {
			return false;
		}

		boolean hasDigit = false;
		for (char c : password.toCharArray()) {
			if (Character.isDigit(c)) {
				hasDigit = true;
				break;
			}
		}
		if (!hasDigit) {
			return false;
		}

		boolean hasUppercase = false;
		for (char c : password.toCharArray()) {
			if (Character.isUpperCase(c)) {
				hasUppercase = true;
				break;
			}
		}
		if (!hasUppercase) {
			return false;
		}

		boolean hasSpecialChar = false;
		for (char c : password.toCharArray()) {
			if ("~!@#$%^&*".contains(String.valueOf(c))) {
				hasSpecialChar = true;
				break;
			}
		}
		if (!hasSpecialChar) {
			return false;
		}

		int count = 0;
		for (char c : username.toCharArray()) {
			if (password.contains(String.valueOf(c))) {
				count++;
				if (count > 3) {
					return false;
				}
			}
		}

		return true;
	}

}
