package datastruture.array;

import java.util.Arrays;
import java.util.Random;

public class Ex01BasicDemoPrimitive {
public static void main(String[] args) {
	// Mảng là kiểu dữ liệu đối tượng -> giá trị lưu trữ nằm ở HEAP 
	// cách 1: khai báo và khởi tạo mảng với giá trị mặc định
	int digits[] = new int[8];
	// Gán, cập nhật giá trị cho phần tử trong mảng 
	digits[2] = 123;
	digits[4] = 825;
	
	
	// In nhanh một mảng
	System.out.println("digits -> " + Arrays.toString(digits));
	System.out.println("digits lenght: " + digits.length);
	
	System.out.println("\n=================\n");
	
	// cách 2: Khai báo và khởi tạo giá trị cho mảng 
	int[] numbers = new int[] {47, 86, 95, 15, 34};
	// BT0: tìm những phần tử lẻ trong mảng 
	for(int i = 0; i < numbers.length; i++) {
		int currentNumber = numbers[i];
		if(currentNumber % 2 != 0 ) {
			System.out.println("lẻ -> " + currentNumber);
		}
	}
	// BT1: lấy một phần tử ngẫu nhiên trong mảng numbers
	Random rd = new Random();
	int randomValue = numbers[rd.nextInt(numbers.length)];
	System.out.println("randomValue -> " + randomValue);
}
private static int[] fetchData() {
	return new int[] {47, 86, 95, 15, 34};
}
}
