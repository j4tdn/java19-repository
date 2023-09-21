package utils;

import java.math.BigDecimal;

public class NumberUtils {

	private NumberUtils() {

	}
	
	public static boolean isValidIntegerNumber(String numberAsString) {
		return numberAsString.matches("-?\\d+(\\.\\d+)?");
	}

	public static BigDecimal bd(double val) {
		return BigDecimal.valueOf(val);
	}
}