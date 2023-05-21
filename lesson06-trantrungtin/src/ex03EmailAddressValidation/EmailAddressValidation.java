package ex03EmailAddressValidation;

import java.util.Scanner;

public class EmailAddressValidation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("\n==============Email Address Validation==============");
			System.out.print("Enter your email address: ");
			String email = scanner.nextLine();

			if (isValidEmail(email)) {
				System.out.println("validated successfully --> your email address: " + email);
				break;
			} else {
				System.err.println("Invalid email address. Please try again.");
			}
		}
	}

	private static boolean isValidEmail(String email) {
		String prefixString = "[a-zA-Z0-9]+([._-][a-zA-Z0-9]+)*";
		String domainString = "[a-zA-Z0-9]+([.-][a-zA-Z0-9]+)*\\.[a-zA-Z]{2,}";

		String[] half = email.split("@");
		if (half.length != 2) {
			return false;
		}

		String prefix = half[0];
		String domain = half[1];

		return prefix.matches(prefixString) && domain.matches(domainString);
	}

}
