package exercises;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex01 {
public static void main(String[] args) {
	Scanner ip = new Scanner(System.in);
	Random rd = new Random();
	int[] arr = new int[6];
	for(int i = 0; i < arr.length; i++) {
		arr[i] = rd.nextInt(10) + 1;
	}
	
	System.out.println("mảng vừa được tạo: " + Arrays.toString(arr));
	//rmDuplicateEls(arr);
	int running = 0;
	int[] duplicate = new int[arr.length];
	for(int i = 0; i < arr.length; i++){
		boolean isDuplicate = false;
		for(int j = 0; j < i; j++ ) {
			if(arr[i] == arr[j]) {
				isDuplicate = true;
			}
		if(!isDuplicate) {
			duplicate[running++] = arr[i];
		}
			
		}
	}
	System.out.println("Các phần tử trùng là: " + Arrays.toString(Arrays.copyOf(duplicate, running)));
	
}
//private static int[] rmDuplicateEls(int[] arrs) {
//	int running = 0;
//	int[] duplicate = new int[arrs.length];
//	for(int i = 0; i < arrs.length; i++){
//		boolean isDuplicate = false;
//		for(int j = 0; j < i; j++ ) {
//			if(arrs[i] == arrs[j]) {
//				isDuplicate = true;
//			}else {
//				duplicate[running++] = arrs[i];
//			}
//		}
//	}
//	System.out.println("Các phần tử trùng là: " + Arrays.toString(duplicate));
//	return duplicate;
}


