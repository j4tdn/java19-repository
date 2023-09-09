package common;

import java.util.function.BinaryOperator;

public class DeviceRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("DeviceRunnable -- calling -- method calling");
	}
}
