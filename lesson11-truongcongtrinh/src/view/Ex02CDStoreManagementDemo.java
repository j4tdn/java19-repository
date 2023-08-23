package view;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.util.Comparator.*;
import static utils.CDUtils.*;

import bean.CD;

public class Ex02CDStoreManagementDemo {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		List<CD> CDs = new ArrayList<>(mockData());
		
			while (true) {
				System.out.println("----- CD Management -----");
				System.out.println("1. Add CD");
				System.out.println("2. Show Number of CDs ");
				System.out.println("3. Total Price Of All CDs");
				System.out.println("4. Sort by CD's Price DESC");
				System.out.println("5. Sort by CD's ID ASC");
				System.out.println("6. Exit");
				System.out.print("Your selection: ");
				int choice = 0;
				while(true) {
					try {
						choice = Integer.parseInt(sc.nextLine());
						if(choice<1 || choice > 6) throw new IllegalArgumentException();
						break;
					} catch (IllegalArgumentException e) {
						System.out.print("Your selection must be a number in [1-6]\nEnter again: ");
					}
				}
				switch (choice) {
				case 1:
					CDs = addCD(CDs);
					break;
				case 2:
					System.out.println("Number of CDs: " + CDs.size());
					break;
				case 3:
					System.out.println("Total Price Of All CDs: " + total(CDs));
					break;
				case 4:
					System.out.println("Sort by CD's Price DESC\n" + sort(CDs, comparing(CD::getPrice).reversed()));
					break;
				case 5:
					System.out.println("Sort by CD's ID ASC\n" + sort(CDs, comparing(CD::getId)));
					break;
				case 6:
					System.out.println("Exit Successfully!");
					return;
				}
			}
	}

	private static List<CD> mockData() {
		return Arrays.asList(new CD(1, "Rock", "Artist1", 12, new BigDecimal("15.99")),
				new CD(2, "Pop", "Artist2", 10, new BigDecimal("12.49")),
				new CD(3, "Classical", "Artist3", 8, new BigDecimal("18.99")),
				new CD(4, "Hip-Hop", "Artist4", 15, new BigDecimal("14.99")),
				new CD(5, "Jazz", "Artist5", 9, new BigDecimal("16.79")));
	}

}
