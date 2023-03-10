package view;

public class BaiTap03 {
	public static void main(String[] args) {
		int n= 5;
		int s=1;
		for (int i=n; i>=1; i--) {
			if(i!=1) {
				System.out.print(i + "*");
			}
			else {
				System.out.print(i);
			}
			s *=i;
		}
		System.out.println(" = " + s);
	}
}
