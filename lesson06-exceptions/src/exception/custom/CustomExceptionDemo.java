package exception.custom;

import validate_trycatch.Ex01YearOfBirth_TryCatch;

public class CustomExceptionDemo {
	public static void main(String[] args) {
		
	
	long x = 0;
NonZeroValidator nzValidator = new NonZeroValidator(x);
try{
		nzValidator.validate();
	}catch(ZeroException e){
		e.printStackTrace();
	}


}
}

