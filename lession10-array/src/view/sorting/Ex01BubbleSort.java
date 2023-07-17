package view.sorting;

import java.util.Arrays;

import functional.IntComparator_Int;
import utils.ArrayUtils;

public class Ex01BubbleSort {
	
	/*
	 * ASC : ascending --> tăng
	 * DESC : descending --> giảm
	 * */
	public static void main(String[] args) {
		int[] numbers = {1,5,11,9,4,6};
		bubleSortASC(numbers);
		System.out.println("Buble sort ASC : " + Arrays.toString(numbers));
		
		bubleSort(numbers, (i1,i2)->{
			return i1<i2;
		});
		
		System.out.println("Buble sort DESC strategy : " + Arrays.toString(numbers));
	}
	
	private static void bubleSort(int[] numbers, IntComparator_Int comparator) {
		for(int round =0; round < numbers.length;round++) {
			for(int i= 0; i < numbers.length-round-1;i++) {
				if(comparator.compare(numbers[i], numbers[i+1])) {
					ArrayUtils.swap(numbers, i, i+1);
				}
			}
		}
	}
	
	private static void bubleSortDESC(int[] numbers) {
		for(int round =0; round < numbers.length;round++) {
			for(int i= 0; i < numbers.length-round-1;i++) {
				if(numbers[i]> numbers[i+1]) {
					ArrayUtils.swap(numbers, i, i+1);
				}
			}
		}
	}
	
	private static void bubleSortASC(int[] numbers) {
		for(int round =0; round < numbers.length;round++) {
			for(int i= 0; i < numbers.length-round-1;i++) {
				if(numbers[i]> numbers[i+1]) {
					ArrayUtils.swap(numbers, i, i+1);
				}
			}
		}
	}
}
