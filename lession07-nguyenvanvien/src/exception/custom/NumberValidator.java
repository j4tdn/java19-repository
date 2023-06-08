package exception.custom;

public class NumberValidator {
	
	
	public NumberValidator() {
		
	}
	
	public boolean isNumber(String number) throws ThrowsException{
		if(!number.matches("\\d+(\\.\\d+)?")) {
			throw new ThrowsException("Please enter type Integer");
		}
		return true;
	}
}
