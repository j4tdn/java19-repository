package controlling;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import java.util.Scanner;

public class Ex01IfIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// cho 1 so nguyen duong N --> kiem tra N chan hay le
		// neu nhu la so chan thi in ra
		// neu la so le thi khong lam gi ca
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("- Nhap so nguyen duong N: ");
		int n = sc.nextInt();

		if (isEven(n)) {
			System.out.println("N = " + n + " la so chan");
		}

		System.out.println("--- Ket thuc chuong trinh ---");

		/*
		 * Cho 1 chuoi ky tu (mat khau) --> kiem tra xem do dai cua mk da thoa man yeu
		 * cau chua - Neu do dai mk >= 8 --> mk hop le - Neu do dai < 8 --> mk co it
		 * nhat la 8 ky tu, vui long nhap lai
		 */
		String password = "fej830";
		int length = password.length();
		System.out.println("Password length: " + length);
		
		if(length >= 8) {
			System.out.println("Mat khau hop le!");
		}else {
			System.out.println("Mat khau co it nhat la 8 ky tu, vui long nhap lai");
		}
		
		BigDecimal avgPointBd = BigDecimal.valueOf(rd.nextFloat()*10).setScale(1, RoundingMode.HALF_UP);
		float avgPoint = avgPointBd.floatValue();
		System.out.println("avgPoint: " + avgPoint);
		
		
	}

	private static boolean isEven(int input) {
		return input % 2 == 0;
	}

}
