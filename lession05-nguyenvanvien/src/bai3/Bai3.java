package bai3;

public class Bai3 {
	public static void main(String[] args) {
		int[] arr = {2,3};
		System.out.println(getLeastCommonMultiple(arr));
	}
	
	static int getLeastCommonMultiple(int[] arr) {
		int max = findMax(arr);
		while(true) {
			if(check(max, arr)) break;
			max ++;
		}
		return max;
	}
	
	static boolean check(int num,int[] arr) {
		boolean check = true;
		int max = findMax(arr);
		for(int i : arr) {
			if(num % i !=0) return false;
		}
		return true;
	}
	
	static int findMax(int[] arr) {
		int max = arr[0];
		for (int i : arr) {
			if(i>max) max = i;
		}
		return max;
	}
}
