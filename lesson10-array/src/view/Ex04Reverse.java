package view;

import java.util.Arrays;

public class Ex04Reverse {
	
	public static void main(String[] args) {
		// KDL NT --> int, double
		
		// KDL DT --> Integer, String, Double
		//        --> Customer, Item
		
		int[] origin = {1, 9, 5, 8, 36, 12, 33};
		
		System.out.println("origin --> " + Arrays.toString(origin));
		
		reverse(origin);
		
		System.out.println("reverse --> " + Arrays.toString(origin));
		
	}
	
	private static void reverse(int[] origin) {
		// i và length - i - 1 là 2 vị trí đối xứng trong mảng
		for (int i = 0 ; i < origin.length/2; i++) {
			int tmp = origin[i];
			origin[i] = origin[origin.length - i - 1];
			origin[origin.length - i - 1] = tmp;
		}
	}
}