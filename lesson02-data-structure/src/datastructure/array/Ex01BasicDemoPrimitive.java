package datastructure.array;

import java.util.Arrays;
import java.util.Random;

public class Ex01BasicDemoPrimitive {
	public static void main(String[] args) {
		// 1. Khai báo, khởi tạo mảng
		
		// Cách 1: Khai báo và khởi tạo 1 mảng với giá trị mặc định
		int[] digits = new int[8];
		
		// gán, cập nhật giá trị cho phần tử trong mảng
		digits[2] = 123;
		digits[4] = 582;
		
		// In nhanh 1 mảng
		System.out.println("digit ----> " + Arrays.toString(digits));
		System.out.println("digit length: " + digits.length);
		
		System.out.println("\n===========================\n");
		
		// Cách 2: Khai báo và khởi tạo giá trị cho mảng
		// int[] numbers = new int[] {47, 56, 95, 15, 34};
		int[] numbers = {47, 56, 95, 15, 34};
		
		// BT1 --> Lấy 1 phần tử ngẫu nhiên trong mảng
		
		Random rd = new Random();
		int a = rd.nextInt(5);	
		System.out.println(numbers[a]);
	}
}
