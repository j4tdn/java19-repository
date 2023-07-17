package view;

import java.util.Arrays;

public class Ex04Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 1, 14, 33, 34, 55, 66 };
		System.out.println("numbers-->" +Arrays.toString(numbers));
		
		reverse(numbers);
		System.out.println("reverse-->" +Arrays.toString(numbers));

	}
	private static void reverse(int[] numbers) {
		for (int i = 0; i < numbers.length/2; i++) {
			int tmp = numbers[i];
			numbers[i] = numbers[numbers.length - i -1];
			numbers[numbers.length - i -1] = tmp;
		}
	}

}
