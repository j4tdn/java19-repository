package view;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Hãy nhập số nguyên dương n: ");
		int result = 1;
		int n = Integer.parseInt(in.nextLine());
		for (int i = 1; i <= n; i++) {
			result *= i; 
		}
		System.out.println("Giai thừa của " + n + " là : " + result);
	}
}
