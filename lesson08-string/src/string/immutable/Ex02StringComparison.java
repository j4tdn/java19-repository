package string.immutable;

public class Ex02StringComparison {
public static void main(String[] args) {
	String s1 = "susan";
	String s2 = "pepe";
	String s3 = "pepe";
	
	String o1 = new String("susan");
	String o2 = new String("pepe");
	String o3 = new String("pepe");
	
	// so sánh địa chỉ 
	System.out.println("s1==s2 -> " + (s1 == s2));
	System.out.println("o1==o2 -> " + (o1 == o2));
	
	System.out.println("s1 == s2 -> " + (s1 == s2));
	System.out.println("s1.equal(s2) -> " + s1.equals(s2));
	
	
	// so sánh giá trị lớn bé -> compare to 
	// s1.compareTo(s2)
	// > 0 -> s1 > s2
	// < 0 -> s1 < s2 
	System.out.println("s1.compareTo(s2) -> " + s1.compareTo(s2));
	System.out.println("o2.compareTo(o3) -> " + o2.compareTo(o3));
}
}
