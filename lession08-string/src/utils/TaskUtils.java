package utils;

import java.util.concurrent.TimeUnit;

public class TaskUtils {
	private TaskUtils() {
		
	}
	public static void doTask(String taskName,int seconds,long startTime) {
		try {
			System.out.println(taskName + " is being executed ....");
			TimeUnit.SECONDS.sleep(seconds);
//			for(int i =seconds;i>=1;i--) {
//				System.out.println(i +"(s) ");
//				TimeUnit.SECONDS.sleep(1);
//			}
			System.out.println(taskName + " is done !!!!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
