package view;

import java.util.Arrays;

import utils.ArrayUtils;

public class Ex01 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 3, 1 };
		System.out.println("third max number: " + thirdMaxNumber(a));
		System.out.println("After remove duplicate: " + Arrays.toString(removeDuplicate(a)));

		compareAverageOfHalfFisrtAndHalfLast(a);

	}

	private static int[] removeDuplicate(int[] array) {
		int[] resultArray = new int[array.length];
		int running = 0;
		for (int a : array) {
			if (!ArrayUtils.isDuplicate(resultArray, a)) {
				resultArray[running++] = a;
			}
		}
		return Arrays.copyOfRange(resultArray, 0, running);
	}

	private static void compareAverageOfHalfFisrtAndHalfLast(int[] array) {
		int midIndex = array.length / 2;
		int halfFisrt = 0;
		int halfLast = 0;
		if (array.length % 2 == 0) {
			for (int i = 0; i < array.length; i++) {
				if (i < midIndex) {
					halfFisrt += array[i];
				} else {
					halfLast += array[i];
				}
			}
		}

		if (array.length % 2 != 0) {
			for (int i = 0; i < array.length; i++) {
				if (i < midIndex) {
					halfFisrt += array[i];
				} else if (i > midIndex) {
					halfLast += array[i];
				}
			}
		}

		if (halfFisrt > halfLast) {
			System.out.println("half fisrt " + halfFisrt + " > half last " + halfLast);
		} else if (halfFisrt < halfLast) {
			System.out.println("half fisrt " + halfFisrt + " < half last " + halfLast);
		} else {
			System.out.println("half first equals to half half last");
		}
	}

	private static int thirdMaxNumber(int[] array) {
		Arrays.sort(array);
		int count = 0;
		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i] > array[i - 1]) {
				count++;
			}
			if (count == 3) {
				return array[i];
			}
		}
		return 0;
	}
}
