import java.util.Scanner;

public class TheDescent {
public static void main(String[] args) {
	Scanner ip = new Scanner(System.in);
	int max = 0;
	int index = 0;
	while(true) {
		for(int i = 0; i < 8; i++) {
			System.out.println("Height of mountain" + i +": ");
			int n = ip.nextInt();
			
			if(max < n) {
				index = i;
				max = n;
				}
			
		}
			System.out.println("Ngọn núi lớn nhất là " + index + ": " + max);
			break;
	}
}
}
