package datastructure.array;

import java.util.Arrays;
import java.util.Random;

public class Ex01BasisDemoPrimitive {
	public static void main(String[] args) {
		//1 -->Khai baos, khoir tajo manrg
		
		// Mang : la kieu du lieu doi tuong -->gia tri luu o HEAP
		//		: So luong phan tu co dinh
		//		--> khai bao thi phai khai bao so luong phan tu cho no
		//		: chi so bat dau tu 0 --> length -1
		//		: gia tri mac dinh phu thuoc vao KDL cua tung phan tu trong mang
		
		
		//Casch 1
		// digits --> 0,0,0,0,0,0,0,0
		int[] digits = new int[8];
		
		digits[2] = 123;
		digits[4] = 852;
		
		//in nhanh 1 mang
		System.out.println("digits --> " + Arrays.toString(digits));
		System.out.println("digits --> " + digits.length);
		
		//cach 2 : khai bao va khoi tao gtri trong mang
	
//		int[] numbers = new int[] {47,36,94,12,76};
//		int[] numbers = fetchData();
		int[] numbers = {47,36,94,12,76};
		
		//BT1 --> lay 1 phan tu ngau nhien trong mang numbers
		int randomeVal = numbers[new Random().nextInt(numbers.length)];
		System.out.println("randomValue --> " + randomeVal);
	}
	public static int[] fetchData() {
		return new int[] {47,36,94,12,76};
	}
}
