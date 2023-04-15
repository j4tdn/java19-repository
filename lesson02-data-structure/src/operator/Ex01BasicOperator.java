package operator;

//Format code --> ctrl shift f
public class Ex01BasicOperator {
	public static void main(String[] args) {
		// Toán tử gán
		int a = 6;
		a += 2; // a = a + 2
		a *= 2; // a = a * 2
		System.out.println("a1 --> " + a);// 16

		// Toán tử 1 ngôi
		a++;// a = a + 1
		a--;// a = a - 1
		System.out.println("a2 --> " + a);
		// System.out.println("a2++ --> " + (a++));
		System.out.println("a2++ --> " + (++a));

		// Toán tử 1 ngôi - Tiền tố - Hậu tố
		// Prefix, suffix
		// Tiền tố: + hoặc - vào giá trị hiện tại --> đem giá trị đó sử dụng giá trị
		// Hậu tố:sử dụng giá trị hiện tại cho biểu thức rồi mới đem đi + hoặc - sau
		int b = a++;
		System.out.println("b --> " + b);

		// Toán tử so sánh --> được dùng trong biểu thức so sánh
		boolean isAEqualsB = (a == b);
		System.out.println("isAEqualsB --> " + isAEqualsB);

		boolean isAGreaterThanB = (a > b);
		System.out.println("isAGreaterThanB --> " + isAGreaterThanB);

		boolean isAEvenNumber = (a % 2 == 0);
		System.out.println("isAEvenNumber --> " + isAEvenNumber);
	}
}
