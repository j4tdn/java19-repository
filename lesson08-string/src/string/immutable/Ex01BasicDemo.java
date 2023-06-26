package string.immutable;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		// string object
		// --> HEAP
		String s1 = new String("hello");
		String s2 = new String("xin chao");
		String s3 = new String("hello");
		hash("s1", s1);
		hash("s2", s2);
		hash("s3", s3);
		
		System.out.println("\n===================\n");
		
		// string literal
		// --> HEAP --> 'constant pool'
		// lưu trữ những giá trị không trùng nhau
		String l1 = "thanks";
		String l2 = "cam on";
		String l3 = "thanks";
		// l1 = "thank you";
		hash("l1", l1);
		hash("l2", l2);
		hash("l3", l3);
	}
	
	private static void hash(String prefix, String val) {
		System.out.println(prefix + ": " + System.identityHashCode(val));
	}
}
