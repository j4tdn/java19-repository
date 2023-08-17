package view;

import java.util.Arrays;

import utils.SortUntils;

public class Ex08SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 8, 5, 11, 9, 4, 6 };
		System.out.println("numbers: " +Arrays.toString(numbers));
		
		selectionSort(numbers);
		System.out.println("SelectionSort: " +Arrays.toString(numbers));

	}
	private static void selectionSort(int[] origin) {
		for (int round = origin.length - 1; round > 0 ; round--) {
			for (int i = 0; i < round; i++) {
				if(origin[i] > origin[round]) {
					SortUntils.swap(origin, round, i);
				}
			}
			System.out.println("After round " + (origin.length - round) + "-->" + Arrays.toString(origin));
		}
	}

}
