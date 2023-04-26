package bai2;

import utils.Utils;

public class ArraySolution {
	public static void main(String[] args) {
		int n = Utils.inputInteger(); //Nhập n
		int[] randArray = Utils.randIntArray(n, 10, 99);
		PrintIntArray(solve(randArray));
		
	}
	
	public static int[] solve(int[] arr) {
		Integer[] divisibleBySeven = new Integer[arr.length];
		Integer[] divisibleByFive = new Integer[arr.length];
		Integer[] divisibleByFiveAndSevenAndOther = new Integer[arr.length];
		
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		
		for (int i : arr) {
			if( i % 5 != 0 && i % 7 == 0) {
				divisibleBySeven[count1++] = i;
			}
			else if (i % 5 == 0 && i % 7 != 0) {
				divisibleByFive[count2++] = i;
			}
			else {
				divisibleByFiveAndSevenAndOther[count3++] = i;
			}
		}
		
		int[] result = new int[arr.length];
		int index = 0;
		
		for (Integer i : divisibleBySeven) {
			if(i == null) break;
			result[index++] = i;
		}
		
		for (Integer i : divisibleByFiveAndSevenAndOther) {
			if(i == null) break;
			result[index++] = i;
		}
		
		for (Integer i : divisibleByFive) {
			if(i == null) break;
			result[index++] = i;
		}
		
		return result;
	}
	
	public static void PrintIntArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
