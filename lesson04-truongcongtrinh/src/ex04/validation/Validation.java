package ex04.validation;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Validation {
	
	private Validation() {
	}
	
	
	public static boolean isValidIntNumber(String choice) {
		return choice.matches("^[0-9]+$");
	}
	
	
	public static boolean isValidName(String name) {
		return name.matches("^[A-Za-z ]+$");
	}
	
	public static boolean isValidDate(String Date) {
		try {
			Integer check = Period.between(LocalDate.parse(Date, DateTimeFormatter.ofPattern("dd/MM/yyyy")),
					java.time.LocalDate.now()).getDays();
			if (check < 0) {
				System.out.println("Ngay sinh phai nho hon ngay hien tai");
				return false;
			} else
				return true;
		} catch (Exception e) {
			System.out.println("Khong co ngay nay hoac ngay bi sai dinh dang (dd/MM/yyyy)");
			return false;
		}
	}
	
	public static boolean isValidCoef(String coef) {
		return coef.matches("^[+]?[0-9]*\\.?[0-9]+([-+]?[0-9]+)?$");
	}
	
	
	public static String normalizeName(String name) {
		StringBuilder resName = new StringBuilder();
		String[] words = name.toLowerCase().trim().split("\\s+");
		for(String word:words) {
			char[] characters = word.toCharArray();
			characters[0] = Character.toUpperCase(characters[0]);
			resName.append(characters);
			resName.append(" ");
		}
		return resName.toString().trim();
	}
	
	
	
}
