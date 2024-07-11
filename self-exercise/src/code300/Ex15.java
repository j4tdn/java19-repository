package code300;

import java.util.Arrays;
import java.util.Comparator;

public class Ex15 {
public static void main(String[] args) {
	int[] array = {1};
//	Arrays.sort(array);
//	System.out.println(Arrays.toString(array));
	System.out.println(coinChange(array, 0));
	//System.out.println(coinChange(array, 11));
}
public static int coinChange(int[] coins, int amount) {
	int max = 0;
	int sum = 0;
	Arrays.sort(coins);
	int count = 0;
	
	for(int i = coins.length - 1; i >= 0; i--) {
			int coin = coins[i];
			while(sum + coin <= amount) {
				sum = sum + coin;	
				count ++;
				//System.out.println(sum);
			}
			if(sum == amount ) {
				return count;
			}else if( sum != amount && i == 0) {
				return -1; 
			} 
			
	}
	 return count;

}
}

