package view;

import java.util.Scanner;

public class bai05 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		while(true) {
			System.out.println("Enter N: ");
			String num = ip.nextLine();
			if(!bai01.validNumber(num)) {
				System.out.println("Not valid number, type again!!");
			}
			else {
				if(palindrome(num)) System.out.println("Is palindrome");
				else System.out.println("Is not palindrome");
			}
		}
	}
	
	private static boolean palindrome(String n) {
		int i = 0, j = n.length() - 1;
		while(i < j){
	        if(n.charAt(i) != n.charAt(j)){
	            return false;
	        }else{
	            ++i; // Tang dau
	            --j; // Giam cuoi
	        }
	    }
		return true;
	}
}
