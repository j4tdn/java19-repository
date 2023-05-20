package excercise;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex02 {
	private static void isValid(String s) {
		if(!s.matches(".{8,256}")) {
			throw new IllegalArgumentException("Password must be more than 8 characters and less than 256 characters!!!");
		}
		if(!s.matches(".*[a-z].*")) {
			throw new IllegalArgumentException("Password must contains at least one lowercase letter !!!");
		}
		if(!s.matches(".*[A-Z].*")) {
			throw new IllegalArgumentException("Password must contains at least one uppercase letter !!!");
		}
		if(!s.matches(".*[0-9].*")) {
			throw new IllegalArgumentException("Password must contains at least one number !!!");
		}
		if(!s.matches(".*[~!@#$%^&*(()_{}\\[\\]\\|\\:;.,<>/?].*")) {
			throw new IllegalArgumentException("Password must contains at least one special character !!!");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Nhap mat khau: ");
			String password = sc.nextLine();
			try {
				isValid(password);
				System.out.println("Valid password !!!");
				break;
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		} while (true);
	}
	
}
