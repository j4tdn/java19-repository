package view;

import java.util.Arrays;
import java.util.Random;

import utils.ArrayUtils;

public class Ex01 {
	public static void main(String[] args) {
		int n = 10;
        int[] arrays = createRandomArray(n);
        System.out.println("Mảng ban đầu: " + Arrays.toString(arrays));
		System.out.println("So sánh giá trị trung bình của n/2 phần tử đầu tiên với n/2 phần tử cuối cùng: " + Arrays.toString(removeDuplicates(arrays)));
		compareHalfAverage(arrays);
		System.out.println("Tìm số lớn thứ 3 trong mảng : " + findElementThird(removeDuplicates(arrays)));
	}
	
	//Tạo mảng số nguyên ngẫu nhiên gồm n phần tử
	 public static int[] createRandomArray(int n) {
	        int[] arr = new int[n];
	        Random random = new Random();
	        for (int i = 0; i < n; i++) {
	            arr[i] = random.nextInt(10);
	        }
	        return arr;
	    }

	// Tìm số lớn thứ 3 trong mảng.
	private static int findElementThird(int[] removeDuplicates) {
		for(int i = 0; i < removeDuplicates.length;i++) {
			for(int j = 0; j < removeDuplicates.length - i - 1; j++) {
				if(removeDuplicates[j] < removeDuplicates[j+1]) {
					ArrayUtils.swap(removeDuplicates, j, j+1);
				}
			}
		}
		return removeDuplicates[2];
	}

	//So sánh giá trị trung bình của n/2 phần tử đầu tiên với n/2 phần tử cuối cùng
	private static void compareHalfAverage(int[] origin) {
		int mid = origin.length/2;
		int sumFirst = 0;
		int sumLast = 0;
		for(int i=0; i< origin.length;i++) {
			if(i<mid) sumFirst += origin[i];
			else sumLast += origin[i];
		}
		if(sumFirst>sumLast) System.out.println("First Half Average = "+sumFirst+" > Last Half Average = "+ sumLast);
		else System.out.println("N/2 Phần tử đầu tiên = "+ sumFirst +" < N/2 Phần tử cuối cùng = "+ sumLast);
	}

	//Loại bỏ những phần tử trùng nhau
	private static int[] removeDuplicates(int[] origin) {
		int length = origin.length;
		int[] newArr = new int[length];
		int running = 0;
		for(int i = 0; i < length; i++) {
			if(!ArrayUtils.checkDuplicate(newArr, origin[i])) {
				newArr[running++] = origin[i];
			}
		}
		return Arrays.copyOfRange(newArr, 0, running);
	}

}
