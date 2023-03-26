import java.util.Arrays;
import java.util.Random;

public class Exercise10 {
	public static void main(String[] args) {
		Random rd = new Random();
		Integer[] pickedNumbers = new Integer[5];
		for(int i = 0; i < 5;) {
			int temp = 20 + rd.nextInt(10);
			
			if(isExist(temp, pickedNumbers)){
				continue;
			}
			pickedNumbers[i++] = temp;
			
			}
		System.out.println("số nguyên dương đó là : " + Arrays.toString(pickedNumbers));
		
		}
	
		private static boolean isExist(Integer checkingNumbers, Integer[] Numbers ) {
			 for(int i = 0; i < Numbers.length; i++) {
				 if(checkingNumbers.equals(Numbers[i])) {
					 return true;
				 }
			 }
			 return false;}

}
