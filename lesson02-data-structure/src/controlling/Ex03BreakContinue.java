package controlling;

public class Ex03BreakContinue {

	public static void main(String[] args) {
		// dùng được cho for while do-while
		// break: thoát khỏi vòng lặp ngay lập tức
		//			Không thực hiện các vòng lặp còn lại
		// continue: thoát khỏi vòng lặp hiện tại ngay lập tức
		//			Thực hiện các vòng lâp tiếp theo
		
		for (int i = 1; i <= 10; i++) {
			if (i == 4) {
				continue;
			}
			if (i == 8) {
				break;
			}
			System.out.print(i + " ");
		}

	}

}
