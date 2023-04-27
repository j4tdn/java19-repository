package bai1;


public class Bai1 {
	public static void main(String[] args) {
		int a =6;
		int b =2;
		
		if(a<b) {
			System.out.println(isPowerOf(a,b));
		}
		else {
			System.out.println(isPowerOf(b, a));
		}
	}
	
	static boolean isPowerOf(int a, int b) {
		int result = 1;
		boolean check = false;
		for(int i=1; i< Math.sqrt(b);i++) {
			for(int j=1;j<=i;j++) {
				result *=a;
				if(result != b) {
					check = false;
				}
				else {
					check = true;
					break;
				}
			}
		}
		return check;
	}
}

