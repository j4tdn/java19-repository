package view.knowledge;

import java.util.function.Predicate;

public class Ex03MethodReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Predicate<Long> isPrimePredicate = new Predicate<Long>() {

			@Override
			public boolean test(Long number) {
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
		};*/
		Predicate<Long> isPrimePredicate = Ex03MethodReference::isPrime;
		System.out.println("isPrime(7) -->" + isPrimePredicate.test(7l));
		System.out.println("isPrime(14) -->" + isPrimePredicate.test(14l));
		System.out.println("isPrime(7) -->" + Ex03MethodReference.isPrime(19l));

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
