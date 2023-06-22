package ex03;

public class RemoveRedundantWhiteSpaceAndReverse {
	public static void main(String[] args) {
		String string = "Welcome to JAVA10 class";
		System.out.println(revert(string));
	}
	
	private static String revert(String s) {
		String stripedString = s.strip();
		String[] words = stripedString.split("\\s+");
		
		 StringBuilder reversedStringBuilder = new StringBuilder();
		 
	        for (String word : words) {
	            StringBuilder wordBuilder = new StringBuilder(word);
	            reversedStringBuilder.append(wordBuilder.reverse()).append(" ");
	        }
	        
	        String reversedString = reversedStringBuilder.toString().strip();
	        
	        return reversedString;
	}
}
