package string.immutable;

public class Ex02StringComparision {
	public static void main(String[] args) {
		String s1  = "susan"; 
		String s2 = "pepe";
		String s3 = "pepe";
		
		String o1  = new String("susan");
		String o2 = new String("pepe");
		String o3 = new String("pepe");
		
		// so sánh địa chỉ
		System.out.println("s1 == s2 --> " + (s1==s2));
		System.out.println("s1 == s2 --> " + (o1==o3));
		
		// mặc định nếu hàm equals từ class Objects --> dùng toán tử == --> so sánh địa chỉ
		// override lại thì so sánh giá trị của các thuocj tính --> so sánh giá trị
		System.out.println("s1.equals(s2) --> " + s1.equals(s2));
		System.out.println("s1.equals(o2) --> " + o2.equals(o3));
		
		// so sánh giá trị lớn bé --> compare To
		
		// > 0 --> s1 > s2
		// = 0 --> s1 == s2
		// < 0 --> s1 < s2
		
		System.out.println("s1.compareTo(s2) --> " + s1.compareTo(s2));
		System.out.println("o2.compareTo(o3) --> " + o2.compareTo(o3));
	}
}
