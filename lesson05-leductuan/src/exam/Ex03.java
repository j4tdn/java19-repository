package exam;

public class Ex03 {
	public static void main(String[] args) {
		String text = "affgan123bn22ha462";
		int largestNumber =getMaxValidNumber(text);
		System.out.println("So tu nhien lon nhat trong chuoi: " + largestNumber);
	}

	public static int getMaxValidNumber(String a) {
		int largestNumber = -1;
		String[] substrings = a.split("[^\\d]+");
		for (String substring : substrings) {
			if (substring.matches("\\d+")) {
				int number = Integer.parseInt(substring);
				if (number > largestNumber) { 
					largestNumber = number;
				}
			}
		}
		return largestNumber;
	}
}
