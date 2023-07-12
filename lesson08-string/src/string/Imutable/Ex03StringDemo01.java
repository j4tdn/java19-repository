package string.Imutable;

public class Ex03StringDemo01 {
	public static void main(String[] args) {
		String s = "hello world, my name is teo";
		String s1 = ", nice to see you all";
		
		System.out.println("s length: " + s.length());
		System.out.println("s1 length: " + s1.length());
		
		String s2 = s.concat(s1);
		System.out.println(s2);
		
		System.out.println(s.charAt(3));
		
	}
}
