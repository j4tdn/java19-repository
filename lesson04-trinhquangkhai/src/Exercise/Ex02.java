package Exercise;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex02 {
public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		Random rd = new Random();
		
		//int n = ip.nextInt();
		int arr[] = {12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18};
//		for (int i = 0; i < n; i++) {
//            System.out.printf("a[%d] = ", i);
//            arr[i] = .nextInt(99);
//        }
		arrange(arr);
		
}
private static void arrange(int [] arr) {
	int [] sevendivide = new int[arr.length];
	int [] fivedivide = new int[arr.length];
	int [] alldivide = new int[arr.length];
	int [] all;
	int running = 0;
	for(int i = 0; i < arr.length; i++) {
		if(arr[i] % 7 == 0 && arr[i] % 5 != 0) {
			sevendivide[running] = arr[i];
			running++;
		}
	}
	running = 0;
	for(int j = 0; j < arr.length; j++) {
		if(arr[j] % 5 == 0 && arr[j] % 7 != 0) {
			fivedivide[running] = arr[j];
			running++;
		}
	}
	running = 0;
	for(int h = 0; h < arr.length; h++) {
		if(arr[h] % 5 == 0 && arr[h] % 7 == 0 ) {
			alldivide[running] = arr[h];
			running++;
		}else if(arr[h] % 5 != 0 && arr[h] % 7 != 0) {
			alldivide[running] = arr[h];
			running++;
		}
	}
System.out.print(Arrays.toString(sevendivide));
System.out.print(Arrays.toString(alldivide));
System.out.print(Arrays.toString(fivedivide));
}
}
