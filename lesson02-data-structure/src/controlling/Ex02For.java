package controlling;

public class Ex02For {

	public static void main(String[] args) {
		//	Bài 1: in ra 0 và danh sách các số nguyên dương nhỏ hơn 20
		// [0, 20)
		
		//int i = 0; Biểu thức khởi tạo, chỉ chạy 1 lần
		// i < 20 --> biểu thức điều kiện
		for (int i = 0; i < 20; i++) {
			System.out.print(i + " ");
		}
		
		System.out.print("\n\n=======\n\n");
		//	Bài 2: in ra danh sách các số là bội của 7 và nhỏ hơn 50
		for (int i = 0; i < 50; i++) {
			if (i%7==0) {
				System.out.print(i + " ");
			}
		}
	}

}
