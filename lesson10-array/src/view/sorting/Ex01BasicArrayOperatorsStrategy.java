package view.sorting;

import java.util.Arrays;

import functional.Condition;
import utils.NumberUtils;

import static utils.NumberUtils.*;

/**
 * Requirement: Given the array of integers.
 * 
 * Write methods to get odd, even, prime, happy, etc condition
 *
 */
public class Ex01BasicArrayOperatorsStrategy {

	public static void main(String[] args) {
		int[] numbers = { 1, 8, 12, 6, 33, 40, 19, 24, 17};
		
		// khởi tạo giá trị(thể hiện, đối tượng) cho biến kiểu interface
		
		// new interface --> override --> anonymous class
		// shortern version: new interface --> override --> anonymous function(lambda expression)
		
		// anonymous function --> khởi tạo giá trị(thể hiện, đối tượng) cho biến kiểu (functional)interface với code ngắn gọn
		// công thức: anonymous function, lambda để override abstract method trong (functional)interface
		//          : (parameters...) -> {override}
		
		// boolean test(int number) {
		//    return number % 2 != 0;
	    // }

		Condition c1 = (int number) -> {
			return number % 2 != 0;
		};
		
		printf("1. Odd numbers", getNumbers(numbers, c1));

		System.out.println("\n=====================\n");

		/*
		Condition c2 = new Condition() {
			
			@Override
			public boolean test(int number) {
				return number % 2 == 0;
			}
		};
		*/
		
		// (parameters) --> ko cần truyền kiểu dữ liệu
		// khi parameters chỉ có 1 tham số --> xóa luôn ()
		// body: nếu chỉ có 1 dòng --> xóa luôn {}
		//     : nếu chỉ có 1 dòng --> có return type --> xóa luôn từ khóa return
		// Condition c2 = number -> number % 2 == 0;
		
		// Condition c2 = NumberUtils::isEven;
		
		printf("2. Even numbers", getNumbers(numbers, NumberUtils::isEven));
		
		System.out.println("\n=====================\n");
		
		/*
		Condition c3 = new Condition() {
			
			@Override
			public boolean test(int number) {
				return isPrime(number);
			}
		};
		*/

		printf("3. Prime numbers", getNumbers(numbers, nb -> isPrime(nb)));
		
		System.out.println("\n=====================\n");
		
		/*
		Condition c4 = new Condition() {
			
			@Override
			public boolean test(int number) {
				return isHappy(number);
			}
		};
		*/

		printf("4. Happy numbers", getNumbers(numbers, nb -> isHappy(nb)));
	}
	
	// a + b
	// a - b
	// a * b
	// a / b
	// strategy
	// input: (int a, int b)
	// output: int
	// int process(int a, int b) ==> strategy
	
	
	
	// number % 2 != 0 --> isOdd(number)
	// number % 2 == 0 --> isEven(number)
	// isPrime(number)
	// isHappy(number)
	
	// Strategy Pattern: Mẫu thiết kế chiến lược
	// Tìm công thức(strategy=method) chung của các expressions
	
	// Công thức: expression có 'input' 'output' chung là gì
	// input: tham số của các biểu thức
	// output: kiểu dữ liệu trả về của các biểu thức
	
	// --> input: (int number)
	// --> output: boolean
	
	// boolean test(int number); ==> strategy, any name
	
	// Chưa quan tâm đến phần thực thi
	
	// TT --> Tạo ra 1 interface(any name) để chứa abstract method được gọi là strategy đó
	
	private static int[] getNumbers(int[] numbers, Condition condition) {
		int[] result = new int[numbers.length];
		int count = 0;
		for (int number : numbers) {
			if (condition.test(number)) {
				result[count++] = number;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	private static void printf(String prefix, int[] numbers) {
		System.out.println(prefix + " --> " + Arrays.toString(numbers));
	}
}