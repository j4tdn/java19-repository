package ex02;

import java.util.Scanner;

public class PasswordRegistrationDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String password = null;
		do {
			try {
				System.out.print("Create a new password: ");
				password = sc.nextLine();
				validate(password);
				break;
			} catch (InvalidPasswordLengthException e) {
				e.printStackTrace();
			}  catch (MissingCharacterException e) {
				e.printStackTrace();
			}
		} while (true);
		sc.close();
		System.out.println(">>>>>Create Successfully!!!<<<<<");
	}

	private static boolean validate(String password) {
		if (password.length() < 8 || password.length() > 256) {
			throw new MissingCharacterException("Password must contain at least 8 characters and At most 256 characters");
		}

		if (password.matches("^[A-Z0-9]+$")) {
			throw new MissingCharacterException("Password must contain at least one lowercase character (a,b,c,...)");
		}

		if (password.matches("^[a-z0-9]+$")) {
			throw new MissingCharacterException("Password must contain at least one uppercase character (A,B,C,...)");
		}

		if (password.matches("^[a-zA-Z]+$")) {
			throw new MissingCharacterException("Password must contain at least one number (1,2,3,...)");
		}

		if (password.matches("^[a-zA-Z0-9]+$")) {
			throw new MissingCharacterException("Password must contain at least one special character (!,@,#,$,%,^,...)");
		}

		return true;
	}

}