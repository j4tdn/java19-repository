package ex04;

import java.util.Random;
import java.util.Scanner;

public class MatrixUtil {
	// Implement insert matrix method
	public static Matrix inputMatrix(Matrix mtx) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		System.out.print("Enter rows: ");
		int rows = Integer.parseInt(sc.nextLine());
		System.out.print("Enter cols: ");
		int cols = Integer.parseInt(sc.nextLine());
		Matrix result = new Matrix(rows, cols);

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				result.setValue(i, j, Integer.parseInt(sc.nextLine()));
			}
		}
		return result;
	}

	public static Matrix randomMatrix(Matrix mtx) {
		Random rd = new Random();
		int rows = mtx.getRow();
		int cols = mtx.getCol();
		Matrix result = new Matrix(rows, cols);

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				result.setValue(i, j, 1 + rd.nextInt(99));
			}
		}
		return result;
	}

	// Implement print saddle element
	public static boolean isMinOfRow(Matrix mtx,int a,int row) {
		int min = mtx.getValue(row,0);
			for (int i = 0; i < mtx.getCol(); i++) {
				min = Math.min(min, mtx.getValue(row, i));
		}
		return a == min;
	}
	
	public static boolean isMaxOfCol(Matrix mtx,int a,int col) {
		int max = mtx.getValue(0,col);
		for (int i = 0; i < mtx.getRow(); i++) {
			max = Math.max(max, mtx.getValue(i, col));
		}
		return a == max;
	}


	public static void printExistSaddle(Matrix mtx) {
		int count = 0;
		for(int i=0;i<mtx.getRow();i++) {
			for(int j=0;j<mtx.getCol();j++) {
				if(isMinOfRow(mtx, mtx.getValue(i, j), i) && isMaxOfCol(mtx, mtx.getValue(i, j), j)) {
					count++;
					System.out.println("Matrix[" + i + "," + j + "]= " + mtx.getValue(i, j) + " is saddle element!");
				}
			}
		}
		if(count>0) {			
			System.out.println("==================================================");
			System.out.println("Total: " + count);
		} else {
			System.out.println("There is no saddle element");
		}
		
	}

	// Implement print Matrix method
	public static void displayMatrix(Matrix mtx) {
		for (int i = 0; i < mtx.getRow(); i++) {
			for (int j = 0; j < mtx.getCol(); j++) {
				System.out.print((mtx.getValue(i, j)) + "\t");
			}
			System.out.print("\n");
		}
	}

}
