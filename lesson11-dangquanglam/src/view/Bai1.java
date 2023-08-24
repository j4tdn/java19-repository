package view;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import static java.util.Comparator.*;
import bean.CD;

public class Bai1 {
	public static void main(String[] args) {
		List<CD> discs = mockData();
		boolean success = addNewDisc(new CD(5, "Metal", "Ca Sy 5", 9, bd(20.0d)), discs);

		if (success) {
			System.out.println("Add new CD successful");
		} else {
			System.out.println("CD id is duplicated");
		}

		discs.forEach(System.out::println);

		System.out.println("===================================================");
		System.out.println("Tìm số lượng CD có trong danh sách.:  " + countOfDisc(discs));

		System.out.println("===================================================");
		System.out.println("Tình tổng giá thành của các CD: " + totalPriceOfDiscs(discs));

		System.out.println("===================================================");
		System.out.println("Viết phương thức sắp xếp danh sách giảm dần theo giá thành");
		sortByPriceDESC(discs);
		discs.forEach(System.out::println);

		System.out.println("===================================================");
		System.out.println("Viết phương thức sắp xếp danh sách tĕng dần theo mã CD:");
		sortByIdSASC(discs);
		discs.forEach(System.out::println);
	}
	
	private static BigDecimal bd(Double number) {
		return BigDecimal.valueOf(number);
	}

	private static List<CD> mockData() {
		List<CD> CDs = new ArrayList<>();
		
		CDs.add(new CD(1, "Xua", "Ca Sy 1", 10, bd(10d))); 
		CDs.add(new CD(2, "Pop", "Ca Sy 2", 11, bd(11d))); 
		CDs.add(new CD(3, "Rock", "Ca Sy 3", 12, bd(12d))); 
		CDs.add(new CD(4, "CoDien", "Ca Sy 4", 13, bd(13d)));
				
		return CDs;
	}

	private static boolean addNewDisc(CD newdisc, List<CD> lists) {
		if (lists.contains(newdisc)) {
			return false;
		}
		lists.add(newdisc);
		return true;
	}

	private static Integer countOfDisc(List<CD> discs) {
		return discs.size();
	}

	private static BigDecimal totalPriceOfDiscs(List<CD> discs) {
		return discs.stream().map(CD::getPrices).reduce(bd(0d), (subtotal, price) -> subtotal.add(price));

	}

	private static void sortByPriceDESC(List<CD> discs) {
		discs.sort(comparing(CD::getPrices).reversed());
	}

	private static void sortByIdSASC(List<CD> discs) {
		discs.sort(comparing(CD::getId));
	}
}
