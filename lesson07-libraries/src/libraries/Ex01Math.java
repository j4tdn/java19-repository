package libraries;

public class Ex01Math {
	public static void main(String[] args) {
		System.out.println("min: " + Math.min(5.6, 6.7));
		
		float fVal = 10f/3;
		
		
		// not support much for rounding, scaling
		// --> should use DecimalFormat, BigDecimal
		
		System.out.println("fVal: " + fVal);
		System.out.println("round: " + Math.round(fVal));
		System.out.println("round up: " + Math.ceil(fVal));
		System.out.println("round down: " + Math.floor(fVal));
	}
}
