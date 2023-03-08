package controlling;

public class Ex02DoWhile2 {
	public static void main(String[] args) {
//		in ra danh sách các số là bội của 7 và nhỏ hơn 50
			// [0, 20)
		int i = 0;
		do {
			if (i%7==0) {
				System.out.print(i + " ");
			}
			i++;
		} while (i<50);
	
	}
}

/*
 * for: duyệt mảng
 * while: code logic
 * do while: code logic nhưng tối thiểu duyệt 1 lần
*/