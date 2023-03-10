package view;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số nguyên dương N: ");
		n = scanner.nextInt();
		int factorial = 1;
		for (int i = n; i > 0; i--) {
			factorial *= i;
		}
		System.out.println(n + "!= " + factorial);
	}
}
