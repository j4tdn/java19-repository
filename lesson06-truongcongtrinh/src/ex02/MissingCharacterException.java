package ex02;

public class MissingCharacterException extends RuntimeException {

	private static final long serialVersionUID = -578769161576848141L;

	public MissingCharacterException() {
	}

	public MissingCharacterException(String message) {
		super(message);
	}

}