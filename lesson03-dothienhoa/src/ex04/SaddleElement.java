package ex04;

import java.util.Scanner;

public class SaddleElement {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập số hàng của bảng số: ");
		int m = input.nextInt();
		System.out.print("Nhập số cột của bảng số: ");
		int n = input.nextInt();
		int[][] a = new int[m][n];
		System.out.println("Nhập các phần tử của bảng số: ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = input.nextInt();
			}
		}
		boolean foundYenNgua = false;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				int minInRow = a[i][j];
				int maxInCol = a[i][j];
				for (int k = 0; k < n; k++) {
					if (a[i][k] < minInRow) {
						minInRow = a[i][k];
					}
				}
				for (int k = 0; k < m; k++) {
					if (a[k][j] > maxInCol) {
						maxInCol = a[k][j];
					}
				}
				if (a[i][j] == minInRow && a[i][j] == maxInCol) {
					foundYenNgua = true;
					System.out.printf("Phần tử yên ngựa tại hàng %d, cột %d: %d\n", i, j, a[i][j]);
				}
			}
		}
		if (!foundYenNgua) {
			System.out.println("Không tìm thấy phần tử yên ngựa trong bảng số.");
		}
	}
}
