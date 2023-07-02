package view.test02;

public class Ex04StringPermutation {
	public static void main(String[] args) {
        String str = "ABC";
        generatePermutations("", str);
    }

	// chuẩn bị idea của giải thuật đệ quy
    private static void generatePermutations(String prefix, String remaining) {
        if (remaining.isEmpty()) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < remaining.length(); i++) {
                String newPrefix = prefix + remaining.charAt(i);
                String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
                generatePermutations(newPrefix, newRemaining);
            }
        }
    }
}
