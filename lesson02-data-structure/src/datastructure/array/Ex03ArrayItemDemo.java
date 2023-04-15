package datastructure.array;

import java.util.Arrays;

import datastructure.object.custom.Item;

public class Ex03ArrayItemDemo {
      public static void main(String[] args) {
		// Tìm kiếm nhanh 1 class trong eclipse --> ctrl shift t
    	  Item[] items = fetchItems();
    	  
    	 // Viết chương trình, hàm tìm những mặt hàng có giá > 300
    	  //input: items
    	  //--> condition: item's price > 300
    	  //output : items[] --> price > 300
    	Item[] filteredItems = filter(items);
    	System.out.println("items --> " + Arrays.toString(filteredItems));  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
	}
      private static Item[] filter(Item[] items) {
    	  Item[] result = new Item[items.length];
    	  int running = 0;
    	  
    	  for(int i = 0; i < items.length; i++) {
    		  Item currentItem = items[i];
    		  if(currentItem.price > 300) {
    			  result[running++] = currentItem;
    		  }
    	  }
    	  // copy non-null trong result vào finalResult
    	  // running: số lượng phần tử != null trong result
    	  /*Item[] finalResult = new Item[running];
    	  for (int i = 0; i < running; i++) {
    		  finalResult[i] = result[i];
    	  }
    	  return finalResult;*/
    	  Item[] finalResult = Arrays.copyOfRange(result, 0, running);
    	  return finalResult;
      }
      
      private static Item[] fetchItems() {
    	  return new Item[] {
    			  new Item(1, 'A', 253f),
    		      new Item(2, 'B', 211f),
    		      new Item(3, 'C', 403f),
    		      new Item(4, 'D', 113f),
    		      new Item(5, 'E', 433f),
    		      new Item(6, 'F', 500f),
    		      new Item(7, 'G', 123f)

    	  };
      }
}
