package ex02PasswordValidation;

import java.util.Scanner;

public class PasswordValidation {

	private static final int MIN_LENGTH = 8;
	private static final int MAX_LENGTH = 256;
	private static final String SPECIAL_CHARACTERS = "~!@#$%^&*\\(\\)-_=+\\[\\]{};:,.<>\\/?";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			register(scanner);
			System.out.println("Account registered successfully!");
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
			
		}
	}

	private static void register(Scanner scanner) {
		System.out.println("\n==============Account Registration==============");
		System.out.print("Enter your name: ");
		String name = scanner.nextLine();

		System.out.print("Enter your email address: ");
		String email = scanner.nextLine();

		System.out.print("Enter your password: ");
		String password = scanner.nextLine();

		try {
			validatePassword(name, email, password);
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
			register(scanner);
		}
	}

	private static void validatePassword(String name, String email, String password) {
		if (password.length() < MIN_LENGTH || password.length() > MAX_LENGTH) {
			throw new IllegalArgumentException(
					"Password must be at least " + MIN_LENGTH + " characters." + " and at most " + MAX_LENGTH + " characters.");
		}

		if (!password.matches(".*[a-z].*")) {
			throw new IllegalArgumentException("Password must contain at least one lowercase alphabetic character.");
		}

		if (!password.matches(".*[A-Z].*")) {
			throw new IllegalArgumentException("Password must contain at least one uppercase alphabetic character.");
		}

		if (!password.matches(".*\\d.*")) {
			throw new IllegalArgumentException("Password must contain at least one numeric character.");
		}

		if (!password.matches(".*[" + SPECIAL_CHARACTERS + "].*")) {
			throw new IllegalArgumentException(
					"Password must contain at least one special character: " + SPECIAL_CHARACTERS);
		}
		

		if (password.contains(name) || password.contains(email)) {
			throw new IllegalArgumentException("Password must not contain your name or email address.");
		}
	}

}
