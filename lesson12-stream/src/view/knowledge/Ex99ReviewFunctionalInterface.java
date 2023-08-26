package view.knowledge;

import java.util.function.BiPredicate;

public class Ex99ReviewFunctionalInterface {
	 public static void main(String[] args) {
		 
		 // TestFunctionalInterface #abstract-method# T apply(U u,V v);  ~ BiFunction/
		TestFunctionalInterface<Integer, Integer, Integer> t = new TestFunctionalInterface<Integer, Integer, Integer>() {
			@Override
			public Integer apply(Integer u, Integer v) {
				return u+v;
			}
		};
		
		
		
		
		
	}
}
