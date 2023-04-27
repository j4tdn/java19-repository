package bai4;

public class SumArray {

	public static void main(String[] args) {
		int[] a = {4, 2, 6, 6, 4, 15, 1};
		System.out.println(sumDistinct(a));
	}

	public static int sumDistinct(int[] arr) {
		int min = arr[0];
		int max = arr[0];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}
			sum += arr[i];
		}

		sum -= (min + max);
		
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
		    for (int j = i + 1; j < arr.length; j++) {
		        if (arr[i] == arr[j]) {
		        	sum -= arr[i];
		        }
		    }
		}

		return sum;
	}

}
