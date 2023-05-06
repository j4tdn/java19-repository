package ex03;

import java.util.Scanner;

public class PascalTriangle {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập n là số dòng của tam giác Pascal: ");
		int n = ip.nextInt();
		int[][] triangle  = new int[n][];
		for (int i = 0; i < n; i++) {
			triangle [i] = new int[i + 1];
			triangle [i][0] = 1;
			for (int j = 1; j < i; j++) {
				triangle [i][j] = triangle [i - 1][j - 1] + triangle [i - 1][j];
			}
			triangle [i][i] = 1;
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(triangle [i][j] + " ");
			}
			System.out.println();
		}
	}
}
