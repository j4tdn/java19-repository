package code300;

public class Ex20 {
public static void main(String[] args) {
	int []array = {	9,6,4,2,3,5,7,0,1};
	int result = missingNumber(array);
	System.out.println(result);
}
public static int missingNumber(int[] nums) {
	int n = nums.length;
	int expectedSum = n*(n + 1)/2;
	int actualSum = 0;
	
	for(int num : nums) {
		actualSum += num;
	}
	
	int result = expectedSum - actualSum;
	return result;
}
}
