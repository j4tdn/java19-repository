package view.knowledge;

import common.DeviceRunable;

public class Ex02LambdaExp_UsingLocalVariable {
    public static void main(String[] args) {
		
    	
    	
	}
	
	private static Runnable doRun(int seconds) {
		String deviceName = "Lenovo 1277";
		
		return new DeviceRunable(deviceName);
	}
	
}
