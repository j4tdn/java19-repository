package view.kx;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 Viết chương trình nhập vào 1 số thực có phần thập phân khác 0. 
 Yêu cầu nhập lại(tối đa 3 lần) nếu nhập sai
 Sau đó tìm phân số tối giản của số thập phân đó. Ví dụ
	+ 0.1       --> 1/10
    + 0.2       --> 2/10   1/5
    + 0.04      --> 4/100  1/15
    + 0.75      --> 75/100 3/4
    + 1.5       --> 15/10  3/2
    + 332.00342 --> 100
    
    --> BigDecimal
          double
          float
          long(double)
          int(float)
          
        --> support many methods
    
    + 2
    + 4
    
    B1: Tìm được phân số từ số thập phân
    Mẫu số: 100
    Tử số: i++ --> i/100 = số thập phân --> tử số
    
    + 0.1        --> 1/10     : 1(phần thập phân)
                 -->          : 10(10^1[số chữ số thập phân])
                 
    + 0.75       --> 75/100  : 75(phần thập phân)
                 -->          : 10(10^2[số chữ số thập phân])
                 
    + 1.5        --> 1 + 5/10  : 1(phần nguyên)
                 -->           : 5(phần thập phân)
                 -->           : 10(10^1[số chữ số thập phân])
                 --> 15/10     : (phần nguyên * 10^[số chữ số thập phân] + phần thập phân)] / 10^[số chữ số thập phân
    						   
    						   : tử số = phần nguyên * 10^[số chữ số thập phân] + phần thập phân)
    						   : mẫu số: 10^[số chữ số thập phân]
    332.00342    --> (332 * 10^5 + 00342) / 10^5
    
    B2: Tìm UCLN của tử và mẫu
    
    B3: Tìm phân số tối giản
*/
public class Ex01MinFraction {
	
	public static void main(String[] args) {
		BigDecimal[] elements = {bd(0.1), bd(0.2), bd(0.04), bd(0.75), bd(1.5), bd(332.00342), bd(2), bd(14)};
		
		for (BigDecimal element: elements) {
			if (getDecimalPart(element).compareTo(BigDecimal.ZERO) != 0) {
				System.out.println(element + " has fraction = " + getMinFract(element));
			} else {
				System.out.println(element + " is not a float number !!!");
			}
			System.out.println("\n");
		}
	}
	
	// 1.5, 1.7
	private static BigDecimal getDecimalPart(BigDecimal value) {
		int intPart = value.intValue(); // lấy phần nguyên
		return value.subtract(bd(intPart));
	}
	
	private static String getMinFract(BigDecimal element) {
		String[] tokens = element.toString().split("\\.");
		int intPart = Integer.parseInt(tokens[0]);
		int decPart = Integer.parseInt(tokens[1]);
		int decPartAmount = tokens[1].length();
		int numerator = intPart * (int)Math.pow(10, decPartAmount) + decPart;
		int denominator = (int)Math.pow(10, decPartAmount);
		int gcd = gcd(numerator, denominator);
		return (numerator/gcd) + "/" + (denominator/gcd);
	}
	
	// UCLN --> greatest common divisor
	// BCNN --> least common multiple
	// a(12), b(8)
	//   4  ,  8
	//   4     4
	
	private static int gcd(int a, int b) {
		while(a != b) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		return a;
	}
	
	private static BigDecimal bd(double value) {
		return BigDecimal.valueOf(value);
	}
	
}
