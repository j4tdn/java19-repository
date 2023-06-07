package singleton;

public class Clock {
	// bien/ doi tuong duy nhat se duoc tao ra trong class Clock
	private static Clock INSTANCE = null;
	
	public int time;
	
	
    private Clock(){
     }
    
    public static Clock geInstance() {
    	if (INSTANCE == null) {
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
