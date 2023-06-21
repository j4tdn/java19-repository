package utils;

import java.util.concurrent.TimeUnit;

public class TaskUtils {
	private TaskUtils() {
		
	}
	public static void doTask(String taskName, int seconds) {
//		String tname = Thread.currentThread().getName()
		try {
			System.out.println(taskName + " is being executed ...");
			TimeUnit.SECONDS.sleep(seconds);
//			for(int i = seconds; i>=1; i--) {
//				System.out.println();
//			}
			System.out.println(taskName + "is done !!!");
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
