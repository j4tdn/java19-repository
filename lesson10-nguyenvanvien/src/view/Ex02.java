package view;
import functional.ArrayCondition;

public class Ex02 {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 3, 8, 7 }, { 1, 9, 0, 9 }, { 2, 9, 6, 5 }, { 1, 2, 4, 5 } };
		System.out.println("The origin matrix : ");
		printMatrix(matrix);
		matrixTransformation(matrix);
	}
	
	private static void slideEachElement(int[][] matrix, int[][] newMatrix, int i, int j, ArrayCondition condition) {
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				if(condition.checkCondition().equals("Coppy Array")) {
					newMatrix[row][col] = matrix[row][col];
				}
				if(condition.checkCondition().equals("Get position")) {
					if (matrix[row][col] == 0) {
						tranform(newMatrix, row, col);
					}
				}
			}
		}
	}

	private static void matrixTransformation(int[][] matrix) {
		int[][] newMatrix = new int[matrix.length][matrix[0].length];
		slideEachElement(matrix, newMatrix, 0, 0, ()->{
			return "Coppy Array";
		});
		slideEachElement(matrix, newMatrix, 0, 0, ()->{
			return "Get position";
		});
		System.out.println("\nThe matrix transformation : ");
		printMatrix(newMatrix);

	}

	private static void tranform(int[][] newMatrix, int i, int j) {
		for (int row = 0; row < newMatrix.length; row++) {
			for (int col = 0; col < newMatrix[0].length; col++) {
				if (row == i || col == j) {
					newMatrix[row][col] = 0;
				}
			}
		}
	}

	private static void printMatrix(int[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				System.out.print(matrix[row][col]);
				if (col != matrix[0].length - 1) {
					System.out.print("	");
				}
			}
			System.out.println();
		}
	}
}
