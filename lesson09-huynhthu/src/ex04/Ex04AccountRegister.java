package ex04;

import java.util.Scanner;

/*/
 * Viết chương trình thực hiện chức năng đăng ký tài khoản
B1. Nhập tên tài khoản ví dụ byztkhx256
B2. Nhập mật khẩu admin123
Yêu cầu mật khẩu như sau:
1. Độ dài mật khẩu: >= 8
2. Có ít nhất 1 chữ số, 1 kí tự in hoa, và một kí tự đặc biệt (~!@#$%^&*)
3. Không được trùng quá 3 ký tự với tên tài khoản [Đăng ký khi bắt đầu chương trình]
Sau khi đã thỏa mãn yêu cầu thông báo đăng ký tài khoản thành công
 */
public class Ex04AccountRegister {
	private static final int max = 3;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your username: ");
		String username = input.nextLine();
		System.out.print("Enter your password: ");
		String password = input.nextLine();
		try {
			registerAccount(username, password);
			System.out.println("Account is registered successfully!");
		} catch (Exception e) {
			System.out.println("Failure: " + e.getMessage());
		}
	}

	private static void registerAccount(String username, String password) throws Exception {
		if (!isValidPassword(username, password)) {
			throw new Exception("Invalid password.Plz input again!");
		}
	}

	public static boolean isValidPassword(String username, String password) throws Exception {
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
		int sameChars = 0;
		for (char c : username.toCharArray()) {
			if (password.contains(String.valueOf(c))) {
				sameChars++;
				if (sameChars > max) {
					return false;
				}
			}
		}
		return true;
	}
}
