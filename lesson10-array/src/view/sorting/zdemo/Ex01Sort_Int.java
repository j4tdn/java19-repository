package view.sorting.zdemo;

import java.util.Arrays;

import utils.ArrayUtils;

public class Ex01Sort_Int {

	public static void main(String[] args) {

		int[] numbers = { 4, 1, 9, 2, 8, 15, 6 };
		
		System.out.println("numbers --> " + Arrays.toString(numbers));
		// Dòng này in ra màn hình mảng numbers trước khi sắp xếp. 
		//Arrays.toString(numbers) được sử dụng để chuyển mảng thành một chuỗi để in ra.
		
		ArrayUtils.sort(numbers, false);
		
		System.out.println("numbers sorted DESC --> " + Arrays.toString(numbers));
	}
}
