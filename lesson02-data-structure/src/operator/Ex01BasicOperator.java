package operator;

public class Ex01BasicOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Toán tử gán
		int a = 6;
		a += 2; // a = a + 2
		a *= 2; // a = a * 2
		System.out.println("a1 --> " + a);// 16

		// Toán tử 1 ngôi
		a++; // a = a + 1 //16
		a--; // a = a - 1 //16
		int b = a++;// b=16 --> a = 17

		System.out.println("a2 --> " + a);// a = 17
		System.out.println("a2 --> " + (a++)); // a = 17
		System.out.println("a2 --> " + (--a)); // a = 16

		// Toán tử 1 ngôi -- tiền tố - hậu tố
		// Prefix, suffix
		// Tiền tố: + hoặc - vào giá trị hiện tại --> đêm giá trị đó sử dụng trong biến
		// Hậu tố : Sử dụng giá trị hiện tại cho biểu thức rồi --> đem đi + hoặc - sau
		
		//Toán tử so sánh
		boolean isAEqualsB = (a==b);
		System.out.println("isAQualsB-->" +isAEqualsB);
		
		boolean isAGreaterThanB = (a > b);
		System.out.println("isAGreaterThanB-->" +isAGreaterThanB);
		
		boolean isAEvenNumber = (a % 2 == 0);
		System.out.println("isAEvenNumber-->" +isAEvenNumber);
		
		//Toán tử phủ định  --> dùng biến , biểu thức boolean
		boolean isAOddNumber = !isAEvenNumber;
		System.out.println("isAOddNumber-->" +isAOddNumber);

		//Toán tử 
	}

}
