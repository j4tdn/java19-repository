package view.knowledge;

import common.DeviceRunnable;

public class Ex02LambdaExp_UsingLocalVariable {
	public static String haha;
	public static void main(String[] args) {
		
	}
	private static Runnable doRun(int seconds) {
		String deviceName = "Lenovo 1277";
		return new Runnable() {
			
			@Override
			public void run() {
				deviceName = "test";
			}
		};
	}
}
