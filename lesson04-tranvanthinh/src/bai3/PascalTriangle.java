package bai3;

import utils.Utils;

public class PascalTriangle {
	public static void main(String[] args) {
		
		int n = Utils.inputInteger();
		
		int[] arr = {1,1};
		
		for(int i = 0; i< n + 1; i++) {
			int[] arrTemp = arr; // Lưu giá trị của mảng để cộng cho lần sau 
			arr = new int[i + 2];
			for(int j = 0; j< i + 2; j++) {
				if(j == 0 || j == (i + 1)) {
					arr[j] = 1;
					System.out.format("%-10d", 1);
				}
				else {
					arr[j] = arrTemp[j] + arrTemp[j-1];
					System.out.format("%-10d", arr[j]);
				}
			}
			System.out.println("");
		}
	}
}
