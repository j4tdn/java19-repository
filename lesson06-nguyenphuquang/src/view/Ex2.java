package view;

import java.util.Scanner;

import bean.Account;
import bean.InvalidPasswordException;

public class Ex2 {

	public static void main(String[] args) {
		Account acc = createAcc();
		System.out.println(acc);
	}

	private static Account createAcc() {
		String name = "";
		String passwords = "";
		Scanner ip = new Scanner(System.in);
		while (true) {
			System.out.println("Enter Name");
			name = ip.nextLine();
			System.out.println("Enter Passwords");
			
			try {
				passwords = passwordsValidator(name,ip.nextLine());
				break;
			} catch (InvalidPasswordException ivp) {
				System.out.println(ivp.getMessage());
				
			}
			
		}
		return new Account(name, passwords);
	}

	private static String passwordsValidator(String accountName, String passwords) throws InvalidPasswordException {
		boolean containLowercase = false;
		boolean containUppercase = false;
		boolean containNumber = false;
		boolean containSpecialChar = false;
		String specialChar = "~!@#$%^&*()-_=+[]{}/;:,.<>/?";

		if (passwords.length() < 8 || passwords.length() > 256) {
			throw new InvalidPasswordException("length must be 8-256 characters");
		}

		for (int i = 0; i < passwords.length(); i++) {
			if (passwords.charAt(i) >= 'a' && passwords.charAt(i) <= 'z') {
				containLowercase = true;
			}
			if (passwords.charAt(i) >= 'A' && passwords.charAt(i) <= 'Z') {
				containUppercase = true;
			}
			if (passwords.charAt(i) >= '0' && passwords.charAt(i) <= '9') {
				containNumber = true;
			}
			for (int j = 0; j < specialChar.length(); j++) {

				if (passwords.charAt(i) == specialChar.charAt(j)) {
					containSpecialChar = true;
					break;
				}
			}

		}

		if (!containLowercase) {
			throw new InvalidPasswordException("At least 1 lowercase");
		}

		if (!containUppercase) {
			throw new InvalidPasswordException("At least 1 uppercase");
		}

		if (!containNumber) {
			throw new InvalidPasswordException("At least 1 number");
		}

		if (!containSpecialChar) {
			throw new InvalidPasswordException("At least 1 special character");
		}
		if (passwords.toLowerCase().contains(accountName.toLowerCase())) {
			
			throw new InvalidPasswordException("Must not contain your name");
		}
return passwords;
	}
}