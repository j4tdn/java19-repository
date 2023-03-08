package operator;
// format code -> ctrl shilf f
public class Ex01BasicOperator {
	public static void main(String[] args) {
		// Toán tử gán
		int a = 6;
		a += 2; // a = a + 2
		a *= 2; // a = a * 2
		// Toán tử 1 ngôi 
		a++; // a = a + 1
		a--; // a = a - 1
		int b = a++;
		System.out.println("b -> " +b);
		System.out.println("a2 -> " + (a++));
		System.out.println("++a2 -> " + (++a));
		// Tiền tố: + hoặc - vào giá trị hiện tại -> đem giá trị sử dụng trong biểu thức
		// Hậu tố: Sử dụng giá trị hiện tại cho biểu thức rồi -> đem đi + hoặc - sau
		
		// Toán tử so sánh
		boolean isAEqualsB = (a == b);
		System.out.println("isAEqualsB -> " + isAEqualsB);
		boolean isAGreaterThanB = (a > b);
		System.out.println("is AGreaterThanB -> " + isAGreaterThanB);
		boolean isAEvenNumber = (a % 2 == 0);
		System.out.println("isAEvenNumber -> " + isAEvenNumber);
		boolean isAOddNumber = !isAEvenNumber;
		System.out.println("isAOddNumber -> " + isAOddNumber);
		
		
	}

}
