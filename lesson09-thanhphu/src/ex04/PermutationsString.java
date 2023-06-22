package ex04;

public class PermutationsString {
	public static void main(String[] args) {
		String string = "xyz";
		printPermutations(string);
	}
	
	public static void printPermutations(String str) {
	    Permutations("", str);
	}

	private static void Permutations(String prefix, String suffix) {
	    if (suffix.length() == 0) {
	        System.out.println(prefix);
	    } else {
	        for (int i = 0; i < suffix.length(); i++) {
	            String newPrefix = prefix + suffix.charAt(i);
	            String newSuffix = suffix.substring(0, i) + suffix.substring(i + 1);
	            Permutations(newPrefix, newSuffix);
	        }
	    }
	}
}
