package ex01;

import java.util.Scanner;

public class KtBoiCua2 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		String text = "";
		
		while(true) {
			System.out.println("Nhap so nguyen n(hop le): ");
			text = ip.nextLine();
			if(isValidNumber(text)) {
				break;
			} System.out.println("Nhap N khong hop le, yeu cau nhap lai");
			
			
		}
		
		int n = Integer.parseInt(text);
		System.out.println("Nhap thanh cong n = "+ n);
		
		//kiem tra n co phai boi cua 2
		System.out.println((n %2 == 0) ? "True" : "False");
		
	}
	private static boolean isValidNumber(String input) {
		int textLength = input.length();
		for(int i = 0; i < textLength; i ++) {
			char letter = input.charAt(i);
			//letter < '0' || letter > '9'
			if(!Character.isDigit(letter) || letter <= 0) {
				return false;
			}
		}
		return true;
		
	}	
}
