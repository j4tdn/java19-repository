package view;
import java.util.Scanner;

public class Ex01 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double a,b ;
	do {
		try {
			System.out.println("Enter a: ");
			a = Integer.parseInt(sc.nextLine());
			System.out.println("Enter b: ");
			b = Integer.parseInt(sc.nextLine());
			
			if (a == 0) {
				throw new IllegalArgumentException("please enter a != 0");
			}
			break;
			
		} catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		}
	} while (true);
	sc.close();
	System.out.println((float)-b/a);
}
}

