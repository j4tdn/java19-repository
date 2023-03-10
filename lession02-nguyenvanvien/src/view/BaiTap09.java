package view;

public class BaiTap09 {
	public static void main(String[] args) {
		int count = 0;
		int dem =2;
		while(true) {
			if(checkPrime(dem)) {
				count ++;
			}
			if(count == 200) break;
			dem ++;
		}
		System.out.print(dem);
	}
	static boolean checkPrime(int num) {
		for(int i=2; i <=Math.sqrt(num);i++) {
			if(num%i == 0) {
				return false;
			}
		}
		return true;
	}
}
