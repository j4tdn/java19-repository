package ex04;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số dòng của tam giác Pascal: ");
		int n = sc.nextInt();
		int[][] result = new int[n][];
		for (int i = 0; i < n; i++) {
			result[i] = new int[i + 1];
			result[i][0] = 1;
			for (int j = 1; j < i; j++) {
				result[i][j] = result[i - 1][j - 1] + result[i - 1][j];
			}
			result[i][i] = 1;
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}
}
