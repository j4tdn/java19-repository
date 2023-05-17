package view;

import javax.naming.InvalidNameException;

import bean.InvalidNumber;

public class Ex4 {
	public static void main(String[] args) {
int n = -999;
		while (n<999) {

			try {
				System.out.println(readNumber(n++));
				
				/*
				System.out.println(readNumber(6));
				System.out.println(readNumber(-5));
				System.out.println(readNumber(25));
				System.out.println(readNumber(101));
				System.out.println(readNumber(321));
				System.out.println(readNumber(820));
				System.out.println(readNumber(219));
				System.out.println(readNumber(-219));
				break;
				*/
			} catch (InvalidNumber e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static String readNumber(int n) throws InvalidNumber {
		int isNegative = 0;
		int first = Math.abs(n % 10);
		int second = Math.abs((n % 100 - n % 10) / 10);
		int third = Math.abs((n % 1000 - n % 100) / 100);
		
		String[] reading = { "", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín" };
		String[] reading1 = { "", "mốt", "hai", "ba", "tư", "lăm", "sáu", "bảy", "tám", "chín" };
		String[] reading2 = { "lẻ", "mười", "hai mươi", "ba mươi", "bốn mươi", "năm mươi", "sáu mươi", "bảy mươi",
				"tám mươi", "chín mươi" };
		String[] reading3 = { "", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín" };
		String[] Negative = { "", "Âm" };
		//special cases
		
		if (n < 0) {
			isNegative = 1;
		}
		if (n > 999 || n < -999) {
			
			throw new InvalidNumber("nhập số tối đa 3 chữ số");
		}
		if (n==0) {
			return "không";
		}
		if (n%100 == 0) {
			return Negative[isNegative] + " " + reading3[third] + " trăm ";
		}
		
		//common cases
		if (n > 99 || n < -99) {
			if (second == 0 || second == 1) {
				return Negative[isNegative] + " " + reading3[third] + " trăm " + reading2[second] + " "
						+ reading[first];
			} else {

				return Negative[isNegative] + " " + reading3[third] + " trăm " + reading2[second] + " "
						+ reading1[first];
			}
		} else if (n < 10 && n> -10) {
			return Negative[isNegative] + " " + reading[first];
		} else {
			if (second == 0 || second == 1) {
				return Negative[isNegative] + " " + reading2[second] + " " + reading[first];
			} else {

				return Negative[isNegative] + " " + reading2[second] + " " + reading1[first];
			}
		}

	}
}