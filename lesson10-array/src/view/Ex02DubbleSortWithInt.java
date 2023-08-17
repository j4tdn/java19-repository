package view;

import java.util.Arrays;

import functional.CompareIntHelper;
import utils.SortUntils;

public class Ex02DubbleSortWithInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 1, 14, 33, 34, 55, 66 };
		sort(numbers, new CompareIntHelper() {
			
			@Override
			public boolean compare(int pre, int next) {
				// TODO Auto-generated method stub
				return pre < next;
			}
		});
		
		sort(numbers, (pre, next) -> pre > next);
		System.out.println(Arrays.toString(numbers));
		
		sort(numbers, (pre, next) -> pre < next);
		System.out.println(Arrays.toString(numbers));

	}
	
	private static void sort(int[] source, CompareIntHelper helper) {
		for (int round = 0; round < source.length; round++) {
			for (int i = 0; i < source.length - round - 1; i++) {
				if(helper.compare(source[i], source[i + 1])) {
					SortUntils.swap(source, i, i+1);
				}
			}
		}
	}

}
