package utils;

import java.util.concurrent.TimeUnit;

public class TaskUtils {
	public TaskUtils() {
	}
	
	public static void doTask(String taskname, int seconds) {
		try {
			System.out.println(taskname + "is being executed ...");
			TimeUnit.SECONDS.sleep(seconds);
			System.out.println(taskname + "is done !!!");
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}	
