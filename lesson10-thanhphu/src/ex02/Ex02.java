package ex02;

public class Ex02 {
	public static void main(String[] args) {
		int[][] matrix = {
	            {1, 2, 3, 4},
	            {5, 6, 8, 7},
	            {1, 9, 0, 9},
	            {2, 0, 6, 5},
	            {1, 2, 4, 5}
	        };
		
		convertMatrix(matrix);
		printMatrix(matrix);
		
	}
	public static void printMatrix(int[][] matrix) {
	    int n = matrix.length;
	    int m = matrix[0].length;

	    for (int i = 0; i < n; i++) {
	        for (int j = 0; j < m; j++) {
	            System.out.print(matrix[i][j] + " ");
	        }
	        System.out.println();
	    }
	}
	public static void convertMatrix(int[][] matrix) {
	    int n = matrix.length;
	    int m = matrix[0].length;
	    int row = -1;
	    int col = -1;

	   
	    for (int i = 0; i < n; i++) {
	        for (int j = 0; j < m; j++) {
	            if (matrix[i][j] == 0) {
	                row = i;
	                col = j;
	                break;
	            }
	        }
	        if (row != -1) {
	            break;
	        }
	    }
	    
	    for (int i = 0; i < n; i++) {
	        for (int j = 0; j < m; j++) {
	            if (i == row || j == col) {
	                matrix[i][j] = 0;
	            }
	        }
	    }
	}
}
