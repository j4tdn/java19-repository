package controlling;

public class Ex02While {
	public static void main(String[] args) {
//		in ra danh sách các số là bội của 7 và nhỏ hơn 50
			// [0, 20)
		int i = 0;
		while (i < 50) {
			if (i%7==0) {
				System.out.print(i + " ");
			}
			i++;
		}
		
		i = 0;
		while (true) {
			if (i%7==0) {
				System.out.print(i + " ");
			}
			i++;
			if (i==50) {
				break;
			}
		}
	}
}
