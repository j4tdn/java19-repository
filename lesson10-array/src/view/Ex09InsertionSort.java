package view;

import java.util.Arrays;

import utils.SortUntils;

public class Ex09InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 8, 5, 11, 9, 4, 6 };
		System.out.println("numbers: " +Arrays.toString(numbers));
		
		insertionSort(numbers);
		System.out.println("SelectionSort: " +Arrays.toString(numbers));

	}
	private static void insertionSort(int[] origin) {
		for (int round = 1 ; round < origin.length ; round++) {
			for (int i = 0; i < round; i++) {
				if(origin[i] > origin[round]) {
					SortUntils.swap(origin, round, i);
				}
			}
			System.out.println("After round " + (round) + "-->" + Arrays.toString(origin));
		}
	}

}
