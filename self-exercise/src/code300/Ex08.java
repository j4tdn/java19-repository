package code300;

import java.util.Arrays;

public class Ex08 {
public static void main(String[] args) {
	int[] array = {-2,1,-3,4,-1,2,1,-5,4};
	int result = maxSubarray(array);
	System.out.println(result);
	
}
private static int maxSubarray(int[] array) {
	try {
		if(array == null || array.length == 0) {
			throw new IllegalArgumentException("Mảng không hợp lệ!");
		}
	} catch ( IllegalArgumentException e) {
		e.printStackTrace();
	}
	
	int maxSum = array[0];
	int currentSum = array[0];
	
	for(int i = 1; i < array.length; i++) {
		currentSum = Math.max(array[i], currentSum + array[i]);
		maxSum = Math.max(maxSum, currentSum);
	}
	return maxSum;
}
}
