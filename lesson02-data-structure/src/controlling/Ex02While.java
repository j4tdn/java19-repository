package controlling;

public class Ex02While {
	public static void main(String[] args) {
		// 1. In ra danh sách các số là bội của 7 và nhỏ hơn 50
		int i = 0;
		while (i < 50) {
			if (i % 7 == 0) {
				System.out.print(i + " ");
			}
			i++;
		}
		System.out.println("Exit while conditiom..");
		
		System.out.println("\n============================\n");
		
		int j = 0;
		while (true) {
			if (j % 7 == 0) {
				System.out.print(j + " ");
			}
			j++;
			if (j == 50) {
				break;
			}
		}
		System.out.println("Exit while true conditiom..");
	}
}
