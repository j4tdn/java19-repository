package ex02;

import java.util.Scanner;

public class PasswordValidationDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String passWord = null;
		do {
			try {
				System.out.println("Nhập vào 1 mật khẩu hợp lệ: ");
				passWord = input.nextLine();
				validation(passWord);
				break;
			} catch (Exception e) {
				e.printStackTrace();;
			}
		} while (true);
		input.close();
		System.out.println("Sign Up Success");
	}

	public static void validation(String input) throws PasswordException {
		if (input.length() < 8) {
			throw new PasswordException("Password is at least 8 characters");
		}
		if (input.length() > 256) {
			throw new PasswordException("Password is at most 256 characters");
		}
		if (input.matches(".*[a-z].*")) {
			throw new PasswordException("Password is at least 1 lowercase alphabetic character");
		}
		if (input.matches(".*[A-Z].*")) {
			throw new PasswordException("Password is at least 1 uppercase alphabetic character");
		}
		if (input.matches(".*[0-9].*")) {
			throw new PasswordException("Password is at least 1 number ");
		}
		if (input.matches(".*[~-_=+\\[\\]{}|;\\?].*")) {
			throw new PasswordException("Password is at least 1 special character character");
		}
	}

}
