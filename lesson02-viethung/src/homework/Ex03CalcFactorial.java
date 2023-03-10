package homework;

import java.util.Scanner;

public class Ex03CalcFactorial {
	public static boolean checkDigit(String s) {
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) < '0' || s.charAt(i) > '9') {
				return false;
			}
		}
		return true;
	}
	public static long calcFactorial(int a) {
		long result = 1;
		while(a > 0) {
			result *= a;
			a--;
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String temp = "abc";
		while(!checkDigit(temp)) {
			System.out.println("Nhap so: ");
			temp = ip.nextLine();
		}
		System.out.println(calcFactorial(Integer.parseInt(temp)));
	}
}
