package controling;

public class Ex02DoWhile {
	public static void main(String[] args) {
		int i = 0;
		do {
			if(i % 7 == 0) {
				System.out.println(i + " ");
			}				
			i++;
		}while(i < 50);
	}
}
