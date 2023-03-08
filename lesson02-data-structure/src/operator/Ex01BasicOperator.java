package operator;

public class Ex01BasicOperator {

	public static void main(String[] args) {
		// Toán tử gán
		int a = 6;
		a += 2;// a=a+2
		a *= 2;// a=a*2
		System.out.println("a-->" + a);

		// Toán tử một ngôi
		a++;// a=a+1
		a--;// a=a-1
		// Toán tử 1 ngôi - Tiền tố - Hậu tố
		// Prefix, suffix
		// Tiền tố: + hoặc - vào giá trị hiện tại --> đem giá trị đó sử dụng trong biểu
		// thức
		// Hậu tố: Sử dụng giá trị hiện tại cho biểu thức rồi đem đi + hoặc - sau
		// Toán tử so sánh
		int b = 18;
		boolean isAEqualsB = a == b;
		System.out.println("isAEqualsB-->" + isAEqualsB);
		boolean isAGreaterThanB = (a > b);
		System.out.println("isAGreaterThanB-->" + isAGreaterThanB);
		boolean isAEvenNumber = (a % 2 == 0);
		// Toán tử phủ định-- dùng biến, biểu thức boolean
		boolean isAOddNumber = !isAEvenNumber;
		System.out.println("isAOddNumber-->" + isAOddNumber);
		
	}

}
