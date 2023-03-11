package controlling;

public class Ex03BreakContinue {
	public static void main(String[] args) {
		//for while dowhile
		
		//trong vòng lặp khi gặp từ khoá 
		//break: --> thoát khỏi vòng lặp ngay lập tức
		//           không thực hiện các vòng lặp còn lại
		//continue: --> thoát khỏi vòng lặp ngay lập tức 
		//              tiếp tục thực hiện các vòng lặp phía sau
		
		for (int i = 1; i <= 10; i++) {
			if (i == 4) {
				continue;
			}
			if (i == 8) {
				break;
			}
			System.out.println(i + " ");
		}
		//switch case --> break
		//loop --> break, continue
	}

}
