package controlling;

public class Ex02While {
	public static void main(String[] args) {
		int i = 0;
		while(i < 50) {
			if (i % 7 == 0) {
				System.out.println(i + " ");
			}
			i++;
		}
		System.out.println("Exit while condition...\n");
		i = 0;
		
		while (true) {
			if (i % 7 == 0) {
				System.out.println(i + " ");
			}
			i++;
			if (i == 50) {
				break;
			}
		}
	}

}