package exam;

public class Ex01 {
	public static void main(String[] args) {
		if(isPowerOf(2,8)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
			
		
	}
	
	
	public static boolean isPowerOf(int a, int b) {
		int pow = 1;
		
		if( a == 1) {
			return b == 1;
		}
		
		while(pow < b) {
			 pow *= a; 
		}
		return (pow == b || isPowerOf(b,a));
		
	}
}
