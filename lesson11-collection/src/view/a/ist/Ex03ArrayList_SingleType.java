package view.a.ist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex03ArrayList_SingleType {
public static void main(String[] args) {
	
	System.out.println("\n==========i1===============\n");
	
	// i1: initial list of elements with dynamic size, modifiable
	List<String> word = new ArrayList<>();
	word.set(0, "dacing");
	word.add("dacing");
	word.add("welcome");
	word.add("to");
	word.add("club");
	
	System.out.println("words: size -> " + word.size());
	for(String words: word) {
		System.out.println(words);
	}
	
	System.out.println("\n==========i2===============\n");
	// i2: initial list of elements(support get(i), set(i)) with fixed size
	List<String> colors = Arrays.asList("yellow", "red", "green");
	colors.set(0, "orange");
	System.out.println("colors: size -> " + colors.size());

//	colors.add("blue");
//	colors.add("violet");
//	System.out.println("colors: size -> " + colors.size());
//	for(String color: colors) {
//		System.out.println(color);
//	}
	
	System.out.println("\n==========i3===============\n");
	// i3: initial immutable list(unable to add, remove,set )
	List<String> letters = List.of("a", "b", "c");
	letters.set(0, "A");
	letters.add("d");
	letters.add("e");
	System.out.println("letters: size -> " + letters.size());
}
}
