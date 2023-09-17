package view.sorting;

import java.util.Arrays;

import utils.ArrayUtils;

public class Ex03CrudOperations { 
	public static void main(String[] args) {
		int[] origin = { 1, 9, 5, 36, 12, 33 };
	}

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

	private static int[] remove(int[] origin, int pos) {
		if (pos < 0 || pos >= origin.length) {
			throw new IllegalArgumentException("Pos to add is invalid !!! -> " + pos);
		}
		// B1: Tạo mảng mới có length = oldLength
		// B2: Sao chép các phần tử từ origin -> newArray
		int[] newArray = Arrays.copyOfRange(origin, 0, origin.length);

		// B3: Thực hiện dịch trái từ vị trí thứ 'pos' đến length - 1
		ArrayUtils.shiftLeft(origin, pos);

		// B4: Lấy các phần tử từ 0 đến length - 2
		return Arrays.copyOfRange(newArray, 0, newArray.length - 1);
	}
}
