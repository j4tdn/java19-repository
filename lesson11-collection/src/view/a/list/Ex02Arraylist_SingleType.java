package view.a.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex02Arraylist_SingleType {
     
	public static void main(String[] args) {
		//initialize
		
		
		// i1: initial list of elements with dynamic size, modifiable
		List<String> words = new ArrayList<>();
		words.add("dancing");
		words.add("welcome");
		words.add("club");
		
		System.out.println("words: size " + words.size());
		for(String word: words) {
			System.out.println(word);
		}
		
		//i2:initial list of elements with fixed size --> only support set
		List<String> colors = Arrays.asList("yellow", "red", "green" );
		colors.set(2, "orange");
		colors.remove("yellow");
		colors.add("blue");
		
		//i3: initial immutable(unable to add, remove, set)
		List<String> letters = List.of("a", "b", "c");
		letters.set(0, "A");
		letters.add("d");
	}
	
	
}
