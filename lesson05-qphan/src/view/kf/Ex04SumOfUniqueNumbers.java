package view.kf;

import java.util.Arrays;

/**
 * Viết chương trình tìm tổng các phần tử không trùng nhau trong mảng
ngoại trừ phần tử lớn nhất và phần tử nhỏ nhất.
 * 
 * int[] a = {1, 5, 8, 9, 2, 5, 9} --> Tổng = 2 + 5 + 8 = 15
 * int[] a = {4, 2, 6, 6, 4, 15, 1} --> Tổng = 2 + 4 + 6 = 12
 * 
 * B1: int[] uniqueElements = new int[a.length];
 * B2: Loop element in 'a' array
 *     if (element not exits in 'uniqueElements') {
 *         uniqueElements.add(element)
 *     } else {
 *         -- ignore
 *     }
 *     --> uniqueElements(1,5,8,9,2) --> 1,2,5,8,9
 * B3: max, min
 *     sum of not min, max
 * 
 * @author qphan
 *
 */
public class Ex04SumOfUniqueNumbers {
	public static void main(String[] args) {
		int[] numbers = {1, 5, 8, 0, 0, 2, 5, 9};
		System.out.println("uniqueElements --> " + Arrays.toString(numbers));
		System.out.println("sum --> " + sum(numbers));
	}
	
	// 0, 0, 0, 0, 0, 0, 0
	private static int sum(int[] numbers) {
		// B1: find unique elements
		int[] uniqueElements = new int[numbers.length];
		int running = 0;
		for (int number: numbers) {
			if (!contains(uniqueElements, running, number)) {
				uniqueElements[running++] = number;
			}
		}
		
		uniqueElements = Arrays.copyOfRange(uniqueElements, 0, running);
		
		// B2: find sum of elements except min, max
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int number: uniqueElements) {
			if (number < min) {
				min = number;
				continue;
			}
			if (number > max) {
				max = number;
			}
		}
		int sum = 0;
		for (int number: uniqueElements) {
			if (number != min && number != max) {
				sum += number;
			}
		}
		return sum;
	}
	
	private static boolean contains(int[] elements, int realValueCount, int number) {
		for (int i = 0; i < realValueCount; i++) {
			if (elements[i] == number) {
				return true;
			}
		}
		return false;
	}
}
