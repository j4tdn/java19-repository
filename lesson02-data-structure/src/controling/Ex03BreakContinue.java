package controling;

public class Ex03BreakContinue {
	public static void main(String[] args) {
		//for while dowhile
		
		//trong vòng lặp khi gặp từ khóa
		//break: --> thoát khỏi vòng lặp ngay lập tức
		//			 không thực hiện các vòng lặp còn lại
		//continue: --> thoát khỏi vòng lặp hiện tại ngay lặp tức
		// 				tiếp tục thực hiện các vòng lặp khác
		
		for(int i = 0; i <= 10; i++) {
			if(i ==4) {
				continue;
			}
			//System.out.println(i);
			if (i==8) {
				break;
			}
			System.out.println(i);
		}
		
	}
}
