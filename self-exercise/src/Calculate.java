import java.util.Scanner;

public class Calculate {
public static void main(String[] args) {
	Scanner ip = new Scanner(System.in);
	System.out.println("Nhập n ");
	double x_tb = 33.66;
	double sum =0;
	double n = ip.nextDouble();
	double []array = {33.8, 34.7, 27.6, 35.4, 34.3, 35.6, 31.4, 
			36.6, 38.9, 35.7, 34.5, 37.1, 34.6, 32.5, 31.1, 30.1,
			33, 33.9, 33.6, 33.4, 32.4, 31.4, 30.2, 32.4, 34.3,
			36.9, 34.5, 37, 32.3, 32.2, 31.9, 33.9
	};
	for(int i = 0; i < array.length; i++) {
		sum += (double) Math.pow(array[i] - x_tb, 2);
	}
	double phuong_sai = sum/(n -1);
	double do_lech_chuan = Math.sqrt(phuong_sai);
	System.out.println(do_lech_chuan);
}}
