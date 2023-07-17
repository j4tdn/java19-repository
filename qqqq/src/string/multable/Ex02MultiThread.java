package string.multable;

public class Ex02MultiThread {
	public static void main(String[] args) {
		System.out.println("Main --> Start");
		System.out.println("\n===================\n");

		String name1 = Thread.currentThread().getName();
		System.out.println(name1);
		
		System.out.println("\n===================\n");
		System.out.println("Main --> End");
	}
}
