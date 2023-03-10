package homework;

import java.util.Arrays;

public class Ex5 {

	public static void main(String[] args) {
		System.out.println("Bài 5: Viết chương trình kiểu tra N có phải là số đối xứng hay không\r\n"
				+ "Biết rằng N được nhập từ bàn phím là một số nguyên dương có tối thiểu 2 chữ số\r\n"
				+ "VD: Nhập N = abc  báo lỗi, yêu cầu nhập lại\r\n"
				+ "= a123  báo lỗi, yêu cầu nhập lại\r\n"
				+ "= 1  báo lỗi, yêu cầu nhập lại\r\n"
				+ "= 256  false\r\n"
				+ "= 12521  true\r\n"
				+ "= 2662  true");
		String numberToCheck = Ex1.inputTwoDigitsNumber();
		if (isSymmetricNumber(numberToCheck)==true) {
			System.out.println(numberToCheck + " là số đối xứng");
		} else {
			System.out.println(numberToCheck + " không là số đối xứng");

		}

	}
	public static boolean isSymmetricNumber (String input) {
		for (int i = 0; i < input.length()/2; i++) {
			if (input.charAt(i)!=input.charAt(input.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}
}
