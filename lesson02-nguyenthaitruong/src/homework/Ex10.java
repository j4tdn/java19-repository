package homework;

import java.util.Random;

public class Ex10 {
	    public static void main(String[] args) {
	        Random random = new Random();

	        for (int i = 0; i < 5; i++) {
	            int num = 20 + random.nextInt(11);
	            System.out.println(num);
	        }
	    }
}
