package datastructure.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Ex01BasicDemoPrimitive {
	public static void main(String[] args) {
		//1--> declare array(object data --> HEAP)
		//fixed length --> declare length
		
		//cach 1: declare and create a default array
		//digits --> 0,0,0,0,0,0,0,0
		int[] digits = new int[8];
		
		//set, update value
		digits[2] = 123;
		digits[4] = 852;
		//digits[8] = 369; 0-->7: ERROR
		
		//print array
		System.out.println("digits-->" + Arrays.toString(digits));
		System.out.println("digits length: " + digits.length);
		
		System.out.println("\n==================\n");
		
		//cach 2:
		
		//int[] numbers = fetchData();
		//int[] numbers = new int[] {47,86,95,15,34};
		int[] numbers = {47,86,95,15,34};
		
		//BT1: printa random element of array
		Random rd = new Random();
		int index = rd.nextInt(numbers.length);
		System.out.println("random element of array: "+numbers[index]);
		
	}
	
	private static int[] fetchData() {
		return new int[] {47,86,95,15,34};
		//return {47,86,95,15,34}; 
	}
}
