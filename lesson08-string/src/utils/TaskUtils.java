package utils;

import java.util.concurrent.TimeUnit;

public class TaskUtils {

	private TaskUtils() {
	}

	public static void doTask(String taskName, int seconds) {
		String tName = Thread.currentThread().getName();
		try {
			System.out.println(taskName + " is being executed ... by thread '" + tName + "'");
			TimeUnit.SECONDS.sleep(seconds);

//			for (int i = seconds; i >= 1; i--) {
//				System.out.println(i);
//			}

			System.out.println(taskName + " is done at " + );
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
