package utils;

public class StreamUtils {
	
	private StreamUtils() {
	}
	
	public static <E> E mergeF(E e1, E e2) {
		return e1;
	}
	
	public static <E> E mergeS(E e1, E e2) {
		return e2;
	}
}