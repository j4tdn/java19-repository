package test1;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Enter your username: ");
		String username = ip.nextLine(); 
		while(true) {
		try {
		System.out.println("Enter your password: ");
		String 	password = ip.nextLine();
		if(valid(password, username)) {
			System.out.println("Sign Up Success");
			break;
		}
	}	catch(IllegalArgumentException i) {
		System.out.println(i.getMessage());
	}
		break;
		}
		}

	public static boolean valid(String pass, String username) {
		if(pass.length() <= 8) {
			throw new IllegalArgumentException("The password have at least 8 char ");
		}
		if(!pass.matches(".*[A-Z].*")) {
			throw new IllegalArgumentException("The password have at least 1 uppercase alphabetic char");
		}
		if(!pass.matches(".*\\d.*")) {
			throw new IllegalArgumentException("The password have at least 1 number");
		}
		if(!pass.matches(".*(~!@#$%^&*).*")) {
			throw new IllegalArgumentException("The password have at least 1 special char");
		}
		
		for(int i = 0; i < username.length() -2; i++) {
			if(pass.contains(username.substring(i,i+3))) {
				throw new IllegalArgumentException("Password must not be more than 3 characters similar to your account ");
			}
		}
		return true;
	}
}
