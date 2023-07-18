package test01;

import java.util.Arrays;

public class Ex02MaxValidNumbers {
	
	private static final String NUMBER_SPLIT_PATTERN = "[a-z]+";
	
	public static void main(String[] args) {
		String[] sequences = {
				"xx01axy88888yz2b3456cde478", 
				"01a2b3456cde478", 
				"aa6b326c6e22h",
				"aa6b546c6e22h",
				"aaaaaaaaa",
				"aaaaaaaaa"
		};
		
		// cắt theo 1 hoặc N kí tự chữ --> [a-z]+
		// cắt theo 1 hoặc N kí tự không phải là số
 		
		int[] maxValidNumbers = getMaxValidNumbers(sequences);
		Arrays.sort(maxValidNumbers);
		System.out.println("maxValidNumbers --> " + Arrays.toString(maxValidNumbers));
	}
	
	private static int[] getMaxValidNumbers(String[] sequences) {
		int[] result = new int[sequences.length];
		int count = 0;
		for (String s: sequences) {
			try {
				result[count] = max(getValidNumbers(s));
				count++;
			} catch (IllegalArgumentException e) {
				System.out.println(s + " --> " + e.getMessage());
			}
		}
		System.out.println("count --> " + count);
		return Arrays.copyOfRange(result, 0, count);
	}
	
	private static int max(int... numbers) {
		if (numbers.length == 0) {
			throw new IllegalArgumentException("The given number does not have any valid number");
		}
		int max = Integer.MIN_VALUE;
		for (int number: numbers) {
			if (max < number) {
				max = number;
			}
		}
		return max;
	}
	
	private static int[] getValidNumbers(String s) {
		String[] tokens = s.split(NUMBER_SPLIT_PATTERN); // 10 --> 2 empty
		
		int[] validNumbers = new int[tokens.length]; /// 8
		int count = 0;
		for (String token: tokens) {
			if (!token.isEmpty()) {
				validNumbers[count++] = Integer.parseInt(token);
			}
		}
		return Arrays.copyOfRange(validNumbers, 0, count);
	}
}
