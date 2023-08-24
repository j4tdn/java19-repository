package view.a.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex06ArrayList_Principle {
	
	public static void main(String[] args) {
		
		/*
		 
		 ArrayList
		 	Object[] elementData
		 	int size // number of 'actual' elements in ArrayList
		 	int capacity // length of elementData
		 	
		 TH1: new ArrayList<>()
		      + elementData = {}
		      + Any empty ArrayList with elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA
		        will be expanded to DEFAULT_CAPACITY when the first element is added
		      
		      list.add('a')
		      list.add('b')
		      .....
		      list.add('k')
		      list.add('l')
		      
		      public boolean add(E e) {
			        modCount++;
			        add(e, elementData, size); // e = 'l', size = 10
			        return true;
		      }
		      
		      private void add(E e, Object[] elementData, int s) {
			        if (s == elementData.length) // s = 0, elementData.length = 0
			            elementData = grow(); // {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'k', 'l', null, null, null, null}
			        elementData[s] = e; 
			        size = s + 1; // size = 11
			  }
			  
			  private Object[] grow() {
			        return grow(size + 1); // size = 11
			  }
			  
			  
			  // minCapacity = 11
			  // DEFAULT_CAPACITY = 10
			  private Object[] grow(int minCapacity) {
			        int oldCapacity = elementData.length; // oldCapacity = 10
			        if (oldCapacity > 0 || elementData != DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
			            int newCapacity = ArraysSupport.newLength(oldCapacity,
			                    minCapacity - oldCapacity, // minimum growth
			                    oldCapacity >> 1           // preferred growth); // 15
			            return elementData = Arrays.copyOf(elementData, newCapacity);
			        } else {
			            return elementData = new Object[Math.max(DEFAULT_CAPACITY, minCapacity)];
			        }
			 }
			 
			 // elementData = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'k', null, null, null, null, null}
			  
		 	 + mặc định, khi khởi tạo arraylist, arraylist tự động
		 	 tạo 1 mảng rỗng và sẽ mở rộng thành mảng 10 phần tử trong lần add đầu tiên
		 	 
		 	 + g�?i hàm khởi tạo với initial capacity --> tạo 1 elementData có length = initial capacity
		 	 new ArrayList<>(initialCapacity)
		 	 public ArrayList(int initialCapacity) {
			        if (initialCapacity > 0) {
			            this.elementData = new Object[initialCapacity];
			        } else if (initialCapacity == 0) {
			            this.elementData = EMPTY_ELEMENTDATA;
			        } else {
			            throw new IllegalArgumentException("Illegal Capacity: "+
			                                               initialCapacity);
			        }
		     }
		     
		     * nếu như mình biết được số lượng phần tử tối đa sẽ lưu trong ArrayList
		     * sẽ dùng new ArrayList với initial capacity --> tránh khởi tạo elementData cũng như copyOf elementData nhi�?u lần
		 	 * improve performance
		 */
		
		List<String> list = new ArrayList<>(5);
		list.add("a");
		list.add("b");
		list.add("c");
		System.out.println("size --> " + list.size());
	}
}