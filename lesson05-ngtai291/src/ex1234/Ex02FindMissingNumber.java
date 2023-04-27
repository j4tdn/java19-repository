package ex1234;

import java.util.Arrays;
import java.util.Random;

public class Ex02FindMissingNumber {
	public static void main(String[] args) {
		int n = 9;
		int[] a = new int[n];

		Random rd = new Random();
		int slNumber = rd.nextInt(n) + 1;
		System.out.println("selected number to delete in array "
				+ "--> " + slNumber);
		
		Ex02FindMissingNumber ex02 = new Ex02FindMissingNumber();
		a = ex02.returnArray(slNumber, n);
		
		System.out.println("Phần tử cần tìm có giá trị: " 
				+ ex02.getMissingNumber(a));
		

	}

	private int[] returnArray(int pickNumber, int n) {
		int[] a = new int[n];
		int temp = 1;
		int running = 0;
		while(true){
			
			if(temp == pickNumber) {
				continue;
			}
			
			a[running++] = temp++;
			
			if(temp == n) {
				break;
			}
		}
		System.out.println(Arrays.toString(a));
		return a;

	}
	

	private int getMissingNumber(int a[]) {
		Arrays.sort(a);
		int temp = 1;
		
		for(int number : a) {
			if(number == 0) continue;
			if(temp != number && temp != 0) {
				return temp;  
			}
			temp++;
		}
		
		return -1;
	}
}
