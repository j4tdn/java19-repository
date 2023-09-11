package view.stream.practice;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import utils.CollectionUtils;

public class Ex01FilterAndSlide {
     public static void main(String[] args) {
		 
    	 
    	 var letters = List.of("a", "b", "c", "f", "g", "g", "a", "a", "b");
    	 //1. distinct elements from numbers
    	 var nonDupElements = letters.stream().distinct().collect(Collectors.toList());
    	 
    	 CollectionUtils.generate("1.Distinct elements from numbers", nonDupElements);
    	 
    	 //2. select unique elements from input list of numbers
    	 
    	 letters.forEach(letter -> );
    	 
	}
}
