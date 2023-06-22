package De1;

public class Ex03 {
	public static void main(String[] args) {
		String input = "Welcome   to  JAVA10  class";
		String output = reverseStringAndRemoveExtraSpaces(input);
		System.out.println(output);
	}

	public static String reverseStringAndRemoveExtraSpaces(String input) {
		// Loại bỏ khoảng trắng thừa
		String trimmedString = input.trim();
		String[] words = trimmedString.split("\\s+");

		StringBuilder reversedString = new StringBuilder();

		// Đảo ngược từng từ và thêm vào reversedString
		for (int i = words.length - 1; i >= 0; i--) {
			reversedString.append(reverseWord(words[i]));

			if (i > 0) {
				reversedString.append(" ");
			}
		}

		return reversedString.toString();
	}

	public static String reverseWord(String word) {
		StringBuilder reversedWord = new StringBuilder();

		for (int i = word.length() - 1; i >= 0; i--) {
			reversedWord.append(word.charAt(i));
		}

		return reversedWord.toString();
	}
}
