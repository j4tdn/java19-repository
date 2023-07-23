package controlling;

public class Ex02DoWhile {
	public static void main(String[] args) {
		// B2: In ra danh sách các số là bộ của 7 và nhỏ hơn 50

		int i = 0;
		do {
			if (i % 7 == 0) {
				System.out.print(i + " ");
			}
			i++;
		} while (i < 50);

	}
}
