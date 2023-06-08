package exception_custom;

public class CustomExceptionDemo {
	public static void main(String[] args) {
		long x = 0;
		
		NonZeroValidator nzValidator = new NonZeroValidator(x);
		try {
			nzValidator.validate();
		} catch (ZeroException e) {
			e.printStackTrace();
		}
		
		System.out.println("*** ___ finished ___ ***");
		
		// try catch
		// try finally
		// try catch finally
	}
}