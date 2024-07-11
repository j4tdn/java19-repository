package code300;

import java.util.Arrays;

public class Ex18 {
public static void main(String[] args) {
	int[] array = {-4,-1,0,3,10};
	int[] result = sortedSquares(array);
	System.out.println(Arrays.toString(result));
}
public static int[] sortedSquares(int[] nums) {
	int running = 0;
	int []squares = new int[nums.length]; 
	for(int i = 0; i < nums.length; i++) {
	 squares[running++] = (int)Math.pow(nums[i], 2);
	}
	Arrays.sort(squares);
	return squares;
}

}
