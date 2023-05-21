package exception.custom;

public class NonZeroValidator {
	//number laf class cha cua Integer, Double, Long 
	private Number number;
	
	private NonZeroValidator(Number number) {
		this.number = number;
	}
	
	public void validate() throws DivideByZeroException {
		if(number == null || number.intValue() == 0) {
			throw 
		}
	}
	
}
