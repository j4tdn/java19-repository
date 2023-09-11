package view.d.generic;

import java.util.List;

import bean.Item;

public class Ex04GenericWWildCard_ListDemo {
    public static void main(String[] args) {
    	  List<Integer> inList = List.of(5, 7, 8, 2, 6);
    	  List<Double> douList = List.of(8d, 2d, 1d, 7d);
    	  List<String> strList = List.of("x", "b", "a", "z");
    	  List<Item> iteList = List.of(new Item(1), new Item(5), new Item(2), new Item(7));
    	  
	}
    /*/
     
     
     
     Generic Wild Car
     */
    
    private static void g_printf(String prefix, List<?> elements) {
    	System.out.println(prefix + "-->");
    	for(Object element : elements) {
    		System.out.println(element);
    	}
    	System.out.println();
    }
    
    private static  void gn_printf(String prefix, List<? extends Number> objects) {
    	System.out.println(prefix + "-->");
    	
    }
}
