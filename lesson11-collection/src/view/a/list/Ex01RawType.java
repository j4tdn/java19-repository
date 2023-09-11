package view.a.list;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex01RawType {
	public static void main(String[] args) {
		//p1 --> raw type
		/*
		 * ex: store list of item number --> value (Integer)
		   add values with arbitory types
		   compile ok  but cause, throw error at runtime
		 */
		List rawTypeList = new ArrayList();
		rawTypeList.add(5);
		rawTypeList.add(2);
		rawTypeList.add(3);
//		rawTypeList.add("hai");
		rawTypeList.add(BigDecimal.valueOf(7));
		System.out.println("\n===== raw type =====\n");
		// reduce subtract 1 for every store
		for (Object object : rawTypeList) {
			int newValue = Integer.parseInt(object.toString())-1;
			System.out.println(object + " --> " + newValue);
		}
		
		
		System.out.println("\n===== generic type =====\n");
		
		//p2 --> generic type from JDK 1.5
		//support error detection when compile
		
		List<Integer> genTypeList = new ArrayList<>();
		genTypeList.add(6);
		genTypeList.add(7);
		genTypeList.add(8);
//		genTypeList.add("chin");
		
		for (Integer i : genTypeList) {
			int newValue = i-1;
			System.out.println(i + " --> " + newValue);
		}
		
		
		
	}
}
