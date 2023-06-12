package string.immutable;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		String s1 = new String("hello");
		System.out.println("s1"+s1);
		String s2 = new String("xin chao");
		System.out.println("s2"+s2);
		String s3 = new String("hello");
		System.out.println("s3"+s3);
//		--> 1 lần new là 1 lần tạo ô nhớ trên heap
		
		String l1 = "thanks";
		System.out.println("l1"+l1);
		String l2 = "cam on";
		System.out.println("l2"+l2);
		String l3 = "thank";
		System.out.println("l3"+l3);
//		--> lưu trữ những giá trị không trùng nhau
	}

}
