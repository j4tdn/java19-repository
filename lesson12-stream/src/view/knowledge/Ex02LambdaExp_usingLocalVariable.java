package view.knowledge;

import common.DeviceRunnable;

public class Ex02LambdaExp_usingLocalVariable {
public static void main(String[] args) {
	
}
private static Runnable doRun(int seconds) {
	String deviceName = "Lenovo 1277";
	return (Runnable) new DeviceRunnable();
}
}
