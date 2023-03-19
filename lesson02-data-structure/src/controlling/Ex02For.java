package controlling;

public class Ex02For {
	public static void main(String[] args) {
		// B1: In ra danh sách các số nguyên dương nhỏ hơn 20 --> [0, 20)
		
		// int i = 0 --> biểu thức khởi tạo - chạy 1 lần duy nhất: 
		// i < 20 --> biểu thức điều kiện
		for(int i = 0; i < 20; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n\n=================\n");
		
		// B2: In ra danh sách các số là bộ của 7 và nhỏ hơn 50
		for(int i = 0; i < 50; i++) {
			if (i % 7 == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
