package view;

public class bai02 {
	public static void main(String[] args) {
		int n = 1;
		solve(n);
	}
	private static boolean isInt(double s) {
		 if (Math.ceil(s) != Math.floor(s)) return false;
		return true;
	}
	private static void solve(int n) {
		double power = Math.log(n)/Math.log(2); // Số mũ 
		if(isInt(power)) System.out.println("Is power of 2");
		else System.out.println("Is not power of 2");
	}
}
