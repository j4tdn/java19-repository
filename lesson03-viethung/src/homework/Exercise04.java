package homework;

import java.util.Random;
import java.util.Scanner;

public class Exercise04 {

	public static int checkMin(int[][] arr, int currentRow, int column) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < column; i++) {
			if (min > arr[currentRow][i]) {
				min = arr[currentRow][i];
			}
		}
		return min;
	}

	public static int checkMax(int[][] arr, int row, int currentColumn) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < row; i++) {
			if (max < arr[i][currentColumn]) {
				max = arr[i][currentColumn];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Random rd = new Random();
		int row = 0, column = 0;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so hang: ");
		row = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap so cot: ");
		column = Integer.parseInt(sc.nextLine());
		int[][] arr = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				arr[i][j] = rd.nextInt(99) + 1;
			}
		}
//		int[][] arrTest = new int[3][3];
//		arrTest[0][0] = 47;
//		arrTest[0][1] = 47;
//		arrTest[0][2] = 36;
//		arrTest[1][0] = 23;
//		arrTest[1][1] = 43;
//		arrTest[1][2] = 31;
//		arrTest[2][0] = 46;
//		arrTest[2][1] = 7;
//		arrTest[2][2] = 29;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println("\n");
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (arr[i][j] == checkMin(arr, i, 3) && arr[i][j] == checkMax(arr, 3, j)) {
					System.out.println("Điểm yên ngựa nằm ở cột " + (j + 1) + " dòng " + (i + 1));
					count++;
				}
			}
		}
		if (count == 0) {
			System.out.println("Khong co diem yen ngua nao");
		}
	}
}
