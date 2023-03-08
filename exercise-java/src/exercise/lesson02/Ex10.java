package exercise.lesson02;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Ex10 {
	public static void main(String[] args) {
		Set<Integer> numbers = new HashSet<Integer>();
        Random random = new Random();
        
        while (numbers.size() < 5) {
            int num = random.nextInt(11) + 20; 
            numbers.add(num); 
        }
        
        System.out.println("5 số nguyên ngẫu nhiên từ 20 đến 30 không trùng lặp là: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
	}
}
