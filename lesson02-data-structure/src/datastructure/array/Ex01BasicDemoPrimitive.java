package datastructure.array;

import java.util.Arrays;
import java.util.Random;

public class Ex01BasicDemoPrimitive {
       public static void main(String[] args) {
		   // 1 --> khai báo, khởi tạo mảng
    	   
    	   
    	   // cách 1
    	   int[] digits = new int[8];
    	   
    	   System.out.println("digits --> " + Arrays.toString(digits));
    	   
    	   
    	   //BT1 --> lấy 1 phần tử ngãu nhiên trong mảng numbers
    	   Random rd = new Random();
    	  
    	   int randomValue = numbers[rd.nextInt(numbers.length)];
    	   System.out.println("randomValue --> " + randomValue);
	}
}
