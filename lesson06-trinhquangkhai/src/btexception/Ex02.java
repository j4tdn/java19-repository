package btexception;

import java.util.Scanner;

public class Ex02 {
public static void main(String[] args)  {
	Scanner ip = new Scanner(System.in);
while(true) {
	System.out.println("Create a new password");
	String pass = ip.nextLine();
	try {
		validPass(pass);
	}catch(IllegalArgumentException i) {
		System.out.println(i.getMessage());
	}
	if(validPass(pass) == true) {
	break;
	}
	System.out.println("The password are generated successfully");
	break;
}


}
public static boolean validPass(String password)  {
	boolean valid = true;
	if((password.length() < 8 && password.length() > 256)) {
		throw new IllegalArgumentException("The password have at least 8 char and at most 256 char ");
	}
	if(!password.matches(".*[a-z].*")) {
		throw new IllegalArgumentException("The password have at least 1 lowercase alphabetic char ");
	}
	if(!password.matches(".*[A-Z].*")) {
		throw new IllegalArgumentException("The password have at least 1 uppercase alphabetic char");
	}
	if(!password.matches(".*\\d.*")) {
		throw new IllegalArgumentException("The password have at least 1 number");
	}
	if(!password.matches(".*[!@#$%^&*()_{}].*")) {
		throw new IllegalArgumentException("The password have at least 1 special char");
	}
	return false;
}
}
