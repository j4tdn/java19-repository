package code300;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int n;
		//int target = 9;
		System.out.println("Nhập số bạn muốn: ");
		int target = ip.nextInt();
		do {
		System.out.println("Nhập số phần tử của mảng: ");
		 n = ip.nextInt();
		}while(n < 0);
		int num[] =new int[n];
		//int[] num = {2,7,15,17};
		for(int i = 0; i < n; i++) {
			System.out.println("Nhập phần tử thứ " + i + " là: ");
			num[i] = ip.nextInt();
					}
		System.out.println("Mảng vừa nhập là: " + Arrays.toString(num));
		twoSum(num, target);
		
	
		
	}	
public static int[] twoSum(int[] num, int target) {
	int nums[] = {};
	for(int i = 0; i < num.length; i++ ) {
		for(int j = i; j < num.length;j++) {
			if(i != j && num[i]+num[j] == target) {
				nums = new int[]{i,j};
			for(int numss : nums) {
				System.out.print(numss);
			}
			}
		}
		}
	return nums;
	
	}
	
}

