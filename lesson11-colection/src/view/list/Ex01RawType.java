package view.list;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Ex01RawType {
	
	/*
	 
	 List: tÃªn cá»§a interface
	 <E> : tham sá»‘ cá»§a interface list
	       --> sá»­ dá»¥ng, gá»?i interface list --> truyá»?n giÃ¡ trá»‹ cho tham sá»‘ E
	       tham sá»‘ E nháº­n vÃ o lÃ  1 kiá»ƒu dá»¯ liá»‡u Ä‘á»‘i tÆ°á»£ng
	 
	 VD: LÆ°u danh sÃ¡ch cÃ¡c sá»‘ nguyÃªn --> List<Integer>
	 
	 public interface List<E>
	 
	 */
	
	public static void main(String[] args) {
		
		/*
			p1 --> raw type
			no pass generic --> default object
			+ add values with arbitrary types
			+ --> compile: ok
			+     runtime: cause casting error at runtime
			
			e.g: store list of amount of items --> values --> integers
		 */
		
		List rawTypeList = new ArrayList();
		rawTypeList.add(5);
		rawTypeList.add(2);
		rawTypeList.add(3);
		// rawTypeList.add("hai"); // runtime error
		rawTypeList.add(BigDecimal.valueOf(15));
		
		// reduce subtract 1 for every store
		for (Object o: rawTypeList) {
			int newValue = Integer.parseInt(o.toString()) - 1;
			System.out.println(o + " --> " + newValue);
		}
		
		
		System.out.println("\n------------ after JDK 1.5 -------------\n");
		
		/* p2 --> generic type from JDK 1.5
		        1.5 new ArrayList<Integer>()
		        1.7 new ArrayList<>()
		   
		   --> support catch error at compile time 
		       + error managable
		       + avoid unexpected error at runtime    
		*/
		List<Integer> genTypeList = new ArrayList<>();
		genTypeList.add(6);
		genTypeList.add(7);
		genTypeList.add(8);
		// genTypeList.add("chin"); // compile error
		
		for (Integer i: genTypeList) {
			int newValue = i - 1;
			System.out.println(i + " --> " + newValue);
		}
		
	}
}