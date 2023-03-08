package controling;

public class Ex02While {
	public static void main(String[] args) {
		//B1: in ra danh sách các số là bội của 7 và nhỏ hơn 50
		
		int i = 0;
		while(i < 50) {
			if(i % 7 == 0) {
				System.out.println(i + " ");
			}				
			i++;
		}
		
		
	}
}
