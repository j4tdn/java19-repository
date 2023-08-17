package view.a.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex02ArrayList_SingleType {
	public static void main(String[] args) {
		// initialize

		// i1: inital list of elements with dynamic size, modifiable
		List<String> words = new ArrayList<>();

		// i2: intial list of elements with fixed size --> only support set(i, newvalue)
		List<String> colors = Arrays.asList("yellow", "red", "green");
		colors.set(2, "orange");
		colors.remove("yellow");
		colors.add("blue");
		colors.add("violet");
		System.out.println("colors: size --> " + colors.size());

		// i3: intial immutable list(unable to add,remove,set) --> available from JDK 9
		List<String> letters = List.of("a", "b", "c");
	}
}
