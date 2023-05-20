package bai3;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailRegistration {
	private static Scanner ip = new Scanner(System.in);

	public static boolean validateEmail(String email) throws InvalidEmailException {
		if (!email.matches("^[\\w-_.+]*[\\w-_.]\\@([\\w]+\\.)+[\\w]+[\\w]$")) {
			throw new InvalidEmailException(
					"Invalid email, email must be format: xuanhung@gmail.com, xuan.hung@gmail.com, xuan-hung@gmail.com ... ");
		}
		return true;
	}

	public static void main(String[] args) {
		String email = null;
		do {
			try {
				System.out.print("Enter email: ");
				email = ip.nextLine();
				validateEmail(email);
				System.out.println("Registration email successfully!");
				break;
			} catch (InvalidEmailException e) {
				System.out.println(e.getMessage());
			}
		} while (true);
		ip.close();
	}
}
