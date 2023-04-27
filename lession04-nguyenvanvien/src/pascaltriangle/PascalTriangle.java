package pascaltriangle;

import java.util.Scanner;

public class PascalTriangle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap n : ");
		int n = scanner.nextInt();
		
		for (int i=0; i<=n;i++) {
			for(int j : oldArray(i)) {
				System.out.print(j+"\t");
			}
			System.out.println("\n");
		}
	}

	
	public static int[] oldArray(int n) {
		int[] arrs = new int[n+2];
		arrs[0] = 1;
		arrs[n+1] = 1;
		if(n ==1) {
			arrs[n] = 2;
		}
		else if(n>1) {
			int[] oldArray = oldArray(n-1);
				for (int j= 0; j< n; j++) {
					arrs[j+1] = oldArray[j]+oldArray[j+1];
				}
		}
		return arrs;
	}
}
