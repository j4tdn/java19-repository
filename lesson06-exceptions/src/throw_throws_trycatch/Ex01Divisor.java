package throw_throws_trycatch;

public class Ex01Divisor {
	public static void main(String[] args) {

		try {
			System.out.println("6/0 ---> " + divide(6, 0));
		} catch (ArithmeticException e) {
			System.out.println("AEM -->" + e.getMessage());
		}
		
		System.out.println("4/2 ---> " + divide(4, 2));
		
		

	}
	
	//---> utility method
	//---> nhan vao input va xu li logic --> duoc goi tu nhieu 

	private static int divide(int a, int b) {
		if(b == 0) {
			throw new ArithmeticException("b should not be zero");
			//khi nem ngoaji le ra  --> doan code phia sau se khong dc thuc thi
		}
		return a / b;

		/*
		 * Exception in thread "main" java.lang.ArithmeticException: / by zero at
		 * throw_throws_trycatch.Ex01Divisor.divide(Ex01Divisor.java:11) at
		 * throw_throws_trycatch.Ex01Divisor.main(Ex01Divisor.java:7)
		 *
		 * validate --> nhap vao b phai luon !=0
		 * trycatch --> neu loi thi quang loi va tiep tuc
		 * 
		 */
	}
}
