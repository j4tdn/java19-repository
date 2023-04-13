package view;

import java.util.Arrays;

public class Ex07Converter {
	public static void main(String[] args) {
		int N = 11;
		System.out.println("binary --> " + Arrays.toString(convert(N)));
	}
	
	private static int converter(int decimal) {
		int mod = 0;
		int power = 0;
		int binary = decimal;
		int tmp = 0;
		
		while(binary != 0) {
			mod = binary % 2; // 1
			binary /= 2; // 0
			tmp += mod * Math.pow(10, power++); // 1101
		}
		return tmp;
	}
	
	// binary: 0 0 0 0
	private static int[] convert(int decimal) {
		int[] binary = new int[4];
		int running = binary.length - 1;
		
		while(decimal != 0) {
			binary[running--] = decimal % 2;
			decimal /= 2;
		}
		
		return binary;
	}
}
