package common;

public class DeviceRunnable implements Runnable{
	
	private String deviceName;
	
	// String deviceName = deviceName;
	public DeviceRunnable(String deviceName) {
		this.deviceName = deviceName;
	}
	
	@Override
	public void run() {
		System.out.println("DevideRunnable -- calling(" + deviceName + ") -- run method");
	}
	
}
