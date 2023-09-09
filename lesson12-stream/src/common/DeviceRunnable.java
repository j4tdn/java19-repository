package common;

import view.knowledge.Ex02LambdaExp_UsingLocalVariable;

public class DeviceRunnable implements Runnable{
	private String deviceName;
	public DeviceRunnable(String deviceName) {
		this.deviceName = deviceName;
	}
	@Override
	public void run() {
		System.out.println("DeviceRunnable -- calling -- run method");
		
	}

}
