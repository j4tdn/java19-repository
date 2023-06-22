package string.immutable;
/**
 * • Kiểm tra chuỗi s1 có phải là chuỗi bắt đầu || kết thúc trong chuỗi s không.
• Thay thế chuỗi s1 bằng chuỗi s2 trong chuỗi s
• Loại bỏ các khoảng trắng thừa của chuỗi s3
• Tạo chuỗi con của chuỗi s bắt đầu từ vị trí số 2
• Xác định chuỗi s2 có tồn tại trong chuỗi s1 hay không
 * @author HP
 *
 */
public class Ex04StringDemo02 {
	public static void main(String[] args) {
		String[] sequences = {"SGK123", "STKxy12", "SGK999","STK115"};
		
		//1. Kiểm tra chuỗi s1 có phải là chuỗi bắt đầu || kết thúc trong chuỗi s không.
		System.out.println(sequences[0]+ "start with -->" + sequences[0].startsWith("SGK"));
		System.out.println(sequences[0]+ "end with -->" + sequences[0].endsWith("123"));
		System.out.println(sequences[1]+ "start with -->" + sequences[1].startsWith("SGK"));
	
		System.out.println("==============");
		
		//2. Thay thế chuỗi s1 bằng chuỗi s2 trong chuỗi s
		String s = "welcome to string lesson";
		System.out.println("replacement --> " + s.replace("string", "char-sequence"));
		
		System.out.println("space replacement --> " + s.replaceAll("\\s+", " "));
		
		System.out.println("==============");
		
		//3. Loại bỏ các khoảng trắng thừa của chuỗi s3
		System.out.println("removed redundant spaces -->|" + s.strip().replaceAll("\\s+", " ") + "|") ;
		
		
		//Loại bỏ các khoảng trắng thừa ở 2 đầu của chuỗi s4
		String s4 = "  welcome    to string   lesson  ";
		System.out.println("Space Replacement--> " + s4.strip().replaceAll("\\s+", " "));
		
		
		System.out.println("==============");
		//4. Tạo chuỗi con của chuỗi s bắt đầu từ vị trí số 2
		
		s = s.strip();//loại bỏ khoảng trắng 2 đầu 
		int firstSpaceIndex = s.indexOf(" ");
		System.out.println("sub String --> " + s.substring(3,firstSpaceIndex));
		
		System.out.println("==============");
		
		//5. Xác định chuỗi s2 có tồn tại trong chuỗi s1 hay không
		System.out.println("contain --> " + s.contains("lesson23"));
	}
}
