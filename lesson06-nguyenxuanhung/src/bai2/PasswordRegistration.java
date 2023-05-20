package bai2;
import java.util.Scanner;

public class PasswordRegistration {
    public static void main(String[] args) {
        try (Scanner ip = new Scanner(System.in)) {
			while (true) {
			    try {
			        System.out.print("Nhập mật khẩu: ");
			        String password = ip.nextLine();
			        validatePassword(password);
			        System.out.println("�?ăng ký tài khoản thành công!");
			        break;
			    } catch (InvalidPasswordException e) {
			        System.out.println("Lỗi: " + e.getMessage());
			    }
			}
		}
    }

    private static void validatePassword(String password) throws InvalidPasswordException {
        if (password.length() < 8) {
            throw new InvalidPasswordException("Password must contain at least 8 characters");
        }
        if (!password.matches(".*\\d.*")) {
            throw new InvalidPasswordException("Password must contain at least 1 number");
        }
        if (!password.matches(".*[a-z].*")) {
            throw new InvalidPasswordException("Password must contain at least 1 lowercase alphabetic");
        }
        if (!password.matches(".*[A-Z].*")) {
            throw new InvalidPasswordException("Password must contain at least 1 uppercase alphabetic");
        }
        if (!password.matches(".*[!@#$%^&*()].*")) {
            throw new InvalidPasswordException("Password must contain at least 1 special character");
        }
    }
}



