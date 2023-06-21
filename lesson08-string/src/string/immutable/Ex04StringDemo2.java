package string.immutable;



public class Ex04StringDemo2 {
	public static void main(String[] args) {
//		1.
		System.out.println("-------------------------------");
		String[] sequences = {"SGK123, STKxy12","SGK999", "SGK115"};
		System.out.println(sequences[0]+"-->"+"start with"+ sequences[0].startsWith("SGK"));
		System.out.println(sequences[0]+"-->" +"ends with"+ sequences[0].startsWith("123"));
		System.out.println(sequences[1]+"-->" +"start with"+ sequences[1].startsWith("SGK"));
//		2. thay the
		System.out.println("-------------------------------");
		String s = "welcome to string lesson";
		System.out.println("replace"+ s.replace("string", "char-sequence"));
//		3. loai bo khoang trang
		System.out.println("-------------------------------");
		System.out.println("space repalace --> "+ s.replaceAll("\\s+", " "));
		System.out.println("removed redundant space --> "+ s.strip().replaceAll("\\s+", " "));
		System.out.println("-------------------------------");
//		4. tao chuoi con cua chuoi s o vi tri so 2
		int firstSpaceIndex = s.indexOf(" ");
		System.out.println("sub string --> "+ s.strip().substring(3,firstSpaceIndex));
//		5. xac dinh s2 co ton tai trong s1 khong
		System.out.println("-------------------------------");
		System.out.println("contain `--> " + s.contains("lesson23"));
	}
	

}
