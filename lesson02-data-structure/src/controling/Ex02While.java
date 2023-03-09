package controling;

public class Ex02While {
	public static void main(String[] args) {
		// Print list number is multiple of 7 and smaller 50
		int i = 0;
		while(i < 50) {
			if(i % 7 ==  0) {
				System.out.println(i + " ");
			}
			i ++;
		}
	}
}
