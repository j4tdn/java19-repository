package view;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import bean.Disc;

public class CDShopApp {
	public static void main(String[] args) {
		List<Disc> discs = mockData();
		boolean success = addNewDisc(new Disc(6, "Metal", "Xuan Hung", 9, bd(20.0d)), discs);

		if (success) {
			System.out.println("Add new CD successful");
		} else {
			System.out.println("CD id is duplicated, cannot add this CD");
		}

		discs.forEach(System.out::println);

		System.out.println("=======");
		System.out.println("count of discs:  " + countOfDisc(discs));

		System.out.println("=======");
		System.out.println("Total price: " + totalPriceOfDiscs(discs));

		System.out.println("=======");
		System.out.println("sorted by prices DESC");
		sortByPriceDESC(discs);
		discs.forEach(System.out::println);

		System.out.println("=======");
		System.out.println("sorted by ID ASC");
		sortByIdSASC(discs);
		discs.forEach(System.out::println);
	}

	private static List<Disc> mockData() {
		return new ArrayList<Disc>(Arrays.asList(new Disc(1, "Pop", "Ca Sy 1", 10, bd(12.5d)),
				new Disc(2, "Rock", "Ca Sy 2", 8, bd(15.0d)), new Disc(3, "R&B", "Ca Sy 3", 12, bd(10.0d)),
				new Disc(4, "Jazz", "Ca Sy 4", 6, bd(18.0d))));
	}

	private static BigDecimal bd(Double number) {
		return BigDecimal.valueOf(number);
	}

	private static boolean addNewDisc(Disc newdisc, List<Disc> lists) {
		if (lists.contains(newdisc)) {
			return false;
		}
		lists.add(newdisc);
		return true;
	}

	private static Integer countOfDisc(List<Disc> discs) {
		return discs.size();
	}

	private static BigDecimal totalPriceOfDiscs(List<Disc> discs) {
		return discs.stream().map(Disc::getPrices).reduce(bd(0d), (subtotal, price) -> subtotal.add(price));
		// reduce(result, Bigdecimal::add)

	}

	private static void sortByPriceDESC(List<Disc> discs) {
		discs.sort(Comparator.comparing(Disc::getPrices).reversed());
	}

	private static void sortByIdSASC(List<Disc> discs) {
		discs.sort(Comparator.comparing(Disc::getId));
	}
}
