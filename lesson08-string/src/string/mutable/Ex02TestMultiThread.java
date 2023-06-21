package string.mutable;

//thread --> execute
//default --> main thread
public class Ex02TestMultiThread {
	public static void main(String[] args) {
		System.out.println("main --> Start");
		System.out.println("-----------------------");
		String defaultThread = Thread.currentThread().getName();
		System.out.println("default thread: " + defaultThread);
		
		System.out.println("---------------------");
		System.out.println("main --> end");
	}

}  
