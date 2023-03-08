package controlling;

public class Ex02For {
	public static void main(String[] args) {
		//1. In ra danh sách các số nguyên của dương < 20 --> [0,20)
		for (int i = 1; i < 20; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n\n==================\n");
		
		//2. In ra danh sách các số là bội của 7 và nhỏ hơn 50
		for (int i = 1; i < 50; i++) {
			if (i % 7 == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
