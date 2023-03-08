package controlling;

public class Ex02DoWhile {
	public static void main(String[] args) {
		int j = 0;
		do {
			if (j % 9 == 0) {
				System.out.println("Bội của 9 là : " + j);
			}
			j++;
		} while (j < 50);
	}
}
