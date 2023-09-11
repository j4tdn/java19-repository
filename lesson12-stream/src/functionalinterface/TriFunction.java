package functionalinterface;

@FunctionalInterface
public interface TriFunction<S, U, V, R> {

	/**
	 * Apply s, u, v.
	 * 
	 * @param s p1
	 * @param u p2
	 * @param v p3
	 * @return r
	 */
	R apply(S s, U u, V v);

}
