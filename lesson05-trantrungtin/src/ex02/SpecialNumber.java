package ex02;

public class SpecialNumber {
	public static void main(String[] args) {
		System.out.println(isSpecialNumber(3));
		System.out.println(isSpecialNumber(4));
		System.out.println(isSpecialNumber(10));
	}

	private static boolean isSpecialNumber(int s) {
        int sum = 0;
        for (int i = 1; i <= s; i++) {
            sum += i;
            if (sum == s) {
                return true;
            }
        }
        return false;
    }
}
