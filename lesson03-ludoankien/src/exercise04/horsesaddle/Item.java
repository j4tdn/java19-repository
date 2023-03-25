package exercise04.horsesaddle;

import java.util.Scanner;

public class Item {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập số hàng M: ");
		int m = scanner.nextInt();
		System.out.print("Nhập số cột N: ");
		int n = scanner.nextInt();

		int[][] matrix = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("Nhập phần tử A" + i + j + ": ");
				matrix[i][j] = scanner.nextInt();
			}
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				int num = matrix[i][j];
				boolean isMinInRow = true;
				boolean isMaxInColumn = true;

				for (int k = 0; k < n; k++) {
					if (matrix[i][k] < num) {
						isMinInRow = false;
						break;
					}
				}

				for (int k = 0; k < m; k++) {
					if (matrix[k][j] > num) {
						isMaxInColumn = false;
						break;
					}
				}

				if (isMinInRow && isMaxInColumn) {
					System.out.println("Phần tử A" + i + j + " là phần tử yên ngựa: " + num);
					return;
				}
			}
		}

		System.out.println("Không có phần tử yên ngựa trong ma trận.");
	}
}
