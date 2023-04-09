import java.util.Random;
import java.util.Scanner;

public class Exercise42 {

	public static class Min {
		public int min;
		public Min() {
		}

	}

	public static Min MinCol(int[][] A, int Row, int j) {
		Min c = new Min();
		c.min = A[0][j];
		for (int i = 0; i < Row; i++) {
			if (c.min > A[i][j]) {
				c.min = A[i][j];
			}
		}
		return c;

	}

	public static Max MaxRow(int[][] A, int i, int Col) {
		Max c = new Max();
		c.max = A[i][0];
		for (int j = 0; j < Col; j++) {
			if (c.max < A[i][j]) {
				c.max = A[i][j];
			}
		}
		return c;
	}

	public static class Max {
		public int max;
	}

	public static void random(int[][] A, int m, int n) {

		Random rd = new Random();

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				A[i][j] = rd.nextInt(99) + 1;
			}
		}

	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int m = 2;
		int n = 2;
		System.out.println("nhập số dòng: ");
		m = ip.nextInt();
		System.out.println("nhập số cột: ");
		n = ip.nextInt();
		int[][] A = new int[m][n];
		
		random(A, m, n);

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if(A[i][j] > 9 ) {
					System.out.print(A[i][j] + " ");
				}
				else if(A[i][j] < 10){
					System.out.print(" " + A[i][j] + " ");
				}
			}
			System.out.print("\n");
		}
		boolean saddle = false;
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if(A[i][j] == MinCol(A, m, j).min && A[i][j] == MaxRow(A, i, n).max) {
					System.out.println("điểm yên ngựa: [" + (i+1) + "] [" + (j+1) + "]" );
					System.out.println("điểm yên ngựa có giá trị: [" + A[i][j] + "]"  );
					saddle = true;
					}
				}
			}
		if(saddle == false) {
		System.out.println("không có điểm yên ngựa");
	}
}
	}
