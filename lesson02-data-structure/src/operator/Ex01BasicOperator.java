package operator;

// Format code --> ctrl shift f
public class Ex01BasicOperator {
	public static void main(String[] args) {
		// Toán tử gán --> convention - quy tắc
		int a = 6;
		a += 2; // a = a + 2
		a *= 2; // a = a * 2
		System.out.println("a1 --> " + a); // 16

		// Toán tử 1 ngôi
		a++; // a = a + 1
		a--; // a = a - 1

		int b = a++;
		System.out.println("b --> " + b);

		System.out.println("a2 --> " + a);
		// System.out.println("a2++ --> " + (a++)); // 16
		System.out.println("++a2 --> " + (++a)); // 17

		// Toán tử 1 ngôi - Tiền tố - Hậu tố
		// Prefix, suffix
		// Tiền tố: + hoặc - vào rồi giá trị hiện tại --> đem giá trị đó sử dụng trong
		// biểu thức
		// Hậu tố: Sử dụng giá trị hiện tại cho biểu thức rồi --> đem đi + hoặc - sau
	
		// Toán tử so sánh --> được dùng trong biểu thức so sánh
		boolean isAEqualsB = (a == b);
		System.out.println("isAEqualsB --> " + isAEqualsB);
		
		boolean isAGreaterThanB = (a > b);
		System.out.println("isAGreaterThanB --> " + isAGreaterThanB);
		
		boolean isAEvenNumber = (a % 2 == 0);
		System.out.println("isAEvenNumber --> " + isAEvenNumber);
		
		// Toán tử phủ định --> dùng biến, biểu thức boolean
		boolean isAOddNumer = !isAEvenNumber;
		System.out.println("isAOddNumer --> " + isAOddNumer);
		
		// Toán tử && & || | ?:
	}
}
