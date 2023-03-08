package exercise.lesson02;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while (count < 10) {
			System.out.println("Nhập số nguyên dương ở hệ cơ số 10: ");
			int decimal = sc.nextInt();

			int[] binary = new int[32];
			int index = 0;

			while (decimal > 0) {
				binary[index++] = decimal % 2;
				decimal /= 2;
			}

			System.out.println("Số nhị phân tương ứng là: ");
			for (int i = index - 1; i >= 0; i--) {
				System.out.print(binary[i]);
			}
		}count++;
	}
}
