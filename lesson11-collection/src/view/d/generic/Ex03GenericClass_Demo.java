package view.d.generic;

import view.d.dgeneric.definition.IList;
import view.d.dgeneric.definition.JavaList;

public class Ex03GenericClass_Demo {
public static void main(String[] args) {
	IList<String> sequences = new JavaList<>();
	
	sequences.add("text");
	sequences.add("x1");
	sequences.add("hello");
	
	System.out.println("Size -> " + sequences.size());
	
	
}
}
