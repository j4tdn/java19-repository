package view;

import java.util.Collections;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<String> letters = List.of("a", "b", "c", "d", "e", "a", "c", "b");
		
		letters.stream()
				.filter(letter -> Collections.frequency(letters, letter) == 1)
				.forEach(System.out::println);
			
		
	}
}
