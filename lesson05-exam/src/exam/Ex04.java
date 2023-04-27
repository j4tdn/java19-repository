package exam;

import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		int[] arr = {2,5,6,7,4,5,7,8};
		int[] newarr = removeDuplicates(arr);
		//System.out.println(Arrays.toString(newarr));
		System.out.println("Sum -->" + sum(newarr));
	}
	
	public static int sum(int[] arr) {
		    int sum = 0;
		    int min = arr[0];
		    int max = arr[0];
		    for (int i = 0; i < arr.length; i++) {
		        if (arr[i] < min) {
		            min = arr[i];
		        }
		        if (arr[i] > max) {
		            max = arr[i];
		        }
		        sum += arr[i];
		    }
		    sum -= (min + max);
		    return sum;
	}
	
	public static int[] removeDuplicates(int[] arr) {
	    int[] temp = new int[arr.length];
	    int index = 0;
	    for (int i = 0; i < arr.length; i++) {
	        boolean isDuplicate = false;
	        for (int j = i + 1; j < arr.length; j++) {
	            if (arr[i] == arr[j]) {
	                isDuplicate = true;
	                break;
	            }
	        }
	        if (!isDuplicate) {
	            temp[index++] = arr[i];
	        }
	    }
	    int[] result = new int[index];
	    System.arraycopy(temp, 0, result, 0, index);
	    return result;
	    
	}
}
