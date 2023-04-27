package exam;

public class Ex02 {
	public static void main(String[] args) {
		
		if(isSpecialNumber(7)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
	
	public static boolean isSpecialNumber(int n) {
		int sum = 0;
		while(true) {
			for(int i = 1; i < n; i++ ) {
				sum += i;
				if(sum ==  n) 
				return true;
			}
			return false;
		} 
	}
}
