package string;

public class Test {
	public static void main(String[] args) {
		String s = "haha";
		System.out.println(System.identityHashCode(s));
		s = "1111";
		System.out.println(System.identityHashCode(s));
	}
}
