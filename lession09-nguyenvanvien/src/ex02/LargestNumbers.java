package ex02;

import java.util.Arrays;

public class LargestNumbers {
	public static void main(String[] args) {
		String[] result = getLargestNumbers(input());
		for(int i=0; i< result.length; i++) {
			System.out.println("\nChuỗi thứ " + i);
			printResult(result[i]);
		}
	}
	
	private static String[] input() {
		String[] inputStr = new String[] {
			new String("01a2b3456cde478"),
			new String("aa6b546c6e22h, aa6b326c6e22h"),
		};
		return inputStr;
	}
	
	private static String[] getLargestNumbers(String... ss) {
		String[] str = new String[ss.length];
		for(int i =0 ; i <ss.length; i++) {
			str[i] = getLargestEachElement(ss[i]);
		}
		return str;
	}
	
	private static String getLargestEachElement(String s) {
		String[] tempResult = new String[s.length()];
		int running =0;
		String strTemp = "";
		for(int i=0; i< s.length(); i++) {
			boolean isNumber = (s.charAt(i)+"").matches("\\d+(\\.\\d+)?");
			if(isNumber) {
				strTemp += s.charAt(i);
			}
			else if(!isNumber || i == s.length()-1){
				if(!strTemp.equals("")) {
					tempResult[running++] = Integer.toString(Integer.parseInt(strTemp));
				}
				strTemp = "";
			}
		}
		tempResult = Arrays.copyOfRange(tempResult, 0, running);
		String result = "";
		for(String str : getStringMaxLeng(tempResult)) {
			result += str+" ";
		}
		return result.strip();
	}
	private static String[] getStringMaxLeng(String[] tempResult) {
		String[] result = new String[tempResult.length];
		int max = tempResult[0].length();
		int running =0;
		for(int i=1; i < tempResult.length;i++) {
			if(tempResult[i].length() >= max) max = tempResult[i].length();
		}
		for(int i=1; i < tempResult.length;i++) {
			if(tempResult[i].length() == max) {
				result[running++] = tempResult[i];
			}
		}
		result = Arrays.copyOfRange(result, 0, running);
		Arrays.sort(result);
		return result;
	}
	private static void printResult(String result) {
		String[] arrResult = result.split(" ");
		for(String str : arrResult) {
			System.out.print(str + " ");
		}
	}
}
