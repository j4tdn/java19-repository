package view;

import java.util.Random;
//TODO: fix if 2 0's in the same col or row
public class Ex02MatrixHandlingWithZero {
	private static Random rd = new Random();

	public static void main(String[] args) {
		Integer[][] matrix = new Integer[][] {
			{ 1, 2, 3, 4 },
			{ 5, 6, 8, 7 },
			{ 1, 2, 0, 9 },
			{ 2, 0, 6, 5 },
			{ 1, 2, 4, 5 } 
		};

		printMatrix(matrix, 5, 4);
		System.out.println("\n");
		printMatrix(process(matrix, 5, 4), 5, 4);

	}
	
	public static Integer[][] process(Integer[][] matrix, int row, int col) {
		boolean[][] isChange = new boolean[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (matrix[i][j] == 0 && isChange[i][j]==false)  {
					for (int k = 0; k < row; k++) {
						for (int l = 0; l < col; l++) {
							matrix[i][l] = 0;
							matrix[k][j] = 0;
							isChange[i][l] = true;
							isChange[k][j] = true;
						}
					}
				}
			}
		}
		return matrix;
	}

	public static void printMatrix(Integer[][] matrix, int row, int col) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
