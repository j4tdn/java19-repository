package operetor;
//fomat code --> crt Shift f
public class Ex01BaisicOperetor {
	public static void main(String[] args) {
		// Toán tử gán --> convention - quy tắc

		int a = 6;

		a += 2;// a= a + 2
		a *= 2;// a= a * 2

		System.out.println("a1 =" + a);// a = 16

		// Toán tử 1 ngôi
		a++;// a = a + 1
		a--;// a = a - 1
		int b = ++a;
		int x = 5, y=2, z= 3;
		// phép toán
		System.out.println( y += y + (x++) + (z++)+(++z)+(++x)-(y--)+(z));

		System.out.println("b =" + b);// a = 16
		System.out.println("a2 =" + a);// a = 16
		// System.out.println("a2++ ="+ (a++));//a = 16
		System.out.println("++a2  =" + (++a));// a = 17

		// Toán tử 1 ngôi - tiền tố - Hậu tố
		// frefix, sufix
		// Tiền tố : + hoặc - vào ròi giá trị hiện tại --> đêm giá trị đó sử dụng trong
		// biểu thức
		// Hậu tố : Sử dụng giá trị hiện tại cho biểu thức ròi --> đem đi + hoặc - sau
		
		// Toán tử so sánh : Được dùng trong biểu thức so sánh;
		 
		boolean isAEquaslB = (a == b);
		System.out.println("isAEquaslB --> " + isAEquaslB);
		
		boolean isAGreaterThanB = (a > b);
		System.out.println("isAGreaterThanB ---> " + isAGreaterThanB);
		
		boolean isAEvenNumber = (a % 2 == 0);
		System.out.println("isAEvenNumber --> " + isAEvenNumber);
		
		// toán tử phủ định --> dùng biến biểu thức boolean
		boolean isAOddNumber =! isAEvenNumber;
		System.out.println("isAOddNumber --> " + isAOddNumber);
		
		// Toán tử && & || | ?:
		
		
	}

}
