package view;

import utils.NumberUtil;

public class Ex09FindNthPrime {
	
	public static void main(String[] args) {
		
		// Viết chương trình tìm số nguyên tố thứ 200 trong hệ thống số tự nhiên
		int running = 2;
		int count = 0;
		
		int breakLinePos = 10;
		
		while(true) {
			if (NumberUtil.isPrime(running)) {
				System.out.printf("%6d", running);
				if (++count % breakLinePos == 0) {
					System.out.println();
				}
				if (count == 200) {
					break;
				}
			}
			running++;
		}
		
		System.out.println("\n" +  count + "th prime --> " + running);
		
	}
}
