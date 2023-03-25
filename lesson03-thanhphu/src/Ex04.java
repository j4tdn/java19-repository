import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		
		System.out.print("Nhap so hang M: ");
		int M = scanner.nextInt();
		System.out.print("Nhap so cot N: ");
		int N = scanner.nextInt();

		
		int[][] A = new int[M][N];
		System.out.println("Nhap cac phan tu cua ma tran:");
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				A[i][j] = scanner.nextInt();
			}
		}

		
		boolean found = false;
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				
				int minInRow = A[i][j];
				for (int k = 0; k < N; k++) {
					if (A[i][k] < minInRow) {
						minInRow = A[i][k];
					}
				}
				
				int maxInCol = A[i][j];
				for (int k = 0; k < M; k++) {
					if (A[k][j] > maxInCol) {
						maxInCol = A[k][j];
					}
				}
				
				if (A[i][j] == minInRow && A[i][j] == maxInCol) {
					System.out.println("Phan tu yen ngua tai vi tri [" + i + "][" + j + "] = " + A[i][j]);
					found = true;
				}
			}
		}
		if (!found) {
			System.out.println("Khong tim thay phan tu yen ngua trong ma tran.");
		}

		scanner.close();

	}
}
