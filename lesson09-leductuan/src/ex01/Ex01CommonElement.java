package ex01;

import java.util.Arrays;

public class Ex01CommonElement {
	public static void main(String[] args) {
		int[] arr1 = {2,8,9,1,6};
		int[] arr2	 = {2,1,1,8,9};
		System.out.println(Arrays.toString(commonElement(arr1, arr2)));
	}
	public static int[] commonElement(int[] arr1, int[] arr2) {
		int[] result = new int[Math.min(arr1.length, arr2.length)];
		int running = 0;
		for (int i = 0; i < arr1.length; i++) {
			for(int j = 0; j< arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					result[running ++] = arr1[i];
					break;
				}
			}
		}
		return Arrays.copyOfRange(result, 0, running);
	}
}
