package excercise1;

import java.util.Arrays;

import bean.Ex2Utils;

public class Ex2 {
	public static void main(String[] args) {
		Integer[] list = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		System.out.println("Sorted list: " + Arrays.toString(sortList(list)));
	}

	private static Integer[] sortList(Integer[] integers) {

		Integer[] listResult = new Integer[integers.length];
		int running5 = 0;
		int running7 = listResult.length - 1;
		for (Integer integer : integers) {
			if (Ex2Utils.isDivisibleby5(integer) && !Ex2Utils.isDivisibleby7And5(integer)) {
				listResult[running5++] = integer;
			} else if (Ex2Utils.isDivisibleby7(integer) && !Ex2Utils.isDivisibleby7And5(integer)) {
				listResult[running7--] = integer;
			}
		}
		
		for (Integer integer : integers) {
			if (Ex2Utils.isDivisibleby7And5(integer)||(!Ex2Utils.isDivisibleby5(integer)&&!Ex2Utils.isDivisibleby7(integer))) {
				listResult[running5++] = integer;
			}
		}
		return listResult;
	}
}