package Ex03;

public class StringRevert {
	public static void main(String[] args) {
        String input = "Welcome   to JAVA10 class";
        String output = revert(input);
        System.out.println("Output: " + output);
    }

    public static String revert(String s) {
        String[] words = s.split("\\s+");
        StringBuilder reversed = new StringBuilder();

        for (String word : words) {
            StringBuilder wordReversed = new StringBuilder(word);
            wordReversed.reverse();
            reversed.append(wordReversed).append(" ");
        }

        return reversed.toString().trim();
    }

}
