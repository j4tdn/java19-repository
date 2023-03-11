package view;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Integer i = 0;
		String n;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter an integer: ");
			n = sc.nextLine();
			if (++i == 5)
				break;
		} while (!Ex01.isValidIntNumber(n));
		if(checkPrime(Integer.parseInt(n))) System.out.println(n + " la so nguyen to");
		else System.out.println(n + " khong la so nguyen to");
	}
	
	public static boolean checkPrime(int n) {
		if(n<2) return false;
		for(int i = 2;i<Math.sqrt(n);i++) {
			if(n%i==0) return false;
		}
		return true;
	}
}
