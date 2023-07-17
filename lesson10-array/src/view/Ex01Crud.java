package view;

import java.util.Arrays;

public class Ex01Crud {

	public static void main(String[] args) {
		int[] numbers = { 1, 14, 33, 34, 55, 66 };
		int[] insertArrays = insert(numbers, 3, 99);
		System.out.println("insertArrays" + Arrays.toString(insertArrays));
		
		int[] addArrays = add(numbers, 3, 99);
		System.out.println("insertArrays" + Arrays.toString(addArrays));

		int[] removeArrays = remove(numbers, 3);
		System.out.println("insertArrays" + Arrays.toString(removeArrays));
	}
	
	private static int[] remove(int[] source, int pos) {
		int[] target = new int[source.length];

		for (int i = 0; i < source.length; i++) {
			target[i] = source[i];
		}

		for (int i = pos; i < target.length -1; i++) {
			target[i] = target[i + 1];
		}
		
		return Arrays.copyOfRange(target, 0, target.length -1);
	}

	private static int[] insert(int[] source, int pos, int newValue) {
		//B1: Tạo mảng mới có length = oldLength + 1
		int[] target = new int[source.length + 1];

		//B2: Sao chép các phần tử từ oirgin --> newArray
		for (int i = 0; i < source.length; i++) {
			target[i] = source[i];
		}
		//B3: Dịch phải 1 dơn vị từ vị trí thứ 'pos' đến length-1
		for (int i = target.length - 1; i > pos; i--) {
			target[i] = target[i - 1];
		}
		target[pos] = newValue;
		return target;
	}

	private static int[] add(int[] source, int pos, int newValue) {
		int[] target = new int[source.length + 1];

		for (int i = 0; i < target.length; i++) {
			if (i < pos) {
				target[i] = source[i];
			} else if (i == pos) {
				target[pos] = newValue;
			} else {
				target[i] = source[i - 1];
			}
		}
		return target;
	}
}
