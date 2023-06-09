package throw_throws_trycatch;

import java.util.Scanner;

public class Ex03MultipleException {
	private static Scanner ip = new Scanner(System.in);
public static void main(String[] args) {
	try {
	System.out.println("M,N -> " + divide(5, 0));
	}catch (ArithmeticException e) {
		System.out.println("AEM -> " + e.getMessage() );
	}
	System.out.println("\nK, T  -> " + divide(10, 2));
	
}
private static int InputAndDivide() {
	int a = input("Enter A");
	int b = input("Enter B ");
	return divide(a, b);
	
}
private static int input(String prefix) {
	System.out.println(prefix + ": ");
	return Integer.parseInt(ip.nextLine());
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
