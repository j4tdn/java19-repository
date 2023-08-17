package string.mutable;

import static utils.TaskUtils.*;

// Thread --> execute Task
// Default --> Main Thread
public class Ex02TestMultiThread {

	public static void main(String[] args) {
		System.out.println("Main --> Start");
		System.out.println("\n================\n");

		String defaultThread = Thread.currentThread().getName();
		System.out.println("default thread: " + defaultThread);

		// Thread
		// Runnable
		// void: run()
		// Thread ==> start ==> Runnable ==> run ==> execute task
		Thread t1 = new Thread(new Task("Task A", 5), "Thread 1");
		t1.start();

		Thread t2 = new Thread(new Task("Task B", 3), "Thread 2");
		t2.start();

		doTask("Task C", 4);

		System.out.println("\n================\n");
		System.out.println("Main --> End");
	}
}
