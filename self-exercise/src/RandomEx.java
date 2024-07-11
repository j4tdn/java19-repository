import java.util.Random;

public class RandomEx {
public static void main(String[] args) {
	Random rd = new Random();
	
	int randomNumber = rd.nextInt(169) + 1;
	System.out.println(randomNumber);
}
}
