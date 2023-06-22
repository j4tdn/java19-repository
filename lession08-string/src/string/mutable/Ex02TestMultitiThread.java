package string.mutable;

import utils.TaskUtils;

// Thread --> Execute Task
// Default --> Main thread
public class Ex02TestMultitiThread {
	public static void main(String[] args) {
		System.out.println("Main --> Start");
		System.out.println("\n=================\n");
		
		String defaultThread = Thread.currentThread().getName();
		System.out.println("default thread : " + defaultThread);
		TaskUtils.doTask("Task A", 5);
		
		System.out.println("\n=================\n");
		System.out.println("Main --> End");
	}
}
