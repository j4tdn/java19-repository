
public class bai1 {
	public static void main(String[] args) {
		System.out.println(isPowerOf(8, 2));
	}
	
	public static boolean isInt(double s) {
		 if (Math.ceil(s) != Math.floor(s)) return false;
		return true;
	}
	
	private static boolean isPowerOf(int a, int b) {
		if(a > b) {
			int temp = b;
			b = a;
			a = temp;
		}
		boolean check = false;
		
		double power = Math.log(b)/Math.log(a); 
		if(isInt(power)) check = true;
		return check;
	}
}
