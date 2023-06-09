package lesson02;

public class Ex05Symetric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] texts = {8, 123, 23532, 8236328};
		
		for (int text : texts) {
			System.out.println(text + " is Symetric " + isSymetric(text));
		}
		

	}
	
	private static boolean isSymetric(int text) {
		if(text < 10) {
			System.out.println(">>>>>>" + text + " is invalid --> At least 2 digits !");
			return false;
		}
		
		String textAsString = String.valueOf(text);
		for (int i = 0; i < textAsString.length()/2; i++) {
			char left = textAsString.charAt(i);
			char right = textAsString.charAt(textAsString.length() - i - 1);
			if (left != right) {
				return false;
			}
		}
		return true;
	}

}
