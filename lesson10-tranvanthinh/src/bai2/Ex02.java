package bai2;

public class Ex02 {
	public static void main(String[] args) {
		int[][] matrix1 = {
	            {1, 2, 3},
	            {4, 0, 6},
	            {7, 8, 9}
	        };
		solve(matrix1);
	}
	public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
	public static int solve(int[][] a) {
		int[][] arr = new int[a.length][a.length];
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length; j++) {
				if(a[i][j] == 0) {
					for(int i0 = 0; i0 < a.length; i0++) {
						a[i][i0] = 0;
						a[i0][j] = 0;
					}
					printMatrix(a);
					return 0;
				}
			}
		}
		return 0;
	}
	
	
	
	
	
	
	
}
