package view;

import java.util.Scanner;

public class Ex01TwoOppositeTriangles {
	public static void main(String[] args) {
		int n = inputN();
		int[][] matrix = generate(n);
		process(matrix, n);
		print(matrix, n);
	}

	private static void print(int[][] matrix, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(matrix[i][j] == 0) {
					System.out.print("   ");
				} else
				System.out.print(matrix[i][j] + "  ");
			}
			System.out.println();
		}
	}
	
	private static void process(int[][] matrix,int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j > i && j < n - i - 1 && i < n / 2 || i > n / 2 && j < i && j > n - i - 1) {
					matrix[i][j] = 0;
				} else
					matrix[i][j] = j + 1;
			}
		}
	}

	private static int[][] generate(int n) {
		int[][] matrix = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = j +1;
			}
		}
		return matrix;
	}

	private static int inputN() {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		while (true) {
			try {
				System.out.print("Enter n: ");
				n = Integer.parseInt(sc.nextLine());
				break;
			} catch (IllegalArgumentException e) {
				System.out.println("Not Valid!");
			}
		}
		sc.close();
		return n;
	}
}
