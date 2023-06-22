package string.immutable;

public class Ex02StringComparision {
	public static void main(String[] args) {
		String s1 = "susan";
		String s2 = "pepe";
		String s3 = "pepe";
		
		
		String o1 = new String("susan");
		String o2 = new String("pepe");
		String o3 = new String("pepe");
		
		//so sanh dia chi
		System.out.println("s1 == s2 --> "+ (s1==s2));
		System.out.println("o2 == o3 --> "+ (o2==o3));
		
		//mac dinh neu ham equals tu class objects 
		//--> dung toan tu == so sanh dia chi
		//override lai thi so sanh gia tri cua cac thuoc tinh
		//--> so sanh gai tri
		
		System.out.println("s1.equals(s2) --> "+ s1.equals(s2));
		System.out.println("o2.equals(o3) --> "+ o2.equals(o3));
		
		// so sanh gia tri lon be --> compare to
		System.out.println("s1.compareTo(s2) --> " + s1.compareTo(s2));
		System.out.println("(o2.compareTo(03) -->" + o2.compareTo(o3));
	}

}
