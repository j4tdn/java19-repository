package code300;

import java.util.Scanner;

public class Ex04 {
public static void main(String[] args) {
	int[] a = {1,2,4};
	int[] b = {1,3,4};
	
	int[] c = merge(a, b);
	show(c);
//	Scanner ip = new Scanner(System.in);
//	System.out.println("Nhập số phần tử của mảng: ");
//	int n = ip.nextInt();
//	int []arr = new int[n];
//	System.out.println("Nhập các phần tử của mảng: \n");
//	for(int i = 0; i < n; i++) {
//		System.out.printf("a[%d] = " , i);
//		arr[i] = ip.nextInt();
//	}
//	sortedAsc(arr);
//	System.out.println("Dãy được sắp xếp tăng dần: ");
//	show(arr);
}
private static void sortedAsc(int[] arr) {
	int temp = arr[0];
	for(int i = 0; i < arr.length - 1; i++) {
		for(int j = i; j < arr.length; j++) {
			if(arr[i] > arr[j]) {
				temp = arr[j];
				arr[i] = arr[j];
				arr[i] = temp;
			}
		}
	}
}
private static int[] merge(int[] a, int[] b) {
	int aindex = a.length - 1;
	int bindex = b.length - 1;
	int cindex = a.length + b.length - 1;
	int[] c = new int[cindex + 1];
	
	// merge a và b -> c
	for(int i = cindex; i > -1; i--) {
		if(aindex > -1 && bindex > -1) {
			if(a[aindex] > b[bindex]) {
				c[i] = a[aindex--];
			}else {
				c[i] = b[bindex--];
			}
			}else if(bindex == -1) {
				c[i] = a[aindex--];
			}else if(aindex == -1) {
				c[i] = b[bindex--];			
			}
		
		}
	sortedAsc(c);
	return c;
	}
 
private static void show(int[] arr) {
	for(int i = 0; i < arr.length; i++) {
		System.out.println(arr[i] + " ");
	}
}
}
