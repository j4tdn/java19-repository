package view;

import java.util.Arrays;

import utils.ArrayUtils;

public class Ex03CrudOperations {
	public static void main(String[] args) {
		int[] origin = {1, 9, 5, 36, 12, 33};
		System.out.println("777");
		System.out.println(Arrays.toString(add(origin, 3, 777)));
		System.out.println(Arrays.toString(remove(origin, 3)));
	}
	
	private static int[] add(int[] origin, int pos, int newValue) {
		if(pos < 0 || pos >= origin.length) {
			throw new IllegalArgumentException("pos is invalid");
		}
		int[] newArray = new int[origin.length + 1];
		//copy
		for(int i = 0; i < origin.length; i++) {
			newArray[i] = origin[i];
		}
		//dich phai
//		for(int i = newArray.length - 1; i > pos; i--) {
//			newArray[i] = newArray[i-1];
//		}
		ArrayUtils.shiftRight(newArray, pos);
		newArray[pos] = newValue;
		return newArray;
	}
	
	private static int[] remove(int[] origin, int pos) {
		int[] newArray = new int[origin.length];
		//copy
		for(int i = 0; i < origin.length; i++) {
			newArray[i] = origin[i];
		}
		
		//dich trai
//		for(int i = pos; i < origin.length - 1; i++) {
//			newArray[i] = newArray[i+1];
//		}
		ArrayUtils.shiftLeft(newArray, pos);
			
		return Arrays.copyOfRange(newArray, 0, newArray.length - 1);
	}
}
