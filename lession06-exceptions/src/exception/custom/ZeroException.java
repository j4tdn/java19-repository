package exception.custom;

public class ZeroException extends Exception{
	
	private static final long serialVersionUID = 5462223600l;
	
	public ZeroException(String message) {
		super(message);
	}
}
