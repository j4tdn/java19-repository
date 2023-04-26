package bai2;

import java.util.Arrays;

public class Bai2 {
	public static void main(String[] args) {
		int[] arrayy = {12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18};
		int [] res = excute(arrayy);
		System.out.println(Arrays.toString(res));
	}
	
	public static int[] excute(int[] numbers) {	
		int[] result = new int[numbers.length];
		int running = 0;
		int runningback = numbers.length - 1;
		for(int number: numbers) {
			if(number % 7 == 0 && number % 5 != 0) {
				result[running++] = number;
			}
		}
		for(int i = numbers.length - 1; i >= 0; i--) {
			if (numbers[i] % 7 != 0 && numbers[i] % 5 == 0) {
				result[runningback--] = numbers[i];
			}
		}
		for(int number: numbers) {
			if(!(number % 7 == 0 && number % 5 != 0) && !(number % 7 != 0 && number % 5 == 0)) {
				result[running++] = number;
			}
		}
		
		return result;
	}
}
