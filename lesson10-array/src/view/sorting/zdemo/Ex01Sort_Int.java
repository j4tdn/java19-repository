package view.sorting.zdemo;

import java.util.Arrays;

import utils.ArrayUtils;

public class Ex01Sort_Int {
   public static void main(String[] args) {
	int[] numbers = {4, 1, 9, 2, 8, 15, 6};
	System.out.println("numbers -->" + Arrays.toString(numbers));
	// sort primitive type, support ASC (default) only
	ArrayUtils.sort(numbers, false);
	
	System.out.println("numbers sort dsc -->" + Arrays.toString(numbers));

  }
  
}
