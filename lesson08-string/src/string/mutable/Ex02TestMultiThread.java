package string.mutable;

import static utils.TaskUtils.*;

// Thread --> execute task
// default --> Main Thread
public class Ex02TestMultiThread {
	public static void main(String[] args) {
		System.out.println("Main --> Start");
		long start = System.currentTimeMillis();
		System.out.println("\n==================\n");
		
		String defaultThread = Thread.currentThread().getName();
		
		System.out.println("default thread: " + defaultThread);
		
		// Thread 
		//    .Runnable
		//		  void run()
		//  Thread ==> start ==> Runnable ==> run ==> execute task

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				doTask("Task A",5);
			}
		}, "Thread 1");
		
		t1.start();
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				doTask("Task B",3);
			}
		}, "Thread 2");
		
		t2.start();
		
		
		doTask("Task C",4);
		
		System.out.println("\n==================\n");
		long end = System.currentTimeMillis();
		System.out.println("Time Execution: " + (end - start) + "(ms)");
		System.out.println("Main --> End");
	}
}
