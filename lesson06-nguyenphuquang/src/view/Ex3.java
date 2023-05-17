package view;

import java.util.Scanner;

import bean.Email;
import bean.EmailValidator;
import bean.WrongEmailException;

public class Ex3 {

	public static void main(String[] args) {
		while (true) {
			
		try {
		Email email = emailCreator();
		System.out.println(email);
		break;
		} catch (Exception e) {
			System.out.println(e.getMessage()); 
		}
		}
		}
			

	private static Email emailCreator() throws WrongEmailException {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter email prefix");
		String prefix = ip.nextLine();
		System.out.println("Enter email domain");
		String domain = ip.nextLine();
		EmailValidator.validate(prefix,domain);
		ip.close();
		Email email = new Email(prefix, domain);
		return email;
	}
}
