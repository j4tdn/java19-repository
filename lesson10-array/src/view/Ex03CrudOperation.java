package view;

import java.util.Arrays;

import utils.ArrayUtils;

// Create, Read(Get), Update(Set), Delete 
public class Ex03CrudOperation {
	public static void main(String[] args) {
		int[] origin = {1, 9, 5, 36, 12, 33};
		
		System.out.println(Arrays.toString(origin));
		
		System.out.println("\n======= Add =======");
		
		System.out.println("Add new elemenet at index=3 --> " + Arrays.toString(add(origin, 3, 777)));
		System.out.println("Add new elemenet at index=0 --> " + Arrays.toString(add(origin, 0, 777)));
		
		System.out.println("\n======= Remove =======");
		
		System.out.println("Remove elemenet at index=1 --> " + Arrays.toString(remove(origin, 1)));
		System.out.println("Remove elemenet at index=4 --> " + Arrays.toString(remove(origin, 4)));
		
	}
	
	private static int[] remove(int[] origin, int pos) {
		if (pos < 0 || pos >= origin.length) {
			throw new IllegalArgumentException("Pos to add is invalid !!! --> " + pos);
		}
		
		// B1: Tạo mảng mới có length = oldLength
		// B2: Sao chép các phần tử từ oirgin -> newArray
		int[] newArray = Arrays.copyOfRange(origin, 0, origin.length);
		
		// B3: Thực hiện dịch trái từ vị trí thứ 'pos' đến length - 1
		ArrayUtils.shiftLeft(origin, pos);
		
		// B4: Lấy các phần tử từ 0 đến length - 2
		return Arrays.copyOfRange(newArray, 0, newArray.length-1);
	}
	
	
	// Option 1
	private static int[] add(int[] origin, int pos, int newValue) {
		if (pos < 0 || pos >= origin.length) {
			throw new IllegalArgumentException("Pos to add is invalid !!! --> " + pos);
		}
		
		// B1: Tạo mảng mới có length = oldLength + 1
		// B2: Sao chép các phần tử từ oirgin -> newArray
		int[] newArray = ArrayUtils.copyOf(origin, origin.length + 1);
		
		// B3: Dịch phải 1 đơn vị từ vị trí thứ 'pos' đến length-1
		ArrayUtils.shiftRight(newArray, pos);
		
		// B4: Gán giá trị mới vào đúng vị trí
		newArray[pos] = newValue;
		
		return newArray;
	}
}