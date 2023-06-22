package string.immutable;


/**
 * 	• Kiểm tra chuỗi s1 có phải là chuỗi bắt đầu || kết thúc trong chuỗi s không.
	• Thay thế chuỗi s1 bằng chuỗi s2 trong chuỗi s
	• Loại bỏ các khoảng trắng thừa của chuỗi s3
	• Tạo chuỗi con của chuỗi s bắt đầu từ vị trí số 2
	• Xác định chuỗi s2 có tồn tại trong chuỗi s1 hay không
 */
public class Ex04StringDemo2 {
	public static void main(String[] args) {
		String[] sequences = {"SGK123", "STKxy12","SGK999","STK115"};
		
		
		// • Kiểm tra chuỗi s1 có phải là chuỗi bắt đầu || kết thúc trong chuỗi s không.
		System.out.println(sequences[0] + " starts with --> " + sequences[0].startsWith("SGK"));
		System.out.println(sequences[0] + " ends with --> " + sequences[0].endsWith("SGK"));
		System.out.println(sequences[1] + " starts with --> " + sequences[0].startsWith("SGK"));
		
		
		// • Thay thế
		String s = "welcome   to  string   lesson   ";
		System.out.println( "|||" + s + "|||"  + " replace to --> " + s.replace("string", "char-sequence"));
		System.out.println( "|||" + s + "|||"  + " space replacement --> " + s.replaceAll("\\s+", " "));
	
		// • Loại bỏ các khoảng trắng thừa của chuỗi s3
		System.out.println( "|||" + s + "|||"  + " Remove redundant space --> " + s.strip().replaceAll("\\s+", " "));
		
		
		// • Tạo chuỗi con của chuỗi s bắt đầu từ vị trí số 2
		System.out.println( "|||" + s + "|||"  + " subString --> " + s.substring(3,s.indexOf(" ")));
		
		// • Xác định chuỗi s2 có tồn tại trong chuỗi s1 hay không
		System.out.println( "|||" + s + "|||"  + " contains --> "  + s.contains("lesson"));
		
	}
}
