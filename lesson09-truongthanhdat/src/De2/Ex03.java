package De2;

import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {
		int[] array = { 8, 5, 9, 20 };
		sortArrayByLevel(array);
		System.out.println("Kết quả sau khi đã sắp xếp: " + Arrays.toString(array));
	}

	public static void sortArrayByLevel(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (getLevel(array[i]) > getLevel(array[j])) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}

	public static int getLevel(int number) {
		int count = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				count++;
			}
		}
		return count;
	}
}
