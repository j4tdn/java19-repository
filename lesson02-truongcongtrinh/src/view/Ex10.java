package view;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Ex10 {
	public static void main(String[] args) {
		Set<Integer> randomNumbers = new HashSet<>();
        Random rand = new Random();

        while (randomNumbers.size() < 5) {
            int randomNumber = rand.nextInt(11) + 20; // Lấy số ngẫu nhiên từ 20 đến 30
            randomNumbers.add(randomNumber);  // Nếu trùng nó sẽ không được thêm vào Set
        }

        for (int randomNumber : randomNumbers) {
            System.out.print(randomNumber + " ");
        }
	}
}
