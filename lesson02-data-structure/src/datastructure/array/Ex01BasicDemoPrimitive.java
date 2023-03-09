package datastructure.array;

import java.util.Arrays;
import java.util.Random;

public class Ex01BasicDemoPrimitive {

	public static void main(String[] args) {
		//1 --> Khai báo, khởi tạo mảng
		
		//Mảng: là kiểu dữ liệu đối tượng (giá trị lưu ở HEAP)
		//có số lượng phần tử cố định
		//--> Khi khai báo thì phải khai báo số phần tử
		//Chỉ số bắt đầu từ 0 --> length từ 1
		//Giá trị mặc định phụ thuộc vào KDL của từng phần tử trong mảng
		
		//cách 1: khai báo mảng có giá trị default
		int[] digits = new int[8];
		
		//in nhanh 1 mảng
		System.out.println("digit --> " + Arrays.toString(digits));
		System.out.println("digit length--> " + digits.length);
		System.out.println("digit [5]--> " + digits[5]);
		
		//Cách 2: khai báo vào khởi tạo giá trị cho mảng
		//int[] number = new int[] {47, 86, 95, 15, 34};
		int[] numbers = {47, 86, 95, 15, 34};
		
		//BT1 --> Lấy 1 phần tử ngẫu nhiên trong mảng numbers
		//Random rd = new Random();
		int randomValue = numbers[new Random().nextInt(numbers.length)];
		System.out.println("randomValue --> " + randomValue);
	}
	private static int[] fetchData() {
		return new int[] {47, 86, 95, 15, 34};
		//return {47, 86, 95, 15, 34}; //sẽ báo lỗi 
		
		
	}

}
