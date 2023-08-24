package view;

import java.util.Arrays;

public class Ex04Reverse {
	public static void main(String[] args) {
		int[] origin = {1, 9, 5, 36, 12, 33};
		reverse(origin);
		System.out.println(Arrays.toString(origin));
	}
	
	private static void reverse(int [] origin) {
		for(int i = 0; i < origin.length/2; i++) {
			int tmp = origin[i];
			origin[i] = origin[origin.length - i - 1];
			origin[origin.length - i - 1] = tmp;
		}
	}
}
