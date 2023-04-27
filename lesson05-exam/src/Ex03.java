import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		String n; 
		System.out.println("nhập chuỗi số: ");
		n = ip.next();

	}
	private static int getMaxValidNumber(String n) {
		int a;
		
		int text = n.length();
		for(int i = 0; i < text; i++) {
			int letter = n.charAt(i);
			if(Character.isDigit(letter)) {
				a = letter;
			
			
			int max = 0;
			if(max > a) {
				max = a;
			}
			}
		
	}
		return a;
	}
	
}
