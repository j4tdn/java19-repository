package view;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numberOfAttempts = 0;
		double inputNumber = 0;

		while (true) {
			System.out.print("Nhập vào một số thực có phần thập phân khác 0: ");
			try {
				inputNumber = Double.parseDouble(in.nextLine());
				if (inputNumber != (int) inputNumber && inputNumber != 0) {
					break;
				} else {
					System.out.println("Số bạn nhập không hợp lệ.");
					numberOfAttempts++;
					if (numberOfAttempts >= 3) {
						System.out.println("Số lần nhập sai quá nhiều. Kết thúc chương trình.");
						return;
					}
				}
			} catch (NumberFormatException e) {
				System.out.println("Số bạn nhập không hợp lệ.");
				numberOfAttempts++;
				if (numberOfAttempts >= 3) {
					System.out.println("Số lần nhập sai quá nhiều. Kết thúc chương trình.");
					return;
				}
			}
		}

		int numerator = 1;
		int denominator = 1;
		double epsilon = 0.000001;

		while (Math.abs(inputNumber - (double) numerator / denominator) > epsilon) {
			if ((double) numerator / denominator < inputNumber) {
				numerator++;
			} else {
				denominator++;
			}
		}

		System.out.println("Phân số tối giản của " + inputNumber + " là: " + numerator + "/" + denominator);
	}
}