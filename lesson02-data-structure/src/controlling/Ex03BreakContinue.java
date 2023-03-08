package controlling;

public class Ex03BreakContinue {
	public static void main(String[] args) {
		// trong vòng lặp:
		// break: --> thoát luôn khỏi vòng lặp 
		//			  không thực hiện các vòng lặp còn lại
		
		//continue:--> chỉ thoát khỏi vòng lặp hiện tại
		//			  tiếp tục thực hiện các vòng lặp còn lại
		
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
