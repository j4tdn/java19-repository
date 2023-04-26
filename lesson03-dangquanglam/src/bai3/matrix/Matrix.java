package bai3.matrix;

import java.util.Scanner;

public class Matrix {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Nhập kích thước bảng số
		System.out.println("Nhập số hàng:");
		int m = input.nextInt();
		System.out.println("Nhập số cột:");
		int n = input.nextInt();

		// Khởi tạo bảng số
		int[][] matrix = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				// Nhập giá trị cho từng phần tử trong bảng số
				System.out.println("Nhập giá trị cho phần tử A" + i + j);
				matrix[i][j] = input.nextInt();
			}
		}

		// Kiểm tra phần tử yên ngựa trong bảng số
		int count = 0; // Biến đếm số phần tử yên ngựa
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				int minInRow = matrix[i][j];
				int maxInColumn = matrix[i][j];

				// Tìm giá trị nhỏ nhất trên hàng i
				for (int k = 0; k < n; k++) {
					if (matrix[i][k] < minInRow) {
						minInRow = matrix[i][k];
					}
				}

				// Tìm giá trị lớn nhất trên cột j
				for (int k = 0; k < m; k++) {
					if (matrix[k][j] > maxInColumn) {
						maxInColumn = matrix[k][j];
					}
				}

				// Kiểm tra phần tử có phải là phần tử yên ngựa hay không
				if (matrix[i][j] == minInRow && matrix[i][j] == maxInColumn) {
					System.out.println("Phần tử A" + i + j + " là phần tử yên ngựa.");
					count++;
				}
			}
		}

		// Nếu không có phần tử yên ngựa nào thì in ra thông báo
		if (count == 0) {
			System.out.println("Không có phần tử yên ngựa nào trong bảng số.");
		}
	}
}
