package functional;

import java.util.Arrays;

import utils.ArrayUtils;

public class Ex02BubleSort_String {
	public static void main(String[] args) {
		String[] sequences = { "a", null, "b", "d", "z", null };
//		bubleSortASC(sequences);
//		System.out.println("buble sort ASC : " + Arrays.toString(sequences));

		// null first
		bubleSort(sequences, (s1, s2) -> {
			if (s1 == null) {
				return false;
			}

			// s1!= null && s2 ==null
			if (s2 == null) {
				return true;
			}
			// s1!= null && s2!=null
			return s1.compareTo(s2) > 0;
		});
		System.out.println("buble sort DESC : " + Arrays.toString(sequences));

		// null last
		bubleSort(sequences, (s1, s2) -> {
			if (s1 == null) {
				return true;
			}

			// s1!= null && s2 ==null
			if (s2 == null) {
				return false;
			}
			// s1!= null && s2!=null
			return s1.compareTo(s2) > 0;
		});
		System.out.println("buble sort DESC : " + Arrays.toString(sequences));
	}

	private static void bubleSort(String[] sequences, StringComparator comparator) {
		for (int i = 0; i < sequences.length; i++) {
			for (int j = 0; j < sequences.length - i - 1; j++) {
				if (comparator.compare(sequences[j], sequences[j + 1])) {
					ArrayUtils.swap(sequences, j, j + 1);
				}
			}
		}
	}

	private static void bubleSortASC(String[] sequences) {
		for (int i = 0; i < sequences.length; i++) {
			for (int j = 0; j < sequences.length - i - 1; j++) {
				if (sequences[j].compareTo(sequences[j + 1]) > 0) {
					ArrayUtils.swap(sequences, j, j + 1);
				}
			}
		}
	}
}
