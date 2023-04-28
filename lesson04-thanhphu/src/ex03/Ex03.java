package ex03;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so hang cua tam giac Pascal: ");
        int n = scanner.nextInt();
        
        createMatrixPascal(n);
        
	}
	
	public static void  createMatrixPascal(int n){
		int[][] pascal = new int[n][n];
		
		for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    pascal[i][j] = 1;
                } else {
                    pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
                }
            }
        }
		for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pascal[i][j] + "\t");
            }
            System.out.println();
        }
	}
}
