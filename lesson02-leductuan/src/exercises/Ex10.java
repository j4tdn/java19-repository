package exercises;

import java.util.Random;

public class Ex10 {

	public static void main(String[] args) {
		int[] numbers = new int[5];
		Random random = new Random();
		for (int i = 0; i < numbers.length; i++) {
			int newNumber = random.nextInt(11) + 20; 
			while (isExist(numbers, newNumber)) { 
				newNumber = random.nextInt(11) + 20; 
			}
			numbers[i] = newNumber; 
		}

		System.out.println("Các số ngẫu nhiên là: ");
		for (int number : numbers) {
			System.out.print(number + " ");
		}
	}

	private static boolean isExist(int[] array, int number) {
		for (int element : array) {
			if (element == number) {
				return true;
			}
		}
		return false;
	}
}
