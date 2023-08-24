package view.sorting.theory;

import java.util.Arrays;

import functional.StringComparator;
import utils.ArrayUtils;


/*
 * Sorting --> NULL handle --> NULL first, last, remaining element(asc, desc)
 *  */
public class Ex02BubbleSort_String {
	public static void main(String[] args) {
		String[] sequences = {null, "a", null, null, "c", "b", "d", "z", "f"};
		
		//ASC
		bubbleSort(sequences, (s1, s2) -> {
			//null first
			if(s1 == null) {
				//no swap
				return false;
			}
			if(s2 == null) {
				return true;
			}
			return s1.compareTo(s2) > 0;
		});
		System.out.println("ASC "+ Arrays.toString(sequences));
		
		bubbleSort(sequences, (s1, s2) -> {
			//null last
			if(s1 == null && s2 != null) {
				//no swap
				return true;
			}
			if(s2 == null) {
				return false;
			}
			return s1.compareTo(s2) < 0;
		});
		System.out.println("DESC "+ Arrays.toString(sequences));
	}
	
	private static void bubbleSort(String [] sequences, StringComparator stringComparator) {
		for(int i = 0; i < sequences.length; i++) {
			for(int j = 0; j < sequences.length - i - 1; j++) {
				if(stringComparator.compare(sequences[j], sequences[j+1])) {
					ArrayUtils.swap(sequences, j, j+1);
				}
			}
		}
	}
}
