package code300;

import java.util.Arrays;
import java.util.Scanner;

public class Ex09 {
public static void main(String[] args) {
	Scanner ip = new Scanner(System.in);
	System.out.println("Nhập RansomeNote: ");
	String ransomnote = ip.nextLine();
	System.out.println("Nhập Magazine: ");
	String magazine = ip.nextLine();
	System.out.println(canConstruct(ransomnote, magazine));
}
private static boolean canConstruct(String ransomNote,String magazine ) {
	int[] charCount = new int[26];
	char[] rsn = ransomNote.toCharArray();
	char[] mgz = magazine.toCharArray();
	
	// Đếm số lần xuất hiện các ký tự trong magazine
	for(char c : mgz) {
		charCount[c - 'a']++;
		System.out.println(Arrays.toString(charCount));
	}
	
	// Kiểm tra xem RansomeNote có thể được tạo thành từ các ký tự trong magazine hay không 
	for(char c : rsn) {
		if(charCount[c - 'a'] == 0) {
			return false;
		}
		charCount[c - 'a']--;
	}
	return true;
}
}
