package view.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex02ArrayList_SingleType {
	public static void main(String[] args) {
		// initialize
		
		//i1: intial list of elements with dynamic size, modifiable(//i1: danh sách ban đầu các phần tử có kích thước động, có thể sửa đổi)
		/*
		 import java.util.ArrayList;
		 public boolean add(E e) {
        	modCount++;
        	add(e, elementData, size);
        	return true;
    	 }
		 */
		List<String> words = new ArrayList<>();
		words.add("dancing");
		words.add("welcome");
		words.add("club");
		
		System.out.println("words: size --> " + words.size());
		for (String word : words) {
			System.out.println(word);
		}
		
		System.out.println("/n======================i1=====================/n");
		
		//i2: intial list of elements (support get(i), set(i)) with fixed size (danh sách phần tử ban đầu (hỗ trợ get(i), set(i)) với kích thước cố định)
		/* 
		 java.utill.Arrays.ArrayList
		 add(size(), e);
		 public void add(int index, E element){
		 	throw new UnsupportedOperationException();
		 	}
		 default void remove() {
        	throw new UnsupportedOperationException("remove");
    		}
		 */
		List<String> colors = Arrays.asList("green", "blue", "red");
		colors.set(2, "violet");
//		colors.remove("blue");
//		colors.add("violet");
//		colors.add("yellow");
		System.out.println("colors: size --> " + colors.size());
		for (String color : colors) {
			System.out.println(color);
			
		}
		System.out.println("/n======================i2=====================/n"); 
		//i3: intial immutable list(unable to add, remove, set) --> available from JDK
		List<String> letters = List.of("a", "b", "c");
//		letters.add("d");
//		letters.set(1, "e");
//		letters.remove("a");
		System.out.println("letters: size --> " + letters.size());
		
	}

}
