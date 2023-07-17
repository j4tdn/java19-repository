package view;

import java.util.Arrays;

import utils.ArrayUtils;

// Create, Read(Get), Update(Set),  Delete
public class Ex03CrudOperations {
	public static void main(String[] args) {
		int[] origin = {1,9,5,36,12,33};
		
		System.out.println("Add element index 2 : "+ Arrays.toString(add(origin, 2, 99)));
		System.out.println("Remove element index 2 : " + Arrays.toString(remove(origin, 2)));
	}
	
	private static int[] remove(int[] origin,int pos ) {
		if(pos<0 || pos >= origin.length) {
			throw new IllegalArgumentException("Pos to add is invalid !!! --> " + pos);
		}
		
		int[] newArray = Arrays.copyOfRange(origin, 0, origin.length);
		// Thực hiện dịch trái từ vị trí pos đến lenth -1
		ArrayUtils.shiftLeft(newArray, pos);
		
		return Arrays.copyOfRange(newArray, 0, newArray.length-1);
	}
	
	// Option 1
	private static int[] add(int[] origin, int pos, int newValue) {
		
		if(pos<0 || pos >= origin.length) {
			throw new IllegalArgumentException("Pos to add is invalid !!! --> " + pos);
		}
		
		// B1 : Tạo mảng mới có length = oldLength + 1;
		// B2: Sao chép các phần tử origin -> newArray
		int[] newArray = ArrayUtils.copyOf(origin, origin.length+1);
		
		// B3: Dịch phải 1 đơn vị từ vị trí oldLengh 
		ArrayUtils.shiftRight(newArray, pos);
		newArray[pos] = newValue;
		
		return newArray;
	}
}
