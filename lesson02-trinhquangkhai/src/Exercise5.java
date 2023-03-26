import java.util.Scanner;
import java.util.regex.Pattern;

public class Exercise5 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("nhập n: ");
		String n = ip.nextLine();
		Exercise5.isValidNumber(n);
		System.out.println("In ra n: " + n);
		System.out.println(isSymmetricalNumber(n) ? "Là số đối xứng" : "Không phải là số đối xứng");

	}

	private static boolean isSymmetricalNumber(String input) {
		int Length = input.length();

		if (Length % 2 == 0) {
			for (int i = 0; i < (Length / 2); i++) {
				if (input.charAt(i) != input.charAt(Length - (i + 1))) {
					return false;
				}
			}
		} else if (Length % 2 == 1) {
			for (int i = 0; i < (Length - 1) / 2; i++) {
				if (input.charAt(i) != input.charAt(Length - (i + 1))) {
					return false;
				}
			}
		}
		return true;

	}

	private static boolean isValidNumber(String input) {
		int textLength = input.length();
		if (textLength < 2) {
			return false;
		}

		for (int i = 0; i < textLength; i++) {
			char letter = input.charAt(i);
			if (!Character.isDigit(letter))
				return false;
		}
		return true;
	}

}
