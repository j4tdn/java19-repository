package view.kt;

import java.util.Arrays;

public class Ex04UniqueNumber {
	public static void main(String[] args) {
		int[] a = { 3, 15, 21, 0, 15, 17, 21 };
		System.out.println(Arrays.toString(getUniqueNumbers(a)));
	}

	public static int[] getUniqueNumbers(int[] elements) {
		Tuple[] tuples = new Tuple[elements.length];
		int running = 0;
		for (int element : elements) {
			int indexOf = indexOf(tuples, element, running);
			if (indexOf >= 0 ) {
				Tuple existedTuple = tuples[indexOf];
				existedTuple.plus();
			} else {
				Tuple newTuple = new Tuple(element, 1);
				tuples[running++] = newTuple;
			}
		}
		tuples = Arrays.copyOfRange(tuples, 0, running);
		running = 0;
		int[] result = new int[tuples.length];
		for(Tuple tuple: tuples) {
			if(tuple.isUnique()) {
				result[running++] = tuple.getValue();
			}
		}
		return Arrays.copyOfRange(result, 0, running);
	}
	
	private static int indexOf(Tuple [] tuples, int element, int numberOfRealValues) {
		for(int i = 0; i < numberOfRealValues; i++) {
			if(tuples[i].getValue() == element) {
				return i;
			}
		}
		return -1;
	}
}
