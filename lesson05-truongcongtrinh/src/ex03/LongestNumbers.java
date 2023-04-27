package ex03;

public class LongestNumbers {
	private LongestNumbers() {
		System.out.println(getMaxValidNumber("Uyk892nn1234uxo2"));
	}

	public static void main(String[] args) {
		new LongestNumbers();
	}

	private static int getMaxValidNumber(String s) {
		String resNum = "";
		int max = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				resNum += s.charAt(i);
			} else {
				if (resNum == "") {
					continue;
				} else {
					max = Math.max(max, Integer.parseInt(resNum));
					resNum = "";
				}
			}
		}
		return max;
	}

}
