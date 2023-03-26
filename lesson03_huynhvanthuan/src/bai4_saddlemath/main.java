package bai4_saddlemath;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int[][] matrix = { { 47, 47, 36 }, { 23, 43, 31 }, { 46, 7, 29 }, { 46, 7, 29 }};
		printMatrix(matrix);
		findSaddlePoints(matrix);
	}

	//in ma trận
	public static void printMatrix(int[][] matrix) {
	    int rows = matrix.length;
	    int cols = matrix[0].length;
	    for (int i = 0; i < rows; i++) {
	        for (int j = 0; j < cols; j++) {
	            System.out.printf("%5d", matrix[i][j]);
	        }
	        System.out.println();
	    }
	}
	
	public static void findSaddlePoints(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;

		// Tìm giá trị nhỏ nhất trong cột
		for (int i = 0; i < rows; i++) {
			int minValue = matrix[i][0];
			int minIndex = 0;
			for (int j = 1; j < cols; j++) {
				if (matrix[i][j] < minValue) {
					minValue = matrix[i][j];
					minIndex = j;
				}
			}

			// Kiểm tra giá trị lớn nhất trong hàng
			boolean isMaxInCol = true;
			for (int k = 0; k < rows; k++) {
				if (matrix[k][minIndex] > minValue) {
					isMaxInCol = false;
					break;
				}
			}

			// Nếu tìm thấy điểm yên ngựa thì in ra thông báo
			if (isMaxInCol) {
				System.out.println("Saddle point found at (" + i + "," + minIndex + "): " + minValue);
			}
		}
	}
}
