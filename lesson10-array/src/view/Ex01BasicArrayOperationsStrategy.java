//package view;
//
//import functional.Condition;
//import static utils.NumberUtils.*;
//
//import java.util.Arrays;
//
///*
//
//* Requirement: Given the array of integers.
//
//* Write methods to get odd, even, prime, happy, etc c
//
// */
//public class Ex01BasicArrayOperationsStrategy implements Condition {
//	public static void main(String[] args) {
//		int[] numbers = { 1, 8, 12, 6, 33, 40, 24, 17, 19 };
//		printf("1. Odd numbers", getNumbers(numbers, nb -> nb%2 != 0));
//
//		System.out.println("=========================================");
//
//		printf("2. Even numbers", getNumbers(numbers, nb -> nb%2 == 0));
//
//		System.out.println("=========================================");
//
//		printf("3. Prime numbers", getNumbers(numbers,nb -> isPrime(nb)));
//
//		System.out.println("=========================================");
//
//				Condition c4 = new Condition() {
//				@Override
//				public boolean test(int number) {
//					return isHappy(number) ;
//					}
//				}
//		
//		
//		printf("4. Happy numbers", getNumbers(numbers,nb -> isHappy(nb)));
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
//	// a + b
//	// a - b
//	// a * b
//	// a / b
//	// input : (int a,int b)
//	// output: int
//
//	// int process(int a,int b) ==> strategy
//
//	private static int[] getNumbers(int[] numbers, Condition condition) {
//
//		int[] result = new int[numbers.length];
//		int count = 0;
//		for (int number : numbers) {
//			if (condition.test(number)) {
//				result[count++] = number;
//			}
//		}
//		return Arrays.copyOfRange(result, 0, count);
//	}
//
//	private static void printf(String prefix, int[] numbers) {
//		System.out.println(prefix + " ---> " + Arrays.toString(numbers));
//	}
//
//	
//
//}
