package ex04;

import java.util.Scanner;
import java.util.regex.Pattern;

public class AccountRegistration {
	private static Scanner ip = new Scanner(System.in);

	public static boolean validatePassword(String username, String password) throws InvalidAccountException {
		if (!password.matches(".{8,}")) {
			throw new InvalidAccountException("Password at least 8 character");

		} else if (!password.matches(".*\\d.*")) {
			{
				throw new InvalidAccountException("Password at least 1 number");
			}
		} else if (!password.matches(".*[A-Z].*")) {
			{
				throw new InvalidAccountException("Password at least 1 Uppercase character");
			}
		} else if (!password.matches(".*[~!@#$%^&*].*")){
			{
				throw new InvalidAccountException("Password at least 1 special character  (~!@#$%^&*)");
			}
		}
		
		//Chua lam duoc
//		else if (!password.matches("(?!.*" + username + ".{" + (username.length() - 3) + ",})")){
//			{
//				throw new InvalidAccountException("Password cannot duplicate more than 3 characters with account name");
//			}
//		}
		
		else {
			return true;
		}
	}

	public static void main(String[] args) {
		String username = null;
		String password = null;
		System.out.println("Type your username: ");
		username = ip.nextLine();

		do {
			try {
				System.out.print("Enter password: ");
				password = ip.nextLine();
				validatePassword(username, password);
				System.out.println("Registration account successfully!");
				break;
			} catch (InvalidAccountException e) {
				System.out.println(e.getMessage());
			}
		} while (true);
		ip.close();
	}
}
