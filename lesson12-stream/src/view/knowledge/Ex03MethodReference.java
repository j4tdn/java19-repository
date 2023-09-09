package view.knowledge;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class Ex03MethodReference {
public static void main(String[] args) {
//	Predicate<Long> isPrimePredicate = (Long number) -> {
//			if(number == 0 || number == 1) {
//				return false;
//			}
//			for(long i = 2; i <= Math.sqrt(number); i++) {
//				if(number % i ==0) {
//					return false;
//				}
//			}
//			return true;
//	};
	Predicate<Long> isPrimePredicate = Ex03MethodReference::isPrime;
	System.out.println("isPrime(7) -> " + isPrimePredicate.test(7l));
	System.out.println("\n=======================\n");
	BiFunction<String, Float, Integer> bf = Ex03MethodReference::calcLength;
	System.out.println("bf test 01: result -> " + bf.apply("hello", 2.6f));
	BinaryOperator<Integer> bomax = (Integer a, Integer b) -> {
		return a > b? a : b;
	};
	
}
private static int calcLength(String s, Float f) {
	int sInt = s.length();
	int fInt = BigDecimal.valueOf(f).setScale(0, RoundingMode.DOWN).intValue();
	return sInt + fInt;	
}
private static boolean isPrime(Long number) {
	if(number == 0 || number == 1) {
		return false;
	}
	for(long i = 2; i <= Math.sqrt(number); i++) {
		if(number % i ==0) {
			return false;
		}
	}
	return true;
};
}
