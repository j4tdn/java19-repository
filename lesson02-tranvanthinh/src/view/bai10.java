package view;import java.util.Random;

public class bai10 {
	public static void main(String[] args) {
		int i = 0;
		int numRand = 0;
		Random rd = new Random();
		while(i<5) {
			int temp = (10 + rd.nextInt(21));
			if(numRand != temp ) {
				numRand = temp;
				System.out.print(numRand+ " ");
				i++;
			}
		}
	}
}
