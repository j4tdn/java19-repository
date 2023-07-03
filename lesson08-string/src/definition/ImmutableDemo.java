package definition;

public class ImmutableDemo {
	public static void main(String[] args) {
		ImmutableTest t1 = new ImmutableTest(17, "Hello");
		System.out.println("t1 -> " + t1);

		// So sánh String s1 = new String(); vs String s2 =...
		// Unable to modify values at HEAP
		// final -> unable to modify value at STACK
	}
}
