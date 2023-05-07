package Exercise;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex02 {
public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		Random rd = new Random();
		
		System.out.println("Nhập số phần tử của mảng: ");
		int n = ip.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = rd.nextInt();
        }
		
}
private static int []arrange(int [] arr) {
	int [] sevendivide = new int[arr.length];
	int [] fivedivide = new int[arr.length];
	int [] alldivide = new int[arr.length];
	int [] all;
	for(int i = 0; i < arr.length; i++) {
		if(arr[i] % 7 == 0) {
			return Arrays.copyOfRange(sevendivide, 0, i);
		}
	}
	for(int j = 0; j < arr.length; j++) {
		if(arr[j] % 5 == 0) {
			return Arrays.copyOfRange(fivedivide, 0, j);
		}
	}
	for(int h = 0; h < arr.length; h++) {
		if(arr[h] % 5 == 0 && arr[h] % 7 == 0 ) {
			return Arrays.copyOfRange(alldivide, 0, h);
		}
	}
	all = {sevendivide[], fivedivide[], alldivide[]};
}
}
