package bai4;

import java.util.Scanner;
public class Solve {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số hàng: ");
		int m = sc.nextInt();
		System.out.print("Nhập số cột: ");
		int n = sc.nextInt();
		Matrix a = new Matrix(m,n);
		a.display();
		solve(a);
		sc.close();
	}
	
	public static void solve(Matrix a) {
		boolean check = false;
		for( int i = 0; i < a.getRowNum(); i++) {
			int min = a.minRow(i);
			for( int j = 0; j < a.getColNum(); j++) {
				if (min == a.maxCol(j)) { 
					System.out.println("Phần tử yên ngựa:" + a.getElementAt(i, j));
					check = true;
				}
			}
		}
		if(!check) System.out.println("Không có phần tử yên ngựa");
	}
}
