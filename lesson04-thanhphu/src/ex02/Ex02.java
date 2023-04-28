package ex02;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		 int[] numbers = {3,47,7,12,24,35,77,54,50,25,15,20};
		 int[] result = arrange(numbers);
		 System.out.println("Result -->" + Arrays.toString(result));
		
	}
	
	public static int[] arrange(int[] numbers) {
		int[] result = new int[numbers.length];
		int running = 0;
		int runningback = numbers.length - 1;
		
		for(int number : numbers) {
			if(number % 7 == 0 && number % 5 != 0) {
				result[running++] = number;
			}
		}
		for(int number : numbers) {
			if(number % 5 == 0 && number % 7 != 0) {
				result[runningback--] = number;
			}
		}
		for(int number : numbers) {
			if((number % 5 != 0 && number % 7 != 0) || (number % 5 == 0 && number % 7 == 0)) {
				result[running++] = number;
			}
		}
		
		return result;
	}
	
	
}
