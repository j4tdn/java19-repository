package homework;

import java.util.Scanner;

public class Ex7 {
	
	private static void convertBinary(int n) {
		String binary = "";
		while(n != 0) {
			binary = n % 2 + binary;
			n /= 2;
		}
		System.out.println(binary);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		convertBinary(number);
	}

}
