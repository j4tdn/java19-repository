package view;

import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {
		int[] numbers = {1,3,5,2,7,9};
		int[] result = add(55, 2, numbers);
		System.out.println(Arrays.toString(result));	
	}
	
	private static int[] add(int value, int k, int[] numbers) {
		int[] news = new int[numbers.length + 1];
		
		for(int i = 0; i < numbers.length; i++) {
			news[i] = numbers[i];
		}
		
		for(int i = news.length -1 ; i > k; i--) {
			news[i] = news[i-1];
		}
		
		news[k] = value;
		
		return news;
	}
}
