package operator;

//Format code --> ctrl shift f
public class Ex01BasicOperator {
	public static void main(String[] args) {
		// Toán tử gán

		int a = 6;
		a += 2;
		a *= 2;
		System.out.println(" a1 --> " + a);

		// Toán tử 1 ngôi
		a++; // a = a + 1
		a--; // a = a - 1;

		int b = a++;
		System.out.println("b -->" + b);

		System.out.println(" a2 --> " + a);
		// System.out.println(" a2++ --> "+ (a++));//16
		System.out.println("a2++ --> " + (++a));// 17

		// Toán tử 1 ngôi - Tiền tố - Hậu tố
		// Prefix, suffix
		// Tiền tố: + hoặc - vào rồi giá trị hiện tại --> đem gía trị đó sử dụng trong
		// biến
		// Hậu tố: sử dụng giá trị hiện tại cho biểu thưc rồi --> đem đi + hoặc - sau

		boolean isAEqualsB = a == b;
		System.out.println("isAEqualsB -->" + isAEqualsB);

		boolean isAGreaterThanB = a > b;
		System.out.println("isAGreaterThanB -->" + isAGreaterThanB);

		boolean isAEvenNumber = (a % 2 == 0);
		System.out.println("isAEvenNumber -->" + isAEvenNumber);

		boolean isAOddNumber = !isAEvenNumber;
		System.out.println("isAOddNumber -->" + isAOddNumber);

		
	}
}
