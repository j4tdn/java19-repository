package homework;

import java.util.Scanner;

public class Ex3 {

	private static long factorial(int n) {
		long fac = 1;
		if (n == 0 || n == 1) {
			return fac;
		} else {
			for (int i = 2; i <= n; i++) {
				fac *= i;
			}
		}
		return fac;
	}

	public static void main(String[] args) {
		Ex1 ex = new Ex1();
		Scanner sc = new Scanner(System.in);
		String str;
		int countErr = 0;
		do {
			System.out.println("Enter number: ");
			str = sc.nextLine();
			if (!ex.checkNumber(str)) {
				System.out.println("Enter number >= 0: ");
				System.out.println();
			}
			countErr++;
			if (countErr >= 5) {
				System.out.println("You entered wrong " + countErr + "times");
				return;
			}
		} while (!ex.checkNumber(str));
		int number = Integer.parseInt(str);
		System.out.println(factorial(number));
	}

}
