package view.knowledge;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Ex03MethodReference {
	
	public static void main(String[] args) {
		
		// Functional Interface
		
		// Implementation Class
		// Anonymous Class
		// Anonymous Function = Lambda Expression
		// --> OK
		// Method Reference
		// --> Lambda override abstract method địa nghĩa quá dài
		// --> Resue lamdba
		
		/*Predicate<Long> isPrimePredicate = (Long number) -> {
			if (number == 0 || number == 1) {
				return false;
			}
			
			for (long i = 2; i <= Math.sqrt(number); i++) {
				if (number % i == 0) {
					return false;
				}
			}
			
			return true;
		};*/
		
		// Dạng 1
		
		Predicate<Long> isPrimePredicate = Ex03MethodReference::isPrime;
		
		System.out.println("isPrime(7) --> " + isPrimePredicate.test(7l));   // T
		
		System.out.println("isPrime(14) --> " + isPrimePredicate.test(14l)); // F
		
		System.out.println("isPrime(19) --> " + Ex03MethodReference.isPrime(19l)); // T
		
		System.out.println("\n=======================\n");
		
		BiFunction<String, Float, Integer> bf = Ex03MethodReference::calcLength;
		
		System.out.println("bf test 01: result --> " + bf.apply("hello", 2.6f));
		
		BinaryOperator<Integer> boMax = (Integer a, Integer b) -> {
			return a > b ? a : b;
		};
		
		BinaryOperator<Integer> boMin = Integer::min;
		
		// Dạng 2
		
		Consumer<Double> cd = (dValue) -> System.out.println(dValue);
		Consumer<Double> dc = System.out::println;
		
		Function<String, Integer> si = (String s) -> s.length();
		Function<String, Integer> is = String::length;
	}
	
	/*
	 Phương pháp 1: Sử dụng 'static' method để biến lambda thành method reference
	 Các bước để chuyển lambda thành method reference khi khởi tạo đối tượng cho Functional Interface
	 B1: Biến lambda thành hàm 'static'
	     + parameter, return type, body --> giống với lambda override
	     + thuộc class(bất kỳ) nào đó
	     + tên hàm bất kỳ
	 B2: Thay thế lambda bằng TenClass::tenHam
	 
	 Phương pháp 2: Kinh nghiệm với non-static method
	 
	 */
	
	private static int calcLength(String s, Float f) {
		int sInt = s.length();
		int fInt = BigDecimal.valueOf(f).setScale(0, RoundingMode.DOWN).intValue();
		return sInt + fInt;
	}
	
	private static boolean isPrime(Long number) {
		if (number == 0 || number == 1) {
			return false;
		}
		
		for (long i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		
		return true;
	}
}