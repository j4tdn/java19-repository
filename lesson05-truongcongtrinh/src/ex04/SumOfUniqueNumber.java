package ex04;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SumOfUniqueNumber {
	private SumOfUniqueNumber() {
		int[] numbers = {4, 2, 6, 6, 4, 15, 1};
		System.out.println(sum(numbers));
	}
	
	
	public static void main(String[] args) {
		new SumOfUniqueNumber();
	}
	
	
	private static int sum(int[] numbers) {
		Set<Integer> setNumbers = new TreeSet<>();
		int res = 0;
		for (int i = 0; i < numbers.length; i++) {
			setNumbers.add(numbers[i]);
		}
		
		Iterator<Integer> iterator = setNumbers.iterator();
		iterator.next();
		while (iterator.hasNext()) {
		    int element = iterator.next();
		    if (!iterator.hasNext()) {
		        break;
		    }
		    res += element;
		}
		return res;
	}
}
