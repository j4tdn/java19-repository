package view;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ex05DailyExpensesApp {

	public static void main(String[] args) {
		Map<String, Integer> expenses = mockData();
		Scanner scanner = new Scanner(System.in);
		int choice = -1;

		while (choice != 0) {
			System.out.println("------- Daily Expenses App -------");
			System.out.println("1. List expenses greater than 500k");
			System.out.println("2. Sort by info");
			System.out.println("3. Sort by amount");
			System.out.println("4. List all expenses");
			System.out.println("0. Exit");
			System.out.println("------------------------------------");
			System.out.print("Enter selection: ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				listExpensesGreaterThan500k(expenses);
				break;
			case 2:
				sortByInfo(expenses);
				break;
			case 3:
				sortByAmount(expenses);
				break;
			case 4:
				for (Map.Entry<String, Integer> entry : expenses.entrySet()) {
					System.out.println(entry.getKey() + ": " + entry.getValue());
				}
				break;
			case 0:
				System.out.println("Exiting program...");
				break;
			default:
				System.out.println("Invalid choice");
			}
		}

		scanner.close();
	}

	private static Map<String, Integer> mockData() {
		Map<String, Integer> expenses = new TreeMap<>();
		expenses.put("Groceries", 200000);
		expenses.put("Rent", 1000000);
		expenses.put("Utilities", 450000);
		expenses.put("Dining Out", 600000);
		expenses.put("Transportation", 300000);
		return expenses;
	}

	public static void addExpense(Map<String, Integer> expenses, String info, Integer amount) {
		expenses.put(info, amount);
	}

	public static void listExpensesGreaterThan500k(Map<String, Integer> expenses) {
		for (Map.Entry<String, Integer> entry : expenses.entrySet()) {
			if (entry.getValue() > 500000) {
				System.out.println(entry.getKey() + ": " + entry.getValue());
			}
		}
	}

	public static void sortByInfo(Map<String, Integer> expenses) {
		Map<String, Integer> sortedExpenses = new TreeMap<>(expenses);
		for (Map.Entry<String, Integer> entry : sortedExpenses.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

	public static void sortByAmount(Map<String, Integer> expenses) {
		Map<Integer, String> amountSorted = new TreeMap<>();
		for (Map.Entry<String, Integer> entry : expenses.entrySet()) {
			amountSorted.put(entry.getValue(), entry.getKey());
		}

		for (Map.Entry<Integer, String> entry : amountSorted.entrySet()) {
			System.out.println(entry.getValue() + ": " + entry.getKey());
		}
	}
}
