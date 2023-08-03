package view.sorting;

import java.util.Arrays;

import functional.StringComparator;
import utils.ArrayUtils;

public class Ex02BubbleSort_String {
	public static void main(String[] args) {
		String[] sequences = { "a", null, "c", null, "b", "d", null, "z", "f", null };
		System.out.println("origin Array: " + Arrays.toString(sequences));
//		bubbleSortASC(sequences);
//		System.out.println("\n\nSorted ASC Array: " + Arrays.toString(sequences));
//
//		bubbleSortDESC(sequences);
//		System.out.println("Sorted DESC Array: " + Arrays.toString(sequences));

		System.out.println("\n========strategy========\n");

		bubbleSort(sequences, (s1, s2) -> {
			// ASC
			// NULL first
			if (s1 == null) {
				// no-swap
				return false;
			}
			// s1 = null

			if (s2 == null) {
				// swap
				return true;
			}
			return s1.compareTo(s2) > 0;
		});
		System.out.println("Sorted ASC Array: " + Arrays.toString(sequences));

		bubbleSort(sequences, (s1, s2) -> {
			// DESC
			// NULL last
			if (s1 == null && s2 != null) {
				// swap
				return true;
			}
			// s1 = null

			if (s2 == null) {
				// no swap
				return false;
			}

			return s1.compareTo(s2) < 0;
		});
		System.out.println("Sorted DESC Array: " + Arrays.toString(sequences));
	}

	private static void bubbleSort(String[] sequences, StringComparator comparator) {
		for (int i = 0; i < sequences.length; i++) {
			for (int j = 0; j < sequences.length - 1 - i; j++) {
				if (comparator.compareTo(sequences[j], sequences[j + 1])) {
					ArrayUtils.swap(sequences, j, j + 1);
				}
			}
		}
	}

//	private static void bubbleSortDESC(String[] sequences) {
//		for (int i = 0; i < sequences.length; i++) {
//			for (int j = 0; j < sequences.length - 1 - i; j++) {
//				if (sequences[j].compareTo(sequences[j + 1]) < 0) {
//					ArrayUtils.swap(sequences, j, j + 1);
//				}
//			}
//		}
//	}
//
//	private static void bubbleSortASC(String[] sequences) {
//		for (int i = 0; i < sequences.length; i++) {
//			for (int j = 0; j < sequences.length - 1 - i; j++) {
//				if (sequences[j].compareTo(sequences[j + 1]) > 0) {
//					ArrayUtils.swap(sequences, j, j + 1);
//				}
//			}
//		}
//	}

}
