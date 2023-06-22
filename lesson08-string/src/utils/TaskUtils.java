package utils;

import java.util.concurrent.TimeUnit;

public class TaskUtils {
    private TaskUtils() {
	}
    
    public static void doTask(String taskName, int seconds) {
    	try {
    		System.out.println("Doing " + taskName + "....");
			TimeUnit.SECONDS.sleep(seconds);
			System.out.println(taskName + "is done !!!$");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    }
}
