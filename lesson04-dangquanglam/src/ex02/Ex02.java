package ex02;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		Integer[] list = {12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18};
		System.out.println("Sorted list: " + Arrays.toString(sortList(list)));
	}

	private static Integer[] sortList(Integer[] integers) {

		Integer[] result = new Integer[integers.length];
		int count5 = 0;
		int count7 = result.length - 1;
		for (Integer integer : integers) {
			if (isBy5(integer) && !isBy7And5(integer)) {
				result[count5] = integer;
				count5++;
			} else if (isBy7(integer) && !isBy7And5(integer)) {
				result[count7] = integer;
				count7--;
				
			}
		}

		for (Integer integer : integers) {
			if (isBy7And5(integer)||(!isBy5(integer)&&!isBy7(integer))) {
				result[count5] = integer;
				count5++;
			}
		}
		return result;
	}
	
	public static boolean isBy5(Integer integer) {
		return (integer%5==0);
	}
	public static boolean isBy7(Integer integer) {
		return (integer%7==0);
	}
	public static boolean isBy7And5(Integer integer) {
		return (isBy5(integer)&&isBy7(integer));
	}

}