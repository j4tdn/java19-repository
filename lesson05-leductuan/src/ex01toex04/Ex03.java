package ex01toex04;

public class Ex03 {
	public static void main(String[] args) {
		System.out.println(getMaxValidNumber("a1bc153def46567")); 
		System.out.println(getMaxValidNumber("a55b2c3d4e5f6g7"));
		System.out.println(getMaxValidNumber("dfyz45l90")); 
	}
	public static int getMaxValidNumber(String s) {
	    int max = 0;
	    int num = 0;
	    for (int i = 0; i < s.length(); i++) {
	        char c = s.charAt(i);
	        if (Character.isDigit(c)) {
	            num = num * 10 + Character.getNumericValue(c);
	        } else {
	            if (num > max) {
	                max = num;
	            }
	            num = 0;
	        }
	    }
	    if (num > max) {
	        max = num;
	    }
	    return max;
	}
}
