package view;

import java.util.ArrayList;
import java.util.List;

import bean.CD;
import bean.CDs;
import util.CollectionUtil;

public class Bai2 {
	public static void main(String[] args) {
		CDs cDs = new CDs(mockData());
		CollectionUtil.generate("List origin", cDs.getCDs());
		
		cDs.addCD(new CD(9, "Type1", "Sơn Tùng", 10, 100d) );
		CollectionUtil.generate("After add", cDs.getCDs());
		
		System.out.println("Size of list: "+ cDs.getSize());
		
		cDs.sortDESCByPrice();
		CollectionUtil.generate("\nSort DESC by Price", cDs.getCDs());
		
		cDs.sortASCById();
		CollectionUtil.generate("\nSort ASC by ID", cDs.getCDs());
		
	}
	
	private static List<CD> mockData(){
		List<CD> CDs = new ArrayList<>();

		CDs.add(new CD(4, "Type3", "Mai Tiến Dũng", 5, 50d));
		CDs.add(new CD(5, "Type2", "Trung Quân", 9, 60d));
		CDs.add(new CD(6, "Type3", "Hoài Lâm", 14, 250d));
		CDs.add(new CD(1, "Type1", "Sơn Tùng", 10, 100d));
		CDs.add(new CD(2, "Type1", "Quốc Thiên", 7, 200d));
		CDs.add(new CD(3, "Type2", "Noo", 8, 300d));
		
		return CDs;
	}
}
