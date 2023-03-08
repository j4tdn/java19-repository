package controling;

public class Ex02For {
	public static void main(String[] args) {
		//B1: in ra danh sách các số nguyên dương nhỏ hơn 20
		
		//B2: in ra danh sách các số là bội của 7 và nhỏ hơn 50
		
		for(int i = 0; i < 20; i++) {
			System.out.println(i + " ");
		}
		System.out.println("\n====================\n");
		
		for(int i = 0; i < 50; i++) {
			if(i % 7 == 0)
				System.out.println(i);
		}
		
	}
}
