package exception.exercise;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex03 {
	public static void main(String[] args) {
		String validEmail = getValidEmail();
	System.out.println("Địa chỉ email hợp lê. " + validEmail);	
	}
	public static boolean isValidEmail(String email) {
        String pattern = "^[\\w.-]+@[\\w.-]+\\.[\\w]+$";
        return Pattern.matches(pattern, email);
    }
	
	public static String getValidEmail(){
		Scanner sc = new Scanner(System.in);
		String email;
		do {
			System.out.println("Nhập địa chỉ email: ");
			email = sc.nextLine();
			if(!isValidEmail(email)) {
				System.out.println("Địa chỉ email ko hợp lệ. Nhập lại.");
			}
		}while (!isValidEmail(email));
		return email;
	}
}
