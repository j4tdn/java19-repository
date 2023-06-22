package string.immutable;

public class Ex02StringComparision {
   public static void main(String[] args) {
	  String s1 = "susan";
	  String s2 = "pepe";
	  
	  String o1 = new String("susan");
	  String o2 = new String("pepe");
	  String o3 = new String("pepe");
	  //so sanh dia chi
	  System.out.println("s1 ==s2 -->" + (s1==s2));// so sanh dia chi
	  //mac dinh neu ham equals tu class Object --> dung toan tu == --> so sanh dia chi
	  //override lai thi so sanh gia tri cua cac thuoc tinh --> so sanh gia tri
	  
	  System.out.println("s1.equals(s2) -->" + s1.equals(s2));
	  System.out.println("o2.equals(o3) -->" + o2.equals(o3));
	  
	  //so sanh gia tri lon be --> compareTo
	  // s1.compareTo(s2)
	  //> 0 --> s1 > s2
	  //= - --> s1 = s2
	  //< 0 --> s1 < s2
	  
	  System.out.println("s1.compareTo(s2) -->" + s1.compareTo(s2));
	  System.out.println("o2.compareTo(o3) -->" + o2.compareTo(o3));


}
}
