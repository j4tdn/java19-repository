package exercises;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex01 {
public static void main(String[] args) {
	int[] arr = {1,2,3,4,3,1};
	int n = arr.length;
	System.out.println(Arrays.toString(arr));
	System.out.println("\n===============\n");
	thirdLargestNum(arr, n);
	//System.out.println("result -> " + Arrays.toString(arr));
	averageValue(arr);
	rmDuplicateEls(arr);
	
	
	
}
private static void rmDuplicateEls(int[] arrs) {
	int n = arrs.length;
	int[] result = new int[n];
	
	for(int i = 0; i < n; i++) {
		for(int j = i + 1; j < n; j++) {
			if(arrs[i] == arrs[j]) {
				for(int k = j; k < n -1; k++) {
					arrs[k] = arrs[k + 1];
				}
				n--;
		}
		
		}
		for(int k = i; k < n -1; k++) 
			arrs[k] = arrs[k+1];
		
		n--;
		result[i] = arrs[i];
	
	}
	System.out.println("result ->  " + Arrays.toString(result));
	
	}
private static void averageValue(int[] arrays) {
	int n = arrays.length;
	int avgFisrtHalf = 0;
	int sumFisrtHalf = 0; 
	int avgLastHalf = 0;
	int sumLastHalf = 0;
	//int[] A = new int [n];
	for(int i = 0; i < n/2; i++) {
		sumFisrtHalf += arrays[i];
	}
	avgFisrtHalf = sumFisrtHalf/(n/2);
	
	for(int i = n/2; i < n; i++) {
		sumLastHalf += arrays[i];
	}
	avgLastHalf = sumLastHalf/(n/2);
	
	if(avgFisrtHalf > avgLastHalf) {
		System.out.println("Giá trị trung bình của nửa đầu lớn hơn nửa sau");
	}else {
		System.out.println("Giá trị trung bình của nửa sau lớn hơn nửa đầu");
	}
}
private static void thirdLargestNum(int[] arr, int arr_length) {
	int max = 0;
	int second = 0;
	int third = 0;
	if(arr_length < 3) {
		System.out.println("Không tồn tại phần tử lớn thứ ba ");
	}
	
	for(int i = 0; i < arr_length; i++) {
		if(arr[i] > max) {
			max = arr[i];
		}
	}
	
	for(int k = 0; k < arr_length; k++) {
		if(arr[k] != max && arr[k] > second) {
			second = arr[k];
		}
	}
	
	for(int j = 0; j < arr_length; j++) {
		if(arr[j] != max && arr[j] != second && arr[j] > third) {
			third = arr[j];
		}
	}
	
	if(third == Integer.MIN_VALUE) {
		System.out.println("Không tồn tại phần tử lớn thứ ba");
	}else {
		System.out.println("Phần tử lớn thứ ba của mảng là: " + third);
	} 
		
	
}

}



