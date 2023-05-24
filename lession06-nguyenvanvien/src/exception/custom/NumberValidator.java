package exception.custom;

public class NumberValidator {
	public NumberValidator() {
	}
	
	public boolean zeroValidate(Number number) throws ThrowsException{
		if(number == null || number.intValue() == 0) {
			throw new ThrowsException("Please enter number A != 0");
		}
		return true;
	}
	
	public boolean validateType(String numberA,String numberB) throws ThrowsException{
		
			if(!numberA.matches("\\d+(\\.\\d+)?") || !numberB.matches("\\d+(\\.\\d+)?")) {
				throw new ThrowsException("Please enter type Integer");
			}
		 
		return true;
	}
	public boolean validateNumber(String numberA,int lengh) throws ThrowsException{
		if (lengh >= 4) 
		{
			throw new ThrowsException("Please enter number < 1000");

		}
		else {
			if(!numberA.matches("\\d+(\\.\\d+)?")) {
				throw new ThrowsException("Please enter type Integer and >0");
			}
		}
		 
		return true;
	}
}
