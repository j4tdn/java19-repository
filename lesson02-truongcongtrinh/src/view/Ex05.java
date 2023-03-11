package view;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		String n;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter an integer: ");
			n = sc.nextLine();
		} while (!checkIntTwoChars(n));
		if(checkPalindrome(Integer.parseInt(n))) System.out.println(n + " is Palinrome Number");
		else System.out.println(n + " is not a palinrome number");
	}
	
	public static boolean checkIntTwoChars(String number) {
		if(number.length()<2) return false;
		for (int i = 0; i < number.length(); i++) {
			if(number.length()>=3 && number.charAt(number.length()-1)=='0' && number.charAt(number.length()-2)=='.') return true;
			if (!Character.isDigit(number.charAt(i)) || Math.ceil(Double.parseDouble(number))!=Math.floor(Double.parseDouble(number)) )
				return false;
		}
		return true;
	}
	
	public static boolean checkPalindrome(int number) {
		int res = 0;
		int n = number;
		while(n>0) {
			res = res*10 + n%10;
			n/=10;
		}
		if(res == number) return true;
		return false;
	}
}
