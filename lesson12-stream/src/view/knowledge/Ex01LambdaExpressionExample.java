package view.knowledge;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.concurrent.Callable;
import java.util.function.Function;

public class Ex01LambdaExpressionExample {
	public static void main(String[] args) {
		Comparator<String> c1 = (s1, s2) -> {
			return s1.compareTo(s2);
		};
		Function<String, Integer> f2 = s-> s.length();
		
		Callable<BigDecimal> f3 = () -> BigDecimal.valueOf(100);
		Function<String, Integer> a = ("a") -> {1;};
		String s = "haha";
		String[] s = {"haha", "bb"};
		
	}
}
