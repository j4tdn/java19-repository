package bai3;

import java.util.Scanner;

public class CreateNewEmail {
	public static void main(String[] args) {
		EnterEmail();
	}
	
	public static void EnterEmail(){
		Scanner ip = new Scanner(System.in);
		do {
			try {
				System.out.print("Enter new email: ");
				String email = ip.nextLine();
				EmailValidation.validate(email);
				System.out.println("Successfull");
				break;
			} catch (EmailException e) {
				System.out.println(e.getMessage());
			}			
		} while (true);
	}
	
}
