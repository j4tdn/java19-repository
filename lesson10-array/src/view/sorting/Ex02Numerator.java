package view.sorting;

import functional.Operator;

public class Ex02Numerator {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		System.out.println("add --> " + process(x, y, Ex02Numerator::sum));
		// là một tham chiếu đến phương thức sum trong lớp Ex02Numerator, 
		//và nó được chuyển vào phương thức process thông qua giao diện Operator.
		System.out.println("subtract --> " + process(x, y, (a, b) -> a - b));
		System.out.println("multiply --> " + process(x, y, (a, b) -> a * b));
	}
	
	public static int sum(int a, int b) {
		return a + b;
	}
	
	private static int process(int a, int b, Operator operator) {
		//operator: Một đối tượng thuộc một giao diện hoặc lớp cung cấp phương thức 
		// operate để thực hiện một phép toán nào đó giữa a và b.
		return operator.operate(a, b);
	}
}
