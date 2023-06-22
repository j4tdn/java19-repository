package exam;

public class Ex03 {
	public static void main(String[] args) {
		String s = "Welcome  to JAVA10  class";
		revert(s);
	}
	public static void revert(String s) {
		String temp[] = s.split("\\s+");
		for (int j = 0; j < temp.length; j++) {
			for (int i = temp[j].length() - 1; i >= 0; i--) {
				System.out.print(temp[j].charAt(i));
			}
			if (j < temp.length - 1)
				System.out.print(" ");
		}
	}
}
