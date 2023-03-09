package view;

public class BaiTap04 {
	public static void main(String[] args) {
		int[] arr = new int[4];
		arr[0] = 12;
		arr[1] =14;
		arr[0] = 16;
		arr[1] =18;
		
		long sum =0;
		for(Integer i : arr) {
			sum += giaithua(i);
		}
		
		System.out.print(sum);
		
	}
	
	static long giaithua(int n) {
		int s=1;
		for (int i=n; i>=1; i--) {
			s *=i;
		}
		return s;
	}
}
