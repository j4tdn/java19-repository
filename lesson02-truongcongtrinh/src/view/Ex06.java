package view;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a;
		String b;
		String c;
		do {
			System.out.print("Enter a: ");  
			a = sc.nextLine();			
		} while (!isValidNumber(a));
		do {
			System.out.print("Enter b: ");  
			b = sc.nextLine();			
		} while (!isValidNumber(b));
		do {
			System.out.print("Enter c: ");  
			c = sc.nextLine();			
		} while (!isValidNumber(c));
		System.out.println("So lon nhat: " + findGreatestNumber(Integer.parseInt(a), Integer.parseInt(b), Integer.parseInt(c)));
		System.out.println("So nho nhat: " + findSmallestNumber(Integer.parseInt(a), Integer.parseInt(b), Integer.parseInt(c)));
	}
	
	public static boolean isValidNumber(String s) {
		for(int i=0;i<s.length();i++) {
			if(!Character.isDigit(s.charAt(i))) return false;
		}
		Integer a = Integer.parseInt(s);
		if(a < 0 || a >= 20 ) return false;
		return true;
	}
	
	
	public static int findGreatestNumber(int a,int b, int c) {
		int res = Math.max(a, Math.max(b, c));
		return res;
	}
	public static int findSmallestNumber(int a,int b, int c) {
		int res = Math.min(a, Math.min(b, c));
		return res;
	}
	
}
