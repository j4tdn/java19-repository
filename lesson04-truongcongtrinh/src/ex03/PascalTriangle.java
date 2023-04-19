package ex03;

public class PascalTriangle {
	public static void main(String[] args) {
		int n = 4;
		int[][] triangle = new int[n + 1][n + 2];
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j < i + 2; j++) {
				triangle[i][j] = 1;
				if (j > 0 && j < i + 1) {
					triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
				}
				System.out.printf("%-" + 5 + "s", triangle[i][j]);
			}
			System.out.println();
		}

	}
}
