package view.a.ist;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Ex01RawType {
	
	
	
public static void main(String[] args) {
	// p1 -> raw type 
	List rawTypeList = new ArrayList();
	rawTypeList.add(5);
	rawTypeList.add(2);
	rawTypeList.add(3);
	
	rawTypeList.add(BigDecimal.valueOf(15));
	for(Object o : rawTypeList) {
		int newvalue = Integer.parseInt(o.toString() ) - 1;
		System.out.println(o + " -> " + newvalue);
	}
	
	System.out.println();
	List<Integer> genTypeList = new ArrayList();
	genTypeList.add(5);
	genTypeList.add(3);
	genTypeList.add(2);
	
}
}
