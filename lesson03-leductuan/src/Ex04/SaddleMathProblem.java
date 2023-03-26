package Ex04;

import java.util.Random;
import java.util.Scanner;

public class SaddleMathProblem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số cột của ma trận: ");
		int m = scanner.nextInt();
		System.out.print("Nhập số hàng của ma trận: ");
		int n = scanner.nextInt();
		System.out.println();
		Random rd = new Random();
		int[][] a = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++)
				a[i][j] = rd.nextInt(99) + 1;
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		if (check2(a)==true) {
			System.out.println("Mảng có phần tử yên ngựa");
		}
		else System.out.println("Mảng không có phần tử yên ngựa");
	}
	
	public static boolean check1( int[][] a, int i, int j) {
		for(int k=0;k<a.length;k++) {
			if(a[i][j]>a[k][j]) return false;
		}
		for(int l=0;l<a[0].length;l++) {
			if(a[i][j]<a[i][l]) return false;
		}
		return true;
		
	}
	public static boolean check2(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if(check1(a,i,j)==true) {
					return true;
				}
				else continue;
			}
		}
		return false;
	}
}
