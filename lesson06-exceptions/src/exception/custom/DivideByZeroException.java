package exception.custom;

public class DivideByZeroException extends Exception {
	
	//java seriallizable, read/write data
	private static final long serialVersionUID = -1032930172131826808L;

	public DivideByZeroException(String message) {
		super(message);
	}
}
