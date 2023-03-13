package datastructure.arrays;

import java.util.Arrays;
import java.util.Random;

public class Ex01BasicDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] digits = new int[8];

		digits[2] = 200;
		digits[5] = 433;

		System.out.println("digits -->" + Arrays.toString(digits));
		System.out.println("digits length: " + digits.length);
		System.out.println("digit[5] -->" + digits[5]);

		System.out.println("/n=====================/n");

		// cách 2: khai báo và khởi tạo giá trị mảng
		// int[] number = int[] {45, 57, 98, 23, 21};
		int[] number = { 45, 57, 98, 23, 21 };
		Random rd = new Random();
		int randomValue = number[rd.nextInt(number.length)];
		System.out.println("randomValue -->" +randomValue);

	}

	// lấy 1 phần tử ngẫu nhiên trong mảng
	private static int[] fetchData() {
		return new int[] { 45, 57, 98, 23, 21 };
	}
}
