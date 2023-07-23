package controlling;

public class Ex03BreakContinue {
	public static void main(String[] args) {
		//for while dowhile
		
		// trong vòng lặp khi
		// break: --> thoát khỏi vòng lặp ngay lặp tức
		//			  không	thực hiện các vòng lặp còn lại
		//continue: --> thoát khỏi vòng lặp hiện tại ngay lập tức
		//				tiếp tục thực hiện các vòng lặp phía sau
		
		for(int i = 1; i <= 10; i++) {
			if(i == 4) {
				continue;
			
			}
			if (i == 7) {
				break;
			}
			System.out.print(i + " ");
		
		}
		// swicth case --> break
		//loop --> break, continue
	}

}
