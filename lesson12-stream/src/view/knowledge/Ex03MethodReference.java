package view.knowledge;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Ex03MethodReference {
	public static void main(String[] args) {
//		Predicate<Long> isPrime = (Long number) -> {
//			if (number == 0 || number == 1) {
//				return false;
//			}
//			for (long i = 2; i < Math.sqrt(i); i++) {
//				if (number % i == 0) {
//					return false;
//				}
//			}
//			return true;
//		};
		Predicate<Long> isPrimePredicate = Ex03MethodReference::isPrime;
		System.out.println(isPrimePredicate.test(15l));
		System.out.println("\n=========================\n");
//		BiFunction<String, Float, Integer> bf = new BiFunction<>() {
//
//			@Override
//			public Integer apply(String s, Float f) {
//				int sInt = s.length();
//				int fInt = BigDecimal.valueOf(f).setScale(0, RoundingMode.DOWN).intValue();
//				return sInt + fInt;
//			}
//		};
		BiFunction<String, Float, Integer> bf = Ex03MethodReference::bf1;
		System.out.println("bf test 01: result --> " + bf.apply("hello", 2.6f));
	}
	private static boolean isPrime (Long number){
		if (number == 0 || number == 1) {
			return false;
		}
		for (long i = 2; i < Math.sqrt(i); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
	private static int bf1(String s, float f) {
		int sInt = s.length();
		int fInt = BigDecimal.valueOf(f).setScale(0, RoundingMode.DOWN).intValue();
		return sInt + fInt;
	}
}