package ex01;

import java.util.Arrays;

public class FindElements {
	public static void main(String[] args) {
		int[] a = {2,3,5,8,10};
		int[] b = {3,5,10,11,9};
		
		System.out.println("findElements --->" + Arrays.toString(findElements(a, b)));
	}
	
	public static int[] findElements(int[] a, int[] b) {
		int[] result = new int[a.length];
		int running = 0;
		for (int i = 0; i < a.length; i++) {
			for(int j = 0; j< b.length; j++) {
				if(a[i] == b[j]) {
					result[running ++] = a[i];
					break;
				}
			}
		}
		
		return Arrays.copyOfRange(result, 0, running);
	}
	
}
