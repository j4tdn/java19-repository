package string.immutable;


public class Ex03StringDemo01 {
public static void main(String[] args) {
	String s = "hello world, my name is teo";
	String s1 = ", nice to meet you all";
	
	//1. 
	System.out.println(s1.length());
	
	System.out.println("\n==================\n");
	//2.
	System.out.println("s + concat -> " + (s.concat(s1)));
	System.out.println("\n==================\n");
	
	//3.
	char  a = s.charAt(3);
	System.out.println("a -> " + a);
	System.out.println("\n==================\n");
	//4.
	for(int i =0; i < s.length(); i++) {
	char n = s.charAt(i);
	System.out.println("n -> " + n);
	}
	System.out.println("\n==================\n");
	
	String []cut =  s.split("[\\s,]+");// +<=>{1,} cắt theo 1 hoặc nhiều kí tự -> lấy trường hợp tốt nhất
									  // [//s]+ tổ hợp nhiều trường hợp xuất hiện trong []
	for(String cuts : cut) {
		System.out.println("các từ xuất hiện -> " + cuts);
	}
	System.out.println("\n==================\n");
}
}
