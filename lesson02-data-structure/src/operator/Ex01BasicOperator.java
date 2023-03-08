package operator;

// Format code Ctrl + Shift + F
public class Ex01BasicOperator {

	public static void main(String[] args) {
		// toán tử gán --> convention (quy tắc)
		int a = 6;

		a += 2; // a = a + 2
		a *= 2; // a = a * 2

		System.out.println("a1 --> " + a); // 16

		// Toán tử 1 ngôi
		a++; // a = a + 1 //17
		a--; // a = a - 1 //16

		int b = a++;
		System.out.println("b1 --> " + b); // 16
		System.out.println("a --> " + a); // 17

		b = ++a;
		System.out.println("b1 --> " + b); // 18
		System.out.println("a --> " + a); // 18

		// System.out.println("a2++ --> "+ (a++)); //16
		// System.out.println("a2++ --> "+ (++a)); //17

		--a; //17

		// Toán tử 1 ngôi- Tiền tố - Hậu tố
		// Prefix, suffix
		// Tiền tố: + hoặc - xong rồi mới sử dụng giá trị
		// Hậu tố: sử dụng giá trị hiện tại cho biểu thức xong rồi mới + hoặc -

		// Toán tử so sánh --? được dùng trong biểu thức so sánh
		boolean isAEqualB = (a == b);
		System.out.println("isAEqualB --> "+ isAEqualB);
		
		boolean isAGreaterThanB = (a>b);
		System.out.println("isAGreaterThanB --> " + isAGreaterThanB);
		
		boolean isAEvenNumber = ((a % 2) == 0);
		System.out.println("isAEvenNumber --> " + isAEvenNumber);
		
		//toán tử phủ định thường dùng cho biến/ biểu thức boolean
		boolean isAOddNumber = !isAEvenNumber;
		System.out.println("isAOddNumber --> " + isAOddNumber);
		
		//Toán tử && & || | ?:|
	}

}
