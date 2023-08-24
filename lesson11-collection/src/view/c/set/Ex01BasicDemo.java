package view.c.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import utils.CollectionUtils;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		Set<Integer> numbers = new TreeSet<Integer>(Comparator.reverseOrder());
		numbers.add(14);
		numbers.add(22);
		numbers.add(18);
		numbers.add(99);
		numbers.add(77);
		
		CollectionUtils.generate("1A LOG >> number", numbers);
	}
}
