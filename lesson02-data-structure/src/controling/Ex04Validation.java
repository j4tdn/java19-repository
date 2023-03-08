package controling;

import java.util.Iterator;
import java.util.Scanner;

public class Ex04Validation {
	public static void main(String[] args) {
		//nhập xuất số nguyê 
		//ip.next() --> trôi lệnh
		//Integer.pareseInt(ip.nextLine()) --> không bị trôi lệnh
		
		
		Scanner ip = new Scanner(System.in);
		
		String text = "";
		
		//kiểm tra hợp lệ, có phải là chuỗi số hay không
		//15 -->ok
		//a333n --> fail
		//444--> ok
		//yyy --> fail
		while(true) {
			System.out.println("Nhap so nguyen n(hop le): ");
			text = ip.nextLine();
			if(isValidNumber(text)) {
				break;
			}
			
		}
		
		int n = Integer.parseInt(text);
		System.out.println("Nhap thanh cong n = "+ n);
		
		// kiem tra n co phai la so ngto
		
		
		System.out.println(isPrime(n) ? "N la so nguyen to" : "N ko phai la so nguyen to");
		
	}
	private static boolean isPrime(int input) {
		for (int i = 2; i <= input/2; i++) {
			if(input % i == 0) {
				return false;
			}
		}return true;
	}
	private static boolean isValidNumber(String input) {
		int textLength = input.length();
		for(int i = 0; i < textLength; i ++) {
			char letter = input.charAt(i);
			//letter < '0' || letter > '9'
			if(!Character.isDigit(letter)) {
				return false;
			}
		}
		return true;
		
	}
	
}
