package Ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringsSolver {
	public static void main(String[] args) {
		String[] strings1 = { "01a2b3456cde478",""};
		String[] strings2 = { "aa6b546c6e22h", "aa6b326c6e22h" };
		
		String[] largestNumbers1 = getLargestNumbers(strings1);
		System.out.println("Result 1: " + String.join(", ", largestNumbers1));
		
		System.out.println("\n========================\n");
		
		String[] largestNumbers2 = getLargestNumbers(strings2);
		System.out.println("Result 2: " + String.join(", ", largestNumbers2));
	}

	public static String[] getLargestNumbers(String[] ss) {
		List<Integer> largestNumbers = new ArrayList<>();

		for (String s : ss) {
			int largest = 0;

			Pattern pattern = Pattern.compile("\\d+");
			Matcher matcher = pattern.matcher(s);

			while (matcher.find()) {
				int num = Integer.parseInt(matcher.group());
				largest = Math.max(largest, num);
			}

			largestNumbers.add(largest);
		}

		largestNumbers.sort(null);

		String[] result = new String[largestNumbers.size()];
		for (int i = 0; i < largestNumbers.size(); i++) {
			int number = largestNumbers.get(i);
			result[i] = String.format("%d", number);
		}

		return result;
	}
}
