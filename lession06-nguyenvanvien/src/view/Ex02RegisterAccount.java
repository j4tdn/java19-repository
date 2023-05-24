package view;

import java.util.Scanner;

import exception.custom.PassValidator;

public class Ex02RegisterAccount {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please Enter User Name or Email Address : ");
		String userName  = scanner.nextLine();
		String passWord;
		
		PassValidator passValidator;
		
		do {
			System.out.print("\nPlease Enter Your Password : ");
			passWord  = scanner.nextLine();
			passValidator = new PassValidator(passWord);
			try {
				if(passValidator.validateLen() && passValidator.validateContain(userName)) {
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		while(true);
		
		System.out.println("Create Account succesfull !");
	}
}
