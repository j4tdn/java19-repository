package utils;

import java.util.concurrent.TimeUnit;

public class TaskUtils {
	private TaskUtils() {
	}
	
	public static void doTask(String taskName, int second) {
		try {
			System.out.println(taskName + " is being executed...");
			TimeUnit.SECONDS.sleep(second);
			System.out.println(taskName + " is done !!!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
