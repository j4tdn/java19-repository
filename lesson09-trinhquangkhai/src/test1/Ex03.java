package test1;

public class Ex03 {
public static void main(String[] args) {
	String s = "Welcome to JAVA10 class";
	s = s.replaceAll("\\s", "");
	StringBuilder str = new StringBuilder(s);
	System.out.println("Chuỗi sau khi đã xóa khoảng trắng và đảo ngược: " + str.reverse().toString());
}
}
