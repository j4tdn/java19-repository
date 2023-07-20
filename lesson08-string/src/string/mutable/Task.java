package string.mutable;

import utils.TaskUtils;

public class Task implements Runnable{
	
	private String name;
	private int seconds;
	
	public Task(String name, int seconds) {
		this.name = name;
		this.seconds = seconds;
	}
	
	@Override
	public void run() {
		TaskUtils.doTask(name, seconds);
	}

}