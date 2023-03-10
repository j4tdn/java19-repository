package testlesson2;

import java.util.Random;

public class Bai10 {
  public static void main(String[] args) {
    Random random = new Random();
    int[] numbers = new int[5];
    
    for (int i = 0; i < numbers.length; i++) {
      int randomNumber = random.nextInt(11) + 10;
      boolean duplicate = false;
      for (int j = 0; j < i; j++) {
        if (numbers[j] == randomNumber) {
          duplicate = true;
          break;
        }
      }
      if (duplicate) {
        i--;
      } else {
        numbers[i] = randomNumber;
      }
    }
    
    System.out.print("5 số ngẫu nhiên không lặp nhau: ");
    for (int number : numbers) {
      System.out.print(number + " ");
    }
  }
}
