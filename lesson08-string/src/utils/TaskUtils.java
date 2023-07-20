package utils;

import java.util.concurrent.TimeUnit;

public class TaskUtils {

	private TaskUtils() {
	}

	public static void doTask(String taskName, int seconds) {
		String tname = Thread.currentThread().getName();
		try {
			System.out.println(taskName + " is being executed .... by thread '" + tname + "' at " + DateUtils.currentTime());
			TimeUnit.SECONDS.sleep(seconds);

			System.out.println("\n" + taskName + " is done at " + DateUtils.currentTime());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}