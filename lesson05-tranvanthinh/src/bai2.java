
public class bai2 {
	public static void main(String[] args) {
		System.out.println(isSpecialNumber(10));
	}
	public static boolean isSpecialNumber(int n) {
		boolean check = false;
		
		double delta = 1 + 4 * 2 * n;
		double x1 = (-1 + Math.sqrt(delta))/2;
		double x2 = (-1 - Math.sqrt(delta))/2;
		if(bai1.isInt(x1) || bai1.isInt(x2)) check = true;
		return check;
	}
	
}
