package string.immutable;

public class Ex03StringDemo01 {
	public static void main(String[] args) {
		String s = "Hello world, my name is teo";
		String s1 = ", nice to see you";
		System.out.println("\n=======================\n");
		System.out.println("s length --> " + s.length());
		System.out.println("\n=======================\n");
		System.out.println("s1 length --> " + s1.length());
		System.out.println("\n=======================\n");
		System.out.println("Nối s1 vào s --> " + s.concat(s1));
		System.out.println("\n=======================\n");
		System.out.println("character at index 3 of s --> " + s.charAt(3));

		System.out.println("\n=======================\n");
		loopChars(s);
		System.out.println("\n=======================\n");
		loopWords(s);

//		System.out.println("First index of a --> " + s.indexOf('a'));
//		System.out.println("last index of a --> " + s.lastIndexOf('a'));

	}

	private static void loopChars(String s) {
		System.out.println("4. Loop Char --> ");
		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i) + " ");
		}
	}

	private static void loopWords(String s) {
		// \\s --> cắt theo một khoảng trắng
		// , --> cắt theo dấu phẩy
		// \\s, --> cắt theo cụm khoảng trắng và phẩy
		// ,\\s --> cắt theo cụm phẩy và khoảng trắng

		// [\\s,] --> tổ hợp tất cả các kết quả có thể xuất hiện trong []

		System.out.println("4. Loop words --> ");
		String[] tokens = s.split("[\\s,]");
		for (String token : tokens) {
			System.out.println("|||" + token + "|||");
		}
	}

}
