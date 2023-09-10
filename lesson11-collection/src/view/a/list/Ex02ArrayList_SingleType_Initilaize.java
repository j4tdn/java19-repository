package view.a.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex02ArrayList_SingleType_Initilaize {
	
	public static void main(String[] args) {
		
		// initialize
		
		// i1: intial list of elements with dynamic size, modifiable
		System.out.println("====================== i1 =====================\n");
		/*
		  java.util.ArrayList
		  public boolean add(E e) {
	          modCount++;
	          add(e, elementData, size);
	          return true;
	      }
		 */
		List<String> words = new ArrayList<>();
		words.add("dancing");// add = add to the end
		words.add("welcome");
		words.add("club");
		words.add("to");
		
		System.out.println("words: size --> " + words.size());
		for(String word: words) {
			System.out.println(word);
		}
		
		System.out.println("\n====================== i2 =====================\n");
		
		// i2: intial list of elements with fixed size --> only support set(i, newValue)
		/*
		 java.util.Arrays.ArrayList
		 add(size(), e);
		 public void add(int index, E element) {
	        throw new UnsupportedOperationException();
	     }
	     
	     default void remove() {
	        throw new UnsupportedOperationException("remove");
	     }
		 
		 */
		List<String> colors = Arrays.asList("yellow", "red", "green");
		colors.set(2, "orange");
		// colors.remove("yellow");
		// colors.add("blue");
		// colors.add("violet");
		System.out.println("colors: size --> " + colors.size());
		
		System.out.println("\n====================== i3 =====================\n");
		
		// i3: intial immutable list(unable to add,remove,set) --> available from JDK 9
		/*
		 AbstractImmutableList
		 throw uoe();
		 */
		List<String> letters = List.of("a", "b", "c");
		letters.set(0, "A");
		letters.add("d");
		letters.add("e");
		System.out.println("letters: size --> " + letters.size());
	}
	
}
