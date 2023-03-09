package datastructure.primitive;

public class Ex03PrimitivePassingValue {
	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		a = modify(a);
		System.out.println(a);
	}
	private static int modify(int number) {
		return 9;
	}
}
