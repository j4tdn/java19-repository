package operator;

public class Ex01BasicOperator {
	public static void main(String[] args) {
		// toán tử gán --> convention - quy tắc
		int a = 6;
		a += 2; // a = a + 2
		a *= 2; // a = a * 2

		System.out.println("a --> " + a);

		// Toán tử một ngôi
		a++; // a = a + 1
		a--; // a = a - 1
		System.out.println("a1 --> " + a);

		int b = a++;
		System.out.println("b --> " + b);
		System.out.println("a2 --> " + a);

		// Toán tử một ngôi - Tiền tố - Hậu tố
		// Prefix, suffix

		// Toán tử so sánh --> được dùng trong biểu thức so sánh
		boolean isAEqualsB = (a == b);
		System.out.println("isAEqualsB --> " + isAEqualsB);

		boolean isAGreatherThanB = (a > b);
		System.out.println("isAGreatherThanB --> " + isAGreatherThanB);

		boolean isAEvenNumber = (a % 2 == 0);
		System.out.println("isAEvenNumber --> " + isAEvenNumber);

		boolean isAOddNumber = !isAEvenNumber;
		System.out.println("isAEvenNumber --> " + isAOddNumber);

		// Toán tử && & || | ?:
	}
}
