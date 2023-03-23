package datastructure.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		//1 --> khai báo, khởi tạo mảng
		
		// mảng KDL đối tượng
		//c1
		int[] digits = new int [8];
		
		digits [2]= 123;
		digits [4]= 852;
		
		
		System.out.println("digits ->>"+ Arrays.toString(digits));
		System.out.println("digits length"+ digits.length);
		System.out.println("digits [5]" + digits [5]);
		
		//c2 : khai báo và khởi tạo giá trị cho mảng
		int [] numbers = new int [] {47,86,95,15,34};
		Random rd = new Random();
		int randomValue = numbers[rd.nextInt(numbers.length)];
	}
	public static int[] fetchData() {
		return new int[] {47,86,95,15,34};
	}
	//bt laays 1 phaanf tử ngẫu nheien trong mảng number
	
		
		
		
	
}
