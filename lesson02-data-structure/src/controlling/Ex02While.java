package controlling;

public class Ex02While {
	public static void main(String[] args) {
		// B1: In ra danh sách các số là bộ của 7 và nhỏ hơn 50
		int i = 0;
		while(i < 50) {
			if (i % 7 == 0) {
				System.out.print(i + " ");
			}
			i++;
		}
		
		System.out.println("Exit while condition ... \n");

		i = 0;
		
		// chạy mãi
		while(true) {
			if (i % 7 == 0) {
				System.out.print(i + " ");
			}
			i++;
			// điều kiện dừng
			if (i == 50) {
				break;
			}
		}
		System.out.println("Exit while true ...");
	}
}
