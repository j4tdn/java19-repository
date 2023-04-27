package exam;

public class Bai3 {
	public static void main(String[] args) {
		System.out.println(getMaxValidNumber("12abu02muzk586cyx"));
		System.out.println(getMaxValidNumber("Uyk892nn1234uxo2"));
		System.out.println(getMaxValidNumber("0123as123asd213asd1345"));
		System.out.println(getMaxValidNumber("0123as123asd213asd0345asdUoias&^%$234"));
		System.out.println(getMaxValidNumber("A@fsdg0123as9123asd213asd1345"));
		System.out.println(getMaxValidNumber("(*^0123as==3asd213asd1230945"));
	}

	public static int getMaxValidNumber(String string) {
		String maxNumber;
		String tempNumber;
		maxNumber = "0";
		tempNumber = "";
		if (string == "") {
			System.out.println("String is empty!");
		} else {
			for (int i = 0; i < string.length(); i++) {
				if (isInteger(string.charAt(i))) {
					tempNumber += string.charAt(i);
					if (Integer.parseInt(maxNumber) < Integer.parseInt(tempNumber)) {
						maxNumber = tempNumber;

					}
				} else {
					tempNumber = "";
					continue;
				}
			}
		}

		return (int) Integer.parseInt(maxNumber);
	}

	public static boolean isInteger(char c) {
		if (c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8'
				|| c == '9') {
			return true;
		} else {
			return false;
		}
	}
}
