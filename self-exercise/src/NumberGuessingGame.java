import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
public static void main(String[] args) {
	Scanner ip = new Scanner(System.in);
	int firstscore = 10;
	String result = "";
	System.out.println("Bạn có 10 lần để đoán. Sẵn sàng chưa nào?");
	int computerguess;
	
	while(true) {
		Random	rd = new Random();
		computerguess = 1+ rd.nextInt(10);
		
		System.out.print("Nhập số bạn đoán");
		int yourguess = ip.nextInt();
		
		
		if(yourguess == computerguess) {
			 result = "Chúc mừng bạn đã đoán đúng ";
			System.out.println(result);
			break;
		}else {
			firstscore--;
			System.out.println("Bạn đã đoán sai.Bạn còn " + firstscore + "lần");
			
		}
		if(firstscore == 0) {
			System.out.println("Rất tiếc! Bạn đã hết cơ hội :( ");
			break;
		}
		}
}
}
