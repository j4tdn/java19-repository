package exam;

public class Ex03 {
	private static int getLeastCommonMultiple(int[] arr) {
		int n = arr.length;
		int x = arr[n - 1] * arr[n - 2];
		int z = 2;
		while (true) {
			for (int i = 0; i < n; i++) {

				if (z % arr[i] == 0) {
					if (arr[i] == arr[n - 1]) {
						return z;
					}
					continue;
				} else
					break;
			}
			z++;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 12, 16, 48};
		System.out.println(getLeastCommonMultiple(arr));
	}
}
