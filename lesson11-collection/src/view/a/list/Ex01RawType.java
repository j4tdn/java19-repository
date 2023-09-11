package view.a.list;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Ex01RawType {
     public static void main(String[] args) {
		List rawTypeList = new ArrayList();
		rawTypeList.add(5);
		rawTypeList.add(2);
		rawTypeList.add(3);
		rawTypeList.add(BigDecimal.valueOf(15));
		
		for(Object o : rawTypeList) {
			int newValue = Integer.parseInt(o.toString())-1;
			System.out.println(o + "-->" + newValue );
		}
		
		
		//generictype : catch error at compile time
		List<Integer> genTypeList = new ArrayList<>();
		genTypeList.add(6);
		genTypeList.add(7);
		genTypeList.add(8);
		
		for(Integer i : genTypeList) {
			int newValue = i - 1;
			System.out.println(i + "-->" + newValue);
		}
	}
}
