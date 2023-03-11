package demo1;

import java.util.Random;

public class Ex10 {

	public static void main(String[] args) {
		int[] numbers = new int[5];
		Random random = new Random();

		for (int i = 0; i < numbers.length; i++) {
			int randomNum = random.nextInt(11) + 20;
			while (contains(numbers, randomNum)) {
				randomNum = random.nextInt(11) + 20;
			}
			numbers[i] = randomNum;
		}

		for (int number : numbers) {
			System.out.print(number + " ");
		}
	}

	public static boolean contains(int[] arr, int num) {
		for (int i : arr) {
			if (i == num) {
				return true;
			}
		}
		return false;
	}

}
