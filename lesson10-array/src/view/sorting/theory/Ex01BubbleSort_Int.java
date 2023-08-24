package view.sorting.theory;

import java.util.Arrays;

import functional.IntComparator;
import utils.ArrayUtils;

public class Ex01BubbleSort_Int {

	/**
	 * Sắp xếp là cơ chế duyệt qua các phần tử trong 'mảng' Sau đó hoán vị, sắp xếp
	 * đưa các phần tử v�? đúng theo vị trí tăng/giảm dần
	 * 
	 * ASC: ascending --> tăng DESC: descending --> giảm
	 */

	public static void main(String[] args) {
		int[] numbers = { 1, 5, 11, 9, 4, 6 };

		System.out.println("origin --> " + Arrays.toString(numbers));

		System.out.println("\n=========***__***=========\n");

		bubbleSortAsc(numbers);
		System.out.println("bubble sort ASC --> " + Arrays.toString(numbers));
		
		bubbleSortDesc(numbers);
		System.out.println("bubble sort DESC --> " + Arrays.toString(numbers));
		
		System.out.println("\n=========***__strategy__***=========\n");
		
		bubbleSort(numbers, (i1, i2) -> {
			return i1 > i2;
		});
		System.out.println("bubble sort ASC --> " + Arrays.toString(numbers));
		
		bubbleSort(numbers, (i1, i2) -> {
			return i1 < i2;
		});
		System.out.println("bubble sort DESC --> " + Arrays.toString(numbers));
		
	}
	
	private static void bubbleSort(int[] numbers, IntComparator comparator) {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length - i - 1; j++) {
				if (comparator.compare(numbers[j], numbers[j + 1])) {
					ArrayUtils.swap(numbers, j, j + 1);
				}
			}
		}
	}
	
	// 0 --> compareTo
	

	/**
	 * Tăng dần Sau mỗi round(i) --> tìm được phần tử lớn nhất Lần kế tiếp sẽ b�? qua
	 * việc xử lý với phần tử lớn nhất đó
	 */
	private static void bubbleSortAsc(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length - i - 1; j++) {
				if (numbers[j] > numbers[j + 1]) {
					ArrayUtils.swap(numbers, j, j + 1);
				}
			}
		}
	}
	
	// strategy: boolean compare(int a, int b);
	//         : int     compare(int a, int b); --> > 0 (a > b)
	//                                              = 0 (a = b)
	//                                              < 0 (a < b)

	private static void bubbleSortDesc(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length - i - 1; j++) {
				if (numbers[j] < numbers[j + 1]) {
					ArrayUtils.swap(numbers, j, j + 1);
				}
			}
		}
	}

}