package view;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập số cần chuyển đổi: ");
		int decimal = scanner.nextInt();
		String binary = decimalToBinary(decimal);
		System.out.println(decimal + " trong hệ nhị phân là: " + binary);
	}

	public static String decimalToBinary(int decimal) {
		String binary = "";
		while (decimal > 0) {
			int remainder = decimal % 2;
			binary = remainder + binary;
			decimal = decimal / 2;
		}
		return binary;
	}
}