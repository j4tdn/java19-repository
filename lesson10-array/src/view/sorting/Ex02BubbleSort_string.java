package view.sorting;

import java.util.Arrays;

import Utils.ArrayUtils;
import functional.StringComparator;

public class Ex02BubbleSort_string {
public static void main(String[] args) {
	String[] sequences = {null, "a", "b",null, "c", "d", "z",null, "f"};
	
	
	System.out.println(Arrays.toString(sequences));
	System.out.println("\n=========================\n");
	bubbleSort(sequences, (s1, s2) -> {
		if(s1 == null) {
			return false;
		}
		if(s2 == null) {
			return true;
		}
		return s1.compareTo(s2) > 0;
		
	});
	System.out.println("bubble sort string ASC -> " + Arrays.toString(sequences));
	bubbleSort(sequences, (s1, s2) -> {
		if(s1 == null && s2 != null) {
			return true;
		}
		if(s2 == null) {
			return false;g
		}
		return s1.compareTo(s2) < 0;
	});
	System.out.println("bubble sort string DESC -> " + Arrays.toString(sequences));
}
private static void bubbleSort(String[] sequences, StringComparator comparator) {
	for(int i = 0; i< sequences.length; i++) {
		for(int j = 0; j < sequences.length - i - 1; j++ ) {
			if(sequences[j].compareTo(sequences[j], sequences[j + 1])) {
				ArrayUtils.swap(sequences, j, j + 1);
			}
		}
	}
}
}
