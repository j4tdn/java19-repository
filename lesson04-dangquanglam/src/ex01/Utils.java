package ex01;

public class Utils {
	public static boolean isInteger(String input) {
		try {
			Integer.parseInt(input);
			return true;
		} catch (NumberFormatException e) {
			System.out.println("Sai định dạng, xin nhập lại!");
			return false;
		}
	}

	public static boolean isFloat(String input) {
		try {
			Float.parseFloat(input);
			return true;
		} catch (NumberFormatException e) {
			System.out.println("Sai định dạng, xin nhập lại!");
			return false;
		}
	}
}