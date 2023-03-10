package homework;

import java.util.Scanner;

public class Ex8 {

	
	public static boolean isPrime(int n) {
		if(n <= 1) {
			return false;
		}
		for(int i = 2; i < Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
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
		if(isPrime(number)) {
			System.out.println(number + " is a prime");
		}else {
			System.out.println(number + " is not a prime");
		}
	}

}
