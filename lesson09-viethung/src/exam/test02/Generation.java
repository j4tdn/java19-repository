package exam.test02;

import java.util.Scanner;

public class Generation {
	public static void generatePermutations(String str) {
		char[] chars = str.toCharArray();
		generatePermutations(chars, 0);
	}

	public static void generatePermutations(char[] chars, int index) {
		if (index == chars.length - 1) {
			System.out.println(new String(chars));
			return;
		}

		for (int i = index; i < chars.length; i++) {
			swap(chars, index, i);
			generatePermutations(chars, index + 1);
			swap(chars, index, i); // Backtrack: restore the original order
		}
	}

	public static void swap(char[] arr, int i, int j) {
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		String str = "abc";
		generatePermutations(str);
	}
}
