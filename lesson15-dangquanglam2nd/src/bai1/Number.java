package bai1;

public class Number {
	private int numerator;
	private int denominator;

	public Number(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public static Number fromDecimal(double decimal) {
		int denominator = (int) Math.pow(10, getDecimalPlaces(decimal));
		int numerator = (int) (decimal * denominator);

		int gcd = gcd(numerator, denominator);
		return new Number(numerator / gcd, denominator / gcd);
	}

	private static int getDecimalPlaces(double decimal) {
		String text = Double.toString(Math.abs(decimal));
		int integerPlaces = text.indexOf('.');
		return text.length() - integerPlaces - 1;
	}

	private static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

	@Override
	public String toString() {
		return numerator + "/" + denominator;
	}
}
