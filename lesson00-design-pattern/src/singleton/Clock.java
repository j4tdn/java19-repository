package singleton;

public class Clock {
	
	private static Clock INSTANCE = null;
	
	private Clock() {
		
	}
	
	public static Clock getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new Clock();
		}
		return INSTANCE;
	}

	@Override
	public String toString() {
		return ;
	}
	
	
}
