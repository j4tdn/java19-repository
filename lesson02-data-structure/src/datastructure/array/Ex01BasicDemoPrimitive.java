package datastructure.array;

import java.util.Arrays;
import java.util.Random;

public class Ex01BasicDemoPrimitive {

	public static void main(String[] args) {
		// 1 --> Khai báo, khởi tạo mảng

		/*
		 * Mảng: Là kiểu dữ liệu đối tượng --> giá trị lưu ở HEAP - mảng có số lượng cố
		 * định --> khai báo thì phải khai báo số lượng phần tử cho nó - chỉ số bắt đầu
		 * từ 0 -> length - 1 - giá trị mặc định phụ thuộc vào KDL của từng phần tử
		 * trong mảng
		 */

		// Cách 1
		int[] digits = new int[11];

		// gán, cập nhật giá trị cho phần tử trong mảng
		digits[2] = 11;

		// in nhanh 1 mảng
		System.out.println(digits.toString());
		System.out.println("digits --> " + Arrays.toString(digits));
		System.out.println("digits length: " + digits.length);
		System.out.println("digits[5]: " + digits[5]);

		System.out.println("============");

		// Cách 2: Khai báo và khởi tạo giá trị cho mảng
		int[] numbers = new int[] { 47, 86, 95, 15, 34 };
		int[] numbers2 = { 47, 86, 95, 15, 34 };
		Random rd = new Random();
		System.out.println(numbers[rd.nextInt(numbers.length)]);

	}

	private static int[] fetchData() {
		return new int[] { 47, 86, 95, 15, 34 };
	}

}
