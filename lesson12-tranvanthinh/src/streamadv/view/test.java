package streamadv.view;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class test {

	public static void main(String[] args) {
		double number = 123.566789;

		// Round to two decimal places
		BigDecimal roundedNumber = new BigDecimal(number).setScale(0, RoundingMode.HALF_EVEN);
		System.out.println(roundedNumber); // 123.41
	}
	
	
	
	
	
	
	
}
