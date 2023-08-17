package view.a.list;

import java.util.ArrayList;
import java.util.List;

public class Ex01RawType {
	public static void main(String[] args) {
		/*
		 * p1 -> raw type no pass generic -> default object + add value with arbitrary
		 * types + compile: ok + runtime: cause casting error at runtime
		 */
		List rawTypeList = new ArrayList();
		rawTypeList.add(1);
		rawTypeList.add(2);
		rawTypeList.add(3);
//		rawTypeList.add("hai"); // runtime error
		for (Object o : rawTypeList) {
			int newValue = Integer.parseInt(o.toString()) - 1;
			System.out.println(o + " --> " + newValue);
		}
		
		System.out.println("------------------After JDK 1.5---------------------");
		
		List<Integer> genTypeList = new ArrayList<>();
		genTypeList.add(1);
		genTypeList.add(2);
		genTypeList.add(3);
//		genTypeList.add("chin"); // compile error
		
		for (Integer i : genTypeList) {
			int newValue = i - 1;
			System.out.println(i + " --> " + newValue);
		}
	}

}
