package view.d.generic.definition;

import java.util.function.Consumer;
import java.util.function.Predicate;

public interface IList<E> {
	boolean add(E e);

	boolean add(int i, E e);

	boolean remove(int i);

	boolean remove(E e);

	boolean removeIf(Predicate<E> predicate);
	
	int size();
	
	E get(int i);
	void set(int i, E e);
	int capacity();
	void forEch(Consumer<E> consumer);

}
