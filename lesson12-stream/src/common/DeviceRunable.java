package common;

public class DeviceRunable implements Runnable{
	
	private String deviceName;
	
	// String deviceName = deviceName;
	public DeviceRunable(String deviceName) {
		this.deviceName = deviceName;
	}
	
	@Override
	public void run() {
		System.out.println("DevideRunnable -- calling(" + deviceName + ") -- run method");
	}
	
}