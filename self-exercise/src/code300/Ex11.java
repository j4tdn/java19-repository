package code300;


public class Ex11 {
public static void main(String[] args) {
	int[] nums = {2,2,1,1,1,2,2};
	int result = majorityElement(nums);
	System.out.println(result);
}
public static int count(int[] nums, int number) {
	int count = 0;
	for(int index = 0; index < nums.length; index++) {
		if( number == nums[index]) {
			count ++; 
		}
		else;
	}
	
	return count;
}

public static boolean checkHalf(int[] nums, int number) {
	int half_length = nums.length/2;

	
		if(count(nums, number) > half_length) {
			return true;
		}
		else {
			return false;
		}
	 
}
public static int majorityElement(int[] nums) {
	for(int i = 0; i < nums.length; i++) {
		int number = nums[i];
		if(checkHalf(nums, number)) {
			return number;
		}else;
	}
	

	
	return -1;
}
}
