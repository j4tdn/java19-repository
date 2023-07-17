package view.test02;

public class Ex03 {
    public static void main(String[] args) {
    	int length = 4;
        int[] numbers = new int[length];
        numbers[0] = 8;
        numbers[1] = 5;
        numbers[2] = 9;
        numbers[3] = 20;
        
        for (int i = 0; i < length-1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (countDivisors(numbers[i]) > countDivisors(numbers[j])) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    private static int countDivisors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count;
    }
}

