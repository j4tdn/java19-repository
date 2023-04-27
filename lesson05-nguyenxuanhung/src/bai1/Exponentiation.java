package bai1;

public class Exponentiation {
	public static void main(String[] args) {
		System.out.println(isPower(8, 2));
	}

	public static boolean isPower(int x, int y) {
		if (x <= y) {
			if (x == 1)
				return true;
			int pow = 1;
			while (pow < y) {
				pow *= x;
			}
			return (pow == y);
		} else {
			if (x == 1)
				return true;
			int pow = 1;
			while (pow < x) {
				pow *= y;
			}
			return (pow == x);
		}

	}

}
