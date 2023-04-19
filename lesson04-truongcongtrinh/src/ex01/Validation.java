package ex01;

public class Validation {

	private Validation() {
	}

	public static boolean isValidID(String stdID) {
		return stdID.matches("^[-+]?[0-9]*\\.?[0-9]+$");

	}

	public static boolean isValidName(String name) {
		return name.matches("^[A-Za-z ]+$");
	}

	public static boolean isValidScore(String score) {
		return score.matches("^[-+]?[0-9]*\\.?[0-9]+([-+]?[0-9]+)?$") && Float.parseFloat(score) <= 10
				&& Float.parseFloat(score) >= 0;
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
