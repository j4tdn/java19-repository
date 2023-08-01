package view;

public class Ex02 {
	public static void main(String[] args) {
		int[][] matrix = { 
					{ 1, 2, 3, 4 },
					{ 4, 5, 6, 7 },
					{ 5, 6, 0, 8 },
					{ 4, 3, 5, 1 }
				};
		System.out.println("Origin -->");
		printMatrix(matrix);
		
		System.out.println("========");
		System.out.println("after excute");
		excute(matrix);
		printMatrix(matrix);
		
	}
	
	private static void excute(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if(matrix[i][j] == 0) {
					for(int k = 0; k < cols; k++) {
						matrix[k][i] = 0;
						matrix[i][k] = 0;
					}
					return;
				}
				
			}
		}
	}

	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + ", ");
			}
			System.out.println();
		}
	}
}
