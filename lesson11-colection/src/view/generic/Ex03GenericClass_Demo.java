package view.generic;

import view.generic.definition.IList;
import view.generic.definition.JavaList;

public class Ex03GenericClass_Demo {
	
	public static void main(String[] args) {
		IList<String> sequences = new JavaList<>();
		
		sequences.add("text");
		sequences.add("x1");
		sequences.add("hello");
		sequences.add("text");
		sequences.add("x1");
		sequences.add("hello");
		sequences.add("text");
		sequences.add("x1");
		sequences.add("hello");
		
		System.out.println("size: " + sequences.size());
		
		sequences.forEach(seq -> {
			System.out.print(seq + " *** ");
		});
	}
}