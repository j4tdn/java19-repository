package ex03;

public class Ex03Revert {

	public static void main(String[] args) {
		String s = "  Welcome   to   JAVA10  class  ";
		System.out.println(revert(s));

	}

	private static String revert(String s) {
		String result = s.trim();
		String[] words = result.split("\\s+");
		StringBuilder reversed = new StringBuilder();
		for (int i = 0; i < words.length; i++) {
			reversed.append(reverseString(words[i])).append(" ");
		}

		return reversed.toString();
	}

	public static String reverseString(String s) {
		StringBuilder reversed = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; i--) {
			reversed.append(s.charAt(i));
		}
		return reversed.toString();
	}

}
