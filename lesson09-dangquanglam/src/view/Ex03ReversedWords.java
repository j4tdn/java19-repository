package view;

public class Ex03ReversedWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Welcome to JAVA10 class";
		System.out.println("Input : " + s);
		String[] words = s.split("[\\s,+]+"); // split by space and comma
		String[] reversedWords = new String[words.length];
		for (int i = 0; i < words.length; i++) {
		   String word = words[i];
		   String reversedWord = "";
		   for (int j = word.length() - 1; j >= 0; j--) {
		      reversedWord += word.charAt(j);
		   }
		   reversedWords[i] = reversedWord;
		}
		String reversedString = String.join(" ", reversedWords);
		System.out.println("Output: " + reversedString);

	}

}
