package throw_throws_trycatch;

public class Ex01Divisor {
public static void main(String[] args) {
	try {
	System.out.println("M,N -> " + divide(5, 0));
	}catch (ArithmeticException e) {
		System.out.println("AEM -> " + e.getMessage() );
	}
	System.out.println("\nK, T  -> " + divide(10, 2));
	
}
// utility method 
// Nhận vào input và xử lý logic -> được gọi từ nhiều chỗ 
private static int divide(int a, int b) {
	if(b == 0) {
		throw new ArithmeticException("b should not be zero!!! ");
		// khi ném ngoại lê ra -> đoạn code phía sau sẽ không thực thi 
	}
	return a/b;
}
}
