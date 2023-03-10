package homework;

import java.util.Arrays;

public class Ex7 {
	public static void main(String[] args) {
		System.out.println("Bài 7: Viết chương trình chuyển đổi cơ số một số tự nhiên ở hệ cơ số 10(thập phân) thành số ở hệ\r\n"
				+ "cơ số 2(nhị phân)\r\n"
				+ "Tham khảo công thức: https://bit.ly/3QuVyXx\r\n"
				+ "VD: Nhập N = 0  0\r\n"
				+ "N = 1  1\r\n"
				+ "N = 2  10\r\n"
				+ "N = 3  11\r\n"
				+ "N = 4  100\r\n"
				+ "N = 5  101");
		
		Integer numberToConvert = Ex1.inputPositiveNumber();
		Integer[] result = reversedDecToBi(numberToConvert);
		System.out.println("Kết quả trong hệ nhị phân: " + Arrays.toString(result));
	
		
	}
	public static Integer[] reversedDecToBi (Integer input) {
		Integer[] result = new Integer[1000];
		int running = 0;
		while (true) {
			if (input == 0) {
				result[running] = input % 2;
				break;
			} else {
			result[running++] = input % 2;
			input /= 2;
			}
			}
		result = reverseInt(result, 1000);
		return Arrays.copyOfRange(result, 1000 - running, 1000);
	}
	
	public static Integer[] reverseInt (Integer[] input, int size) {
		Integer[] result = new Integer[size];
		for (int i = 0; i < size; i++) {
			result[i] = input[size - 1 - i];
		}
		return result;
	}
}
