package view.stream.practice;

import java.util.List;
import java.util.Optional;

public class Ex03FindingAndMatching {
	
	public static void main(String[] args) {
		
		var numbers = List.of(1, 2, 1, 7, 5, 8, 10, 4, 12);
		
		// 1st: is there any element that is divisible by 10
		
	    boolean hasElementDivisibleBy10 = numbers.stream().anyMatch(number -> number % 10 == 0);
	    System.out.println("hasElementDivisibleBy10 --> " + hasElementDivisibleBy10);
		
		// 2nd: find the first element that is divisible by 4
	    Optional<Integer> optDivBy4 = numbers.stream().filter(number -> number % 4 == 0).findFirst();
	    optDivBy4.ifPresent(v -> System.out.println("1st element divisible by 4 --> " + v));
	    
	    if (optDivBy4.isPresent()) {
	    	System.out.println("Optional Test --> " + optDivBy4.get());
	    }
		
		// 3rd: find the elements that is divisible by 5 in the list
	    // filter
		
		// 4th: does all elements less than 100
	    // allMatch
		
		// 5th: does no elements greater than 0
	    // noneMatch
		
	}
	
}
