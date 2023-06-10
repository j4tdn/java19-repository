package singleton;

public class Clock {
	
	// biến/đối tượng duy nhất sẽ được tạo ra trong class Clock.
	private static Clock INSTANCE = null;
	
	public int time;
	
	private Clock() {}
	
	public static Clock getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new Clock();
		}
		return INSTANCE;
	}
	
	public void setTime(int time) {
		this.time = time;
	}
	
	@Override
	public String toString() {
		return "clock --> " + time;
	}
}
