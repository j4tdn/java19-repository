package homework;

import java.util.Random;

public class Ex04 {
	public static void main(String[] args) {
		/*
		 * / Bài 4: Viết chương trình tính tổng giai thừa của các số nguyên dương S = a!
		 * +b! + c! + d! Biết rằng a,b,c,d là các số nguyên ngẫu nhiên từ 10 đến 20 [10,
		 * 20] n! = n*(n-1)! —------------------------------------ Random rd = new
		 * Random(); int a = rd. int b = int c = int d =
		 * 
		 */
		Random rd = new Random();
		int a = 10 + rd.nextInt(21);
		int b = 10 + rd.nextInt(21);
		int c = 10 + rd.nextInt(21);
		int d = 10 + rd.nextInt(21);
		int sum = factorial(a) + factorial(b) + factorial(c) + factorial(d);
		System.out.println("tong giai thua cua cac so nguyen duong: " + sum);

	}
    private static int factorial(int N) {
    	  if(N <= 1) {
    		  return 1;
    	  }else {
    		  return N*factorial(N-1);
    	  }
      }
	
