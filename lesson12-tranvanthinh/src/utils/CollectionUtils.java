package utils;

import java.util.Collection;

public class CollectionUtils {

	public static <E> void generate(String prefix, Collection<E> collection) {
		System.out.println(prefix + " --> {");
		
		for (E element: collection) {
			System.out.println("     " + element);
		}
		
		System.out.println("}\n");
	}
}
