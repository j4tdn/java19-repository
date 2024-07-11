package code300;

import java.util.Arrays;
import java.util.Scanner;

public class Ex14 {
public static void main(String[] args) {
Scanner ip = new Scanner(System.in);
System.out.println("Nhập n: ");
int n = ip.nextInt();
int[] result = countBit(n);
System.out.println(Arrays.toString(result));
}
public static String binary(int n) {
	if(n == 0 ) {
	return "0";
	} else if (n == 1) {
		return "1";
	}
	
	StringBuilder result = new StringBuilder();
	while(n > 0 ) {
		int numberRest = n %2;
		int numberInt = n / 2;
		n = numberInt;
		result.insert(0, numberRest);
	}
	return result.toString();
}
public static int[] countBit(int n) {
	int[] result = new int[n + 1];
	for(int i = 0; i <= n; i++) {
	int[] A = stringToIntArray(binary(i));
	result[i] = sumArray(A);
	}
	return result;
}
public static int sumArray(int[] n) {
	int sum = 0;
	for(int i = 0; i < n.length; i ++) {
		sum += n[i];
	}
	return sum;
}
public static int[] stringToIntArray(String s) {
    char[] chars = s.toCharArray();

    int[] intArray = new int[chars.length];
    for (int i = 0; i < chars.length; i++) {
        intArray[i] = Character.getNumericValue(chars[i]);
    }
    return intArray;
}
}
