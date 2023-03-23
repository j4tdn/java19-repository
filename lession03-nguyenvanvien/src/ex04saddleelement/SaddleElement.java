package ex04saddleelement;

public class SaddleElement {
	public static void main(String[] args) {
		int[][] arr = { { 47, 35, 36 }, { 23, 28, 31 }, { 46, 7, 29 } };

		// In các giá trị của mảng ra màn hình
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(); // Xuống dòng sau khi in hết các giá trị của hàng i
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (checkMinRow(i, arr[i][j], arr)) {
					if (!checkMaxColumn(j, arr[i][j], arr)) {
						System.out.println("\n" + arr[i][j]);
					}
				}
			}
		}
	}

	public static boolean checkMinRow(int dem, int num, int[][] arr) {
		for (int j = 0; j < arr[dem].length; j++) {
			if (arr[dem][j] < num)
				return false;
		}
		return true;
	}

	public static boolean checkMaxColumn(int dem, int num, int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i][dem] < num)
				return false;
		}
		return true;
	}
}
