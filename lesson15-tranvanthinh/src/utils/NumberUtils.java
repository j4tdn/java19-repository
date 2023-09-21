package utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class NumberUtils {

	private NumberUtils() {

	}

	public static BigDecimal bd(double val) {
		return BigDecimal.valueOf(val);
	}
	
	public static BigDecimal bdround(BigDecimal number, int scale) {
		return number.setScale(scale, RoundingMode.HALF_EVEN);
	}
	
	
	
	
	
	
}
