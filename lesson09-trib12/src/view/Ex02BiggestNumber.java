package view;

import java.util.Arrays;
import java.util.Scanner;

public class Ex02BiggestNumber {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Input n : ");
		String n = ip.nextLine();
		String[] s = new String[Integer.parseInt(n)];
		for(int i = 0; i < Integer.parseInt(n); i++) {
			System.out.print("Input a string : ");
			String temp = ip.nextLine();
			s[i] = temp;
		}
		int[] result = getResult(s);
		for(int res : result) {
			System.out.print(res + " ");
		}
	}
	
	private static int getLargestNumber(String s) {
		String[] result = new String[s.length()/2];
		result = s.split("\\D");
		int max = -1;
		for(String res : result) {
			if(res != "" && Integer.parseInt(res) > max) {
				max = Integer.parseInt(res);
			}
		}
		return max;
	}
	
	private static int[] getResult(String[] s) {
		int[] res = new int[s.length];
		int count = 0;
		for(String string : s) {
			res[count++] = getLargestNumber(string);
		}
		for(int i = 0; i < s.length; i++) {
			for(int j = i+1; j < s.length; j++) {
				if(res[i] > res[j]) {
					int temp = res[i];
					res[i] = res[j];
					res[j] = temp;
				}
			}
		}
		return res;
	}
}
