package singleton;

public class Clock {
	//biến/obj duy nhất được tạo ra trong class Clock
	// INSTANCE --> Clock scope
	private static Clock INSTANCE = null;
	
	public int time;
	
	private Clock() {
		
	}
	
	public static Clock getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Clock(); //H1
		}
		return INSTANCE;
	}
	
	public void setTime(int time) {
		this.time = time;
	}
	
	public String toString() {
		return "clock -->" + time;
	}
}
