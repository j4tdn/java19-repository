package bai2;

import java.util.Scanner;

public class CreateNewPassword {
	public static void main(String[] args) {
		EnterPassword();
	}
	
	public static void EnterPassword(){
		Scanner ip = new Scanner(System.in);
		do {
			try {
				System.out.print("Enter new password: ");
				String pass = ip.nextLine();
				PasswordValidation.validate(pass);
				System.out.println("Successfull");
				break;
			} catch (PasswordException e) {
				System.out.println(e.getMessage());
			}			
		} while (true);
	}
}
