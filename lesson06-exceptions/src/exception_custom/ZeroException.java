package exception_custom;

public class ZeroException extends Exception{
	
	// java seriallizable, read/write data
	private static final long serialVersionUID = -1032930172131826808L;

	public ZeroException(String message) {
		super(message);
	}
	
}