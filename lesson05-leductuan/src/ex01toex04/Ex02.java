package ex01toex04;

public class Ex02 {
	public static boolean isSpecialNumber(int num) { 
	    	for(int i=1;i<num;i++) {
	    		num=num-i;
	    		if(num<=0) break;
	    	}
	    if(num==0) return true;
	    else return false;
	}
}
