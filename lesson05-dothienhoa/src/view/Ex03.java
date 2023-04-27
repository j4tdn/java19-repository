package view;

public class Ex03 {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 4 };
		System.out.println("Bội chung nhỏ nhất của các phần tử trong mảng là: " + getLeastCommonMultiple(arr));
	}

	private static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}

	private static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

	private static int getLeastCommonMultiple(int[] arr) {
		int result = arr[0];
		for (int i = 0; i < arr.length; i++) {
			result = lcm(result, arr[i]);
		}
		return result;
	}

}
