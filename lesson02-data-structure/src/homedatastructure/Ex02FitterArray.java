package homedatastructure;

import java.util.Arrays;

public class Ex02FitterArray {

	public static void main(String[] args) {
		int[] numbers = {23, 33, 55, 66, 77};
		
		int[] oddNumbers = findOddNumber(numbers);
		System.out.println(Arrays.toString(oddNumbers));

	}
	//int[] elements = numbers
	private static int[] findOddNumber(int[] elements) {
		//index: 0 1 2 3 4
		//value: 23 33 55 0 0
		int[] oddElements = new int[elements.length];
		int count = 0;
		for(int element : elements) {
			if (element % 2 !=0) {
				oddElements[count] = element;
				count++;
			}
//		}
//		int[] result = new int[count];
//		for (int i = 0; i < count; i++) {
//			result[i] = oddElements[i];
		}
		return oddElements;
	}

}
