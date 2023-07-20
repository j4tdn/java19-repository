package ex01;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] origin = {2,6,7,6,10,9,15,2,23,9};
		System.out.println("RemoveElementSame -->" + Arrays.toString(removeElementSame(origin)));
		System.out.println("CompareFirstAndLastHalf -->" + compareFirstAndLastHalf(origin));
		removeElementSame(origin);
		System.out.println("FindThirdLargest-->" + findThirdLargest(origin));
	}
	
	private static int[] removeElementSame(int[] origin) {
		int[] uniqueArrays = new int[origin.length];
	
	    int running = 0;

	    for (int i = 0; i < origin.length; i++) {
	        boolean isDuplicate = false;

	        for (int j = 0; j < running; j++) {
	            if (origin[i] == uniqueArrays[j]) {
	                isDuplicate = true;
	                break;
	            }
	        }

	        if (!isDuplicate) {
	        	uniqueArrays[running++] = origin[i];
	        }
	    }
		
		return Arrays.copyOfRange(uniqueArrays, 0, running);
	}
	
	public static boolean compareFirstAndLastHalf(int[] origin) {
	    int n = origin.length;
	    int sumFirstHalf = 0;
	    int sumLastHalf = 0;

	    for (int i = 0; i < n/2; i++) {
	        sumFirstHalf += origin[i];
	    }

	    for (int i = n - n/2; i < n; i++) {
	        sumLastHalf += origin[i];
	    }

	    double avgFirstHalf = (double) sumFirstHalf / (n/2);
	    double avgLastHalf = (double) sumLastHalf / (n- n/2);

	    return avgFirstHalf == avgLastHalf;
	}
	
	public static int findThirdLargest(int[] origin) {
		Arrays.sort(origin);
		
		return origin[origin.length-3];
	}
	
	
	
}
