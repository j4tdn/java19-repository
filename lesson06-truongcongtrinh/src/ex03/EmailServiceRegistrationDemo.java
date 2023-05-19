package ex03;

import java.util.Scanner;

public class EmailServiceRegistrationDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String email = null;

		do {
			try {
				System.out.print("Enter email: ");
				email = sc.nextLine();
				validateEmail(email);
				break;
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
		} while (true);

		System.out.println("Valid Email Successfully!!!");
		sc.close();
	}

	private static boolean validateEmail(String email) {
		if (!email.contains("@")) {
			throw new IllegalArgumentException("Email must be this format: example@mail.com");
		}

		if (!"mail.com".equals(email.substring(email.indexOf("@") + 1))) {
			throw new IllegalArgumentException("Invalid Domain!. Email must be this format: example@mail.com");
		}

		String prefix = email.substring(0, email.indexOf("@"));

		if (!prefix.matches("^[a-z0-9_.-]+$")) {
			throw new IllegalArgumentException("asd Email must be this format: example@mail.com");
		}

		return true;
	}

}
