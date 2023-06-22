package string.immutable;

public class Ex04StringDemo02 {
public static void main(String[] args) {
	
	// 1. Kiểm tra chuỗi s1 có phải là chuỗi bắt đầu || kết thúc trong chuỗi s hay không 
	String[] sequences = {"SGK123", "STKxy12", "SGG999", "STK115"};
	System.out.println(sequences[0] + " -> " + sequences[0].startsWith("SGK"));
	System.out.println(sequences[1] + " -> " + sequences[1].startsWith("SGK"));
	System.out.println(sequences[0] + " -> " + sequences[0].endsWith("123"));
	
	System.out.println("\n=====================\n");
	
	// 2. Thay thế
	String s = "welcome to string lesson";
	System.out.println("Replacement -> " +s.replace("string", "char-sequence"));
	System.out.println("Space Replacement -> " +s.replaceAll("\\s", " "));
	
	System.out.println("\n=====================\n");
	
	
	// 3. Loại bỏ khoảng trắng thừa 
	System.out.println("Remove Reduntdant Spaces -> " + s.strip().replaceAll("\\s", " "));
	
	System.out.println("\n=====================\n");
	
	// 4. Tạo chuỗi con của chuỗi s bắt đầu từ vị trí số 2
	s = s.strip();
	int firstSpaceIndex = s.indexOf(" "); // lastIndexOf
	System.out.println("Sub String -> " + s.substring(3, firstSpaceIndex));
	
	System.out.println("\n=====================\n");
	// 5. Xác định chuỗi s2 có tồn tại trong chuỗi s1 hay không 
	System.out.println("Contains -> " + s.contains("lesson23"));
}
}
