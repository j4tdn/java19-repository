package bean;

import java.util.Scanner;

public class Utils {
public static boolean isInteger(String input) {
	try 
	{ 	
		Integer.parseInt(input); 
		return true; 
	}  
	catch (NumberFormatException ee)  
	{ 
		System.out.println("Sai định dạng, xin nhập lại!");
		return false;
	} 
}
}
