package view;

public class Ex02 {
	public static void main(String[] args) {
		// int[] arr = { 3, 2, 1, 6, 5 };
		int[] arr = { 3, 7, 9, 2, 1, 6, 5, 4, 10 };
		System.out.println("Số nguyên còn lại trong mảng là: " + getMissingNumber(arr));

	}

	private static int getMissingNumber(int[] arr) {
		int sumOriginalArray = 0;
		int sumNewArray = 0;
		int[] temp = new int[arr.length + 1];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = i + 1;
			sumNewArray += temp[i];
		}
		for (int i = 0; i < arr.length; i++) {
			sumOriginalArray += arr[i];
		}
		return sumNewArray - sumOriginalArray;
	}

}
