package view;

public class Ex03 {
	public static void main(String[] args) {
		String n = "12abu02muzk586cyx";
		int i = getMaxValidNumber(n);
		System.out.println(i);
	}
	private static int getMaxValidNumber(String n) {
		int i = 0;
		while (i < n.length()) {
			if (Character.isDigit(n.charAt(i))) {
				int j = i;
				while (j < n.length() && Character.isDigit(n.charAt(i))) {
					j++;
				}
				String numberString = n.substring(i, j);
				if (isNumberValid(numberString)) {
					int number = Integer.parseInt(numberString);
			}
			} else {
				i++;
			}
		}
	}
	private static boolean isNumberValid(String n) {
		if (n.charAt(0) == 0) {
			return false;
		}
		for (int i = 0; i < n.length(); i++) {
			if (!Character.isDigit(n.charAt(i))) {
				return false;
			}
		}
		return true;
	}

}
