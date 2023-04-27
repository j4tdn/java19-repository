package exam;

import java.util.Arrays;

public class Bai4 {
	public static void main(String[] args) {
		int[] a= {1, 5, 8, 9, 2, 5, 9};
		int[] b= {4, 2, 6, 6, 4, 15, 1};
		System.out.println(sum(a));
		System.out.println(sum(b));
	}

	public static int sum(int[] is) {
		int result = 0; 
		int[] resultNumbers = new int[is.length];
		int[] finalResultNumbers;
		int running = 0;
		for (int i : is) {
			if (!alreadyInArray(i, resultNumbers)) {
				resultNumbers[running++] = i;
			}
		}
		finalResultNumbers = Arrays.copyOfRange(resultNumbers, 0, running);
		for (int i:finalResultNumbers) {
			result += i;
		}
		return result-max(finalResultNumbers)-min(finalResultNumbers);
	}

	public static boolean alreadyInArray(int i, int[] intArray) {
		for (int integer : intArray) {
			if (i == integer) {
				return true;
			}
		}
		return false;
	}
	
	public static int max(int[] is) {
		int result;
		result = is[0];
		for (int i:is) {
			if (result<i) {
				result = i;
			}
		}
		return result;
		
	}
	public static int min(int[] is) {
		int result;
		result = is[0];
		for (int i:is) {
			if (result>i) {
				result = i;
			}
		}
		return result;
		
	}
}