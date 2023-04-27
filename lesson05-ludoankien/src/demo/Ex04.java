package demo;

public class Ex04 {
	public static int sumOfDistinctElements(int[] arr) {
		int min = arr[0];
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			} else if (arr[i] > max) {
				max = arr[i];
			}
		}

		int sum = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != min && arr[i] != max) {
				sum += arr[i];
				count++;
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[j] == arr[i]) {
						break;
					}
					if (j == arr.length - 1) {
						count++;
					}
				}
			}
		}

		return sum;
	}
	public static void main(String[] args) {
	    int[] arr = {4, 2, 6, 6, 4, 15, 1};
	    int sum = sumOfDistinctElements(arr);
	    System.out.println("S = " + sum);
	}
}
