package controlling;

import java.util.Scanner;

public class Ex04Validation {
      public static void main(String[] args) {
		// Nhập xuất số nguyên
    	Scanner ip = new Scanner(System.in);
    	String text = "";
    	 do {
    		System.out.print("Nhap so nguyen n (hop le): ");
    		text = ip.nextLine();
    		
    		} while(!isValidNumber(text));
   
    	  int n = Integer.parseInt(text);
    	  System.out.println("Nhap thanh cong n = " + n);
   }   	  
    	// Yêu cầu:
      private static boolean isValidNumber(String input) {
    	  int textLength = input.length();
    	  if (textLength == 0) {
    		  return false;
    	  }
    	  for (int i = 0; i < textLength; i++) {
    		  char letter = input.charAt(i);
    		  // letter < '0' || letter > '9'
    		  if (!Character.isDigit(letter)) {
    			  return false;
    			  
    		  }
    	  }
    	  return true;
    	
	}
}
