package view.sorting;

import java.util.Arrays;

import Utils.ArrayUtils;
import functional.IntComparator;

public class Ex01BubbleSort_int {
public static void main(String[] args) {
	int[] numbers = {1, 5, 11, 9, 4, 6 };
	
	System.out.println("\n===============***_strategy_***\n");
	System.out.println("origin -> " +Arrays.toString(numbers));
	bubbleSort(numbers, (i1, i2) -> {
		return i1 > i2;
	});
	
	System.out.println("bubble sort ASC -> " + Arrays.toString(numbers));
	bubbleSort(numbers, (i1, i2) -> {
		return i1 < i2;
	});
	System.out.println("bubble sort DESC -> " + Arrays.toString(numbers));
}
/*
 * Tăng dần 
 * Sau mỗi round(i)-> tìm được phần tử lớn nhất
 * Lần kế tiếp sẽ bỏ qua việc xử lý với các phần tử lớn nhất đó
 */
private static void bubbleSort(int[] numbers, IntComparator comparator) {
	for(int i = 0; i < numbers.length; i++) {
		for(int j = 0; j < numbers.length - 1; j++) {
			if(comparator.compare(numbers[j], numbers[j + 1])) {
				ArrayUtils.swap(numbers, j, j + 1);
			}
			
		}
	}
}
}
