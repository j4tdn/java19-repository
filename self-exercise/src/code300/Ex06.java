package code300;

import java.util.Arrays;
import java.util.Scanner;

import javax.crypto.spec.ChaCha20ParameterSpec;

public class Ex06 {
public static void main(String[] args) {
	Scanner ip = new Scanner(System.in);
	System.out.println("Nhập chuỗi thứ nhất: ");
	String s = ip.nextLine();
	System.out.println("Nhập chuỗi thứ hai: ");
	String t = ip.nextLine();
	boolean result = isAnagram(s, t);
	System.out.println(result);
}
private static boolean isAnagram(String s, String t) {
	s = s.replaceAll("\\s", "").toLowerCase();
	t = t.replaceAll("\\s", "").toLowerCase();
	
	char[] character1 = s.toCharArray();
	char[] character2 = t.toCharArray();
	
	Arrays.sort(character1);
	Arrays.sort(character2);
	
	return Arrays.equals(character1, character2);
}
}
