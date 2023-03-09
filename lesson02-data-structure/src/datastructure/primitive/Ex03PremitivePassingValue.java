package datastructure.primitive;

public class Ex03PremitivePassingValue {
	public static void main(String[] args) {
		int a = 5;
		int b = 7;

		// Cập nhật giá trị của a thành 9;
		System.out.println(a);

		System.out.println("===============");

		a = modify(a);
		System.out.println(a);

		// Tìm tích của a và b
		System.out.println("Result: " + multiply(a, b));
	}

	// Tham số number chưa có giá trị -> nó có giá trị
	// khi có nơi gọi nó và truyền giá trị
	/*
	 * Hàm cập nhật kiểu void -> không cập nhật biến ngoài hàm được
	 * 
	 * private static void modify(int number) { number = 9; }
	 */
	private static int modify(int number) {
		number = 9;
		return number;
	}

	private static int multiply(int a, int b) {
		return a * b;
	}

}
