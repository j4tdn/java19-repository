package view.sorting.theory;

import java.util.Arrays;

import utils.ArrayUtils;

public class Ex05SelectionSort {
	public static void main(String[] args) {
		int[] numbers = {8,5,11,9,4,6};
		
		System.out.println("numbers --> " + Arrays.toString(numbers));
		selectionSort(numbers);
		
		System.out.println("numbers sorted --> " + Arrays.toString(numbers));
		
	}
	
	private static void selectionSort(int[] numbers) {
		
		// i = round
		for(int i= numbers.length-1; i>0;i--) {
			for(int j=0; j<i;j++)
			{
				if(numbers[j] > numbers[i]) {
					ArrayUtils.swap(numbers, i, j);
				}
			}
		}
	}
	
}
