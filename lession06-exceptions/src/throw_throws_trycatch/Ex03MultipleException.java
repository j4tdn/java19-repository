package throw_throws_trycatch;

import java.util.Scanner;

public class Ex03MultipleException {
	private static Scanner ip= new Scanner(System.in);
	
	//Khối catch đứng sau phải là :
	// 1. Khong liên qian gì đến nhau
	// 2. Khối catch đứng sau là con của khối catch đứng trước
	
	public static void main(String[] args) {
		try {
			int result = inputAndDivide();
			System.out.println("result --> "+ result);
		} catch (NumberFormatException | ArithmeticException e) {
			System.out.println("NumberFormatException --> " + e.getMessage());
		}
	}
	public static int inputAndDivide() {
		int a = input("Enter A");
		int b = input("Enter B");
		
		return divide(a,b);
	}
	
	public static int input(String prefix) {
		System.out.println(prefix + " : ");
		return Integer.parseInt(ip.nextLine());
	}
	
	private static int divide(int a, int b) {
		if(b==0) 
			throw new ArithmeticException("b should not be zero !!!");
		return a/b;
	}
}
