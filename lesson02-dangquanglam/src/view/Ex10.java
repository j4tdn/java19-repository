package view;

import java.util.Random;

public class Ex10 {
	public static void main(String[] args) {
		Random rd = new Random();
		int[] arr = new int[5]; //mảng arr chứa 5 phần tử
		int check = 0; //số phần tử được thêm vào mảng.

		while (check < 5) {
		    int a = rd.nextInt(10) + 20;
		    boolean isDuplicate = false;
		    for (int z = 0; z < check; z++) { // xem số ngẫu nhiên này có trùng với các phần tử đã có trong mảng hay không
		        if (a == arr[z]) {
		            isDuplicate = true;
		            break;
		        }
		    }
		    if (!isDuplicate) {
		        arr[check++] = a;
		    }
		}
		for (int q = 0; q < arr.length; q++) {
		    System.out.print(arr[q] + " ");
		}
	}

}
