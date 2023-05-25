package exception_custom;

public class CustomExceptionDemo {
public static void main(String[] args) {
	long x = 1;
	
	NonZeroValidator nzValidator = new NonZeroValidator(x);
	
	try {
		nzValidator.validate();
	} catch (ZeroException e) {
		System.out.println("A --->" + e);
	}
	
	System.out.println("Finish");
	
}
}
