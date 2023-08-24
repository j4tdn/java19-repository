package view.d.generic.definition;

import java.util.function.Consumer;
import java.util.function.Predicate;

public interface IList <E> {
	public boolean add(E e);
	public boolean add(int i, E e);
	public boolean remove(int i);
	public boolean remove(E e);
	public boolean removeIf(Predicate<E> predicate);
	public E get(int i);
	public void set(int i, E e);
	public int size();
	int capacity();
	void forEach(Consumer<E> consumer);
}
