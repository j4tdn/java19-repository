package ex02;

public class InvalidPasswordLengthException extends RuntimeException {
	private static final long serialVersionUID = -8322799661002985899L;

	public InvalidPasswordLengthException() {
	}

	public InvalidPasswordLengthException(String message) {
		super(message);
	}

}