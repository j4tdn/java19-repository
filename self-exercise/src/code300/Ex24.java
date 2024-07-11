package code300;

public class Ex24 {
public static void main(String[] args) {
	String s = "leetcode";
	System.out.println(firstUniqChar(s));
}
public static int firstUniqChar(String s) {
	int[] charCount = new int[26];
	
	for(char c:s.toCharArray()) {
		charCount[c - 'a']++;
		
	}
	
	for(int i = 0;i < s.length();i++) {
		if(charCount[s.charAt(i) - 'a'] == 1) {
			return i;
		}
	}
	return -1;
}
}
