package string.Imutable;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = new String("Xin chao");
		String s3 = new String("hello");
		
		String l1 = "thanks";
		String l2 = "cam on";
		String l3 = "thanks";
	}
	
	private static void hash(String prefix, String val) {
		System.out.println(prefix + ": " + System.identityHashCode(val));
	}
}
