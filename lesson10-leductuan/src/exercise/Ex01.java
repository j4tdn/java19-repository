package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Ex01 {
	public static void main(String[] args) {
		// Loại bỏ những phần tử trùng nhau VD: {1,2,3,4,3,1} Kết quả: {2,4}
		// So sánh giá trị trung bình của n/2 phần tử đầu tiên với n/2 phần tử cuối cùng
		// Tìm số lớn thứ 3 trong mảng. Lưu ý trường hợp các phần tử lớn nhất trùng 
		//nhau VD: {7 8 8 8 6 2 5 1} Kết quả: 6
		int[] array = {1,2,3,4,3,1,1};
		System.out.println("Mảng sau khi loại bỏ các phần tử trùng nhau:"+Arrays.toString(removeDup(array)));
		
		averageComparison(array);
		
		System.out.println("Giá trị lớn thứ 3 trong mảng là: "+ thirdLargestElement(array));
		
		
		
	}
	private static int[] removeDup(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < arr.length; i++) {
	        int count = map.getOrDefault(arr[i], 0);
	        map.put(arr[i], count + 1);
	    }
	    List<Integer> result = new ArrayList<>();
	    for (int i = 0; i < arr.length; i++) {
	        if (map.get(arr[i]) == 1) {
	            result.add(arr[i]);
	        }
	    }
	    int[] newArr = new int[result.size()];
	    for (int i = 0; i < result.size(); i++) {
	        newArr[i] = result.get(i);
	    }
	    return newArr;
	}
	
	private static void averageComparison(int[] arr) {
		int middlePos = arr.length/2;
		int sum1 = 0;
		int sum2 = 0;
		for(int i=0; i< arr.length;i++) {
			if(i<middlePos) sum1+=arr[i];
			else sum2+= arr[i];
		}
		int mean1=sum1/middlePos;
		int mean2=sum2/middlePos;
		
		if(mean1>mean2) System.out.println("The first mean is greater than the latter mean");
		else System.out.println("The first mean is less than the latter mean");
	}
	
	private static int thirdLargestElement(int[] arr) {
		if (arr == null || arr.length < 3) {
			return -1;
		}
		int firstMax = arr[0];
		int secondMax = Integer.MIN_VALUE;
		int thirdMax = Integer.MIN_VALUE;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > firstMax) {
				thirdMax = secondMax;
				secondMax = firstMax;
				firstMax = arr[i];
			} else if (arr[i] > secondMax && arr[i] != firstMax) {
				thirdMax = secondMax;
				secondMax = arr[i];
			} else if (arr[i] > thirdMax && arr[i] != secondMax && arr[i] != firstMax) {
				thirdMax = arr[i];
			}
		}
		if (thirdMax == 0) {
			return -1;
		} else {
			return thirdMax;
		}
	}
	
	
}
