package datastructure.array;

import java.util.Arrays;
import java.util.Random;

public class Ex01BasicDemoPrimitive {
public static void main(String[] args) {
	//1 -> khai báo, khởi tạo mảng
	// Cách 1
	int []digits = new int[8];
	// gán giá trị cho phần tử trong mảng
	digits[2] = 123;
	digits[4] = 852;
	// In nhanh 1 mảng
	System.out.println("digits - > " + Arrays.toString(digits));
	System.out.println("digits length: " +digits.length);
	System.out.println("digits[5] -> " + digits[5]);
	
	System.out.println("\n=================\n");
	// Cách 2: khai báo và khởi tạo giá trị cho mảng
	//int[] numbers = new int[] {47, 86, 95, 15, 34};
	int [] numbers = {47, 86, 95, 15, 34};
	
	// Lấy một phần tử ngẫu nhiên trong mảng numbers[]
	Random rd = new Random();
	int randomValue = numbers[rd.nextInt(numbers.length)];
	System.out.println("randomValue -> " + randomValue);
}
private static int[]fetchData(){
	return new int[] {47, 86, 95, 15, 34};
}

}
