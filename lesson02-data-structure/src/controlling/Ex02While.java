package controlling;

public class Ex02While {
	public static void main(String[] args) {
		int i = 0;
		while (true) {
			if (i % 8 == 0) {
				System.out.println("Bội của 8 là : " + i);
			}
			i++;
			if(i == 50) {
				break;
			}
		}
	}
}
