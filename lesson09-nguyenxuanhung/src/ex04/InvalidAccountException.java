package ex04;

public class InvalidAccountException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public InvalidAccountException() {
	}
	public InvalidAccountException(String message) {
		super(message);
	}

}
