import java.util.Arrays;
import java.util.Scanner;

public class Ex03 {
public static void main(String[] args) {
	Scanner ip = new Scanner(System.in);
	System.out.println("Nhập chuỗi kí tự thứ nhất: ");
	String str1 = ip.nextLine();
	System.out.println("Nhập chuỗi kí tự thứ hai: ");
	String str2 = ip.nextLine();
	boolean result = areAnagrams(str1, str2);
	System.out.println("result -> " + result);
}
private static boolean areAnagrams(String str1, String str2) {
	str1 = str1.replaceAll("\\s", "").toLowerCase();
	str2 = str2.replaceAll("\\s", "").toLowerCase();
	
	char[] charArray1 = str1.toCharArray();
	char[] charArray2 = str2.toCharArray();
	
	Arrays.sort(charArray1);
	Arrays.sort(charArray2);
	
	return Arrays.equals(charArray1, charArray2);
}
}
