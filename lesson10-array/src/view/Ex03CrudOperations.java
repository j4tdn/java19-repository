package view;

import java.util.Arrays;


public class Ex03CrudOperations {
	public static void main(String[] args) {
		int[] origin = {1, 9, 5, 36, 12, 33};
		System.out.println(Arrays.toString(origin));
		
		System.out.println("========= ADD ==========");
		System.out.println(" add new element at index = 3 -->" + Arrays.toString(add(origin, 3, 777)));
		System.out.println(" add new element at index = 0 -->" + Arrays.toString(add(origin, 0, 777)));
		
		System.out.println("========= REMOVE ==========");
		System.out.println(" remove element at index = 3 -->" + Arrays.toString(add(origin, 3, 777)));
		System.out.println(" remove element at index = 0 -->" + Arrays.toString(add(origin, 0, 777)));
		
	}
	
	//opntion 1
	private static int[] add(int[] origin, int pos, int newValue) {
		if(pos < 0 || pos >= origin.length) {
			throw new IllegalArgumentException("Pos to add is invalid!!! --> " + pos);
		}
		//B1: tao mang moi co length = oldlength +1
		int[] newArray = new int[origin.length + 1];
		
		//B2: Sao chep phan cac phan tu tu origin -> > newArray
		for (int i = 0; i < origin.length; i++) {
			newArray[i] = origin[i];
		}
		
		//B3: Dich phai 1 don vi tu vi tri thu 'pos' den length-1
		for (int i = newArray.length-1; i > pos; i--) {
			newArray[i] = newArray[i-1];
		}
		
		//B4: Gan gia tri moi vao dung vi tri
		newArray[pos] = newValue;
		
		return newArray;
	}
}
