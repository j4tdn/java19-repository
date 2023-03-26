package exercise4;

import java.util.Random;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("- Nhập số hàng m = ");
		int row = sc.nextInt();
		System.out.print("- Nhập số cột n = ");
		int col = sc.nextInt();
		
		Random rd = new Random();
		int[][] arr = new int[row][col];
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				arr[i][j] = rd.nextInt(99) + 1;
			}
		}
		
		System.out.println("Ma trận ngẫu nhiên được chọn với phần tử trong khoảng [1,99]: ");
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		boolean isSaddlePoint = false;
		for(int i = 0; i < row; i++) {
			int minRow = arr[i][0];
			int temp = 0;
			for(int j = 0; j < col; j++) {
				if(minRow > arr[i][j]) {
					minRow = arr[i][j];
					temp = j;
				}
			}
			int count = 0;
			for(int k = 0; k < row; k++) {
				if(minRow >= arr[k][temp]) {
					count++;
				}
			}
			if(count == col) {
				System.out.println("- Ma trận có phần tử yên ngựa là: " + minRow);
				isSaddlePoint = true;
			}
		}
		
		if(!isSaddlePoint) {
			System.out.println("- Ma trận không có phần tử yên ngựa.");
		}

	}

}
