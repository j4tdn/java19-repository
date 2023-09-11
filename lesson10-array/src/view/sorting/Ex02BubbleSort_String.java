package view.sorting;

import java.util.Arrays;

import functional.StringComparator;
import utils.ArrayUtils;

/**
 * int    --> numbers[j] > numbers[j+1]          
 *        --> numbers[j] - numbers[j+1] > 0
 * String --> sequences[j].compareTo(sequences[j+1]) > 0
 * 
 * Sorting --> NULL handler --> NULL first, last, remaning elements(asc, desc)
 * 
 */
public class Ex02BubbleSort_String {
	
	public static void main(String[] args) {
		String[] sequences = {null, "a", "c", null, null, "b", null, "d", "z", "f", null};
		
		System.out.println("\n=========***__***=========\n");

		// ASC
		// NULL first(NULL < normal element)
		// NULL last(NULL > normal element)
		bubbleSort(sequences, (s1, s2) -> {
			// null first
			if (s1 == null) {
				// no swap
				return false;
			}
			
			// s1 != null
			if (s2 == null) {
				// swap
				return true;
			}
			
			// s1 != null & s2 != null
			return s1.compareTo(s2) > 0;
		});
		System.out.println("bubble sort string ASC --> " + Arrays.toString(sequences));
		
		// DESC
		// NULL last
		bubbleSort(sequences, (s1, s2) -> {
			// null last
			if (s1 == null && s2 != null) {
				// swap
				return true;
			}
			
			// s1 != null
			if (s2 == null) {
				// no swap
				return false;
			}
			
			// s1 != null & s2 != null
			return s1.compareTo(s2) < 0;
		});
		System.out.println("bubble sort string DESC --> " + Arrays.toString(sequences));
		
	}
	
	// sequences[j].compareTo(sequences[j+1]) > 0
	// sequences[j].compareTo(sequences[j+1]) < 0
	
	private static void bubbleSort(String[] sequences, StringComparator comparator) {
		for (int i = 0; i < sequences.length; i++) {
			for (int j = 0; j < sequences.length - i - 1; j++) {
				if (comparator.compare(sequences[j], sequences[j+1])) {
					ArrayUtils.swap(sequences, j, j+1);
				}
			}
		}
	}
	
}