package exam;

public class Bai2 {
	public static void main(String[] args) {
		System.out.println(isSpecialNumber(1));
		System.out.println(isSpecialNumber(3));
		System.out.println(isSpecialNumber(6));
		System.out.println(isSpecialNumber(10));
		System.out.println(isSpecialNumber(11));
		System.out.println(isSpecialNumber(12));
		System.out.println(isSpecialNumber(15));
	}

	public static boolean isSpecialNumber(Integer integer) {
		int sum = 0;
		int i = 0;
		while (sum < integer) {
			sum = sum + i++;
			if (sum == integer) {
				return true;
			}
		}
		return false;
	}
}
