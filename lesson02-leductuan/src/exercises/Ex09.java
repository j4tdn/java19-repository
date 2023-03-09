package exercises;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {

		int primeCount = 0;
		int number = 2;
		while (primeCount<200) {
			if (isPrime(number)) {
				primeCount++;
				if (primeCount == 200) {
					System.out.println("Số nguyên tố thứ 200 là: " + number);
				}
			}
			number++;
		}

	}

	public static boolean isPrime(int input) {
		if (input == 0 || input == 1)
			return false;
		else
			for (int i = 2; i < input; i++) {
				if (input % i == 0)
					return false;
			}
		return true;
	}
}
