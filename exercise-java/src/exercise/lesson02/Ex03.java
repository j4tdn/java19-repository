package exercise.lesson02;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		long factorial = 1;
		int i = 1;
		int n = 1;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		while (count < 10) {
			do {
				System.out.println("Nhập n: ");
				n = sc.nextInt();
			} while ((n <= 0) || (n > 10));

			while (i <= n) {
				factorial *= i;
				i++;
			}

			System.out.println(n + "! = " + factorial);
			count++;
		}
	}
}
