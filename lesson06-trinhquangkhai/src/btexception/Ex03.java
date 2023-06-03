package btexception;

import java.util.Arrays;
import java.util.Scanner;

public class Ex03 {
public static void main(String[] args) {
	Scanner ip = new Scanner(System.in); 
	while(true) {
	try {
	System.out.println("Enter the email");
	String st = ip.nextLine();
	validMail(st);

}catch(IllegalArgumentException e) {
	System.out.println(e.getMessage());
}}


	

}
private static boolean validMail(String mail) {
	boolean letter = mail.matches(".*[A-Za-z0-9].*");
		if(!letter) {
			return false;
	}
	boolean character = mail.matches(".*[_.-].*");
	if(!character) {
		return false;
	}
	int c =Integer.valueOf(mail.indexOf('@'));
	if(c>=32 && c<=64) {
		throw new IllegalArgumentException("The prefix is invalid");
	}
	String example = "@mail.com";
	if(mail.substring(mail.indexOf('@'), mail.length())!= example) {
	throw new IllegalArgumentException("The domain is invalid");	
	}
	return true;
}
}
