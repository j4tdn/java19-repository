package view.d.generic.definition;

import java.lang.reflect.Array;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class JavaList<E> implements IList<E> {

	private static final int DEFAULT_CAPACITY = 5 ;
	
	private int size;
	private E[] es;
	
	public JavaList() {
		es = createGenericArray(DEFAULT_CAPACITY);
	}
	
	public JavaList(int capacity) {
		if(capacity <0) {
			throw new IllegalArgumentException("Capacity of JavaList should not be negative");
		}
		if(capacity < DEFAULT_CAPACITY) {
			capacity = DEFAULT_CAPACITY;
		}
		es = createGenericArray(DEFAULT_CAPACITY);
	}
	
	@Override
	public boolean add(E e) {
		if(size == es.length) {
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
	
	@SuppressWarnings("unchecked")
	private E[] createGenericArray(int amount) {
		// lý do không thể new đối tượng kiểu gểnic
		return (E[]) Array.newInstance(Object.class, amount);
	}
	
	private E[] grow() {
		int newCapacity = es.length + es.length/2;
		E[] newEs = createGenericArray(newCapacity);
		
		for(int i =0; i< es.length;i++) {
			newEs[i] = es[i];
		}
		return newEs;
	}
	
	@Override
	public String toString() {
		for(E e: es) {
			System.out.println(e);
		}
		return super.toString();
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public E get(int i) {
		if(i<0 || i>= size) {
			throw new ArrayIndexOutOfBoundsException(i);
		}
		return es[i];
	}

	@Override
	public void set(int i, E e) {
		if(i<0 || i>= size) {
			throw new ArrayIndexOutOfBoundsException(i);
		}
		es[i] = e;
	}

	@Override
	public int capacity() {
		return es.length;
	}

	@Override
	public void forEch(Consumer<E> consumer) {
		for(int i=0; i<size;i++) {
			consumer.accept(es[i]);
		}
	}
}
