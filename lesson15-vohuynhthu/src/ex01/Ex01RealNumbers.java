package ex01;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Ex01RealNumbers {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BigDecimal decimal;
		
		int count = 0;
		
		while(true) {
			System.out.print("Vui long nhap vao so thuc co phan thap nhan khac 0:  ");
			String input = scanner.nextLine();
		try {
			decimal = new BigDecimal(input);
			if(decimal.scale() > 0) {
				break;
			}else {
				System.out.println("Chu y: Yeu cau nhap vao so thuc co phan thap phan khac 0");
				count++;
				if(count > 3) {
					System.out.println("So lan nhap vuot qua 3 lan");
					System.exit(0);
				}
			}
		} catch (NumberFormatException e) {
			System.out.println("So nhap vao khong hop le");
			count++;
			if(count > 3) {
				System.out.println("So lan nhap vuot qua 3 lan");
				System.exit(0);
			}
		}
		
		}
		//so toi gian
		String inte = decimal.toBigInteger();
		
		
		
	}
    private static int gcd(int a, int b) {
    	if(b ==0 ) {
    		return a;
    	}
    	return gcd(b, a%b);
    }
}
