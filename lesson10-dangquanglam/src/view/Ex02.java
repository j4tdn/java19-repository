package view;

import java.util.Arrays;
import java.util.Random;

public class Ex02 {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 0, 8, 7 }, { 1, 9, 0, 9 }, { 2, 0, 6, 5 }, {1, 2, 4, 5} };

		int[][] result = convertMatrix(matrix);

		System.out.println("Ma trận sau khi chuyển đổi:");
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] convertMatrix(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;

		boolean hasZeroFirstRow = false;
		boolean hasZeroFirstCol = false;

		// Kiểm tra xem hàng đầu tiên và cột đầu tiên có giá trị 0 không
		for (int j = 0; j < cols; j++) {
			if (matrix[0][j] == 0) {
				hasZeroFirstRow = true;
				break;
			}
		}

		for (int i = 0; i < rows; i++) {
			if (matrix[i][0] == 0) {
				hasZeroFirstCol = true;
				break;
			}
		}

		// Duyệt qua ma trận (trừ hàng đầu tiên và cột đầu tiên)
		// Đánh dấu các hàng và cột chứa giá trị 0 bằng cách gán giá trị 0 cho hàng đầu
		// tiên và cột đầu tiên tương ứng
		for (int i = 1; i < rows; i++) {
			for (int j = 1; j < cols; j++) {
				if (matrix[i][j] == 0) {
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}

		// Chuyển đổi các hàng chứa giá trị 0 thành hàng toàn 0
		for (int i = 1; i < rows; i++) {
			if (matrix[i][0] == 0) {
				for (int j = 1; j < cols; j++) {
					matrix[i][j] = 0;
				}
			}
		}

		// Chuyển đổi các cột chứa giá trị 0 thành cột toàn 0
		for (int j = 1; j < cols; j++) {
			if (matrix[0][j] == 0) {
				for (int i = 1; i < rows; i++) {
					matrix[i][j] = 0;
				}
			}
		}

		// Chuyển đổi hàng đầu tiên thành hàng toàn 0 nếu cần thiết
		if (hasZeroFirstRow) {
			for (int j = 0; j < cols; j++) {
				matrix[0][j] = 0;
			}
		}

		// Chuyển đổi cột đầu tiên thành cột toàn 0 nếu cần thiết
		if (hasZeroFirstCol) {
			for (int i = 0; i < rows; i++) {
				matrix[i][0] = 0;
			}
		}

		return matrix;
	}
}
