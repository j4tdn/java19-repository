package exam;

public class Ex02GetMissingNumber {
	/*
	 * / Cho mảng A gồm n-1 phần tử không trùng nhau, giá trị của mỗi phần tử trong
	 * mảng, Ak = [1, n]. Tìm số nguyên còn lại trong khoảng [1, n] không tồn tại
	 * trong mảng A.
	 * 
	 */
	public static void main(String[] args) {
		int[] Numbers = {3, 2, 1, 6, 5};
		System.out.println("Missing number ---> " + getMissingNumber(Numbers));
	}

	private static int getMissingNumber(int[] Numbers) {
	int N = 6;
	int sum = N * (N + 1) / 2;
	
		int sumOfElements = 0;
		for (int number: Numbers) {
			sumOfElements = sumOfElements + number;
		}
		return sum - sumOfElements;
	}
}
