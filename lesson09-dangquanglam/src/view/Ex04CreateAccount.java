package view;

import java.util.Scanner;

public class Ex04CreateAccount {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome, please register for an account:");

		System.out.println("Enter username:");
		String username = scanner.nextLine();

		System.out.println("Enter password:");
		String password = scanner.nextLine();
		while (true) {
			String firstThreeChars = username.substring(0, Math.min(username.length(), 3));
			if (password.contains(firstThreeChars)) {
				System.out.println("Password must not contain more than 3 characters matching username:");
				password = scanner.nextLine();
				while (true) {
					if (password.contains(firstThreeChars)) {
						System.out.println(
								"Password must not contain more than 3 characters matching username, please choose another one:");
						password = scanner.nextLine();
						firstThreeChars = username.substring(0, Math.min(username.length(), 3));
					} else if (password.length() < 8) {
						System.out.println("Password must be at least 8 characters, please choose another one:");
						password = scanner.nextLine();
					} else if (!password.matches(".*\\d.*")) {
						System.out.println("Password must contain at least one digit, please choose another one:");
						password = scanner.nextLine();
					} else if (!password.matches(".*[A-Z].*")) {
						System.out.println(
								"Password must contain at least one uppercase letter, please choose another one:");
						password = scanner.nextLine();
					} else if (!password.matches(".*[~!@#$%^&*].*")) {
						System.out.println(
								"Password must contain at least one of the following special characters: ~!@#$%^&*, please choose another one:");
						password = scanner.nextLine();
					} else {
						break;
					}
				}

				System.out.println("Account registered successfully! Your username is " + username
						+ " and your password is " + password);
			}
		}
	}
}