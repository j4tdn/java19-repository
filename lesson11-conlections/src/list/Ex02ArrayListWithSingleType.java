package list;

import java.util.ArrayList;
import java.util.List;

public class Ex02ArrayListWithSingleType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//> Java 1.5 --> auto(boxing, unboxing)
		//int Integer, double Double
		//new ArrayList<>(); --> first add -> elementData with length = default capacity(10)
		//new ArrayList<>(20); --> first add -> elementData with length = input capacity
		//size : real elements in elementData
		List<Integer> numbers = new ArrayList<>();
		int x = 15;
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(x);
		
		System.out.println("array numbers: " +numbers.size());

	}

}
