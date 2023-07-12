package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex01 {
	public static void main(String[] args) {
		
		String[] data = new String[] {
				"Java", "C#", "C++", "PHP", "Javascript"
		};
		Stream<String> result = Stream.of(data).filter(a -> a.startsWith("J"));
		
		System.out.println("bat dau bang J");
		result.forEach(a -> System.out.println(a));
	}
	
}
