package code300;

import java.util.Arrays;

public class Ex08 {
public static void main(String[] args) {
	int[] array = {-2,1,-3,4,-1,2,1,-5,4};
	maxSubarray(array);
}
private static void maxSubarray(int[] array) {
	int start = 0;
	int end = 0;
	int length = end - start;
	int[] subarray = new int[length];
	for(int i = 0; i < length; i++) {
		subarray[i] = array[start + i];
		end++;
	}
	System.out.println(Arrays.toString(subarray));
}
}
