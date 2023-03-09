package ex04;

import java.util.Random;

public class TinhSumCacGiaiThuaNgauNhien {
	public static void main(String[] args) {
		Random rd = new Random();
		
		int a = 10 + rd.nextInt(11);
		int b = 10 + rd.nextInt(11);
		int c = 10 + rd.nextInt(11);
		int d = 10 + rd.nextInt(11);
		
		int giaithuaa = giaiThuaCuaN(a);
		int giaithuab = giaiThuaCuaN(b);
		int giaithuac = giaiThuaCuaN(c);
		int giaithuad = giaiThuaCuaN(d);
		
		int s = giaithuaa + giaithuab + giaithuac + giaithuad;
		
		System.out.println("Tong giaithua cua cac so nguyen duong = " + s);
		
	}
	public static int giaiThuaCuaN(int input) {
		int giaithua = 1;
		for(int i = 1; i <= input; i++) {
			giaithua = giaithua *i;
		}
		return giaithua;
	}
	
}
