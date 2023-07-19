package view;

import java.util.Arrays;

import Utils.ArrayUtils;

public class Ex03CrudOperation {
public static void main(String[] args) {
	int[] origin = {1,9,5,36,12,33};
	System.out.println(Arrays.toString(origin));
	System.out.println("Add new element ad index 3 -> " + Arrays.toString(add(origin, 3, 777)));
	System.out.println("Add new element at index 0 -> " + Arrays.toString(add(origin, 0, 777)));
}

private static int[] remove(int[] origin, int pos ) {
	if(pos < 0 || pos >= origin.length) {
		throw new IllegalArgumentException("Pos to add is invalid! ->>" + pos);
	}
	int[] newArray = new int[origin.length];
	for(int i = 0; i < origin.length; i++) {
		newArray[i] = origin[i];
	}
	for(int i = newArray.length - 1; i > pos; i++) {
		newArray[i] = newArray[i + 1];
	}
	return Arrays.copyOfRange(newArray, 0, newArray.length - 1);
}
private static int[] add(int[] origin, int pos, int newValue) {
	
	if(pos < 0 || pos >= origin.length) {
		throw new IllegalArgumentException("Pos to add is invalid! ->>" + pos);
	} 
	// B1: Tạo mảng mới có length = oldlength + 1
	int[] newArray = ArrayUtils.coppyOf(origin, origin.length + 1);
	
	// B2: Sao chép các phần tử từ origin -> newArray
	for(int i = 0; i < origin.length; i++) {
		newArray[i] = origin[i];
	}
	
	// B3: Dịch phải 1 đơn vị từ vị trí thứ 'pos' đến length - 1
	for(int i = newArray.length - 1; i > pos; i--  ) {
		newArray[i] = newArray[i - 1];
	}
	newArray[pos] = newValue;
	// B4: Gán giá trị mới vào đúng vị trí
	return newArray;
}
}
