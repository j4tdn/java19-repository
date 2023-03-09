package controling;

public class Ex02For {
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			System.out.println("Value: " + i);
		}
		
		
		System.out.println("\n==============================\n");
		
		for (int i = 1; i < 50; i++) {
			if(i % 7 == 0) {
				System.out.println(i + " is number multiple of 7 and smaller 50");
			}
		}
		
		
	}
}
