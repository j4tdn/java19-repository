package homework;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
        int number, temp = 1;
        long factorialNumber = 1;
         
        Scanner scanner = new Scanner(System.in);
         
        do {
            System.out.println("Nhập vào N: ");
            number = scanner.nextInt();
        } while ((number <= 0) || (number > 10));
         
       
        while (temp <= number) {
        	factorialNumber *= temp;
            temp++;
        }
         
        System.out.println(number + "! = " + factorialNumber);
    }
 

}
