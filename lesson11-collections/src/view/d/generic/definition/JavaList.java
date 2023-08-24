package view.d.generic.definition;

import java.lang.reflect.Array;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class JavaList<E> implements IList<E> {
	private static final int DEFAULT_CAPACITY = 5;
	private int size;
	private E[] es;

	public JavaList() {
		es = creacteGenericArray(DEFAULT_CAPACITY);
	}

	public JavaList(int capacity) {
		if (capacity < 0) {
			throw new IllegalArgumentException("Capacity of JavaList should not be negative");
		}
		if (capacity < DEFAULT_CAPACITY) {
			capacity = DEFAULT_CAPACITY;
		}
		es = creacteGenericArray(capacity);
	}

	@Override
	public boolean add(E e) {
		if (size == es.length) {
			es = grow();
		}
		es[size++] = e;
		return true;
	}

	@Override
	public boolean add(int i, E e) {
		return false;
	}

	@Override
	public boolean remove(int i) {
		return false;
	}

	@Override
	public boolean remove(E e) {
		return false;
	}

	@Override
	public boolean removeIf(Predicate<E> predicate) {
		return false;
	}

	@Override
	public E get(int i) {
		if (i < 0 || i >= size) {
			throw new ArrayIndexOutOfBoundsException(i);
		}
		return es[i];
	}

	@Override
	public void set(int i, E e) {
		if (i < 0 || i >= size) {
			throw new ArrayIndexOutOfBoundsException(i);
		}
		es[i] = e;
	}

	@Override
	public int size() {
		return size;
	}

	@SuppressWarnings("unchecked")
	private E[] creacteGenericArray(int amount) {
		return (E[]) Array.newInstance(Object.class, amount);
	}

	private E[] grow() {
		int newCapacity = es.length + es.length / 2;
		E[] newEs = creacteGenericArray(newCapacity);
		for (int i = 0; i < es.length; i++) {
			newEs[i] = es[i];
		}
		return newEs;
	}

	@Override
	public int capacity() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void forEach(Consumer<E> consumer) {
		for(int i = 0; i < size; i++) {
			consumer.accept(es[i]);
		}
	}
}
