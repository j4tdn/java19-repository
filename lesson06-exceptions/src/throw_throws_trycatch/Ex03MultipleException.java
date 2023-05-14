package throw_throws_trycatch;

import java.util.Scanner;

/*
 * yeu cau: chia 2 so a, b
 * 
 */
public class Ex03MultipleException {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//try nhieu catch
		//catch 1 ko lien quan den catch 2
		//catch 1 la con cua catch 2
		
		try {
			int result = inputAndDivide();
			System.out.println("result --> " + result);
			
//		} catch (NumberFormatException nfe) {
//			System.out.println("NumberFormatException -->"+ nfe.getMessage());
//		
//		} catch (ArithmeticException e) {
//			System.out.println("AEM --> " + e.getMessage());
		} catch (NumberFormatException | ArithmeticException e) {
			System.out.println("AEM --> " + e.getMessage());
		}
		
		System.out.println("===finished===");
		sc.close();
		
	}
	
	private static int inputAndDivide() {
		int a = input("enter a");
		int b = input("enter b");
		
		return divide(a, b);
	}
	
	private static int input(String prefix) {
		System.out.println(prefix + ": ");
		return Integer.parseInt(sc.nextLine());
	}
	
	private static int divide(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException("b should not be zero !!!");
			//khi nem ngoai le ra --> break
		}
		return a / b;
	}
	
	/**
	 * Exception in thread "main" java.lang.ArithmeticException: / by zero
			at throw_throws_trycatch.Ex01Divisor.divide(Ex01Divisor.java:15)
			at throw_throws_trycatch.Ex01Divisor.main(Ex01Divisor.java:10)
	 */
}
