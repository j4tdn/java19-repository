package controlling;

public class Ex02DoWhile {
	public static void main(String[] args) {
		// 1. In ra danh sách các số là bội của 7 và nhỏ hơn 50
		int i = 0;
		do {
			if (i % 7 == 0) {
				System.out.print(i + " ");
			}
		} while (i < 50);
	}
}
