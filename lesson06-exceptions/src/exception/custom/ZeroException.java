package exception.custom;

public class ZeroException extends Exception {
	/**
	 * 
	 */
	//java seriallizable, read/write data
	private static final long serialVersionUID = 1L;

	public ZeroException(String message) {
		super(message);
	}
}
