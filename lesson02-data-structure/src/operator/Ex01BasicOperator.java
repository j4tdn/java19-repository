package operator;

public class Ex01BasicOperator {
	public static void main(String[] args) {
		int a = 6;
		a += 2;// a=a+2
		a *= 2;// a+a*2
		System.out.println("a1 --> " + a);

		// Toán tử 1 ngôi
		a++;// a=a+1
		a--;// a=a-1

		System.out.println("a2 --> " + a);
		// System.out.println("a2++ --> " + (a++)); //16
		System.out.println("a2++ --> " + (++a)); // 17
		// Toán tử 1 ngôi - Tiền tố -Hậu tố
		// Prefix, suffix

		int x = 5, y = 2, z = 3;
		y += y + x++ + z++ + ++z + ++x - y-- + z;
		System.out.println(x + " " + y + " " + z);
	}

}
