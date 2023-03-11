package demo1;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int number = Integer.parseInt(ip.nextLine());
		factorialNumber(number);
		ip.close();
	}

	private static void factorialNumber(int number) {
		int result = 1;
		for (int i = 1; i <= number; i++) {
			result = result * i;
		}
		System.out.println(result);
	}
}
