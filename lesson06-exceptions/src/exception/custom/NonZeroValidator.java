package exception.custom;

public class NonZeroValidator {
	private static Number number;
	
	public NonZeroValidator(Number x) {
		this.number = x;
	}
	
	public static void validate() throws ZeroException {
		if (number == null || number.intValue() == 0) {
			throw new ZeroException("Please enter number !=0");
		}
	}
}
