package controlling;

public class Ex02For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//B1: In ra danh sách các số nguyên dương nhỏ hơn 20 --> [0, 20)
		
		//int = 0 --> biểu thức khởi tạo - chạy 1 lần duy nhất:
		//i < 20 --> biểu thức đầu tiên
		for (int i = 0; i < 20; i++) {
			System.out.println(i + " ");
		}
		
		System.out.println("\n===============\n");
		
		//B2: In ra danh sách các số là bội của 7 vào nhỏ hơn 50
		for (int i = 0; i < 50; i++) {
			if (i % 7 == 0) {
				System.out.println(i + " ");
			}

		}
		
		System.out.println("\n===============\n");
		
		int i = 0;
		while(i < 50) {
			if (i % 7 == 0) {
				System.out.println(i + " ");
				
			}
			i++;
		}

	}

}
