package exception.custom;

public class CustomExceptionDemo {
	public static void main(String[] args) {
		long x = 22;
		
		NonZeroValidator nzValidator = new NonZeroValidator(x);
		try {
			nzValidator.validate();
		} catch (ZeroException e) {
			e.printStackTrace();
		}
		System.out.println("***___finished___***");
	}
}
