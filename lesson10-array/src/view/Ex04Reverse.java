package view;

import java.util.Arrays;

public class Ex04Reverse {
public static void main(String[] args) {
	int[] origin = {1,9,5,36,12,33};
	System.out.println("orgin -> " + Arrays.toString(origin));
	reverse(origin);
	System.out.println("reverse -> " + Arrays.toString(origin));
}
private static void reverse(int[] origin) {
	
	// i và length - i - 1 là hai vị trí đối xứng nhau trong mảng
	for(int i = 0; i < origin.length/2; i++) {
		int temp = origin[i];
		origin[i] = origin[origin.length - i -1];
		origin[origin.length - i - 1 ] = temp;
	}
}
}
