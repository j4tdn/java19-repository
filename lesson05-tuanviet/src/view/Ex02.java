package view;

public class Ex02 {
	public static void main(String[] args) {
		System.out.println(isSpecialNumber(1));
	}
	private static boolean isSpecialNumber(int n) {
		int S = n * (n + 1) / 2;
		return S == n;
	}

}
