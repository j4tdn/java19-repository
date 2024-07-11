package code300;

import java.util.Arrays;


public class Ex16 {
public static void main(String[] args) {
	int[] array = {0,1,0};
	System.out.println(findMaxLength(array));
}
//public static int findMaxLength(int[] nums) {
//	int result = 0;
//	int running = 0;
//	for(int i = 0; i < nums.length; i++ ) {
//		for(int j = i +  1; j < nums.length; j++) {
//			if(nums[i] == 0 && nums[i] == 1) {
//				return 0;
//			}
//			if(nums[i] != nums[j]) {
//				nums[running++] = nums[i];
//				nums[running++] = nums[j];
//				result = nums.length;
//		}else {
//			j ++;
//		}
//		
//		}
//	}
//	return result;
//}

public static int findMaxLength(int[] nums) {
	int[] subarray = {};
	int[] maxarray = {};
	
	//cắt chuỗi
	int firstindex = 0;
	int lastindex = 0;
	for(int i = 0 ; i<nums.length; i++) {
		
		while(nums[i] != nums[i+1]) {
			lastindex++;
		}
		//
		 subarray = subarray(maxarray, firstindex, lastindex);
		firstindex = lastindex + 1;
		lastindex++;
		//
		if (subarray.length > maxarray.length) {
			maxarray = subarray;
		}
		//
		if (maxarray[0] != maxarray[maxarray.length - 1]) {
			maxarray = subarray(maxarray, 0, maxarray.length - 1);
		}
		System.out.println(Arrays.toString(maxarray));
	}
	return maxarray.length;
}
public static int[] subarray(int[] array, int firstindex, int lastindex) {
	int[] subarray = {};
	for(int j = 0; j<= lastindex; j++) {
		subarray[j] = array[firstindex + j];
	}
	return subarray;
}
}
