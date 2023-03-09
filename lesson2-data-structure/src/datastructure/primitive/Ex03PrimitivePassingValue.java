package datastructure.primitive;

public class Ex03PrimitivePassingValue {
	public static void main(String[] args) {
		int a = 5;
		int b = 7;

		a = modify(a);
		System.out.println(a);
		System.out.println("Multiply A and B = " + multiply(a, b));
	}

	private static int modify(int number) {
		number = 9;
		return number;
	}

	private static int multiply(int a, int b) {
		return a * b;
	}

}
