package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Ex02 {
public static void main(String[] args) {
	int row ;
	int col;
	 int[][] matrix = {{1,5,1,2,1}, {2,6,9,9,2}, {3,8,0,6,4}, {4,7,9,5,5}};
//	Scanner ip = new Scanner(System.in);
//	System.out.println("Nhập số hàng: " );
//	row = ip.nextInt();
//	System.out.println("Nhập số cột: ");
//	col = ip.nextInt();
//	int[][] matrix = new int [row][col];
//	
//	for(int i = 0; i < row; i++ ) {
//		for(int j = 0; j < col; j++) {
//			System.out.println("Nhập phần tử thứ [" + i + ", " + j + "]" );
//			matrix[i][j] = ip.nextInt();
//		}
//	}
//	
//	System.out.println("Mảng vừa nhập: ");
//	for(int i = 0; i < row; i++) {
//		for(int j = 0; j < col; j++) {
//			System.out.print(matrix[i][j] + "\t");
//		}
//		System.out.println();
//	}
	 System.out.println(Arrays.toString(matrix));
	System.out.println("\n===================\n");
	matrixTranformation(matrix);
}

private static void matrixTranformation(int[][] matrix, int row, int col ){
//	int col = -1;
//	int row = -1;
//	for(int i = 0; i < row; i++) {
//		for(int j = 0; j < col; j ++) {
//			if(matrix[i][j] == 0) {
//				matrix[i][col] = 0;
//				matrix[row][j] = 0;
//			}
//		}
//	}
//	
//	for(int i = 0; i < row; i++) {
//		if(matrix[i][col] == 0 && i != row) {
//			for(int j = 0; j < col; j++) {
//				matrix[i][j] = 0;
//			}
//		}
//	}
//	
//	for(int j = 0; j < col; j++) {
//		if(matrix[row][j] == 0 && j != col) {
//			for(int i = 0; i < row; i++) {
//				matrix[i][j] = 0;
//			}
//		}
//	}
	for(int i = 0; i < row; i++) {
		matrix[i][col] = 0;
	}
	for(int j = 0; j < col; j++) {
		matrix[row][j] = 0;
	}
	
	for(int i = 0; i < row; i++) {
		for(int j = 0; j < col; j++) {
			System.out.print(matrix[i][j] + "\t");
		}
		System.out.println();
	}
}
}
