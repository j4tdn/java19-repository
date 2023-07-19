package view;

import java.util.Arrays;

public class Ex03CrudOperations {
	public static void main(String[] args) {
		int[] origin = {1,9,5,36,12,33};
		System.out.println(Arrays.toString(origin));
		System.out.println("\n====================\n");
		add(origin,3,777);
	}
	
	//cach 1
	private static int[] add(int[] origin, int pos, int newValue) {
		//B1: tạo mảng mới có length bắng length mảng ban đầu +1
		int[] newArray = new int[origin.length + 1];
		System.out.println(Arrays.toString(newArray));
		
		//B2: copy các phần tử từ mảng origin sang new array
		for(int i = 0; i < origin.length; i ++) {
			newArray[i] = origin[i];
		}
		System.out.println(Arrays.toString(newArray));
		
		//B3: dịch phải 1 đơn vị từ vị trí pos đến length -1
		for(int i = newArray.length -1; i > pos; i--) {
			newArray[i] = newArray[i-1];
		}
		System.out.println(Arrays.toString(newArray));
		
		//B4: gán giá trị mới vào đúng vị trí
		newArray[pos] = newValue;
		System.out.println(Arrays.toString(newArray));
		
		return newArray;
	}
}
