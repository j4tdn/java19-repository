import java.util.Arrays;

public class bai4 {
	public static void main(String[] args) {
		int[] arr = {1, 5, 8, 9, 2, 5, 9};
//		int[] arr = {4, 2, 6, 6, 4, 15, 1};
//		int[] arr = {1, 1, 1, 1, 9, 9, 9}; // Sai 
//		int[] arr = {1, 1, 1, 1, 9, 9, 10};
//		int[] arr = {1, 2, 2, 2, 3, 3, 9};
//		int[] arr = {1, 2, 2, 2, 2, 2, 3};
//		int[] arr = {2, 2, 2, 2, 2, 2, 2};
		Arrays.sort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("\n" + sum(arr));
	}
	
	public static int sum(int[] arr) {
		
		int result = 0;
		for(int i = 1; i< arr.length - 1; i++) {
			if (arr[i] !=  arr[i+1]) {
				result += arr[i];
			}
			if( i == arr.length - 2) {
				if(result == 0) result += arr[i];
//				if(arr[arr.length - 1] == arr[arr.length - 2] ) result += arr[arr.length - 1];
			}
		}
		
		return result;
	}
}
