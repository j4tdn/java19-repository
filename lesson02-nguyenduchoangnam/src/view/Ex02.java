package view;

import java.util.Scanner;

public class Ex02 {
	static int n;
	static int count = 0;

	static void getInput() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter N: ");
		n = input.nextInt();
		while (n < 0 && count < 4) {
			for (int i = 0; i < 4; i++) {
				System.out.println("Erros input, try again!");
				System.out.println("Enter N: ");
				n = input.nextInt();
				count++;
				if (i == 3) {
					System.out.println("Max input");
				}
			}
		}
	}

	static boolean isPowerOfTwo() {
		if ((Math.log(n))%(Math.log(2)) == 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		getInput();
		if (n > 0) {
			if (isPowerOfTwo() == true) {
				System.out.println(n + " is Power Of Two.");
			} else {
				System.out.println(n + " is not Power Of Two.");
			}
		}

	}
}
