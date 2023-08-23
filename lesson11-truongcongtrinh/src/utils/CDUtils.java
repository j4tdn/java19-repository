package utils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import bean.CD;

public class CDUtils {
	private static final Scanner sc = new Scanner(System.in);

	private CDUtils() {
	}
	
	public static List<CD> addCD(List<CD> CDs) {
		List<CD> addedList = new ArrayList<>(CDs);
		CD CDtoAdd = inputCD();
		if(isExisted(CDs, CDtoAdd.getId())) {
			System.out.println("This ID has already existed!");
			return addedList;
		} else {
			addedList.add(CDtoAdd);
			System.out.println("Added Successfully!");
			return addedList;
		}
	}
	
	public static BigDecimal total(List<CD> CDs) {
		BigDecimal total = BigDecimal.valueOf(0);
		for(CD cd:CDs) {
			total = total.add(cd.getPrice());
		}
		return total;
	}
	
	public static List<CD> sort(List<CD> CDs, Comparator<CD> comparator) {
		CDs.sort(comparator);
		return CDs;
	}

	private static CD inputCD() {
		System.out.println("\n===========ADD-CD===========");
		Integer id = 0;
		String type = "";
		String author = "";
		Integer songs = 0;
		BigDecimal price;
		while (true) {
			try {
				System.out.print("Enter CD's Id: ");
				id = Integer.parseInt(sc.nextLine());
				break;
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.print("Enter CD's type: ");
		type = sc.nextLine();
		System.out.print("Enter CD's author: ");
		author = sc.nextLine();
		while (true) {
			try {
				System.out.print("Enter Number of songs: ");
				songs = Integer.parseInt(sc.nextLine());
				break;
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
		while (true) {
			try {
				System.out.print("Enter CD's Price: ");
				price = new BigDecimal(sc.nextLine());
				break;
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
		return new CD(id, type, author, songs, price);
	}
	
	public static boolean isExisted(List<CD> CDs, Integer id) {
		for(CD cd:CDs) {
			if(cd.getId().equals(id)) return true;
		}
		return false;
	}


}
