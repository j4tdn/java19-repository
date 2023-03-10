package view;

public class bai07 {
	public static void main(String[] args) {
		System.out.println(binToDec(9));
	}
	private static String binToDec(int n) {
		String toBin = "";
		while(n != 0) {
			toBin += (n % 2);
			n = n/2;
		}
		StringBuilder str = new StringBuilder(toBin);
		return str.reverse().toString();
	}
}
