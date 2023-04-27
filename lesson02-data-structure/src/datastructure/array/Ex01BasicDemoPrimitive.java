package datastructure.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Ex01BasicDemoPrimitive {
	public static void main(String[] args) {
		//1 --> khai báo khởi tạo mảng
		
		//mảng: là kiểu dữ liệu đối tượng --> giá trị lưu ở HEAP
		//    : số lượng phần tử cố định
		//    --> khai báo phải khai báo số lượng phần tử cho nó
		//    : chỉ số bắt đầu từ 0 --> length-1
		//    : giá tri mặc định phụ thuộc vào KDL của từng phần tử trong mảng
		
		//cách 1:
		//digits --> 0,0,0,0,0,0,0,0
		
		int[] digits = new int[8];
		
		//gán giá trị cho các phần tử trong mảng
		digits[2]=123;
		digits[4]= 852;
		
		//in nhanh một mảng
		System.out.println("digits --> " + Arrays.toString(digits));
		System.out.println("digits length: " + digits.length);
		System.out.println("digits[5] --> " + digits[5]);
		
		//cách 2: khai báo và khởi tạo giá trị cho phần tử
		//int[] numbers = fetchData();
		//int[] numbers = new int[] {47,86,95,15,34};
		int[] numbers = {47,86,95,15,34};
		
		//bt1 --> lấy 1 phần tử ngẫu nhiên trong mảng numbers
		Random rd = new Random();
		int randomValue = rd.nextInt(numbers.length);
		System.out.println("randomValue -->" + digits[randomValue] );
		
	}		
	public static int[] fetchData() {
		return new int[] {47,86,95,15,34};
	}
}
