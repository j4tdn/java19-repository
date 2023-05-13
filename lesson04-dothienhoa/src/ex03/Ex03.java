package ex03;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int n = input.nextInt();
		int[] currentRow = { 1 };
		for (int i = 2; i <= n + 2; i++) {
			int[] nextRow = new int[i];
			nextRow[0] = 1;
			nextRow[i - 1] = 1;

			for (int j = 1; j < i - 1; j++) {
				nextRow[j] = currentRow[j - 1] + currentRow[j];
			}

			printRow(nextRow);
			currentRow = nextRow;
		}
		input.close();
	}

	private static void printRow(int[] row) {
		for (int num : row) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
