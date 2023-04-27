package bai2;

public class Bai2 {
	public static void main(String[] args) {
		int n= 6;
		int[] arr = {3,2,1,6,5};
		System.out.println(getMissingNumber(findMin(arr), findMax(arr),arr));
	}
	
	static int getMissingNumber(int min, int max, int[] arr) {
		int result = 0;
		for(int i = min; i<=max; i++) {
			if(!check(i, arr)) {
				return i;
			}
		}
		return result;
	}
	
	static boolean check(int x,int[] arr) {
		for(int i : arr) {
			if(i==x) return true;
		}
		return false;
	}
	
	static int findMax(int[] arr) {
		int max = arr[0];
		for (int i : arr) {
			if(i>max) max = i;
		}
		return max;
	}
	static int findMin(int[] arr) {
		int min = arr[0];
		for (int i : arr) {
			if(i<min) min = i;
		}
		return min;
	}
}
