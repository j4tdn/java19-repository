package homework;

import java.util.Scanner;

public class BT07DecimalToBinary {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a natural number: ");
		int n = ip.nextInt();
		int num = n;
		String binaryNumber = "";
		if (n == 0) {
			System.out.println(num + " in binary is: 0");
		} else {
			while (n > 0) {
				binaryNumber = n % 2 + binaryNumber;
				n /= 2;
			}
			System.out.println(num + " in binary is: " + binaryNumber);
		}
	}
}
