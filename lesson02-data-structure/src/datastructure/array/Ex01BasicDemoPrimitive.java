package datastructure.array;

import java.util.Arrays;
import java.util.Random;

public class Ex01BasicDemoPrimitive {
	public static void main(String[] args) {
		//1 --> Khai báo , khởi tạo mảng
		
		// Mảng: là kiểu dữ liệu đối tượng --> giá trị lưu ở HEAP
		//		: số lượng phần tử cố định
		//		--> khai báo thì phải khai áo số lượng phần tử cho nó
		//		: chỉ số bắt đầu từ 0 --> length-1
		//		: giá trị mặc định phụ thuộc vào kdl của từng phần tử trong mảng
		
		
		//cách 1: khai báo và khởi tạo mảng với giá trị mặc định
		// digits --> 0,0,0,0,0,0,0,0
		int[] digits = new int[8];
		
		//gán, cập nhật giá trị cho phẩn tử trong mảng
		digits[2] = 123;
		digits[4] = 852;
		digits[7] = 854;
		
		
		
		//In nhanh 1 mảng
		System.out.println("digits -->" + Arrays.toString(digits));
		System.out.println("digits length: " + digits.length);
		
		System.out.println("\n================\n");
		
		//cách 2 khai báo và khởi tạo giá trị cho mảng
		//int[] numbers = fetchData
		//int[] numbers = new int[] {47, 86, 95, 15, 34};
		int[] numbers = {47, 86, 95, 15, 34};
		//BT0-- tìm những phần tử lẻ trong mảng
		for(int i = 0; i < numbers.length; i++) {
			int currentNumber = numbers[i];
			if(currentNumber % 2 !=0) {
				System.out.println("lẻ ---> " + currentNumber);
			}
		}
		// BT1 --> lấy 1 phần tử ngẫu nhiên trong mảng numbers
		
		Random rd = new Random();
		//int index = rd.nextInt(numbers.length);
		//int randomValue = numbers[index];
		int randomValue = numbers[rd.nextInt(numbers.length)];
		System.out.println("randomValue : " + randomValue);
		
		
		
		
		
	}
	
	private static int[] fetchData() {
		return  new int[] {47, 86, 95, 15, 34};
		//return numbers;
	}
}
