package bean;

public class WrongEmailException extends Exception {
	/**
		 * 
		 */
	private static final long serialVersionUID = -1996922660613587522L;

	public WrongEmailException(String message) {
		super(message);
	}
}
