package controling;

public class Ex03BreakContinue {
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			if(i == 4) {
				continue;
			}
			if(i == 8) {
				break;
			}
			System.out.print(i + " ");
		}
	}
}
