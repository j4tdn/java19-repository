package exception_custom;

public class NonZeroValidator {
	
	private Number number;

	public NonZeroValidator(Number number) {
		this.number = number;
	}
	
	public void validate() throws ZeroException {
		if(number == null || number.intValue() == 0) {
			throw new ZeroException("Please enter number != 0");
		}
	}
}
