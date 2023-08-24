package view.a.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex02ArrayList_SingleType_Initialize {
	public static void main(String[] args) {
		
		List<String> words = new ArrayList<>();
		words.add("hello");
		
		
		
		//only support set(index, value)
		List<String> colors = Arrays.asList("yellow", "red", "green");
		colors.set(1, "RED");
		
		//not support set, remove, add
		List<String> letters = List.of("a", "b", "c");
		String aString = letters.get(1);
		System.out.println(aString);
		
	}
}
