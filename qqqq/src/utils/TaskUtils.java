package utils;

import java.text.DateFormat;
import java.util.concurrent.TimeUnit;

public class TaskUtils {

	private TaskUtils() {

	}

	public static void doTask(String taskName, int second) {
		try {
			System.out.println("Doing " + taskName + " ... ");
			TimeUnit.SECONDS.sleep(second);
			System.out.println(taskName + " is done !!!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
