package string.mutable;

// Thread --> execute Task 
// Default --> Main thread
// 
public class Ex0TestMultiThread {
	public static void main(String[] args) {
		System.out.println("Main --> Start");
		System.out.println("\n================\n");
		
		String defaultThread = Thread.currentThread().getName();
		System.out.println(defaultThread);
		
		System.out.println("\n================\n");
		System.out.println("Main --> End");
	}
}
