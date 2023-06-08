package exception_custom;

public class NonZeroValidator {

	// Number là class cha của Integer, Long, Double
	private Number number;

	public NonZeroValidator(Number number) {
		this.number = number;
	}

	public void validate() throws ZeroException {
		if (number == null || number.intValue() == 0) {
			throw new ZeroException("Please enter number != 0");
		}
	}
}