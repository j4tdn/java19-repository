package view;

import java.util.Random;

public class BaiTap10 {
	public static void main(String[] args) {
		Random rd = new Random();
		int[] arr = new int[5];
		int count =0;
		while(true) {
			int num = 20 + rd.nextInt(11);
			if(count !=0) {
				if(checkTrungNhau(arr,num)) {
					arr[count] = num;
					count ++;
				}
			}
			else {
				arr[count] = num;
				count ++;
			}
			if(count ==5) break;
		}
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}
	static boolean checkTrungNhau(int[] arr, int num) {
		for(int i=0; i<arr.length;i++) {
			if(arr[i] == num) return false;
		}
		return true;
	}
}
