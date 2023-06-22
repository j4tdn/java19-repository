package string.mutable;

public class Ex02TestMultiThread {
public static void main(String[] args) {
	System.out.println("Main -> Start");
	System.out.println("\n=================\n");
	
	String defaultThread = Thread.currentThread().getName();
	System.out.println("default thread: " + defaultThread);
	
	System.out.println("\n====================\n");
	System.out.println("Main -> End");
	
}
}
