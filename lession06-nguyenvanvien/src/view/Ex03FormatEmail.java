package view;

import java.util.Scanner;

import exception.custom.MailValidator;

public class Ex03FormatEmail {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String mail;
		MailValidator mailValidator = new MailValidator();
		System.out.print("\n Please enter your mail : ");
		do {
			mail = scanner.nextLine();
			try {
				if(mailValidator.validateEmail(mail)) {
					break;
				}
			} catch (Exception e) {
				System.out.print("\n Please reEnter your mail : ");
				e.printStackTrace();
			}
		} while (true);
		System.out.println(mail);
	}
}
