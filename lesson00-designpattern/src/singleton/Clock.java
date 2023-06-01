package singleton;

public class Clock {
	
	
	// đối tượng duy nhất được tạo ra trong class này 
	private static Clock INSTANCE = null;
	
	public int time;
	
	private Clock() {
	}
	
	public static Clock getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new Clock();
		}
		return INSTANCE;
	}
	public void setTime(int Time) {
		this.time = Time;
	}
	
	@Override
	public String toString() {
		return "clock -> " + time;
	}
}
