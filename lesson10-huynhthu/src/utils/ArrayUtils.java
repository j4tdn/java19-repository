package utils;

public class ArrayUtils {
     public ArrayUtils() {
	}
     
     public static boolean checkDuplicate(int[] newArray, int value) {
    	 if(newArray == null) {
    		 return false;
    	 }
    	 for (int number:newArray) {
    		 if(number == value) {
    			 return true;
    		 }
    	 }
    	 return false;
     }
     
}
