package controlling;

import java.util.Scanner;

public class Ex04Validation {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		while(true) {
			System.out.println("Nhap so: ");
			String input = ip.nextLine();
			
			if(check(input)) {
				System.out.println("Nhap thanh cong!");
				break;
			}
		}
	}
	public static boolean check(String a) {
		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i) > '9' || a.charAt(i) < '0') {
				return false;
			}
		}
		return true;
	}
}
