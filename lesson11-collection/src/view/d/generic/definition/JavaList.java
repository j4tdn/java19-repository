package view.d.generic.definition;

import java.lang.reflect.Array;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class JavaList<E> implements IList<E> {

	private static final int DEFAULT_CAPACITY = 5;

	private int size;
	private E[] elements;

	public JavaList() {
		elements = createGenericArray(DEFAULT_CAPACITY);
	}

	public JavaList(int capacity) {
		if (capacity < 0) {
			throw new IllegalArgumentException("Capacity of JavaList should not be negative");
		}
		if (capacity < DEFAULT_CAPACITY) {
			capacity = DEFAULT_CAPACITY;
		}
		elements = createGenericArray(capacity);
	}

	@Override
	public boolean add(E e) {
		if (size == elements.length) {
			elements = grow();
		}
		elements[size++] = e;
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
		if(i<0 || i>=size) {
			throw new ArrayIndexOutOfBoundsException(i);
		}
		return elements[i];
	}

	@Override
	public void set(int i, E e) {
		if(i<0 || i>=size) {
			throw new ArrayIndexOutOfBoundsException(i);
		}
		elements[i] = e;
	}
	
	@Override
	public void forEach(Consumer<E> consumer) {
		for(int i=0;i<size;i++) {
			consumer.accept(elements[i]);
		}
	} 

	@Override
	public int size() {
		return size;
	}

	@Override
	public int capacity() {
		return elements.length;
	}
	
	@SuppressWarnings("unchecked")
	private E[] createGenericArray(int amount) {
		// lý do: không thể khởi tạo new 1 đối tượng kiểu generic.
		return (E[]) Array.newInstance(Object.class, amount);
	}

	private E[] grow() {
		int newCapacity = elements.length + elements.length/2;
		E[] newEs = createGenericArray(newCapacity);
		
		for(int i=0;i<elements.length;i++) {
			newEs[i] = elements[i];
		}
		return newEs;
	}
}
