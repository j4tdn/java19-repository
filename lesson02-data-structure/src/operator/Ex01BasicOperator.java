package operator;

public class Ex01BasicOperator {
	public static void main(String[] args) {
		// toán tử gán
		int a = 5;
		a += 7;
		
		// toán tử 1 ngôi
		a++;
		a--;
		
		int b = a++;
		System.out.println("b = " + b);
		System.out.println("a = " + a);
		
		// tiền tố: + hoặc - vào giá trị hiện tại ->> đem giá trị đó sử dụng trong biểu thức
		// hậu tố: sử dụng giá trị hiện tại cho biểu thức rồi --> đem đi + hoặc - sau
		
		
		// toán tử so sánh   --> được dùng trong biểu thức so sánh
		boolean isAEqualsB = (a == b);
		System.out.println(isAEqualsB);
		
		boolean isAGreaterThanB = (a > b);
		System.out.println(isAGreaterThanB);
		
		boolean isAEvenNumber = (a % 2 == 0);
		System.out.println(isAEvenNumber);
		
		// toán tử phủ định  --> dùng biến, biểu thức boolean
		boolean isOddNumber = !isAEvenNumber;
		System.out.println(isOddNumber);
	}
}
