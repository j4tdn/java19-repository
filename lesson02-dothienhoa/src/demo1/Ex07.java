package demo1;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số tự nhiên ở hệ cơ số 10: ");
		int decimalNumber = scanner.nextInt();
		scanner.close();

		String binaryNumber = "";
		while (decimalNumber > 0) {
			int remainder = decimalNumber % 2;
			binaryNumber = remainder + binaryNumber;
			decimalNumber /= 2;
		}

		System.out.println("Số nhị phân tương ứng là: " + binaryNumber);
	}
}
