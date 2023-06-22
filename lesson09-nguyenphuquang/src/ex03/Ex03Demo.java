package ex03;

public class Ex03Demo {

	public static void main(String[] args) {
		String string = "Welcome   to   JAVA10   class";
		System.out.println(revertString(string));
	}

	public static String revertString(String s) {
		String[] words = s.split("[\\s,]+");
		String result = "";
		for (String word : words) {
			result = result.concat(revertWord(word) + " ");
		}

		return result;
	}

	public static String revertWord(String s) {
		String result = "";
		for (int i = s.length(); i > 0; i--) {
			result = result + (s.charAt(i - 1));
		}

		return result;
	}

}
