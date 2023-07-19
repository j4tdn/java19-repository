//package view;
//
//import static utils.NumberUtils.isHappy;
//import static utils.NumberUtils.isPrime;
//import java.util.Arrays;
//
///*
//
//* Requirement: Given the array of integers.
//
//* Write methods to get odd, even, prime, happy, etc c
//
// */
//public class Ex01BasicArrayOperations {
//	public static void main(String[] args) {
//		int[] numbers = { 1, 8, 12, 6, 33, 40, 24, 17, 19};
//		printf("1. Odd numbers", getOddNumbers(numbers));
//		
//		System.out.println("=========================================");
//
//		printf("2. Even numbers", getEvenNumbers(numbers));
//		
//		System.out.println("=========================================");
//
//		printf("3. Prime numbers", getPrimeNumbers(numbers));
//		
//		System.out.println("=========================================");
//
//		printf("4. Happy numbers", getHappyNumbers(numbers));
//	}
//	
//	// number % 2 == 0
//	// number % 2 != 0
//	// isHappy(number)
//	// isPrime(number)
//	
//	// Strategy Pattern: Mẫu thiết kế chiến lược
//	// Tìm công thức (strategy = method) chung của các expressions
//	
//	// Công thức : expression có input output chung là gì
//	// --> input : (int number) 
//	// --> output: boolean
//	
//	// boolean test(int number); --> strategy
//	
//
//	
//	// a + b
//	// a - b
//	// a * b
//	// a / b
//	// input : (int a,int b)
//	// output: int
//	
//	// int process(int a,int b) ==> strategy
//	
//	private static 
//	
//	// Java: Method parameter --> passing by value --> receive value from external
//
//	private static int[] getOddNumbers(int[] numbers) {
//		int[] result = new int[numbers.length];
//		int count = 0;
//		for (int number : numbers) {
//			if (number % 2 != 0)
//				result[count++] = number;
//		}
//		return Arrays.copyOfRange(result, 0, count);
//	}
//
//	private static int[] getEvenNumbers(int[] numbers) {
//		int[] result = new int[numbers.length];
//		int count = 0;
//		for (int number : numbers) {
//			if (number % 2 == 0)
//				result[count++] = number;
//		}
//		return Arrays.copyOfRange(result, 0, count);
//	}
//
//	private static int[] getPrimeNumbers(int[] numbers) {
//		int[] result = new int[numbers.length];
//		int count = 0;
//		for (int number : numbers) {
//			if (isPrime(number))
//				result[count++] = number;
//		}
//		return Arrays.copyOfRange(result, 0, count);
//	}
//
//	private static int[] getHappyNumbers(int[] numbers) {
//		int[] result = new int[numbers.length];
//		int count = 0;
//		for (int number : numbers) {
//			if (isHappy(number))
//				result[count++] = number;
//		}
//		return Arrays.copyOfRange(result, 0, count);
//	}
//
//	private static void printf(String prefix, int[] numbers) {
//		System.out.println(prefix + " ---> " + Arrays.toString(numbers));
//	}
//
//}
