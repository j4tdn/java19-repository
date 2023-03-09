package ex05;

import java.util.Scanner;

public class SoDoiXung {
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
		
		System.out.println((kiemTraSoDoiXung(n))? "true" : "false");
		
	}
	private static boolean isValidNumber(String input) {
		int textLength = input.length();
		for(int i = 0; i < textLength; i ++) {
			char letter = input.charAt(i);
			//letter < '0' || letter > '9'
			if(!Character.isDigit(letter) || letter <= 0 || textLength == 1) {
				return false;
			}
		}
		return true;
		
	}
	 public static boolean kiemTraSoDoiXung(int n) {
	        String s = Integer.toString(n);
	        
	        
	        int i = 0;
	        int j = s.length() - 1;
	        
	        while (i < j) {
	            if (s.charAt(i) != s.charAt(j)) {
	                return false;
	            }
	            i++;
	            j--;
	        }
	        
	        return true;
	    }
}
