package homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex4 {
	/*
	 * public static void main(String[] args) {
	 * 
	 * System.out
	 * .println("Bài 4: Viết chương trình tính tổng giải thừa của các số nguyên dương S = a! +b! + c! + d!\r\n"
	 * + "Biết rằng a,b,c,d là các số nguyên ngẫu nhiên từ 10 đến 20  [10, 20]");
	 * Random rd = new Random(); long result = 0L; for (int i = 0; i < 4; i++) {
	 * 
	 * int n = 10 + rd.nextInt(11); result += Ex3.factorial(n); System.out.print(n +
	 * "!"); if (i < 3) { System.out.print(" + "); } } System.out.print(" = " +
	 * result);
	 * 
	 * }
	 */
	public static void main(String[] args) {
		System.out
				.println("Bài 4: Viết chương trình tính tổng giải thừa của các số nguyên dương S = a! +b! + c! + d!\r\n"
						+ "Biết rằng a,b,c,d là các số nguyên ngẫu nhiên từ 10 đến 20  [10, 20]");
		// tạo 1 mảng 4 phần tử số nguyên
		Integer[] numbers = new Integer[4];
		numbers = randomIntArray(4, 10, 20);
		long result = 0l;
		for (int i = 0; i < 4; i++) {
			result += Ex3.factorial(numbers[i]);
		}
		System.out.println("Các số nguyên a, b, c, d là " + Arrays.toString(numbers));
		System.out.println("a! + b! + c! + d! = " + result);

		// True: continue;

		// false: đưa vào mảng

	}

	public static Integer[] randomIntArray(int n, int lower, int upper) {
		Integer[] numbers = new Integer[n];
		Random rd = new Random();
		int running = 0;
		while (running < n) {
			Integer temp = lower + rd.nextInt(upper - lower + 1);
			if (isExisted(numbers, temp)) {
				continue;
			}
			numbers[running++] = temp;

		}
		return numbers;
	}

	public static boolean isExisted(Integer[] numbers, Integer value) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == (value)) {
				return true;
			}
		}
		return false;
	}
}