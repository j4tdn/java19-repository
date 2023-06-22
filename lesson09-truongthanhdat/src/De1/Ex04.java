package De1;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập tên tài khoản: ");
		String username = scanner.nextLine();

		System.out.print("Nhập mật khẩu: ");
		String password = scanner.nextLine();

		boolean isRegistered = registerAccount(username, password);

		if (isRegistered) {
			System.out.println("Đăng ký tài khoản thành công");
		} else {
			System.out.println("Đăng ký tài khoản không thành công");
		}
		scanner.close();
	}

	public static boolean registerAccount(String username, String password) {
		if (password.length() < 8) {
			return false;
		}

		if (!password.matches(".*\\d.*")) {
			return false;
		}

		if (!password.matches(".*[A-Z].*")) {
			return false;
		}

		if (!password.matches(".*[~!@#$%^&*].*")) {
			return false;
		}

		int duplicatedCharsCount = countDuplicatedChars(username, password);
		if (duplicatedCharsCount > 3) {
			return false;
		}

		return true;
	}

	public static int countDuplicatedChars(String username, String password) {
		int count = 0;
		for (int i = 0; i < username.length(); i++) {
			char c = username.charAt(i);
			if (password.contains(String.valueOf(c))) {
				count++;
			}
		}
		return count;
	}
}