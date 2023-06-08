package code300;

import java.util.Arrays;
import java.util.Scanner;

public class Ex03 {
public static void main(String[] args) {
	Scanner ip = new Scanner(System.in); 
	String st;
	System.out.println("Nhập số phần tử của mảng");
	int n = ip.nextInt();
	String []sts = new String[n];
 	while(true) {
	try {
		for(int i = 0; i < n; i++) {
			System.out.println("Nhập chuỗi thứ " + i);
			sts[i] = ip.next();
			System.out.println("Các phần tử đó là: ");
			for(String e : sts) {
			System.out.println(e);
			}
		}
		System.out.println("các phần tử chung là: " + longestCommonPrefix(sts));
			}
		
	catch(IllegalArgumentException e) {
		System.out.println(e.getMessage());
	}
}}
public static String longestCommonPrefix(String[] strs) {
	
		String result = strs[0];
	for(int i = 1; i< strs.length; i++) {
	 if(strs[i].startsWith(result)){
		result = result.substring(0,strs.length);
	} if (result.isEmpty()){
		result = "";
	}
	}
	return result;

}}

