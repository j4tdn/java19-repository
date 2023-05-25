package polymorphism.method;

import java.util.Iterator;

public class Ex01OverloadingDemo {
	 public static void main(String[] args) {
		 double total = sum(2d,4d);
		 System.out.println("total:" +total);
	}
	 /*
	  2 hay N hàm được gọi là overloading nếu 
	   - thuộc cùng 1 class
	   - cùng tên
	   - khác
	     + KDL truyền vào của tham số
	   	 + Số lượng tham số truyền vào
	  */
	 
	 
	 // tính tổng cho n số thực lớn
	 // truyền 1 hoặc nhiều tham số kiểu double
	 // ... variables -- > nhận vào 1 mảng double 
	 // hoặc nhận vào 0 hoặc nhiều giá trị double cách nhau bởi dấu ,
	  private static double sum (double... numbers) {
		  double result = 0d;
		  for (double number : numbers) {
			result += number;
		}
		 return result;
	 }
	 private static int sum(int a , int b) {
		 return a + b;
	 }
	 private static int sum(int a , int b,int c) {
		 return a + b+ c;
	 }
	private static float sum(float a, float b) {
		return a +b ;
	}
	 
}
